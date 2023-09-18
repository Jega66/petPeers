package com.hcl.cs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="pet")
public class Pet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PETID")
	private Long petId;
	@Column(name="PETNAME",nullable=false,length=55)
	
	private String petName;
	@Column(name="PETAGE")
	
	private Integer petAge;
	@Column(name="PETPLACE",length=55)
	
	private String petPlace;
	@ManyToOne
	@JoinColumn(name="PETOWNERID")
	private User user;

}
