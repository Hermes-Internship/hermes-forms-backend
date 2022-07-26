package com.hermes.forms.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="forms")
public class Form {
    @Id
    Integer id;

    @OneToMany
    List<Question> questions;

    @Column
    String description;
}
