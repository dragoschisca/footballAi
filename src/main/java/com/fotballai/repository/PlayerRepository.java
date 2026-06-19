package com.fotballai.repository;

import com.fotballai.domain.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    Page<Player> findByTeamName(String teamName, Pageable pageable);
}
