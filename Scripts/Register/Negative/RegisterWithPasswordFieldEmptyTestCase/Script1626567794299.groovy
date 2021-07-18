import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.helper.browserhelper.CustomBrowser.openRegisterPage'()

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('RegisterPage/input_signup_name'), 'aabbbccc')

WebUI.setText(findTestObject('RegisterPage/input_signup_email'), 'aaa@gmail.com')

//WebUI.setText(findTestObject('RegisterPage/input_signup_password'), 'aaa')

WebUI.setText(findTestObject('RegisterPage/input_signup_password_confirmation'), 'aaaaaa')

WebUI.check(findTestObject('RegisterPage/checkbox_agreement'))

WebUI.click(findTestObject('RegisterPage/button_register'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.delay(3)

CustomKeywords.'com.helper.browserhelper.CustomBrowser.closeBrowser'()