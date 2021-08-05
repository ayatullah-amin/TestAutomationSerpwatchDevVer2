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

WebUI.waitForElementClickable(findTestObject('DashboardPage/ProjectRow1/button_edit_project_1'), 0)

WebUI.click(findTestObject('DashboardPage/ProjectRow1/button_edit_project_1'))

WebUI.waitForElementVisible(findTestObject('EditProjectPage/input_edit_project_name'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('EditProjectPage/input_edit_project_name'), '')

WebUI.setText(findTestObject('CreateNewProject/FormPage_1/input_domain_name'), '')

WebUI.click(findTestObject('EditProjectPage/icon_edit_remove_add_your_keyword_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('EditProjectPage/icon_edit_remove_add_your_keyword_2'))

WebUI.setText(findTestObject('EditProjectPage/input_edit_domain_competitors'), '')

WebUI.click(findTestObject('EditProjectPage/button_edit_next'))

WebUI.focus(findTestObject('EditProjectPage/input_edit_project_name'))

WebUI.delay(5)

CustomKeywords.'com.helper.browserhelper.CustomBrowser.closeBrowser'()

