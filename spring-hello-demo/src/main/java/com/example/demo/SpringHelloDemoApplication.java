package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class SpringHelloDemoApplication {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
       //         "beans.xml");
		//IOC container ApplicationContext
		// ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageProcessorImpl.class);
		 
		// MessageProcessor  userService = applicationContext.getBean(MessageProcessor.class);
	    //    userService.processMsg("twitter message sending ");
      //  MyBean app = context.getBean(MyBean.class);
       // MyBean app1 = context.getBean(MyBean.class);
        //MyBean app2 = context.getBean(MyBean.class);
       // app.greet("hello spring");
      //  System.out.print("object app1 and app2"+app1.hashCode()+" "+app2.hashCode());
        
        //dependency injection setter example.
		// MessageProcessorImpl m
		 //MessageProcessorImpl m = context.getBean(MessageProcessorImpl.class);
		// m.processMsg("hi");
        
        //GFG gfg = context.getBean(GFG.class);
             
		 AnnotationConfigApplicationContext context =    new AnnotationConfigApplicationContext();

		      // Scan beans
		      context.scan("com.example.demo");
		      //context.scan("com.boraji.tutorial.spring.service");
		      context.refresh();

		      VehicleService vehicle = context.getBean(VehicleService.class);
		      vehicle.service();

		      context.close();
        
        
        
        
		SpringApplication.run(SpringHelloDemoApplication.class, args);
	}

}
