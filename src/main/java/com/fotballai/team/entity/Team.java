package com.fotballai.team.entity;

import com.fotballai.area.entity.Area;
import com.fotballai.player.entity.Player;
import com.fotballai.tornament.entity.Tournament;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name="teams")
public class Team {
    @Id
    public Long Id;
    public String Name;
    public String Logo;
    public String Country;
    @Size(min = 3, max = 3)
    public String Abrevier;
    @OneToMany(mappedBy = "AssociatedTeam")
    public Set<Player> Players;
    @ManyToMany(mappedBy = "Teams")
    public Set<Tournament> Tournaments;
    @ManyToOne
    @JoinColumn(name = "area_id")
    public Area Area;

    public Team() {
    }

    public Team(String name, String logo, String country, Set<Player> players, Set<Tournament> tournaments, Area area) {
        Name = name;
        Logo = logo;
        Country = country;
        Abrevier = name.substring(0, 3);
        Players = players;
        Tournaments = tournaments;
        Area = area;
    }

    public String getName() {
        return Name;
    }

    public String getLogo() {
        return Logo;
    }

    public String getCountry() {
        return Country;
    }

    public String getAbrevier() {
        return Abrevier;
    }

    public Set<Player> getPlayers() {
        return Players;
    }

    public Set<Tournament> getTournaments() {
        return Tournaments;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setPlayers(Set<Player> players) {
        Players = players;
    }

    public void setTournaments(Set<Tournament> tournaments) {
        Tournaments = tournaments;
    }

}
