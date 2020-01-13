package com.example.demo;

public class GFG { 
	  
    // The object of the interface IGeek 
    IGeek geek; 
  
    // Setter method for property geek 
   /* public void setGeek(IGeek geek) 
    { 
       System.out.print("inside geek method...");
    	
    	this.geek = geek; 
    	
    	geek.greet();
    }*/ 
    
    public GFG(IGeek igeek)
    {
System.out.print("inside geek method...");
    	
    	this.geek = igeek; 
    	
    	geek.greet();
    	
    }
} 