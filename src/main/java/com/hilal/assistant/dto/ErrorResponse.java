package com.hilal.assistant.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResponse {
 private Instant timestamp;
    private int status;
    private String error;
    private String message;
}
