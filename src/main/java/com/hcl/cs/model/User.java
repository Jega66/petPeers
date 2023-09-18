package com.hcl.cs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USER")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USERID")
	private Long userId;
	@Column(name="USERNAME",length=55,nullable=false,unique=true)
	@NotBlank(message="* username should not be left blank")
	private String userName;
	@Column(name="USERPASSWORD",length=55,nullable=false)
	@NotBlank(message="* password Should not be left blank")
	private String userPassword;
	@Transient
	 
	private String confirmPassword;
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private Set<Pet> pets;

}
