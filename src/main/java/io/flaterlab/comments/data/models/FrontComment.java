package io.flaterlab.comments.data.models;

public class FrontComment {
    String name;
    String comment;

    public FrontComment() {
    }

    public FrontComment(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
