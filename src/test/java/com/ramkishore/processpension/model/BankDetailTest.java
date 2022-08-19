package com.ramkishore.processpension.model;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BankDetailTest {
	
	@Test
	public void NoArgsBankTest()
	{
		assertThat(new BankDetail()).isNotNull();
	}
	
	@Test
	public void AllArgsBankTest()
	{
		BankDetail bankDetail = new BankDetail("SBI", "11223344", "public");
		assertThat(assertThat(bankDetail).isNotNull());
	}
	
	@Test
	public void SetterBankTest()
	{
		BankDetail bankDetail = new BankDetail();
		bankDetail.setAccountNumber("12345666655433");
		bankDetail.setBankName("SBI");
		bankDetail.setBankType("public");
		assertThat(assertThat(bankDetail).isNotNull());
	}
	
	@Test
	public void getBankDetailTest()
	{
		BankDetail bankDetail = new BankDetail("SBI", "11223344", "public");
		String bankAccountNumber = bankDetail.getAccountNumber() ;
		String bankName = bankDetail.getBankName() ;
		String bankType = bankDetail.getBankType() ;
		assertEquals("11223344", bankAccountNumber) ;
		assertEquals("SBI", bankName) ;
		assertEquals("public", bankType) ;
	}
	

}
