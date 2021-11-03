package top.bearcad.netty.demo.util;

import top.bearcad.netty.demo.domain.FileBurstInstruct;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: netty-demo
 * @description: CacheUtil
 * @author: bearcad
 * @create: 2021-11-03 22:46
 **/
public class CacheUtil {

    public static Map<String, FileBurstInstruct> burstDataMap = new ConcurrentHashMap<>();

}
