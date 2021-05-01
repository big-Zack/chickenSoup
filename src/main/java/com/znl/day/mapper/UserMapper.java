package com.znl.day.mapper;

import com.znl.day.bean.DayUser;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author dell
 * @描述:
 * @文件名: UserMapper.java
 * @创建人: zyhNick
 * @创建时间: 14:08 2021/3/11
 * @修改人:
 * @修改备注: Copyright  2021/3/11
 */
public interface UserMapper {

    DayUser selUserByName(@PathVariable("username") String username);
}
