package com.fotballai.domain;

import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public abstract class AbstractPersonEntity {
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
