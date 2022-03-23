package vn.com.huylq.restapi.service;

import java.util.List;
import vn.com.huylq.restapi.dto.response.UserResponse;

public interface UserService {

  List<UserResponse> getAll();

}
