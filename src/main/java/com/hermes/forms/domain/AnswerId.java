package com.hermes.forms.domain;

import javax.persistence.Embeddable;

@Embeddable
public class AnswerId {
    Integer formId;
    Integer questionId;
    String userId;
}
