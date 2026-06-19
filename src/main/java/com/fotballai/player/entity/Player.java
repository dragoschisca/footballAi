package com.fotballai.player.entity;

import com.fotballai.common.entity.Person;
import jakarta.persistence.*;

@Entity
@Table(name="players")
public class Player extends Person {
    private PositionEnum Position;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private com.fotballai.team.entity.Team AssociatedTeam;

    public PositionEnum getPosition() {
        return Position;
    }
    public void setPosition(PositionEnum position) {
        Position = position;
    }

    public com.fotballai.team.entity.Team getAssociatedTeam() {
        return AssociatedTeam;
    }
    public void setAssociatedTeam(com.fotballai.team.entity.Team team) {
        AssociatedTeam = team;
    }

}
