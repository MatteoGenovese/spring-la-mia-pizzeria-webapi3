package org.generation.italy.demo;


import org.generation.italy.demo.pojo.FootballTeam;
import org.generation.italy.demo.service.FootballTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaWebapiApplication implements CommandLineRunner {
	
	@Autowired
	FootballTeamService fTS;

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaWebapiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
		FootballTeam f1 = new FootballTeam("Milan");
		FootballTeam f2 = new FootballTeam("Juve");
		FootballTeam f3 = new FootballTeam("Inter");
		
		
		fTS.save(f1);
		fTS.save(f2);
		fTS.save(f3);


	}

}
