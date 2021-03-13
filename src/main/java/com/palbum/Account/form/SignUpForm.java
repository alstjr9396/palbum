package com.palbum.Account.form;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class SignUpForm {

    @Length(min = 3, max = 20)
    private String nickname;

    private String email;

    @Length(min = 8, max = 50)
    private String password;
}
