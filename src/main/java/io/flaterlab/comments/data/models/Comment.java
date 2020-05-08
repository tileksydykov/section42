package io.flaterlab.comments.models;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column("username")
    String username;

    @Column("comment")
    String comment;

    @ManyToOne
    @Column("page")
    Page page;

}
