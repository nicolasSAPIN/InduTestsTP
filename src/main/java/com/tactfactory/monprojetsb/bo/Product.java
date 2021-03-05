package com.tactfactory.monprojetsb.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Product {
	@Id
	@GeneratedValue
	Long id;
	String name;
	Float price;
}
