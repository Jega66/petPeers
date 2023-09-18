package com.jega.Petpeers1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hcl.cs.model.Pet;
import com.hcl.cs.model.User;
import com.hcl.cs.service.PetService;
import com.hcl.cs.service.UserService;

@Controller
public class ControllerClass {
	@Autowired
	UserService userService;
	
	@Autowired
	PetService petService;

	
	@GetMapping("/signup")
	public String signUpMethod(ModelMap m) {
		m.addAttribute("user", new User());
		return "registrationPage";
	}

	
	  @GetMapping("/login") public String returnToLoginPage() {
	  
	  return "loginPage"; }
	 

	@GetMapping("/Home")
	public String toHome(Model m) {
		m.addAttribute("pets",petService.getAllPets());
		
		return "homePage";
	}

	@PostMapping("/saveUser")
	public String saveUserMethod(@Validated @ModelAttribute("user") User user, BindingResult bs, Model m) {

		if (!(user.getUserPassword().equals(user.getConfirmPassword()))) {
			bs.rejectValue("confirmPassword", "error.user", "* password and confirm password Should be same");
		}

		if (userService.checkIfExists(user.getUserName())) {
			bs.rejectValue("userName", "error.user", "* userName Already Exists");
		}
		if (bs.hasErrors()) {
			return "registrationPage";
		}
		userService.saveUser(user);
		return "redirect:/login";
	}
	@GetMapping("/myPets")
	public String myPets(Model m) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName(); //get logged in username
	      Long id=userService.getUserByName(name).getUserId();
		m.addAttribute("pets",petService.petsOfUser(id));
		return "myPetsPage";
	}
	@GetMapping("/toAddPet")
	public String addPet(Model m) {
		
		m.addAttribute("pet",new Pet());
		return "addPetPage";
	}
	@PostMapping("/savePet")
	public String savePet(  @ModelAttribute("pet") Pet pet) {
		
		petService.savePet(pet);
		
		String url="redirect:/toAddPet";
		
		return url;                           //"redirect:/redirectedUrl"
	}
	@GetMapping("/BuyPet/{id}")
	public String buyPet(@PathVariable Long id,Model m) {
		
	   Authentication auth = SecurityContextHolder.getContext().getAuthentication(); 
	   String name = auth.getName();
	      User us=userService.getUserByName(name);
	      Pet buyPet=petService.getPetById(id);
	      buyPet.setUser(us);
	      petService.savePet(buyPet);
	      return "redirect:/Home";
	      
	}
	@GetMapping("/logout")
	public String onLogOut() {
		return "redirect:/login";
	}
}
