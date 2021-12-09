package top.bearcad.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import top.bearcad.chat.domain.inet.model.ChannelUserReq;
import top.bearcad.chat.infrastructure.po.User;

import java.util.List;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:41
 **/
@Mapper
public interface IUserDao {

    String queryUserPassword(String userId);
    User queryUserById(String userId);

    List<User> queryFuzzyUserList(String userId, String searchKey);

    Long queryChannelUserCount(ChannelUserReq req);
    List<User> queryChannelUserList(ChannelUserReq req);

}
