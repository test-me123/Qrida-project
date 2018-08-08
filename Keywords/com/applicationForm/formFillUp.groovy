package com.applicationForm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.event.InputEvent
import java.awt.event.KeyEvent

import org.apache.commons.logging.Log

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
import groovy.util.logging.Log4j

public class formFillUp {

	@Keyword
	public void section1() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/createApplication/applicantTitle'), 'Mrs', false)
		//WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/createApplication/applicantTitle'), 'Mrs', false, 0, FailureHandling.STOP_ON_FAILURE)
		//WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/createApplication/applicantTitle'), 'Mrs', true, 5)
		println('---------------------------------------------------------')
		WebUI.setText(findTestObject('Object Repository/createApplication/firstName'), 'test')
		WebUI.setText(findTestObject('Object Repository/createApplication/middleName'), 'middle name')
		WebUI.setText(findTestObject('Object Repository/createApplication/lastname'), 'sur name')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/createApplication/date'), '12', false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/createApplication/month'), '11', false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/createApplication/year'), '1960', false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/createApplication/permanentResident'), 'Yes', false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/createApplication/familyTax'),'Yes', false)
		//upload
		//WebUI.uploadFile(findTestObject('Object Repository/createApplication/Page_Portal/span_Upload'), 'C:\\Users\\Sai Rahul\\Downloads\\User_ Rahul_2018-05-06_2018-05-12.csv')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/createApplication/incomeEarner'), 'Yes', false)
	}

	@Keyword
	public void section2a() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantIdenti/idtype'), 'SA Drivers Licence Number', false)
		//WebUI.setText(findTestObject('Object Repository/applicantIdenti/idnum'), '123456789')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantIdenti/idtype1'), 'WA Drivers Licence Number', false)
		//WebUI.setText(findTestObject('Object Repository/applicantIdenti/idnum1'), '9876543210')
		//WebUI.setText(findTestObject('Object Repository/contactDetails/nominatedPerson'), 'test nominated')
		//WebUI.setText(findTestObject('Object Repository/contactDetails/landline'), '9874125630')
		//WebUI.setText(findTestObject('Object Repository/contactDetails/mobilenum'), '')
		//WebUI.setText(findTestObject('Object Repository/contactDetails/email'), 'test@test.com')
		//WebUI.setText(findTestObject('Object Repository/contactDetails/noDependents'), '2')
	}

	@Keyword
	public void section2b() {
		WebUI.setText(findTestObject('Object Repository/applicantDetails/propertyName'), 'property name')
		WebUI.setText(findTestObject('Object Repository/applicantDetails/unitNumber'), '122')
		WebUI.setText(findTestObject('Object Repository/applicantDetails/streetNumber'), '12345')
		WebUI.setText(findTestObject('Object Repository/applicantDetails/streetName'), 'Street name')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantDetails/streetType'), 'Anchorage', false)
		WebUI.setText(findTestObject('Object Repository/applicantDetails/sunurb'), 'town name')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantDetails/state'), 'TAS', false)
		WebUI.setText(findTestObject('Object Repository/applicantDetails/postCode'), '500021')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantDetails/householdCosts'), 'Yes', false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantDetails/solarBonus'), 'Yes', false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantDetails/permanentInstallation'), 'Yes', false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantDetails/postalInstall'), 'Yes', false)
	}

	@Keyword
	public void startNewApplication() {
		WebUI.click(findTestObject('Object Repository/createApplication/startNewApplication'))
		WebUI.click(findTestObject('Object Repository/createApplication/anIndividual'))
		WebUI.click(findTestObject('Object Repository/createApplication/SolarPanelInstallation'))
		WebUI.click(findTestObject('Object Repository/createApplication/IndividualSolarLoan'))
		WebUI.click(findTestObject('Object Repository/createApplication/button_Create new Application'))
	}



	@Keyword
	public void purchaseDetails(){
		WebUI.click(findTestObject('Object Repository/applicantIdenti/Page_Portal/button_Save'))
		Thread.sleep(5000)
		WebUI.click(findTestObject('Object Repository/applicantIdenti/Page_Portal/button_Next'))

		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantIdenti/step2/batteryInstalled'), 'Yes', false)
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step2/retailerName'), 'retailer name')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step2/abnRetailer'), '1234567890')
		//-----upload---
		WebUI.click(findTestObject('Object Repository/applicantIdenti/step2/button_Next'))
	}




	@Keyword
	public void yourFinance(){
		//step3
		WebUI.click(findTestObject('Object Repository/applicantIdenti/step3/1checkbox'))
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/primaryIncome'), 'primaryIncome')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/primaryIncomeEarner'), 'primaryIncomeEarner')

		WebUI.selectOptionByLabel(findTestObject('Object Repository/applicantIdenti/step3/otherIncome'), 'Yes', false)
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/homeLoan'), '1')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/food'), '2')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/utilities'), '3')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/entertainment'), '4')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/schooling'), '5')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/motorVehicle'), '6')
		//WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/personalServices'), '7')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/healthcare'), '8')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/personalInsurance'), '9')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/clothing'), '10')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/residentialHomeValue'), '11')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/otherRealEstate'), '12')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/vechile'), '13')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/householdContent'), '14')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/otherAssest'), '15')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/homeLoan (1)'), '16')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/otherLoans'), '17')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/otherInvestmentLoans'), '18')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/storeLimits'), '19')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/outstandingTaxes'), '20')
		WebUI.setText(findTestObject('Object Repository/applicantIdenti/step3/otherCreditors'), '21')
		WebUI.click(findTestObject('Object Repository/applicantIdenti/step3/button_Next'))
	}
}



