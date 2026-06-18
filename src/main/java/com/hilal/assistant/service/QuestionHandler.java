package com.hilal.assistant.handler;

import com.hilal.assistant.model.Intent;

public interface QuestionHandler {
Intent supports(String question);
String handle();

}
