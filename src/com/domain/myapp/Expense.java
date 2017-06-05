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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Expense {

	public boolean Add_Expense() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nName of the Member to add expense:");
		String name = sc.nextLine();
		
		File file_chk = new File("/../Users/"+ name + ".json");
		
		if(file_chk.exists())
		{
			System.out.println("\nCategory:");
			String ctg = sc.nextLine();
			System.out.println("\nAmount:");
			float amnt = sc.nextInt();
			String date = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
			
			JSONArray items = new JSONArray();
			JSONObject miniObj = new JSONObject();
			miniObj.put("Amount", amnt);
			miniObj.put("Category", ctg);
			miniObj.put("Date", date);
			
			JSONObject Obj1 = new JSONObject();
			Read_File file = new Read_File();
			
			try {
				
				Obj1 = file.read(name);
				items = (JSONArray) Obj1.get("items");
				items.add(miniObj);
			} catch (org.json.simple.parser.ParseException e) {
				e.printStackTrace();
			}
			
			JSONObject memberObj = new JSONObject();
			memberObj.put("Name", name);
			memberObj.put("items", items);
			
			Write_File obj = new Write_File();
			Boolean status = obj.write(memberObj);
			
			if(status == true)
			{
				System.out.println("\n\nExpense for " + name +" in " + ctg + " added Successfully!! ");
				System.out.println("\n\n\n");
				Balance bal = new Balance();
				bal.display(name);
				return true;
			}
			else 
				return false;
		}
			
		else
		{
			System.out.println("\n\nUser" + name + " doesn't exist ");
			System.out.println("\n\n\n");
			return false;
		}
						
	}
	
		public boolean Del_Expense(){
		
		Boolean counter = false;
		Date dt = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nName of the Member whose expense to be deleted:");
		String name = sc.nextLine();
		
		File file_chk = new File("/../Users/"+ name + ".json");
		
		if(file_chk.exists())
		{
		System.out.println("\nCategory to be deleted:");
		String ctg = sc.nextLine();
		
		System.out.println("\nEnter the date of entry in the format yyyymmdd:");	
		       
        String date = sc.nextLine();
				
		JSONArray items = new JSONArray();
		JSONObject Obj = new JSONObject();
		Read_File file = new Read_File();
		
		try {
			
			Obj = file.read(name);
			items = (JSONArray) Obj.get("items");
			
			JSONObject Obj1 = new JSONObject();
			for(int i=1; i<items.size();i++)
			{	
				Obj1 = (JSONObject) items.get(i);
				if(Obj1.get("Category").toString().equals(ctg) && Obj1.get("Date").toString().equals(date))
				{
					counter = true;
					items.remove(i);
					JSONObject memberObj = new JSONObject();
					memberObj.put("Name", name);
					memberObj.put("items", items);
					
					Write_File obj = new Write_File();
					obj.write(memberObj);
					break;
				}
			}
			if(counter == true)
			{System.out.println("\n\n\nExpense " + ctg + " for " + name +", deleted successfully!! ");
			System.out.println("\n\n\n");
			Balance bal = new Balance();
			bal.display(name);
			 return true;
			}
			else	
			{
			 System.out.println("\n\n\nEntry does not exist for " + ctg + " or your date " + date + " is not in valid format. Please try Again!!");
			 System.out.println("\n\n\n");
		     return false; }
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		return true;
	}
					
	else
		{
			System.out.println("\n\nUser" + name + " doesn't exist ");
			System.out.println("\n\n\n");
			return false;
		}
	
	}
		
	public boolean Update_Expense(){
		
		Boolean counter = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nName of the Member whose expense needs to be updated:");
		String name = sc.nextLine();
		
		File file_chk = new File("/../Users/"+ name + ".json");
		
		if(file_chk.exists())
		{
			System.out.println("\nCategory to be Updated:");
			String ctg = sc.nextLine();
			
			System.out.println("\nEnter the date of entry in the format yyyymmdd:");	
			String date = sc.nextLine();
					
			JSONArray items = new JSONArray();
			JSONObject Obj = new JSONObject();
			Read_File file = new Read_File();
			
			try {
				
				Obj = file.read(name);
				items = (JSONArray) Obj.get("items");
				
				JSONObject Obj1 = new JSONObject();
				for(int i=1; i<items.size();i++)
				{	
					Obj1 = (JSONObject) items.get(i);
					if(Obj1.get("Category").toString().equals(ctg) && Obj1.get("Date").toString().equals(date))
					{	
						counter = true;
						System.out.println("\nEnter the new Amount:");
						float amnt = sc.nextInt();
						Obj1.replace("Amount",amnt);
						
						JSONObject memberObj = new JSONObject();
						memberObj.put("Name", name);
						memberObj.put("items", items);
						
						Write_File obj = new Write_File();
						obj.write(memberObj);
						break;						
					}
				}							
			} catch (org.json.simple.parser.ParseException e) {
				e.printStackTrace();
			}
			if(counter == true)
			{System.out.println("\n\nExpense" + ctg + " Updated Successfully!! ");
			System.out.println("\n\n\n");
				Balance bal = new Balance();
				bal.display(name);
			    return true;
			}
			else	
			{
			 System.out.println("\n\nEntry" + ctg + " does not exist or your date " + date +" is not in valid format. Please try Again!!");
			 System.out.println("\n\n\n");
		     return false; }
			
		}
	else
		{
			System.out.println("\n\nUser" + name +" doesn't exist ");
			System.out.println("\n\n\n");
			return false;
		}
	}
}
