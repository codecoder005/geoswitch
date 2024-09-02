package com.jpmc.geoswitch.repository;

import com.jpmc.geoswitch.entity.ContinentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContinentRepository extends JpaRepository<ContinentEntity, UUID> {

}
