package com.ms.ms_secure_sign.reponse;

import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private boolean status;
    private String message;
    private boolean isTwoFactorAuthEnable;
    private String session;
}