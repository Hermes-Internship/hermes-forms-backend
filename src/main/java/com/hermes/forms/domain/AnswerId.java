package com.hermes.forms.domain;

import javax.persistence.Embeddable;

@Embeddable
public class AnswerId {
    Long formId;
    Long questionId;
    String userId;
}
