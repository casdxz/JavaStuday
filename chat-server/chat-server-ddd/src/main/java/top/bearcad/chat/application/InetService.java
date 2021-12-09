package top.bearcad.chat.application;

import top.bearcad.chat.domain.inet.model.ChannelUserInfo;
import top.bearcad.chat.domain.inet.model.ChannelUserReq;
import top.bearcad.chat.domain.inet.model.InetServerInfo;

import java.util.List;
/**
 * @program: chat-server
 * @description: 网络信息查询
 * @author: bearcad
 * @create: 2021-11-09 00:22
 **/
public interface InetService {

    /**
     * 查询Netty服务器信息
     *
     * @return InetServerInfo
     */
    InetServerInfo queryNettyServerInfo();

    /**
     * @param req 请求
     * @return Channel用户数
     */
    Long queryChannelUserCount(ChannelUserReq req);

    /**
     * @param req 请求
     * @return List<ChannelUserInfo>
     */
    List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req);

}
