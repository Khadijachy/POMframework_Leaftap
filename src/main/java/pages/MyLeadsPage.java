package pages;

import wrapper.ProjectSpecificWrapper;

public class MyLeadsPage extends ProjectSpecificWrapper {
	
		public CreateLeadPage clickCreateLeadLink() {
			clickByLinkText("Createleads");
			return new CreateLeadPage();
		}
	}


