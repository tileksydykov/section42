package io.flaterlab.comments.models;

import javax.persistence.*;

@Entity
public class Page {
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column("link")
    String link;

}
