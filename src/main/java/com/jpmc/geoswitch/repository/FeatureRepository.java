package com.jpmc.geoswitch.repository;

import com.jpmc.geoswitch.entity.FeatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FeatureRepository extends JpaRepository<FeatureEntity, UUID> {

}
