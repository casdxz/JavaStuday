package top.bearcad.chat.ui.view.login;

/**
 * @program: chat-ui
 * @description:
 * @author: bearcad
 * @create: 2021-10-22 22:21
 **/
public interface ILoginEvent {

    /**
     * 登陆验证
     *
     * @param userId       用户ID
     * @param userPassword 用户密码
     */
    void doLoginCheck(String userId, String userPassword);

}
