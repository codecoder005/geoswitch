package com.jpmc.geoswitch.repository;

import com.jpmc.geoswitch.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CountryRepository extends JpaRepository<CountryEntity, UUID> {
    List<CountryEntity> findByContinentId(final UUID continentId);
}
