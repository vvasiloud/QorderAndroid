package com.example.clientalphaprototype.util;

import java.io.IOException;
import java.net.URL;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil{

	private static final ObjectMapper mapper = new ObjectMapper();
	
	protected ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }


	public static <T> T JsonToPojoParser(String url, Class<?> target) throws JsonParseException, JsonMappingException, IOException, ClassNotFoundException {
		URL jsonurl = new URL(url);
        return mapper.readValue(jsonurl, mapper.getTypeFactory().constructType(Class.forName(target.getName())));
	}
	
	//TODO: PojoToJsonParser



}
