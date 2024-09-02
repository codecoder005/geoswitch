package com.jpmc.geoswitch.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "state")
public class StateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID stateId;
    private UUID countryId;
    private String name;
}
