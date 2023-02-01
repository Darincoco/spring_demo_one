package spring_demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields of emailAddress and teams
	private String emailAddress;
	private String team;
	
	// create a non-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
		
	//our setter method
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoachL: inside the setter method");
		this.fortuneService = fortuneService;
	}
		
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoachL: inside the setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoachL: inside the setter method - setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15 min";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
