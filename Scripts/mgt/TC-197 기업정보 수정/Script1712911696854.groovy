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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.codehaus.groovy.ast.expr.EmptyExpression

String companyNameFirst

String companyNameSecond

WebUI.callTestCase(findTestCase('mgt/TC-003 유효한 기업관리자 로그인 정보로 로그인하는 경우'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/기업정보페이지/span_기업정보 메뉴(2레벨)'))

WebUI.click(findTestObject('Object Repository/기업정보페이지/a_기업정보메뉴'))

companyNameFirst = WebUI.getText(findTestObject('기업정보페이지/span__2기업정보화면-기업명'))

WebUI.click(findTestObject('Object Repository/기업정보페이지/b_수정버튼'))

//WebUI.click(findTestObject('Object Repository/기업정보페이지/input__companyNm'))
companyNameSecond = WebUI.getText(findTestObject('Object Repository/기업정보페이지/input__companyNm'))

if (companyNameFirst.equals(companyNameSecond)) {
    KeywordUtil.markPassed('ok!')
} else {
   KeywordUtil.markFailed('failed')
}

