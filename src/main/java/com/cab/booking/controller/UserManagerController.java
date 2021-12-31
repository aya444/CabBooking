package com.cab.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cab.booking.model.User;
import com.cab.booking.service.FavAreaObserverManager;
import com.cab.booking.service.UserManager;

@RestController
@RequestMapping("/api/usermanager")
public class UserManagerController{
	@Autowired
	private UserManager userManager;
	@SuppressWarnings("unused")
	private FavAreaObserverManager favAreaObserverManager;

//    @Override
//    public void update(ArrayList<Driver> subs, Ride r)
//    {
//      for(int i=0; i< subs.size(); i++)
//         subs.get(i).addAvailable(r);
//    }

    @PostMapping("/add")
    public boolean add(@RequestBody User user) {
    	return userManager.add(user);
    }

    @GetMapping("/get/{index}")
    public User get(@PathVariable int index) {
        return userManager.get(index);
    }

    @GetMapping("/getall")
    public List<User> getAll() {
        return userManager.getAll();
    }

    @DeleteMapping("/delete/{index}")
    public boolean delete(@PathVariable int index) {
        return userManager.delete(index);
    }

    @PostMapping("/login")
	public User login(@RequestBody User user){
    	return userManager.login(user);
    }

    @PostMapping("/register")
    public boolean register(@RequestBody User user){
    	return userManager.register(user);
    }

    @GetMapping("/listDriversByAdmin")
    public void listDriversByAdmin(){
    	userManager.listDriversByAdmin();
    }
    
    @PostMapping("/selectDriverByAdmin")
    public User selectDriverByAdmin(@RequestBody User user){
    	return userManager.selectDriverByAdmin(user);
    }

    @PostMapping("/verifyDriverByAdmin")
    public boolean verifyDriverByAdmin(@RequestBody User user){
    	return userManager.verifyDriverByAdmin(user);
    }


}
