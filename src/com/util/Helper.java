package com.util;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class Helper {

    public static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    public static String convertJavaToJson(Object object){
        String jsonResults = "";
        try {
            jsonResults = mapper.writeValueAsString(object);
        } catch (IOException e) {
            System.out.println("There was a problem in coverting object in JSON" +e.getMessage());
        }
        return jsonResults;
    }


}
