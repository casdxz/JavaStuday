package top.bearcad.java.basic.version;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 12:45
 **/
class QrcodeTest {

    @Test
    public void QrcodeDown() {
        try {
            // ⼆维码内容
            String qrCodeContent = "https://cdn.jsdelivr.net/gh/RuErJieFei/PicX@master/20211028/4E67C176-C6F8-425D-9E68-609C03E30A45.4ex2iwt733w0.jpeg";
            // 读取⽂件为流对象
            InputStream stream = new
                    FileInputStream("E:/FlowChart/img25.jpg");
            // ⽣成⼆维码
            BufferedImage erweima = Qrcode.createQrCode(qrCodeContent);
            // 将⼆维码放在背景图上
            BufferedImage image = Qrcode.addLogo_QRCode(erweima,
                    stream);
            // 给图⽚添加⽂字并且输出
            BufferedImage bufferedImage = Qrcode.generateQrCode(image,
                    "qrcode.jpg");
            File file = new File("qrcode.jpg");
            // 创建⽂件
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(file);
            // 写⼊⽂件
            ImageIO.write(bufferedImage, "jpg", out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}