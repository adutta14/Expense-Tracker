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
public class deleteExpenseTest {

	@Test
	public void delExpTest() {
		System.out.println("\n\n**** Test to delete expense for an existing entry!! Please give valid entry as inputs****\n\n");
		Boolean result = true;
		Expense junit = new Expense();
		Boolean val = junit.Del_Expense();
		assertEquals(result, val);
	}
	
	@Test
	public void delExpTest1() {
		System.out.println("\n\n**** Test to delete expense for an invalid entry that doesn't exist!! Please give invalid <Name> as input****\n\n");
		Boolean result = false;
		Expense junit = new Expense();
		Boolean val = junit.Del_Expense();
		assertEquals(result, val);
	}
	
	@Test
	public void delExpTest2() {
		System.out.println("\n\n**** Test to delete expense for an invalid entry that doesn't exist!! Please give invalid <Category/Date> as input****\n\n");
		Boolean result = false;
		Expense junit = new Expense();
		Boolean val = junit.Del_Expense();
		assertEquals(result, val);
	}


}
