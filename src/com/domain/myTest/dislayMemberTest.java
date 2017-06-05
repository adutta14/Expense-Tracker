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
import com.domain.myapp.Members;

public class dislayMemberTest {

	@Test
	public void dispMembertest() {
		System.out.println("\n\n**** Test to display all the existing members****\n\n");
		Boolean result = true;
		Members junit = new Members();
		Boolean val = junit.Display_Members();
		assertEquals(result, val);
	}

}
