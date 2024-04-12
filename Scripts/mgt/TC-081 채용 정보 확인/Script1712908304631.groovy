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

/* Write a Katalon Studio test case to perform the following steps.
 * 1. perform testcase, TC001-기업담당자로그인
 * 2. if sucess step 1 perform next step else go to end
 * 3. get first item text at id 'resultList'
 * 4. Click the button '자세히보기'
 * 5. compare text in tag <h4> with the text got step 3 
 * 6. if equals two text this test will pass else failed
 * */
// Define a variable to store the text for comparison
WebUI.callTestCase(findTestCase('mgt/TC-003 유효한 기업관리자 로그인 정보로 로그인하는 경우'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/채용목록화면/span_'))

WebUI.verifyElementText(findTestObject('Object Repository/채용목록화면/a_(공고명)'), '[김준영] 정량평가 테스트 공고명')

WebUI.click(findTestObject('Object Repository/채용목록화면/a_(공고명)'))

WebUI.verifyElementText(findTestObject('Object Repository/채용목록화면/h2__2'), '[아던트_계열사2] [김준영] 정량평가 테스트 공고명')

WebUI.verifyElementText(findTestObject('Object Repository/채용목록화면/h4_'), '[김준영] 정량평가 테스트 공고명')

