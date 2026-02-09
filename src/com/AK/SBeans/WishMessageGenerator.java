// WishMessageGenerator.java ( target spring bean )
package com.AK.SBeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	// HAS-A properties
	private LocalTime time;
	private LocalDate date;
	
	// simple property
	private int age;
	
	public WishMessageGenerator() {
		IO.println("WishMessageGenerator:: 0-param Constructor !");
	}
	
	// setter methods for setter injection
	public void setTime(LocalTime time) {
		IO.println("WishMessageGenerator.setTime(-)");
		this.time = time;
	}
	
	public void setDate(LocalDate date) {
		IO.println("WishMessageGenerator.setDate(-)");
		this.date = date;
	}
	
	public void setAge(int age) {
		IO.println("WishMessageGenerator.setAge(-)");
		this.age = age;
	}
	
	// business method
	public String showWishMessage(String user) {
		IO.println("WishMessageGenerator.showWishMessage()::" + time + "..." + date + "..." + age);
		
		// get current hour of the day
		int hour = time.getHour();
		String wish;
		
		// generate the wish message
		if(hour<12)
			wish = "Good Morning";
		else if(hour<16)
			wish = "Good AfterNoon";
		else if(hour<20)
			wish = "Good Evening";
		else
			wish = "Good Night";
		
		// get current month of the year
		int month = date.getMonthValue();
		String season;
		
		// generate the season message
		if(month>=2 && month<=3)
			season = "Spring Season";
		else if(month>=4 && month<=6)
			season = "Summer Season";
		else if(month>=7 && month<=9)
			season = "Rainy Season";
		else
			season = "Winter Season";

		// final message
		return wish + " :: " + user + "! Hope you're enjoying the " + season + ".";
	}
}
