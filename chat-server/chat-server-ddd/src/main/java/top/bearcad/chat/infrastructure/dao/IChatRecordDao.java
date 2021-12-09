package top.bearcad.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearcad.chat.infrastructure.po.ChatRecord;

import java.util.List;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:39
 **/
@Mapper
public interface IChatRecordDao {

    void appendChatRecord(ChatRecord req);

    List<ChatRecord> queryUserChatRecordList(String talkId, String userId);

    List<ChatRecord> queryGroupsChatRecordList(String talkId, String userId);

}
