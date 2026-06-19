package com.fotballai.area.entity;

import com.fotballai.team.entity.Team;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name="areas")
public class Area {
    @Id
    public Long id;
    public String name;
    public String city;
    public String country;
    public String address;
    @OneToMany(mappedBy = "Area")
    public Set<Team> teams;
    public Integer capacity;
}
