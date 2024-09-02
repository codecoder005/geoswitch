package com.jpmc.geoswitch.controller.rest;

import com.jpmc.geoswitch.api.PingAPI;
import com.jpmc.geoswitch.dto.response.PingAPIResponse;
import com.jpmc.geoswitch.model.FeatureModel;
import com.jpmc.geoswitch.service.FeatureService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/features")
@RequiredArgsConstructor
@Slf4j
public class FeatureRestAPIController implements PingAPI {
    private final FeatureService featureService;
    @Override
    public PingAPIResponse ping() {
        return PingAPIResponse.builder()
                .status(HttpStatus.OK.value())
                .message("Up and Running")
                .timestamp(ZonedDateTime.now())
                .build();
    }
    
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<FeatureModel>> getAllFeatures() {
        log.info("StateRestAPIController::getAllFeatures");
        return ResponseEntity.status(HttpStatus.OK)
                .body(featureService.getAllFeatures());
    }
    
    @GetMapping(value = "/{stateId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<FeatureModel> getFeatureById(@PathVariable final UUID stateId) {
        log.info("StateRestAPIController::getFeatureById");
        return ResponseEntity.status(HttpStatus.OK)
                .body(featureService.getFeatureById(stateId));
    }
}
