

import java.util.ArrayList;

import com.example.demo.Application.UserManagerImpl;
import com.example.demo.Core.Client;
import com.example.demo.Core.Driver;
import com.example.demo.Core.Admin;
import com.example.demo.Application.UserManager;

public class RunAppQuick {
	public static void main(String[] args) {
		UserManagerImpl userManager = new UserManagerImpl();
		ArrayList<Driver> pendingDriverApprovalArr = UserManager.pendingDriverArr;
		
		// Run Driver Registration and Login
		Driver driver = new Driver("Ahmed Driver", "somewhere & may be 69870", "pass2&%ew", 123456789, 22222222, 3333333);
        userManager.registerDriver(driver);        
        userManager.loginDriver(123456789, "pass2&%ew");
        
        // Run Client Registration and Login
		Client client = new Client("Salah Client", "somewhere & may be 69870", "pass2&%ew", 123456789);
        userManager.registerClient(client);        
        userManager.loginClient(123456789, "pass2&%ew");
        
		// Run Admin Login
        Admin A1 = new Admin("Adam","zxcv123");
        userManager.registerAdmin(A1);
        Admin A2 = new Admin("Omar","asdf456");
        userManager.registerAdmin(A2);
        Admin A3 = new Admin("Morad","qwer789");
        userManager.registerAdmin(A3);
        userManager.loginAdmin("Adam","zxcv123");
        userManager.listDriversByAdmin();
	    for(int i=0;i<pendingDriverApprovalArr.size();i++){
	          System.out.println("Would you like to Verify driver (" + pendingDriverApprovalArr.get(i).getName() + ") ?");
	          userManager.verifyDriverByAdmin(pendingDriverApprovalArr.get(i));
	    }
	}
}