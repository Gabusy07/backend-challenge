package com.tech.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserToRegister {

    private String name;
    private String email;
    private String password;
}
