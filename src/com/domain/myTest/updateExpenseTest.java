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

public class updateExpenseTest {

	@Test
	public void updateExpTest() {
		System.out.println("\n\n****Test to update expense for a valid entry!! Please give all valid entries as input****\n\n");
		Boolean result = true;
		Expense junit = new Expense();
		Boolean val = junit.Update_Expense();
		assertEquals(result, val);
	}
	
	@Test
	public void updateExpTest1() {
		System.out.println("\n\n**** Test to update expense for an invalid entry that doesn't exist!! Please give invalid <Name> as input****\n\n");
		Boolean result = false;
		Expense junit = new Expense();
		Boolean val = junit.Update_Expense();
		assertEquals(result, val);
	}
	
	@Test
	public void updateExpTest2() {
		System.out.println("\n\n**** Test to update expense for an invalid entry that doesn't exist!! Please give invalid <Category/Date> as input****\n\n");
		Boolean result = false;
		Expense junit = new Expense();
		Boolean val = junit.Update_Expense();
		assertEquals(result, val);
	}


}
