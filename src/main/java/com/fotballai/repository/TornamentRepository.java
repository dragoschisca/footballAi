package com.fotballai.repository;

import com.fotballai.domain.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TornamentRepository extends JpaRepository<Tournament, Integer> {
}
