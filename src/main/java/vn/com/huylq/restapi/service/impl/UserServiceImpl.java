package vn.com.huylq.restapi.service.impl;

import java.util.Arrays;
import java.util.List;
import lombok.SneakyThrows;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import vn.com.huylq.restapi.dto.response.UserResponse;
import vn.com.huylq.restapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @SneakyThrows
  @Cacheable("userCache")
  @Override
  public List<UserResponse> getAll() {
    Thread.sleep(3000);
    return Arrays.asList(
        UserResponse.builder().name("huylq33").build(),
        UserResponse.builder().name("phuongnvt1").build()
    );
  }
}
