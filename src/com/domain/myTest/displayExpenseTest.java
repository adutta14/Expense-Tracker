
//
//  
//  Expense Tracker
//
//  Created by Abhishek Dutta on 11/25/16.
//  Copyright © 2016 ABHISHEK DUTTA. All rights reserved.
//


package com.domain.myTest;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;
import com.domain.myapp.Balance;
public class displayExpenseTest {

	@Test
	public void dispExpTest() {
		System.out.println("\n\n**** Test to check whether member exist or not!! Please give an valid <Name> as input****\n\n");
		Scanner sc = new Scanner(System.in);
		Boolean result = true;
		
		System.out.println("Name of the Member whose balance to be shown:");
		String name = sc.nextLine();
		
		Balance junit = new Balance();
		Boolean val = junit.display(name);
		assertEquals(result, val);
	}
	
	@Test
	public void dispExpTest1() {
		System.out.println("\n\n**** Test to check whether member exist or not!! Please give an invalid <Name> as input****\n\n");
		Scanner sc = new Scanner(System.in);
		Boolean result = false;
		
		System.out.println("Name of the Member whose balance to be shown:");
		String name = sc.nextLine();
		
		Balance junit = new Balance();
		Boolean val = junit.display(name);
		assertEquals(result, val);
	}

}
