package com.example.hospitalreview.controller;

import com.example.hospitalreview.domain.Response;
import com.example.hospitalreview.domain.dto.UserDto;
import com.example.hospitalreview.domain.dto.UserJoinRequest;
import com.example.hospitalreview.domain.dto.UserJoinResponse;
import com.example.hospitalreview.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public Response<UserJoinResponse> Join(@RequestBody UserJoinRequest userJoinRequest){
        log.info("join으로 요청이 들어왔습니다.");
        log.info("join 과정 진행합니다.");
        UserDto userDto = userService.join(userJoinRequest);
        return Response.suceess(new UserJoinResponse(userDto.getUserName(), userDto.getEmail()));
    }
}
