package com.tech.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserToRegister {

    private String name;
    private String lastname;
    private String email;
    private String password;
    private String document;
    private String documentType;
}
