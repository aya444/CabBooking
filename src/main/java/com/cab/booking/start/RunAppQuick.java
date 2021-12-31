package com.cab.booking.start;
import com.cab.booking.model.Admin;
import com.cab.booking.model.Client;
import com.cab.booking.model.Driver;
import com.cab.booking.model.Ride;
import com.cab.booking.model.User;
import com.cab.booking.service.FavAreaSubjectManager;
import com.cab.booking.service.impl.ArrayUserPresistenceImpl;
import com.cab.booking.service.impl.FavAreaManagerImpl;
import com.cab.booking.service.impl.RideManagerImpl;
import com.cab.booking.service.impl.UserManagerImpl;

public class RunAppQuick {
	public static void main(String[] args) {

		UserManagerImpl userManager = new UserManagerImpl();
		RideManagerImpl rideManager = new RideManagerImpl();
		FavAreaSubjectManager favserv = new FavAreaManagerImpl();
		userManager.setUserPresistence(new ArrayUserPresistenceImpl());

		// Run Driver Registration and Login
		Driver driver = new Driver("driver", "Ahmed Driver", "somewhere & may be 69870", "pass2&%ew", 156784569, 22222222, 3333333);
		userManager.register(driver);
		userManager.login((Driver) driver);


		// Run Client Registration and Login
		Client client = new Client("client", "Salah Client", "somewhere & may be 69870", "pa34s2&%ew", 121343456);
		userManager.register(client);
		userManager.login((User) client);

		// Run Admin Login
		User A1 = new User("admin", "Adam", "zxcv123");
		userManager.register(A1);
		User A2 = new User("admin", "Omar", "asdf456");
		userManager.register(A2);
		User A3 = new User("admin", "Morad", "qwer789");
		userManager.register(A3);
		userManager.login(A1);

		userManager.listDriversByAdmin();
		User select = new User();
		select.setType("driver");
		select.setName("Ahmed Driver");
		User selectedByAdmin = userManager.selectDriverByAdmin(select);
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