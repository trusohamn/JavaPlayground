package com.trusohamn.menu.app;

import java.io.File;
import java.util.Comparator;

import com.trusohamn.menu.foods.Food;
//import com.trusohamn.menu.parsers.FileUtils;
import com.trusohamn.menu.parsers.Sort;

/**
 * @author trusohamn
 * main app
 *
 */
public class App {


	public static void main(String[] args) {
		String filename = args[0];
		File f;
		//uncomment to get the file from resources folder
		//FileUtils fu = new FileUtils();
		//f = fu.getFileFromResources(filename);
		f = new File(filename);
		
		MyContainer<Food> fc = new FoodContainerImpl();
		//parsing the file
		fc.parseFile(f);
		
		//retrieve the proper comparator
		String sortingWay = args[1].toUpperCase();
		Comparator<Food> comp = Sort.valueOf(sortingWay).getComp();
		//sort and print the sorted menu
		fc.sortMenu(comp);
		fc.printSortedMenu();
		
	}

}
