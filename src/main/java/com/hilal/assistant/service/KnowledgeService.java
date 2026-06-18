package com.hilal.assistant.service;

import org.springframework.stereotype.Service;

import com.hilal.assistant.domain.Profile;

@Service
public class KnowledgeService {
    private final Profile profile;
  
    public KnowledgeService(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

}
