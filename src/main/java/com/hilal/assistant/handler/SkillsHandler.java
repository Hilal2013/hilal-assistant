package com.hilal.assistant.handler;

import org.springframework.stereotype.Component;

import com.hilal.assistant.domain.Skills;
import com.hilal.assistant.service.KnowledgeService;
import com.hilal.assistant.service.QuestionHandler;

@Component
public class SkillsHandler implements QuestionHandler {

    private final KnowledgeService knowledgeService;

    public SkillsHandler(KnowledgeService knowledgeService) {
        this.knowledgeService = knowledgeService;
    }
    @Override
    public Boolean supports(String question) {
        String q=question.toLowerCase();
        return q.contains("skill")
            || q.contains("technology")
            || q.contains("tech stack")
            || q.contains("java")
            || q.contains("spring");
    }

    @Override
    public String handle() {
       Skills skills =
            knowledgeService.getProfile().getSkills();

    return String.join(", ", skills.getBackend());


    }

}
