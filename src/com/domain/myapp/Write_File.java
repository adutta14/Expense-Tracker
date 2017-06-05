//
//  
//  Expense Tracker
//
//  Created by Abhishek Dutta on 11/25/16.
//  Copyright © 2016 ABHISHEK DUTTA. All rights reserved.
//


package com.domain.myapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class Write_File {

	public boolean write(JSONObject obj) {
		
		String path = "/../Users/";
		File file1 = new File("/../Users/");
		file1.mkdirs();
		
		String name = (String) obj.get("Name");
		
		try{
			String file = name + ".json";
			path = path + file;
			obj.remove("Name");
			FileWriter fileWriter = new FileWriter(path);
	        fileWriter.write(obj.toJSONString());   
	        fileWriter.close();  
	  
	        } catch (IOException e) {  
	            System.out.println("\n\n User" + name + " doesn't Exist!!");  
	            System.out.println("\n\n\n");
	            return false;
	        }
		return true; 

	}

}
