/**
 * 
 */
package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * @author puneet
 *
 */
@Component
public class Bike implements Vehicle {

	  
	   public void start() {
	      System.out.println("Bike started");
	   }

	  
	   public void stop() {
	      System.out.println("Bike stopped");
	   }

}
