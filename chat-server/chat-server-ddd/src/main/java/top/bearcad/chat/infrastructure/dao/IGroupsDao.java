package top.bearcad.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import top.bearcad.chat.infrastructure.po.Groups;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:40
 **/
@Mapper
public interface IGroupsDao {

    Groups queryGroupsById(String groupsId);

}