package com.hilal.assistant.handler;

import org.springframework.stereotype.Component;

import com.hilal.assistant.domain.Contact;
import com.hilal.assistant.service.KnowledgeService;
import com.hilal.assistant.service.QuestionHandler;
@Component
public class ContactHandler implements QuestionHandler {
private final KnowledgeService knowledgeService;

    public ContactHandler(KnowledgeService knowledgeService) {
        this.knowledgeService = knowledgeService;
    }
    @Override
    public Boolean supports(String question) {
       String q=question.toLowerCase();
        return q.contains("contact")
                || q.contains("email")
                || q.contains("touch")
                || q.contains("linkedin")
                || q.contains("github")
                || q.contains("resume")
                || q.contains("cv")
                || q.contains("schedule")
                || q.contains("meeting")
                || q.contains("interview")
                || q.contains("reach");
    }

    @Override
    public String handle() {
 Contact contact =
            knowledgeService.getProfile().getContact();

    return """
            Email: %s

            LinkedIn: %s

            GitHub: %s
            """
            .formatted(
                    contact.getEmail(),
                    contact.getLinkedin(),
                    contact.getGithub());    }

}
