package com.hilal.assistant.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Career {
 private String currentRole;
    private String previousRole;
    private String internship;
}
