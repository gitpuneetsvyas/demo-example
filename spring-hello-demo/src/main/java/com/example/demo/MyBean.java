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
public class MyBean 
{
private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void greet(String message)
	{
		System.out.print("greet"+message);
	}
	
}
