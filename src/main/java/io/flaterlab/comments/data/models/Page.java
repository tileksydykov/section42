package io.flaterlab.comments.data.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pa")
public class Page {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "link")
    String link;

    public Page(String link) {
        this.link = link;
    }

    public Page() {
    }

    public int getId() {
        return id;
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
