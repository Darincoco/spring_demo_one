package spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoath = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(theCoath.getDailyWorkout());
		
		System.out.println(theCoath.getDailyFortune());
		
		// call literal value on the bean
		System.out.println(theCoath.getEmailAddress());
		
		System.out.println(theCoath.getTeam());
		
		// close the context
		context.close();
	}

}
