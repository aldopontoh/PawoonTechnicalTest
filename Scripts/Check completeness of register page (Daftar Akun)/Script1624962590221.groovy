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

WebUI.verifyElementPresent(findTestObject('Pawoon/Page_Pawoon POS/input_Namalengkap'), 0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Daftar Akun page/Page_Pawoon POS/teks_Daftar Akun'), 0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Daftar Akun page/Page_Pawoon POS/teks_Daftar sekarang dan gunakan Pawoon gratis selama 14 hari'), 
    0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Page_Pawoon POS/input_email'), 0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Page_Pawoon POS/input_phone_number'), 0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Page_Pawoon POS/input_password'), 0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Page_Pawoon POS/checkbox_agreement'), 0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Daftar Akun page/Page_Pawoon POS/teks_Sudah Punya Akun  Login'), 0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Daftar Akun page/Page_Pawoon POS/link_Kebijakan Privasi'), 0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Daftar Akun page/Page_Pawoon POS/link_Syarat dan Ketentuan'), 0)

WebUI.verifyElementPresent(findTestObject('Pawoon/Daftar Akun page/Page_Pawoon POS/link_Login'), 0)

WebUI.click(findTestObject('Pawoon/Page_Pawoon POS/Page_Pawoon POS/button_Lanjutkan1'))

WebUI.delay(5)

WebUI.closeBrowser()

