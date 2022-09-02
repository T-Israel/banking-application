//MAKING A SMALL BANK APPLICATION

package miniBankingApp.java;


 class bankingApp{
	 
	 Identification userDetails;
	
	bankingApp() {
		userDetails = new Identification();
	}
	
	void get_registration() {
		userDetails.userRegistration();
	}
	
	void get_login() {
		userDetails.login();
	}
	
	
	
	
	public static void main(String [] args) {
		bankingApp app1 = new bankingApp();
		
		app1.get_registration();
		app1.get_login();
		
		
		
		
		
		
	}
}

