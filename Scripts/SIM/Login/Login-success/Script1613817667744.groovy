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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Custom Keyword/Navigate To URL SIM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('login-page/Page_Login SIM/input_Username_username'), 'sweetsins53@gmail.com')

WebUI.setText(findTestObject('login-page/Page_Login SIM/input_Password_password'), 'proktorku')

WebUI.click(findTestObject('login-page/Page_Login SIM/button_Login'))

WebUI.verifyElementPresent(findTestObject('login-page/Page_Beranda  Pijar Sekolah/div_Hi, ProktorSemangat untuk pagi hari ini'), 
    0)

WebUI.closeBrowser()

