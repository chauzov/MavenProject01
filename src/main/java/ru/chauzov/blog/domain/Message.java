package ru.chauzov.blog.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

import static javax.persistence.GenerationType.AUTO;

@Data
@ToString(exclude = {"id"}, includeFieldNames = true)

@Entity
@Table(name="messages")
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;

    @Column(name="spittleText")
    private String text;

    @Column(name="postedTime")
    private LocalDate when;

    public Message() {
        this.author = new Author();
        this.author.setId((long)1);
    }

}
