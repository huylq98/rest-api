package vn.com.huylq.restapi.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.huylq.restapi.dto.response.UserResponse;
import vn.com.huylq.restapi.service.UserService;

@RestController
@RequestMapping("/${spring.application.name}/v1/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping
  public List<UserResponse> getAll() {
    return userService.getAll();
  }
}
