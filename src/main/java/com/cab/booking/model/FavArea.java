package com.cab.booking.model;

import java.util.ArrayList;

public class FavArea {
	private String areaName;
	private ArrayList<Driver> subscribers = new ArrayList<Driver>();

	public FavArea(String areaName) {
		this.areaName = areaName;
	}

	public String getName() {
		return areaName;
	}

	public void addSubscriber(Driver driver, String fav) {
		subscribers.add(driver);
		subscribers.get(subscribers.size() - 1).addToFav(fav);
	}

	public void sendNotification(String notification) {
		for (int i = 0; i < subscribers.size(); i++)
			{

				subscribers.get(i).addNotification(notification);
			}
	}

	public void removeSubscriber(Driver driver) {
		subscribers.remove(driver);
	}

	public String toString() {
		return "favArea { name='" + getName() + "'}";
	}
	public ArrayList<Driver> getSubscribers()
	{
		return subscribers;
	}

}
