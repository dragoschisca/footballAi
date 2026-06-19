package com.fotballai.common.entity;

import com.fotballai.team.entity.Team;
import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    public String FirstName;
    public String LastName;
    public Date BirthDate;
    @ManyToOne
    @JoinColumn(name = "team_id")
    public Team AssociatedTeam;
    public Integer Age;
    public String Nationality;
}
