package top.bearcad.chat.ui.view.face;

/**
 * @program: chat-ui
 * @description:
 * @author: bearcad
 * @create: 2021-10-25 21:06
 **/
public class FaceEventDefine {
    private  FaceInit faceInit;

    public FaceEventDefine(FaceInit faceInit) {
        this.faceInit = faceInit;
        hideFace();
    }

    private void hideFace() {
        faceInit.root().setOnMouseExited(event -> faceInit.hide());
    }


}
