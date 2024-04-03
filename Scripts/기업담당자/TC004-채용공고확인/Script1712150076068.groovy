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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Define a variable to store the text for comparison
String firstItemText

// Step 1: Perform testcase TC001-기업담당자로그인
boolean loginSuccess = WebUI.callTestCase(findTestCase('기업담당자/TC001-기업담당자로그인'), [:], FailureHandling.STOP_ON_FAILURE)

// Check if login was successful
if (loginSuccess) {
	// Step 3: Get first item text at id 'resultList'
	firstItemText = WebUI.getText(findTestObject('Object Repository/채용공고목록/text'))
	
	// Step 4: Click the button '자세히보기'
	WebUI.click(findTestObject('Object Repository/채용공고목록/자세히보기버튼'))
	
	// Waiting for the page to load after click
	WebUI.waitForPageLoad(10)
	
	// Step 5: Compare text in tag <h4> with the text got from step 3
	String h4Text = WebUI.getText(findTestObject('Object Repository/전형관리홈/공고명'))
	
	// Step 6: Check if the texts are equal
	if (firstItemText.equals(h4Text)) {
		WebUI.comment('Test Passed: The text matches.')
	} else {
		WebUI.comment('Test Failed: The text does not match.')
		throw new Exception('The texts do not match.')
	}
} else {
	// If login fails, end the test
	WebUI.comment('Login failed, ending test.')
}