package com.trusohamn.menu.foods;

public class Menu {
    private My_menu my_menu;
    
    public Menu() {
    }
    
	public Menu(My_menu my_menu) {
		this.my_menu = my_menu;
	}
	  
	public My_menu getMy_menu() {
		return my_menu;
	}
	public void setMy_menu(My_menu my_menu) {
		this.my_menu = my_menu;
	}

}