package top.bearcad.chat.socket.handler;

import com.alibaba.fastjson.JSON;
import io.netty.channel.Channel;
import top.bearcad.chat.application.UserService;
import top.bearcad.chat.domain.user.model.NewUserInfo;
import top.bearcad.chat.protocol.friend.SearchFriendRequest;
import top.bearcad.chat.protocol.friend.SearchFriendResponse;
import top.bearcad.chat.protocol.friend.dto.UserDto;
import top.bearcad.chat.socket.MyBizHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:53
 **/
public class SearchFriendHandler extends MyBizHandler<SearchFriendRequest> {

    public SearchFriendHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, SearchFriendRequest msg) {
        logger.info("搜索好友请求处理：{}", JSON.toJSONString(msg));
        List<UserDto> userDtoList = new ArrayList<>();
        List<NewUserInfo> userInfoList = userService.queryFuzzyUserInfoList(msg.getUserId(), msg.getSearchKey());
        for (NewUserInfo userInfo : userInfoList) {
            UserDto userDto = new UserDto();
            userDto.setUserId(userInfo.getUserId());
            userDto.setUserNickName(userInfo.getUserNickName());
            userDto.setUserHead(userInfo.getUserHead());
            userDto.setStatus(userInfo.getStatus());
            userDtoList.add(userDto);
        }
        SearchFriendResponse response = new SearchFriendResponse();
        response.setList(userDtoList);
        channel.writeAndFlush(response);
    }

}
