import com.cab.booking.model.Admin;
import com.cab.booking.model.Client;
import com.cab.booking.model.Driver;
import com.cab.booking.model.Ride;
import com.cab.booking.services.FavAreaSubjectManager;
import com.cab.booking.services.impl.ArrayUserPresistenceImpl;
import com.cab.booking.services.impl.FavAreaManagerImpl;
import com.cab.booking.services.impl.RideManagerImpl;
import com.cab.booking.services.impl.UserManagerImpl;

public class RunAppQuick {
	public static void main(String[] args) {

		UserManagerImpl userManager = new UserManagerImpl();
		RideManagerImpl rideManager = new RideManagerImpl();
		FavAreaSubjectManager favserv = new FavAreaManagerImpl();
		userManager.setUserPresistence(new ArrayUserPresistenceImpl());
		// Run Driver Registration and Login
		Driver driver = new Driver("driver", "Ahmed Driver", "somewhere & may be 69870", "pass2&%ew", 156784569, 22222222, 3333333);
		userManager.registerDriver(driver);
		userManager.loginDriver("driver", 156784569, "pass2&%ew");

		driver.showNotifications();

		// Run Client Registration and Login
		Client client = new Client("client", "Salah Client", "somewhere & may be 69870", "pa34s2&%ew", 121343456);
		userManager.registerClient(client);
		userManager.loginClient("client", 121343456, "pa34s2&%ew");

		// Run Admin Login
		Admin A1 = new Admin("admin", "Adam", "zxcv123");
		userManager.registerAdmin(A1);
		Admin A2 = new Admin("admin", "Omar", "asdf456");
		userManager.registerAdmin(A2);
		Admin A3 = new Admin("admin", "Morad", "qwer789");
		userManager.registerAdmin(A3);
		userManager.loginAdmin("admin", "Adam", "zxcv123");

		userManager.listDriversByAdmin();
		Driver selectedByAdmin = userManager.selectDriverByAdmin("Ahmed Driver");
		userManager.verifyDriverByAdmin(selectedByAdmin);

		System.out.println("************ Final List of Users ***********");
		System.out.println(userManager.getAll());
		System.out.println("********************************************");

		/*favserv.subscribe(selectedByAdmin, "dokki");
		Ride r1 = new Ride("dokki", "zamalek");
		rideManager.add(r1, favserv,userManager);
		System.out.println(r1.getSrcLocation() + " " + r1.getDestLocation());
		selectedByAdmin.showNotifications();
		selectedByAdmin.showAvailableRides();*/
       
		//client enters dokki, zamalek


	//	rideManager.createRide(client, r2);


		Ride r2 = new Ride("dokki", "zamalek");
		rideManager.subscribe(client, r2);
		System.out.println(r2.getClient());
		rideManager.addoffer(r2, 20.2);
	
	}
}