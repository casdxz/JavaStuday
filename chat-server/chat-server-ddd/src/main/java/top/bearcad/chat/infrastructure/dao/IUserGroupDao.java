package top.bearcad.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:42
 **/
@Mapper
public interface IUserGroupDao {

    List<String> queryUserGroupsIdList(String userId);

}
