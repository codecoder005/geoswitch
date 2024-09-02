package com.jpmc.geoswitch.repository;

import com.jpmc.geoswitch.entity.JPMCApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JPMCApplicationRepository extends JpaRepository<JPMCApplicationEntity, UUID> {

}
