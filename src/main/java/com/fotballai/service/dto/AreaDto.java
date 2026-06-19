package com.fotballai.service.dto;

import com.fotballai.domain.Team;
import com.fotballai.domain.enums.CountryEnum;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public sealed interface AreaDto permits
        AreaDto.UpsertRequest,
        AreaDto.View{

     record UpsertRequest(
             @NotBlank @Size(max = 255) String name,
             @NotNull @Size(max = 5000) String city,
             @NotNull CountryEnum country,
             @NotNull String address,
             @NotNull Set<Team> teams,
             @NotNull Integer capacity
     ) implements AreaDto {}

    record View(
            @NotBlank @Size(max = 255) String name,
            @NotNull @Size(max = 5000) String city,
            @NotNull Integer capacity
    ) implements AreaDto {}
}
