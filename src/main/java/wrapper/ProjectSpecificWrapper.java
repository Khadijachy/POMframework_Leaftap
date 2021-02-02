package wrapper;

public class ProjectSpecificWrapper extends GenericWrapper {
	public String excelfile;

	//@Parameters({"url"})
	@BeforeMethod
	public void login() {
		invokeApp("http://leaftaps.com/opentaps");

	}

	@AfterMethod
	public void closeBrowser() {
		quitBrowser();
	}

	@DataProvider
	public String[][] getData() throws IOException {		
		ReadExcel1 rl = new ReadExcel1();
		return rl.readExcel(excelfile);		
	}
}
