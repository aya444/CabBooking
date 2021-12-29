
import com.example.demo.Application.UserManagerImpl;
import com.example.demo.Core.Client;
import com.example.demo.Core.Driver;
import com.example.demo.Core.Admin;

public class RunAppQuick {
	public static void main(String[] args) {
		UserManagerImpl userManager = new UserManagerImpl();
		
		// Run Driver Registration and Login
		Driver driver = new Driver("driver", "Ahmed Driver", "somewhere & may be 69870", "pass2&%ew", 156784569, 22222222, 3333333);
        userManager.registerDriver(driver);        
        userManager.loginDriver("driver", 156784569, "pass2&%ew");
        
        // Run Client Registration and Login
		Client client = new Client("client", "Salah Client", "somewhere & may be 69870", "pa34s2&%ew", 121343456);
        userManager.registerClient(client);        
        userManager.loginClient("client", 121343456, "pa34s2&%ew");
        
		// Run Admin Login
        Admin A1 = new Admin("admin", "Adam","zxcv123");
        userManager.registerAdmin(A1);
        Admin A2 = new Admin("admin", "Omar","asdf456");
        userManager.registerAdmin(A2);
        Admin A3 = new Admin("admin", "Morad","qwer789");
        userManager.registerAdmin(A3);
        userManager.loginAdmin("admin", "Adam","zxcv123");
        
        userManager.listDriversByAdmin();
        Driver selectedByAdmin = userManager.selectDriverByAdmin("Ahmed Driver");
        userManager.verifyDriverByAdmin(selectedByAdmin);
        
        
        System.out.println("************ Final List of Users ***********");
        System.out.println(userManager.getAll());
        System.out.println("********************************************");
	}
}