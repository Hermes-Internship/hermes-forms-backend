package com.hermes.forms.domain;

import javax.persistence.EmbeddedId;

public class Answer {
    @EmbeddedId
    AnswerId id;
}
