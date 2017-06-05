//
//  
//  Expense Tracker
//
//  Created by Abhishek Dutta on 11/25/16.
//  Copyright © 2016 ABHISHEK DUTTA. All rights reserved.
//


package com.domain.myapp;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read_File {
	
	public JSONObject read(String name) throws ParseException{
		Object obj1; 
		JSONObject jsonObject = null; 
		JSONParser parser = new JSONParser(); 
		try{
			FileReader reader=new FileReader("/../Users/" + name + ".json");
			obj1 = parser.parse(reader);
			jsonObject = (JSONObject)obj1;	       
			reader.close();
		}catch (IOException e) {  
            System.out.println("\n\n User" + name+ " doesn't Exist!!");
            System.out.println("\n\n\n");
           }
		return jsonObject;
		
	}

}
