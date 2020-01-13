/**
 * 
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author puneet
 *
 */

@Component
public class VehicleService {
	
		@Autowired
		 @Qualifier("bike")
	   private Vehicle vehicle;

	   public void service() {
	      vehicle.start();
	      vehicle.stop();
	   }
}
