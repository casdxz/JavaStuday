package top.bearcad.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import top.bearcad.chat.infrastructure.po.UserFriend;

import java.util.List;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:42
 **/
@Mapper
public interface IUserFriendDao {

    List<String> queryUserFriendIdList(String userId);

    UserFriend queryUserFriendById(UserFriend req);

    void addUserFriendList(List<UserFriend> list);

}
