package com.fotballai.tornament.entity;

import com.fotballai.team.entity.Team;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Tournament {

    @Id
    public Integer Id;
    public TournamentEnum Name;
    public String Logo;
    @ManyToMany
    @JoinTable(
        name = "tournament_teams",
        joinColumns = @JoinColumn(name = "tournament_id"),
        inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    public Set<Team> Teams;
}
