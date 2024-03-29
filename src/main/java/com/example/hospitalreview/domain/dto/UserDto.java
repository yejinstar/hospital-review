package com.example.hospitalreview.domain.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserDto {
    private Long id;
    private String userName;
    private String password;
    private String email;
}
