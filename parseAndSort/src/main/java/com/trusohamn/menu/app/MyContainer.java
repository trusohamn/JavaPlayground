package com.trusohamn.menu.app;

import java.io.File;
import java.util.Comparator;


public interface MyContainer<T> {
	
	/**
	 * @param f File for parsing
	 * uses Parser accordingly to the File extension, or throws the IllegalArgumentException("unsupported file extension")
	 * retrieves Food object from file f and keeps in local List foods
	 * 
	 */
	void parseFile(File f);
	
	/**
	 * @param comp Comparator for sorting Food objects from foods List.
	 * Stores sorted elements in Treeset sortedFoods.
	 */
	void sortMenu(Comparator<T> comp);
	
	/**
	 * prints elements of List foods
	 */
	void printMenu();
	
	/**
	 * print elements of Treeset sortedFoods
	 */
	void printSortedMenu();

}
