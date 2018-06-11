package com.login.qrida

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

public class loginQrida {

	@Keyword
	public void loginApplication(String url,String username,String password) {
		WebUI.openBrowser(url)
		WebUI.maximizeWindow()
		WebUI.setText(findTestObject('Object Repository/Qrida_Login/input_email'), username)
		WebUI.setText(findTestObject('Object Repository/Qrida_Login/input_password'), password)
		WebUI.click(findTestObject('Object Repository/Qrida_Login/input_rememberMe'))
		WebUI.click(findTestObject('Object Repository/Qrida_Login/button_Login'))
		Thread.sleep(3000)
	}

	@Keyword
	public void logintoApplication() {
		loginApplication(GlobalVariable.url,GlobalVariable.username,GlobalVariable.password)
	}

	@Keyword
	public void logoutApplication() {
		WebUI.closeBrowser()
	}

	@Keyword
	public void openBrowser(){
		WebUI.openBrowser('http://qrida.dev-fsit.com/login')
	}
}
