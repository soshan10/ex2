package com.soshan.ex2;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "Sample application to test challenge 2";
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,String> index(int i) {
		// Using a map to create a dynamic json structure. For a more complex structure, serialized object may be used.
		HashMap<String,String> map = new HashMap<String,String>();
		StringBuilder str = new StringBuilder();
		if (i % 7 == 0)
			str.append( "C" );
		if (i % 9 == 0)
			str.append( "N" );
		if (str.length() == 0)
			str.append(i);
		map.put("Response", str.toString());
		return map;
	}
}
