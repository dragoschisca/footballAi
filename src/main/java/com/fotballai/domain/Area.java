package com.fotballai.domain;

import com.fotballai.domain.enums.CountryEnum;
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
    public CountryEnum country;
    public String address;
    @OneToMany(mappedBy = "Area")
    public Set<Team> teams;
    public Integer capacity;

    public Area() {
    }
    public Area(String name, String city, CountryEnum country, String address, Set<Team> teams, Integer capacity) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.address = address;
        this.teams = teams;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CountryEnum getCountry() {
        return country;
    }

    public void setCountry(CountryEnum country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
