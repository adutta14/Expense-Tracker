//
//  
//  Expense Tracker
//
//  Created by Abhishek Dutta on 11/25/16.
//  Copyright © 2016 ABHISHEK DUTTA. All rights reserved.
//



package com.domain.myTest;

import static org.junit.Assert.*;
import org.junit.Test;
import com.domain.myapp.Expense;
public class addExpenseTest {

	@Test
	public void addExpTest() {
		System.out.println("\n\n****Test to add expense!! Please give all valid inputs****\n\n");
		Boolean result = true;
		Expense junit = new Expense();
		Boolean val = junit.Add_Expense();
		assertEquals(result, val);
	}
	
	@Test
	public void addExpTest1() {
		System.out.println("\n\n**** Test to add expense for an invalid user!! Please give invalid <Name> as input****\n\n");
		Boolean result = false;
		Expense junit = new Expense();
		Boolean val = junit.Add_Expense();
		assertEquals(result, val);
	}

}
