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
@Table(name = "continent")
public class ContinentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "continent_id")
    private UUID continentId;
    private String name;
}
