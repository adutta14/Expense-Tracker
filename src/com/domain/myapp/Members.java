//
//  
//  Expense Tracker
//
//  Created by Abhishek Dutta on 11/25/16.
//  Copyright © 2016 ABHISHEK DUTTA. All rights reserved.
//

package com.domain.myapp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Members {

	public boolean Add_Members() {
		
		String ctg = null;
		String date = null;
		float amnt = 0;
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Name of the Member to be Added:");
		String name = sc.nextLine();
		
		JSONArray items = new JSONArray();
		JSONObject miniObj = new JSONObject();
		miniObj.put("Amount", amnt);
		miniObj.put("Category", ctg);
		miniObj.put("Date", date);
		items.add(miniObj);
				
		JSONObject memberObj = new JSONObject();
		memberObj.put("Name", name);
		memberObj.put("items", items);
		
		Write_File obj = new Write_File();
		Boolean status = obj.write(memberObj);
		
		if(status == true)
		{
			System.out.println("\n\n"+ name +" added Successfully!! ");
			System.out.println("\n\n\n");
			Display_Members();
			return true;
		}
		else
			return false;
		
	}
	
	public boolean Remove_Members(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the Member to remove:");
		String name = sc.nextLine();
		
		File file_chk = new File("/../Users/"+ name + ".json");
		
		if(file_chk.exists())
		{
			File file = new File("/../Users/"+ name + ".json");
			file.delete();
			System.out.println("\n\nUser " + name + " successfully deleted!!");
			System.out.println("\n\n\n");
			Display_Members();
			return true;
		}
		else
		{
			System.out.println("\n\nUser" + name+ " doesn't exist ");
			System.out.println("\n\n\n");
			return false;
		}
			
	}
	
	public boolean Display_Members(){
		
		File folder = new File("/../Users/");
		File[] listOfFiles = folder.listFiles();
		System.out.println("\n\nAll Members :- ");
		System.out.println("=========== ");

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile())
		        System.out.println((i+1)+ ")" + listOfFiles[i].getName().substring(0,listOfFiles[i].getName().lastIndexOf('.')));
	    }
		    
		    return true;
	}
}
