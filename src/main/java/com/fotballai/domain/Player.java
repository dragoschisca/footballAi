package com.fotballai.domain;

import com.fotballai.domain.enums.PositionEnum;
import jakarta.persistence.*;

@Entity
@Table(name="players")
public class Player extends AbstractPersonEntity {
    private PositionEnum Position;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team AssociatedTeam;

    public PositionEnum getPosition() {
        return Position;
    }
    public void setPosition(PositionEnum position) {
        Position = position;
    }

    public Team getAssociatedTeam() {
        return AssociatedTeam;
    }
    public void setAssociatedTeam(Team team) {
        AssociatedTeam = team;
    }

}
