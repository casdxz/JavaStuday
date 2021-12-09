package top.bearcad.java.basic.version;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 12:19
 **/
class VerificationCodeTest {

    VerificationCode test = new VerificationCode();

    @Test
    void getImage() throws IOException {
        BufferedImage image = test.getImage();
        String fileName = "VerificationCode.jpg";
        FileOutputStream out = new FileOutputStream(fileName);
        //写出图片
        ImageIO.write(image, "JPEG", out);
        System.out.println(test.getText());
    }

}