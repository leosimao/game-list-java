package com.devsuperior.GameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.GameList.Entity.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
}
