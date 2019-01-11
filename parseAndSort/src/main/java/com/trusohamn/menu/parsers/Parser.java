package com.trusohamn.menu.parsers;

import java.io.File;
import java.util.List;

import com.trusohamn.menu.foods.Food;


public interface Parser {
	/**
	 * @param f File for parsing
	 * @return List of Food objects parsed from File f
	 */
	List<Food> parseFoodFromFile(File f);
}
