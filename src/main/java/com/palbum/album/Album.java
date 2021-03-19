package com.palbum.album;

import com.palbum.Account.Account;
import com.palbum.comment.Comment;
import com.palbum.tag.Tag;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "id")
public class Album {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private LocalDateTime createdAt;

    private LocalDateTime updatedTime;

    @OneToOne
    private Account account;

    @ManyToMany
    private Set<Tag> tags = new HashSet<>();

    @OneToMany
    private Set<Comment> comments = new HashSet<>();

}
