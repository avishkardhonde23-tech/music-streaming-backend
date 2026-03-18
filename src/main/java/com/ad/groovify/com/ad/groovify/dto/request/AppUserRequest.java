package com.ad.groovify.com.ad.groovify.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserRequest {

    @Size(min= 2, max=50, message = " Name must be between 2 to 50 Characters")
    private String name;

    @Email(message = "Email should be Valid")
    private String email;

    @Size(min=6,message="password must be at least 6 characters")
    private String password;

    private
}

