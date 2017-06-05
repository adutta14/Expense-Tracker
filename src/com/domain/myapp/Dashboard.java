//
//  
//  Expense Tracker
//
//  Created by Abhishek Dutta on 11/25/16.
//  Copyright © 2016 ABHISHEK DUTTA. All rights reserved.
//


package com.domain.myapp;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Dashboard {
	
	public static void main(String[] args) {
		
		Dashboard dw = new Dashboard();
		dw.runner();
	}
	
	public void runner(){
		
		Dashboard dw = new Dashboard();
		System.out.println("\n\n\n");		
		System.out.println("=====================================> EXPENSE TRACKER <==============================================");
		System.out.println("\n   a) Add Expense -- 1 ");
		System.out.println("   b) Delete Expense -- 2 ");
		System.out.println("   c) Update Expenses -- 3 ");
		System.out.println("   d) Display Expenses -- 4 ");
		System.out.println("   e) Add a Member -- 5 ");
		System.out.println("   f) Remove a Member -- 6  ");
		System.out.println("   g) Display the list of Members -- 7  ");
			
		System.out.println("\nPlease enter your Choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		try{
			
		choice = sc.nextInt();
		
		}catch (Exception e) {
			System.out.println("\n");
		}	
		
		sc.nextLine();
				
		switch(choice){
			case 1:
					Expense exp = new Expense();
					exp.Add_Expense();
					dw.runner();
					break;
			case 2:
					Expense exp1 = new Expense();
					exp1.Del_Expense();
					dw.runner();
					break;
			case 3: Expense exp2 = new Expense();
					exp2.Update_Expense();
					dw.runner();
					break;
			case 4:
					System.out.println("\nName of the Member whose balance to be shown:");
					String name = sc.nextLine();
					Balance bal = new Balance();
					bal.display(name);
					dw.runner();
					break;
			case 5:
					Members mem = new Members();
					mem.Add_Members();
					dw.runner();
					break;
			case 6:
					Members mem1 = new Members();
					mem1.Remove_Members();
					dw.runner();
					break;
			case 7:
					Members mem2 = new Members();
					mem2.Display_Members();
					dw.runner();
					break;
			default: 
					System.out.println("\n\nINVALID CHOICE !!! Please try Again");
					System.out.println("\n\n\n");
					dw.runner();
					break;
		}
		
		
	}

}
