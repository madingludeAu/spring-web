package com.my.mapper;


import com.my.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserMapper {


    List<User>  selectAll();
}
