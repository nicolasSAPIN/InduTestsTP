package com.tactfactory.monprojetsb.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {
	
	@Id
	@GeneratedValue
	Long id;
	String firstname;
	String lastname;
	
	@OneToMany
	List<Product>product = new ArrayList<Product>();
}
