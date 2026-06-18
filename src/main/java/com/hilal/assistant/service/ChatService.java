package com.hilal.assistant.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import java.util.List;



@Service
@Slf4j
public class ChatService {

    //private static final Logger log=LoggerFactory.getLogger(ChatService.class);instead of this @Slf4j
private final List<QuestionHandler> handlers;


    public ChatService(List<QuestionHandler> handlers) {
    this.handlers = handlers;
}


    public String reply(String question){

            log.info("Incoming question: {}", question);
 for (QuestionHandler handler : handlers) {

            if (handler.supports(question)) {

                log.info("Matched handler: {}", handler.getClass().getSimpleName());

                return handler.handle();
            }
        }
    log.warn("Unknown question: {}", question);


        return """
                I can answer questions about:

                • About Hilal
                • Technical Skills
                • Experience/carer/project/background
                • contact

                Try asking one of those.
                """;
    }
}
