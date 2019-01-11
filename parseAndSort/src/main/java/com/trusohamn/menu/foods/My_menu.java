package com.trusohamn.menu.foods;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="my_menu")
@XmlAccessorType(XmlAccessType.FIELD)
public class My_menu {
    private List<Food> food;
    
    public My_menu() {
    }
    
	public My_menu(List<Food> food) {
		this.food = food;
	}
	  
	public List<Food> getFood() {
		return food;
	}
	public void setFoods(List<Food> food) {
		this.food = food;
	}


}