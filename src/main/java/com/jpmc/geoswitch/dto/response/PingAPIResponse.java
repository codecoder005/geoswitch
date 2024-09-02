package com.jpmc.geoswitch.dto.response;

import lombok.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PingAPIResponse {
    private Integer status;
    private String message;
    private ZonedDateTime timestamp;
}
