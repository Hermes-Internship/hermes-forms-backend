package com.hermes.forms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public abstract class Question {
    @Id
    Long id;

    @Column
    String text;
}
