package com.registration.qrida

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class registrationLink 
{

	@Keyword
public void registration(String givenNameReg,String surNameReg,String emailReg,String passwordReg,String confirmReg)
{
	WebUI.click(findTestObject('Object Repository/registration/a_Dont have an account Registe'))
	
	WebUI.setText(findTestObject('Object Repository/registration/input_givenNames'), givenNameReg)
	
	WebUI.setText(findTestObject('Object Repository/registration/input_lastname'), surNameReg)
	
	WebUI.setText(findTestObject('Object Repository/registration/input_email'), emailReg)
	
	WebUI.setText(findTestObject('Object Repository/registration/input_password'), passwordReg)
	
	WebUI.setText(findTestObject('Object Repository/registration/input_confirmPassword'), confirmReg)
	
	WebUI.click(findTestObject('Object Repository/registration/button_Register'))
		
}	
	
}
