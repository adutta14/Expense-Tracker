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
public class addMemberTest {

	@Test
	public void addMemberTest() {
		System.out.println("\n\n****Test to check if member is added properly****\n\n");
		Boolean result = true;
		Members junit = new Members();
		Boolean val = junit.Add_Members();
		assertEquals(result, val);
	}

}
