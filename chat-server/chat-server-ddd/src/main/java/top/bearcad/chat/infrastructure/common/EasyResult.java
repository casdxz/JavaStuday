package top.bearcad.chat.infrastructure.commom;

import lombok.Data;

/**
 * @program: chat-server
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 00:38
 **/
@Data
public class EasyResult {

    private Integer code;
    private String msg;
    private Long count;
    private Object data;

    public static EasyResult buildEasyResultError(String message) {
        return new EasyResult(1, message);
    }

    public static EasyResult buildEasyResultError(Exception e) {
        return new EasyResult(1, e.getMessage());
    }

    public static EasyResult buildEasyResultSuccess(Object data) {
        return new EasyResult(0, "", 1L, data);
    }

    public static EasyResult buildEasyResultSuccess(Long count, Object data) {
        return new EasyResult(0, "", count, data);
    }

    public static EasyResult buildEasyResultSuccess() {
        return new EasyResult(0, "");
    }

    public EasyResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public EasyResult(Integer code, String msg, Long count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }


}
