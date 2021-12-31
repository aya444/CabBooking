package com.cab.booking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cab.booking.model.Ride;
import com.cab.booking.service.RidePresistenceManager;

@RestController
@RequestMapping("/api/arrayridepresistence")
public class ArrayRidePresistenceController {

	private RidePresistenceManager ridePresistenceManager;

	@GetMapping("/getsize")
    public int getSize() {
        return ridePresistenceManager.getSize();
    }

	@PostMapping("/add")
    public boolean add(@RequestBody Ride ride) {
        return ridePresistenceManager.add(ride);
    }

	@GetMapping("/get/{id}")
    public  Ride get(@PathVariable int id) {
		return ridePresistenceManager.get(id);
    }

	@GetMapping("/getall")
    public List<Ride> getAll() {
        return ridePresistenceManager.getAll();
    }

	@DeleteMapping("/delete/{index}")
    public boolean delete(@PathVariable int index) {
		return ridePresistenceManager.delete(index);
    }

	@GetMapping("/addtohistory/{id}")
    public void addtohistory (@PathVariable Ride ride) {
		 ridePresistenceManager.addtohistory(ride);
    }

	@GetMapping("/getallhistory")
    public List<Ride> getAllHistory() {
		return ridePresistenceManager.getAllHistory();
    }
}