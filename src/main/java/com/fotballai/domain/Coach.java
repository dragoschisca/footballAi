package com.fotballai.domain;

import com.fotballai.domain.enums.CoachLicenseEnum;
import jakarta.persistence.*;

@Entity
@Table(name="coaches")
public class Coach extends AbstractPersonEntity {

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
