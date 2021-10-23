package top.bearcad.chat.ui.util;


import top.bearcad.chat.ui.view.chat.element.group_bar_chat.ElementTalk;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: chat-ui
 * @description: 缓存工具
 * @author: bearcad
 * @create: 2021-10-23 15:59
 **/

public class CacheUtil {

    /**
     * 对话框组
     */
    public static Map<String, ElementTalk> talkMap = new ConcurrentHashMap<>(16);

}
