package com.trusohamn.menu.app;

import java.io.File;
import java.util.TreeSet;

import com.trusohamn.menu.foods.Food;
import com.trusohamn.menu.parsers.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;


public class FoodContainerImpl implements MyContainer<Food> {

	private Set<Food> sortedFoods;
	private List<Food> foods;

	public FoodContainerImpl() {
		sortedFoods = new TreeSet<>();
		foods = new ArrayList<>();
	}

	@Override
	public void parseFile(File f) {
		String ext = FileUtils.getFileExtension(f);
		Parser p;
		switch(ext) {
		case ".xml" :
			p = new ParseXML();
			break; 

		case ".json" :
			p = new ParseJSON();
			break; 

		default : 
			throw new IllegalArgumentException("unsupported file extension");
		}		

		foods = p.parseFoodFromFile(f);

	}
	@Override
	public void sortMenu(Comparator<Food> comp) {
		sortedFoods =  new TreeSet<>(comp);
		sortedFoods.addAll(foods);

	}
	@Override
	public void printMenu() {
		foods.forEach(System.out::println);
	}
	@Override
	public void printSortedMenu() {
		sortedFoods.forEach(System.out::println);
	}

	public Set<Food> getSortedFoods() {
		return sortedFoods;
	}

	public void setSortedFoods(Set<Food> sortedFoods) {
		this.sortedFoods = sortedFoods;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}



}
