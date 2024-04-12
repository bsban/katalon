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

String recruitNameText

WebUI.callTestCase(findTestCase('mgt/TC-003 유효한 기업관리자 로그인 정보로 로그인하는 경우'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/채용목록화면/span_'))

//WebUI.verifyElementText(findTestObject('null'), '[test] 채용공고등록테스트240305 (~2024.03.05)')
'목록에서 첫번째 공고명을 저장'
recruitNameText = WebUI.getText(findTestObject('Object Repository/채용목록화면/a_(공고명)'))

WebUI.click(findTestObject('Object Repository/채용목록화면/a_(공고명)'))

//int offset = recruitNameText.indexOf('(')
//if (offset != -1) {
//    recruitNameText = recruitNameText.substring(0, offset).trim()
//}
//WebUI.verifyElementText(findTestObject('Object Repository/채용목록화면/h4_'), '[김준영] 정량평가 테스트 공고명')
'전형관리홈에서 공고명 확인'
WebUI.verifyElementText(findTestObject('Object Repository/채용목록화면/h4_'), recruitNameText)

//WebUI.verifyElementText(findTestObject('null'), '[아던트_계열사2] [test] 채용공고등록테스트240305')
'전형관리 중간 바에서 공고명 저장\r\n'
String compText = WebUI.getText(findTestObject('Object Repository/채용목록화면/h2__2'))

'처음 선택했던 공고명과 같은지 확인'
if (compText.contains(recruitNameText)) {
    KeywordUtil.markPassed('ok!')
} else {
    KeywordUtil.markFailed('failed')
}

