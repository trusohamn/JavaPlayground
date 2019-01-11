package com.trusohamn.menu.parsers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trusohamn.menu.foods.Food;
import com.trusohamn.menu.foods.Menu;

public class ParseJSON implements Parser{
	ObjectMapper mapper;

	public ParseJSON() {
		mapper = new ObjectMapper();	
	}
	
	@Override
	public List<Food> parseFoodFromFile(File f) {
		Menu obj = null;
		try {
			obj = mapper.readValue(f, Menu.class);

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return obj.getMy_menu().getFood();
	}

}
