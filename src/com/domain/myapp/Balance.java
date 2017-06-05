//
//  
//  Expense Tracker
//
//  Created by Abhishek Dutta on 11/25/16.
//  Copyright © 2016 ABHISHEK DUTTA. All rights reserved.
//

package com.domain.myapp;

import java.io.File;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Balance {
	
	public boolean display(String name){
		
		Scanner sc = new Scanner(System.in);
		
		File file_chk = new File("/../Users/"+ name + ".json");
		
		if(file_chk.exists())
		{
			JSONArray items = new JSONArray();
			JSONObject Obj1 = new JSONObject();
			Read_File file = new Read_File();
			
			try {
				
				Obj1 = file.read(name);
				items = (JSONArray) Obj1.get("items");	
				
				JSONObject Obj2 = new JSONObject();
				System.out.println("\n All transactions for member " + name + "\n");
				System.out.println(" Date      |   Category  |  Amount");
				System.out.println(" ----          --------     ------");
				for(int i=1; i<items.size();i++)
				{	
					Obj2 = (JSONObject) items.get(i);
					System.out.println(" " +Obj2.get("Date").toString()+"  |    "+ Obj2.get("Category").toString() + "    |  " + Obj2.get("Amount").toString());
				}
			
			} catch (org.json.simple.parser.ParseException e) {
				e.printStackTrace();
			}
			System.out.println("\n\n\n");
			return true;
		}
		else
		{
			System.out.println("User" + name +" doesn't exist ");
			System.out.println("\n\n\n");
			return false;
		}
	}

}
