package io.flaterlab.comments.data.models;

import javax.persistence.*;

@Entity
@Table(name = "co")
public class Comment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username")
    String username;

    @Column(name = "body")
    String body;

    @Column(name = "page_id")
    int pageId;

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return body;
    }

    public void setComment(String comment) {
        this.body = comment;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int page) {
        this.pageId = page;
    }
}
