package com.palbum.comment;

import com.palbum.Account.Account;
import com.palbum.album.Album;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "id")
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private LocalDateTime createdAt;

    private LocalDateTime updatedTime;

    @OneToOne
    private Account account;

    boolean isReply;

    @OneToOne
    private Comment parentComment;

    @ManyToOne
    private Album album;
}
