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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String originText

String dataText

WebUI.callTestCase(findTestCase('mgt/TC-004 만료된 계약이 있는 경우(기업관리자)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Mangement/도움말관리페이지/span_'))

WebUI.click(findTestObject('Object Repository/Mangement/도움말관리페이지/a_'))

WebUI.click(findTestObject('Object Repository/Mangement/도움말관리페이지/span__treeDemo_1_switch'))

WebUI.click(findTestObject('Object Repository/Mangement/도움말관리페이지/span__1'))

originText = WebUI.getText(findTestObject('Object Repository/Mangement/도움말관리페이지/span__1'))

WebUI.click(findTestObject('Object Repository/Mangement/도움말관리페이지/span__1'))

dataText = WebUI.getText(findTestObject('Object Repository/Mangement/도움말관리페이지/div_'))

if (dataText.equals(originText)) {
    KeywordUtil.markPassed('ok!')
} else {
    KeywordUtil.markFailed('failed')
}

