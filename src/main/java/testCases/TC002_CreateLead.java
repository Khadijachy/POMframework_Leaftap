package testCases;

import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper {
	@BeforeTest
	public void setData() {
		
		excelfile = "TC002_CreateLead";
	}
    @Test(dataProvider = "getData")
    public void loginLogout( String uName,String pwd, String CName, String Fname,String LName) {
}
}