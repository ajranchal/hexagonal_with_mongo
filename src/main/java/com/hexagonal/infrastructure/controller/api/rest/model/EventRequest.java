package com.hexagonal.infrastructure.controller.api.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRequest {

    @JsonProperty(value = "topic", required = true)
    private String topic;

    @JsonProperty(value = "message", required = true)
    private String message;
}
