package top.bearcad.chat.domain.inet.repository;

import top.bearcad.chat.domain.inet.model.ChannelUserInfo;
import top.bearcad.chat.domain.inet.model.ChannelUserReq;

import java.util.List;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:28
 **/
public interface IInetRepository {

    /**
     * queryChannelUserCount
     *
     * @param req req
     * @return long
     */
    Long queryChannelUserCount(ChannelUserReq req);

    /**
     * queryChannelUserList
     *
     * @param req req
     * @return List
     */
    List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req);

}
