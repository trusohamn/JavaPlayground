package com.trusohamn.menu.parsers;

import java.util.Comparator;

import com.trusohamn.menu.foods.Food;

/**
 * @author trusohamn
 * enums with Comparator fields, used for comparing Food objects
 *
 */
public enum Sort {
	ASC ((Food o1, Food o2) -> (o1.getName().compareTo(o2.getName()))), 
	DESC ((Food o1, Food o2) -> (o2.getName().compareTo(o1.getName()))),
	CUSTOM ((Food o1, Food o2) -> {
			if(!o1.getName().equals(o2.getName())) {
				return o1.getName().compareTo(o2.getName());
			}
			else {
				return o1.getPrice().compareTo(o2.getPrice());
			}
	});

	private Comparator<Food> comp; 


	public Comparator<Food> getComp(){ 
		return this.comp; 
	} 

	private Sort(Comparator<Food> comp){ 
		this.comp = comp; 
	} 
} 