package com.hilal.assistant.service;

import org.springframework.stereotype.Service;

import com.hilal.assistant.domain.Profile;
import com.hilal.assistant.repository.KnowledgeRepository;

@Service
public class KnowledgeService {
    private final KnowledgeRepository knowledgeRepository;

    public KnowledgeService(KnowledgeRepository knowledgeRepository) {
        this.knowledgeRepository = knowledgeRepository;
    }

    public Profile getProfile() {
        return knowledgeRepository.getProfile();
    }

}
