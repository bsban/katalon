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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String recruitNameText

WebUI.openBrowser('')

WebUI.navigateToUrl('http://mgt.wiselection.com/login.do')

WebUI.callTestCase(findTestCase('기업담당자/TC001-기업담당자로그인'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementText(findTestObject('Object Repository/채용등록페이지/공고명'), '[test] 채용공고등록테스트240305 (~2024.03.05)')
recruitNameText = WebUI.getText(findTestObject('Object Repository/채용등록페이지/공고명'))

int offset = recruitNameText.indexOf("(")
if (offset != -1) {
	recruitNameText = recruitNameText.substring(0,offset).trim()
}

WebUI.click(findTestObject('Object Repository/채용등록페이지/자세히보기버튼'))

WebUI.verifyElementText(findTestObject('Object Repository/채용등록페이지/전형관리홈_공고명'), recruitNameText)

//WebUI.verifyElementText(findTestObject('Object Repository/채용등록페이지/중단바_공고명'), '[아던트_계열사2] [test] 채용공고등록테스트240305')
String compText = WebUI.getText(findTestObject('Object Repository/채용등록페이지/중단바_공고명'))
if ( compText.contains(recruitNameText)) {
	KeywordUtil.markPassed("ok!")
} else {
	KeywordUtil.markFailed("failed")
}
