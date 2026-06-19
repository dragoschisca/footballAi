package com.fotballai.coach.entity;

import com.fotballai.common.entity.Person;
import jakarta.persistence.*;

@Entity
@Table(name="coaches")
public class Coach extends Person {

    @Enumerated(EnumType.STRING)
    public CoachLicenseEnum License;

    public Coach() {
    }
    public CoachLicenseEnum getLicense() {
        return License;
    }

    public void setLicense(CoachLicenseEnum license) {
        this.License = license;
    }
}
