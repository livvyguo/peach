package org.lvy.wwt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.lvy.wwt.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by livvy (livvyguo@gmail.com) on 2017/3/21.
 *
 * @author livvy
 * @date 2017/03/21
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> selectUsers();
}
