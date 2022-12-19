package org.generation.italy.demo.controller;

import java.util.List;

import org.generation.italy.demo.pojo.FootballTeam;
import org.generation.italy.demo.service.FootballTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/FootballTeams")
@CrossOrigin("*")
public class FootballTeamController {

	@Autowired
	private FootballTeamService footballTeamService;
	
	@GetMapping("/all")
	public List<FootballTeam> getAll() {
		
		List<FootballTeam> teams = footballTeamService.findAll();
		return teams;
	}
}
