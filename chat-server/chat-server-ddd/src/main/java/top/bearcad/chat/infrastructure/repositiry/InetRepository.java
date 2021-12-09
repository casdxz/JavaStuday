package top.bearcad.chat.infrastructure.repositiry;

import org.springframework.stereotype.Repository;
import top.bearcad.chat.domain.inet.model.ChannelUserInfo;
import top.bearcad.chat.domain.inet.model.ChannelUserReq;
import top.bearcad.chat.domain.inet.repository.IInetRepository;
import top.bearcad.chat.infrastructure.dao.IUserDao;
import top.bearcad.chat.infrastructure.po.User;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: chat-server
 * @description: InetRepository
 * @author: bearcad
 * @create: 2021-11-09 00:45
 **/
@Repository("inetRepository")
public class InetRepository implements IInetRepository {

    @Resource
    private IUserDao userDao;

    @Override
    public Long queryChannelUserCount(ChannelUserReq req) {
        return userDao.queryChannelUserCount(req);
    }

    @Override
    public List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req) {
        List<ChannelUserInfo> channelUserInfoList = new ArrayList<>();
        List<User> userList = userDao.queryChannelUserList(req);
        for (User user : userList) {
            ChannelUserInfo channelUserInfo = new ChannelUserInfo();
            channelUserInfo.setUserId(user.getUserId());
            channelUserInfo.setUserNickName(user.getUserNickName());
            channelUserInfo.setUserHead(user.getUserHead());
            channelUserInfoList.add(channelUserInfo);
        }
        return channelUserInfoList;
    }
}
