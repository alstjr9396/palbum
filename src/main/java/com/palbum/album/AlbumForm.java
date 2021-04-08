package com.palbum.album;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class AlbumForm {

    @Length(max = 50)
    private String title;

    @Length(max = 100)
    private String shortDescription;

    private String fullDescription;

}
