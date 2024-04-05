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
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedConditions as EC
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor

@Keyword
def clickUsingJS(TestObject to, int timeout)
{
	WebDriver driver = DriverFactory.getWebDriver()
	///WebElement element = WebUICommonHelper.findWebElement(to, timeout)
	WebElement element = WebUI.findWebElement(to, timeout)
	JavascriptExecutor executor = (driver as  JavascriptExecutor)
	executor.executeScript('arguments[0].click()',element)
}

WebUI.callTestCase(findTestCase('기업담당자/TC001-기업담당자로그인'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/채용등록페이지/span_'))

WebUI.setText(findTestObject('Object Repository/채용등록페이지/input__WAP-EMPL-0010-RecruitNoticNm'), '2024하반기 신입사원 모집')

WebUI.click(findTestObject('Object Repository/채용등록페이지/input__WAP-EMPL-0010-RecruitNoticNm'))

WebUI.setText(findTestObject('Object Repository/채용등록페이지/input__departmentName'), '사무직')

WebUI.sendKeys(findTestObject('Object Repository/채용등록페이지/input__departmentName'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/채용등록페이지/input__departmentName'), '기술직')

WebUI.sendKeys(findTestObject('Object Repository/채용등록페이지/input__departmentName'), Keys.chord(Keys.ENTER))

clickUsingJS(findTestObject('채용등록페이지/button_'),10)
//WebUI.click(findTestObject('채용등록페이지/button_'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/button__1'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/span__1_2'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/span__1_2_3'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/input__calendar1_1'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/span_4'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/input__calendar1_2'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/span_30'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/button__1_2'))

WebUI.setText(findTestObject('Object Repository/채용등록페이지/body_concat(html1bodyclass, , tx-content-container, , )_tx-content-container'), 
    '개인정보 수집 및 이용수칙1 약관내용 입니다.<div style=""><br></div><div><p style="">1. 총칙</p><p style="">2. 용어정의</p><p style="">3. 회사의책</p><p style=""><br></p></div><p><br></p>')

WebUI.click(findTestObject('Object Repository/채용등록페이지/button__1_2_3'))

WebUI.setText(findTestObject('Object Repository/채용등록페이지/body_concat(html1bodyclass, , tx-content-container, , )_tx-content-container'), 
    '개인정보 수집 및 이용수칙1 약관내용 입니다.<div style=""><br></div><div><p style="">1. 총칙</p><p style="">2. 용어정의</p><p style="">3. 회사의책임</p><p style=""><br></p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: block;">/html[1]/body[@class="tx-content-container"]</div></div></div><p><br></p>')

WebUI.click(findTestObject('Object Repository/채용등록페이지/button__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/button__1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/채용등록페이지/button__1_2_3_4'))

