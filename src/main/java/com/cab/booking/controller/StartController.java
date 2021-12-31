package com.cab.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cab.booking.model.Admin;
import com.cab.booking.model.Client;
import com.cab.booking.model.Driver;
import com.cab.booking.model.Ride;
import com.cab.booking.model.User;
import com.cab.booking.service.impl.ArrayUserPresistenceImpl;
import com.cab.booking.service.impl.RideManagerImpl;
import com.cab.booking.service.impl.UserManagerImpl;

@RestController
@RequestMapping("/api")
public class StartController {

	@GetMapping("/test")
    public String start()
    {
		UserManagerImpl userManager = new UserManagerImpl();
		RideManagerImpl rideManager = new RideManagerImpl();
		
		/*
		 * 1. The user should be able to register to the system. The user should provide 
		 * username, mobile number, email (optional), and password. If the user is going 
		 * to register to the system as a driver so the driving license and national id 
		 * should be provided. The user should be able to login into the system once the 
		 * registration is completed. If the user registers as a driver, so the user 
		 * should be able to login into the system once the admin user verify the registration
		 */
		
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

        /* 
         * 2. The admin user should be able to verify driver registration. 
         * So the admin should be able to list all pending driver registrations 
         * and verify any pending driver registration.
         */
		
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

        /*
         * 3. The user should be able to request a ride given a source and a destination. 
         * For a simplicity user can enter the source area’s name and the destination area’s name.
         */
        
		Ride r2 = new Ride("dokki", "zamalek");
		
        /*
         * 4. The driver should be able to add some areas to get notification when any 
         * ride is requested and one of these areas is added as the source area. 
         * These areas will be called as “favorite areas”.
		 */
		
		driver.showNotifications();

        /*
         * 5. The driver should be notified if any new ride is requested from 
         * any area added as a “favorite area” to the driver.
         */
		rideManager.subscribe(client, r2);
		System.out.println(r2.getClient());
		
        /*
         * 6. The driver should be able to list all rides with source area within one of the 
         * driver’s favorite areas. The driver should be able to suggest a price to this ride 
         * and notify the user with this price. Each price suggestions is called an “offer”
         */
		
		rideManager.addoffer(r2, 20.2);
		
        /*
         * 7. The user should be notified if any new price is added to the requested ride. So the 
         * user should be able to list all ride offers and check the driver details for each offer.
         */
        
        
        /*
         * 8. The user should be able to select a specific offer for the requested ride. By this 
         * selection the corresponding driver (who put the selected price) should be notified 
         * that the user accepts the suggested ride price.
         */
        
        
        /*
         * 9. The system should calculate the distance and estimate time arrival (ETA) 
         * with the help of google maps API
         */
		
        /*
         * 10. The system should track number of calls to google maps API if it’s exceeded 
         * specific number of calls. The system should change the way to calculate ETA by 
         * using harvesine distance to calculate the distance between the source area and 
         * the destination area then divide this distance by the speed (Assume 60 KM/H speed).
         */
        
        
        /*
         * 11. The driver should be able to end the ride once the ride is finished and the ride 
         * should be added to the rides history. The ride cost should be added to the driver balance.
         */
        
        
        /*
         * 12. The user should be able to rate any completed ride requested before by the user 
         * ( through the rides history ), meaning the user should be able to list all of his rides 
         * history and rate any of them which were not rated before.
         */
		
		return "Request Processed Successfully";
    }
}
