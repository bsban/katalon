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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://mgt.wiselection.com/login.do')

WebUI.setText(findTestObject('Object Repository/Mangement/로그인페이지/input__userId'), 'bsban')

WebUI.setEncryptedText(findTestObject('Object Repository/Mangement/로그인페이지/input__pw'), '0N+/9BdCbC1lxno8MXOsSQ==')

WebUI.click(findTestObject('Object Repository/Mangement/로그인페이지/button_'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Mangement/슈퍼관리자메뉴/span_'))

//WebUI.verifyElementText(findTestObject('Object Repository/Mangement/슈퍼관리자메뉴/a_'), '권한관리')
WebUI.verifyTextNotPresent('권한관리', false)

