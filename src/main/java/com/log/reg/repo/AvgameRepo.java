package com.log.reg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.log.reg.model.AvailableGames;


@Repository
public interface AvgameRepo extends JpaRepository<AvailableGames, Integer>{
	
}
