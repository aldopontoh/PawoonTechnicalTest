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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dashboard.pawoon.com/login')

WebUI.click(findTestObject('Pawoon/Page_Pawoon POS - My Pawoon v2 - Login/Daftar sekarang'))

WebUI.sendKeys(findTestObject('Pawoon/Page_Pawoon POS/input_Namalengkap'), 'Renaldo Pontoh')

WebUI.sendKeys(findTestObject('Pawoon/Page_Pawoon POS/input_email'), 'pawonnnnn@mailinator.com')

WebUI.sendKeys(findTestObject('Pawoon/Page_Pawoon POS/input_phone_number'), '081211336018')

WebUI.sendKeys(findTestObject('Pawoon/Page_Pawoon POS/input_password'), '123456')

WebUI.verifyElementNotChecked(findTestObject('Pawoon/Page_Pawoon POS/checkbox_agreement'), 2)

WebUI.check(findTestObject('Pawoon/Page_Pawoon POS/checkbox_agreement'))

WebUI.click(findTestObject('Pawoon/Page_Pawoon POS/Page_Pawoon POS/button_Lanjutkan1'))

WebUI.sendKeys(findTestObject('Pawoon/Page_Pawoon POS/input_namaBisnis'), 'AutomationTest')

WebUI.click(findTestObject('Pawoon/Page_Pawoon POS/Page_Pawoon POS/input_business_type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pawoon/informasi bisnis page/bisnis type/Page_Pawoon POS/span_Jasa'))

WebUI.click(findTestObject('Pawoon/informasi bisnis page/bisnis type/Page_Pawoon POS/span_Lain-lain-jasa'))

WebUI.sendKeys(findTestObject('Pawoon/Page_Pawoon POS/input_kotaBisnis'), 'Tangerang')

WebUI.delay(2)

WebUI.click(findTestObject('Pawoon/Page_Pawoon POS/span_Kota Tangerang, Banten'))

WebUI.click(findTestObject('Pawoon/Page_Pawoon POS/Page_Pawoon POS/button_Lanjutkan2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pawoon/Page_Pawoon POS/button_Daftar'))

WebUI.delay(10)

currentUrl = WebUI.getUrl()

WebUI.verifyMatch(currentUrl, 'https://dashboard.pawoon.com/first-step', false)

WebUI.closeBrowser()

