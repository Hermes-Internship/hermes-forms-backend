package com.hermes.forms.repository;

import com.hermes.forms.domain.Answer;
import com.hermes.forms.domain.AnswerId;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Answer, AnswerId> { }
