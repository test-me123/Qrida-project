import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.event.KeyEvent

import org.openqa.selenium.Keys

import com.google.common.collect.Multimaps.Keys.KeysEntrySet
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


CustomKeywords.'com.login.qrida.loginQrida.loginApplication'('http://qrida.dev-fsit.com/login', 'rahul.sai@test.com', 'Sai@Rahul1234')
for(i=0;i<1;i++)
{
WebUI.click(findTestObject('Object Repository/delete/button_Delete'))
WebUI.click(findTestObject('Object Repository/deleteee/button_Delete Application'))
WebUI.click(findTestObject('Object Repository/deleteee/button_OK'))
Thread.sleep(3000)
}

CustomKeywords.'com.applicationForm.formFillUp.startNewApplication'()
CustomKeywords.'com.applicationForm.formFillUp.section1'()
CustomKeywords.'com.applicationForm.formFillUp.section2b'()
CustomKeywords.'com.applicationForm.formFillUp.purchaseDetails'()
CustomKeywords.'com.applicationForm.formFillUp.yourFinance'()

//WebUI.click(findTestObject('Object Repository/applicantIdenti/loanRepaymentDetails_Step4/a_Loan Repayment Details'))
Thread.sleep(3000)

WebUI.setText(findTestObject('Object Repository/applicantIdenti/step4/bsb'), '123456789123456')
WebUI.click(findTestObject('Object Repository/applicantIdenti/step4/bsb'))
WebUI.setText(findTestObject('Object Repository/applicantIdenti/step4/bsb'), KeyEvent.VK_TAB)
WebUI.setText(findTestObject('Object Repository/applicantIdenti/step4/accName'), 'accountName')
WebUI.setText(findTestObject('Object Repository/applicantIdenti/step4/accNumber'), '11345125412')

