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

CustomKeywords.'com.helper.browserhelper.CustomBrowser.login'()

WebUI.click(findTestObject('CreateNewProject/button_add_project'))

WebUI.waitForElementVisible(findTestObject('CreateNewProject/popup_frame_choose_ project_type_domain_or_youtube'), GlobalVariable.Timeout)

WebUI.click(findTestObject('CreateNewProject/button_domain'))

WebUI.waitForElementPresent(findTestObject('CreateNewProject/popup_window_creating_project'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('CreateNewProject/FormPage_1/input_project_name'), 'Sample')

WebUI.setText(findTestObject('CreateNewProject/FormPage_1/input_domain_name'), '')

WebUI.waitForElementVisible(findTestObject('CreateNewProject/FormPage_1/input_add_your_keyword'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('CreateNewProject/FormPage_1/input_add_your_keyword'), 'politik')

WebUI.setText(findTestObject('CreateNewProject/FormPage_1/input_keyword_suggestions'), 'partai')

WebUI.click(findTestObject('CreateNewProject/FormPage_1/button_next'))

WebUI.delay(3)

CustomKeywords.'com.helper.browserhelper.CustomBrowser.closeBrowser'()

