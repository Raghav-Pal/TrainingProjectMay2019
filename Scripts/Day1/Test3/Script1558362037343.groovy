import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Day1/Page_OrangeHRM_2/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Day1/Page_OrangeHRM_2/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Day1/Page_OrangeHRM_2/input_Password_Submit'))

WebUI.click(findTestObject('Day1/Page_OrangeHRM_2/b_Leave'))

WebUI.click(findTestObject('Day1/Page_OrangeHRM_2/b_Dashboard'))

WebUI.click(findTestObject('Day1/Page_OrangeHRM_2/a_Welcome Admin'))

WebUI.verifyElementPresent(findTestObject('Day1/Page_OrangeHRM_2/a_Logout'), 5)

WebUI.click(findTestObject('Day1/Page_OrangeHRM_2/a_Logout'))

WebUI.closeBrowser()

