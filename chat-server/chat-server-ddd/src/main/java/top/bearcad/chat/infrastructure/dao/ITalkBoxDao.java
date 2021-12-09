package top.bearcad.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import top.bearcad.chat.infrastructure.po.TalkBox;

import java.util.List;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:41
 **/

@Mapper
public interface ITalkBoxDao {

    List<TalkBox> queryTalkBoxList(String userId);

    void addTalkBox(TalkBox talkBox);

    void deleteUserTalk(String userId, String talkId);

    TalkBox queryTalkBox(String userId, String talkId);

    List<String> queryTalkBoxGroupsIdList(String userId);

}