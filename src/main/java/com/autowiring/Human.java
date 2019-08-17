package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	/*
	 * public Human() {
	 * 
	 * }
	 * 
	 * public Human(Heart heart) { this.heart = heart;
	 * System.out.println("inside human constructor"); }
	 * 
	 * public Heart getHeart() { return heart; }
	 * 
	 * public void setHeart(Heart heart) { this.heart = heart;
	 * System.out.println("setter method called"); }
	 */
	public void startPumping() {

		if (heart != null) {
			heart.pump();
			System.out.println("Name of animal is " + heart.getNameOfAnimal() + "\nNumber of hearts are "
					+ heart.getNumberOfHeart());
		} else
			System.out.println("You are dead");
	}
}
