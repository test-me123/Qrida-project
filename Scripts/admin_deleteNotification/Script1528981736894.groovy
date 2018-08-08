import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.List
import java.io.ObjectOutputStream.DebugTraceInfoStack

import org.openqa.selenium.By
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://qrida.dev-fsit.com/login')
WebUI.setText(findTestObject('Object Repository/Qrida_Login/input_email'), 'admin@creativecuriosity.com.au')
WebUI.setText(findTestObject('Object Repository/Qrida_Login/input_password'), 'happylittleaccident')
WebUI.click(findTestObject('Object Repository/Qrida_Login/button_Login'))
WebUI.click(findTestObject('Object Repository/notification/a_Notifications'))

String ExpectedValue = "This is a test Notification"
 
WebDriver driver = DriverFactory.getWebDriver()


//WebElement Table = driver.findElement(By.xpath("*/table/tbody"))
//List<WebElement> rows_table = Table.findElements(By.tagName("tr"))
//int rows_count = rows_table.getRows()
//println(rows_count)

WebElement e=driver.findElement(By.xpath("/html/body/app-root/notifications/sidemenu/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]")).getText()

System.out.println(e)
Assert.assertEquals(e, ExpectedValue)
