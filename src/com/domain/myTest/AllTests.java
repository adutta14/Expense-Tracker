
//
//  
//  Expense Tracker
//
//  Created by Abhishek Dutta on 11/25/16.
//  Copyright © 2016 ABHISHEK DUTTA. All rights reserved.
//



package com.domain.myTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ addMemberTest.class, dislayMemberTest.class, addExpenseTest.class,updateExpenseTest.class, displayExpenseTest.class, 
	 deleteExpenseTest.class, removeMemberTest.class })
public class AllTests {

}
