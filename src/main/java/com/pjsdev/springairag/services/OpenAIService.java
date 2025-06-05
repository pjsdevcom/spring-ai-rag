package com.pjsdev.springairag.services;

import com.pjsdev.springairag.model.Answer;
import com.pjsdev.springairag.model.Question;

public interface OpenAIService {
    Answer getAnswer(Question question);
}
