package com.jpmc.geoswitch.repository;

import com.jpmc.geoswitch.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StateRepository extends JpaRepository<StateEntity, UUID> {

}
