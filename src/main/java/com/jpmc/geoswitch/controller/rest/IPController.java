package com.jpmc.geoswitch.controller.rest;

import jakarta.servlet.http.HttpServletRequest;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/ip")
@Slf4j
public class IPController {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    protected static class HttpServletRequestDTO {
        private String method;
        private String requestURI;
        private Map<String, String[]> parameters;
        private Map<String, Object> headers;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> getSourceDetails(HttpServletRequest request) {
        log.info("IPController::getSourceDetails");
        HttpServletRequestDTO dto = new HttpServletRequestDTO();
        dto.setMethod(request.getMethod());
        dto.setRequestURI(request.getRequestURI());
        dto.setParameters(request.getParameterMap());

        // Extract headers
        Map<String, Object> headers = new HashMap<>();
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            if(headerName.equalsIgnoreCase("cookie")) {
                final String COOKIES_DELIMITER = "; ";
                var cookies = request.getHeader(headerName).split(COOKIES_DELIMITER);
                var cookiesListToSerialize = new LinkedList<Cookie>();
                for(String cookie: cookies) {
                    var part = cookie.split("=");
                    if(part.length==2) {
                        cookiesListToSerialize.add(new Cookie(part[0], part[1]));
                    }
                }
                headers.put(headerName, cookiesListToSerialize);
                continue;
            }
            headers.put(headerName, request.getHeader(headerName));
        }
        dto.setHeaders(headers);

        return ResponseEntity.status(HttpStatus.OK)
                .body(dto);
    }

    @Getter
    @AllArgsConstructor
    protected static class Cookie {
        private String name;
        private Object value;
    }
}
