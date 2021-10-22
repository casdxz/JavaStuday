package top.bearcad.chat.ui.view.chat;

/**
 * @program: chat-ui
 * @description:
 * @author: bearcad
 * @create: 2021-10-23 00:15
 **/

/**
 * 窗体控制器
 * @author Bear
 */
public class ChatController extends ChatInit implements IChatMethod{

    private ChatEventDefine chatEventDefine;

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {
        chatEventDefine = new ChatEventDefine(this);
    }

    @Override
    public void doShow() {
        super.show();
    }

}

