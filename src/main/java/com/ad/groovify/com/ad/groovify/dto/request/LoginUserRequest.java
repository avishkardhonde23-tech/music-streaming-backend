package com.ad.groovify.com.ad.groovify.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoginUserRequest {

    @NotBlank(message = "Email is Required")
    @Email(message ="Email Should be Valid")
    private String email;

    @NotBlank(message = "Password is must")
    private String password;
}
