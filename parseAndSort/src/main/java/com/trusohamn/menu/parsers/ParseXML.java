package com.trusohamn.menu.parsers;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.trusohamn.menu.foods.My_menu;
import com.trusohamn.menu.foods.Food;

public class ParseXML implements Parser {

	@Override
	public List<Food> parseFoodFromFile(File f) {

		JAXBContext jaxbContext;
		My_menu menu = null;
		try { 
			jaxbContext = JAXBContext.newInstance(My_menu.class); 
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			menu = (My_menu) jaxbUnmarshaller.unmarshal(f);
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
		return menu.getFood();
	}

}
