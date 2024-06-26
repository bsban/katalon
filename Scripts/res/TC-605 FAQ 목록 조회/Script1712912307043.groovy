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

WebUI.navigateToUrl('http://testhost.wiselection.com/')

WebUI.click(findTestObject('Object Repository/RecruitHome/Page__2_/a_'))

WebUI.click(findTestObject('Object Repository/RecruitHome/Page__2_/a_FAQ'))

'전체 탭\r\n'
WebUI.click(findTestObject('Object Repository/RecruitHome/Page__2_/a__1'))

'서류전형탭'
WebUI.click(findTestObject('Object Repository/RecruitHome/Page__2_/a__1_2'))

'필기전형탭'
WebUI.click(findTestObject('Object Repository/RecruitHome/Page__2_/a__1_2_3'))

'면접전형탭'
WebUI.click(findTestObject('Object Repository/RecruitHome/Page__2_/a__1_2_3_4'))

'기타탭'
WebUI.click(findTestObject('Object Repository/RecruitHome/Page__2_/a__1_2_3_4_5'))

'FAQ 제목\r\n'
WebUI.click(findTestObject('Object Repository/RecruitHome/Page__2_/strong_'))

'답변'
WebUI.verifyElementVisible(findTestObject('Object Repository/RecruitHome/Page__2_/div_A'))

