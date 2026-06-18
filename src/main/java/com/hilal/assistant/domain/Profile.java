package com.hilal.assistant.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Profile {
private About about;
    private Skills skills;
    private Career career;
    private Contact contact;
}
