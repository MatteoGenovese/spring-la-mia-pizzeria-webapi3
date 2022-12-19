package org.generation.italy.demo.service;

import java.util.List;
import java.util.Optional;

import org.generation.italy.demo.pojo.FootballTeam;
import org.generation.italy.demo.repo.FootballTeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FootballTeamService {
	
	@Autowired
	private FootballTeamRepo footballTeamRepo;
	
	public void save(FootballTeam footballTeam)
	{
		footballTeamRepo.save(footballTeam);
	}
	
	public List<FootballTeam> findAll(){
		return footballTeamRepo.findAll();
	}
	
	
	public void delete(int id)
	{
		footballTeamRepo.deleteById(id);
	}

	
	public Optional<FootballTeam> getFootballTeamById(int id)
	{
		return footballTeamRepo.findById(id);
	}
}
