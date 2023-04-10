package com.tech.demo.dto;

import com.tech.demo.document.User;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String id;
    private String name;
    private String email;
    private String token;
    private String password;

    public UserResponse(User t1) {
    }

    public UserResponse(String id, String name, String email) {
    }
}
