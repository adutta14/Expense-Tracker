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

public class removeMemberTest {

	@Test
	public void delMemberTest() {
		System.out.println("\n\n****Test to check existing user removed!! Please enter valid <Name>****\n\n");
		Boolean result = true;
		Members junit = new Members();
		Boolean val = junit.Remove_Members();
		assertEquals(result, val);
	}
	
	@Test
	public void delMemberTest1() {
		System.out.println("\n\n****Test to check unknown user removed!! Please enter invalid <Name> which does not exist****\n\n");
		Boolean result = false;
		Members junit = new Members();
		Boolean val = junit.Remove_Members();
		assertEquals(result, val);
	}

}
