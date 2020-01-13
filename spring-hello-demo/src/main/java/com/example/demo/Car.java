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
public class Car implements Vehicle
{

	@Override
	   public void start() {
		String ps=null;
		int length=ps.length();
	      System.out.println("Car started");
	   }

	   @Override
	   public void stop() {
	      System.out.println("Car stopped");
	   }
}
