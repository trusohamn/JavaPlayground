package com.trusohamn.menu.app;

import java.io.File;
import java.util.Comparator;

import org.junit.Test;

import com.trusohamn.menu.foods.Food;
import com.trusohamn.menu.parsers.FileUtils;
import com.trusohamn.menu.parsers.Sort;

public class AppTest {

	@Test
	public void testJSONdesc() {
		String filename = "menu.json";
		File f;

		FileUtils fu = new FileUtils();
		f = fu.getFileFromResources(filename);
		
		MyContainer<Food> fc = new FoodContainerImpl();
		//parsing the file
		fc.parseFile(f);
		
		//retrieve the proper comparator
		String sortingWay = "DESC";
		Comparator<Food> comp = Sort.valueOf(sortingWay).getComp();
		//sort and print the sorted menu
		System.out.println("\nSorting: " + filename + " by " + sortingWay);
		fc.sortMenu(comp);
		fc.printSortedMenu();
	}
	
	@Test
	public void testJSONasc() {
		String filename = "menu.json";
		File f;

		FileUtils fu = new FileUtils();
		f = fu.getFileFromResources(filename);
		
		MyContainer<Food> fc = new FoodContainerImpl();
		//parsing the file
		fc.parseFile(f);
		
		//retrieve the proper comparator
		String sortingWay = "ASC";
		Comparator<Food> comp = Sort.valueOf(sortingWay).getComp();
		//sort and print the sorted menu
		System.out.println("\nSorting: " + filename + " by " + sortingWay);
		fc.sortMenu(comp);
		fc.printSortedMenu();
	}
	
	@Test
	public void testXMLdesc() {
		String filename = "menu.xml";
		File f;

		FileUtils fu = new FileUtils();
		f = fu.getFileFromResources(filename);
		
		MyContainer<Food> fc = new FoodContainerImpl();
		//parsing the file
		fc.parseFile(f);
		
		//retrieve the proper comparator
		String sortingWay = "DESC";
		Comparator<Food> comp = Sort.valueOf(sortingWay).getComp();
		//sort and print the sorted menu
		System.out.println("\nSorting: " + filename + " by " + sortingWay);
		fc.sortMenu(comp);
		fc.printSortedMenu();
	}
	
	@Test
	public void testXMLasc() {
		String filename = "menu.xml";
		File f;

		FileUtils fu = new FileUtils();
		f = fu.getFileFromResources(filename);
		
		MyContainer<Food> fc = new FoodContainerImpl();
		//parsing the file
		fc.parseFile(f);
		
		//retrieve the proper comparator
		String sortingWay = "ASC";
		Comparator<Food> comp = Sort.valueOf(sortingWay).getComp();
		//sort and print the sorted menu
		System.out.println("\nSorting: " + filename + " by " + sortingWay);
		fc.sortMenu(comp);
		fc.printSortedMenu();
	}

}
