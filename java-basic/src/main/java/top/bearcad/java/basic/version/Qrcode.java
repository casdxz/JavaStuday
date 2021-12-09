package top.bearcad.java.basic.version;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 12:29
 **/
@SuppressWarnings("unchecked")
public class Qrcode {
    /**
     * ⿊⾊
     */
    private static final int BLACK = 0xFF000000;
    /**
     * ⽩⾊
     */
    private static final int WHITE = 0xFFFFFFFF;
    /**
     * ⼆维码的宽
     */
    private static final int WIDTH = 360;
    /**
    * ⼆维码的⾼
    */
    private static final int HEIGHT = 360;


    public static BufferedImage toBufferedImage(BitMatrix matrix) {
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        BufferedImage image = new BufferedImage(width, HEIGHT, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                image.setRGB(x, y, WHITE);
            }
        }
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, matrix.get(x, y) ? BLACK : WHITE);
            }
        }
        return image;
    }

    public static BufferedImage createQrCode(String content) throws
            Exception {
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        Map hints = new HashMap();
        // 设置UTF-8， 防⽌中⽂乱码
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        // 设置⼆维码四周⽩⾊区域的⼤⼩
        hints.put(EncodeHintType.MARGIN, 1);
        // 设置⼆维码的容错性
        hints.put(EncodeHintType.ERROR_CORRECTION,
                ErrorCorrectionLevel.H);
        // 画⼆维码
        BitMatrix bitMatrix = multiFormatWriter.encode(content,
                BarcodeFormat.QR_CODE, WIDTH, HEIGHT, hints);
        BufferedImage image = toBufferedImage(bitMatrix);
        return image;
    }

    public static BufferedImage addLogo_QRCode(BufferedImage erweima,
                                               InputStream bgp) throws Exception {
        // 读取⼆维码图⽚，并构建绘图对象360*360
        // 保持⼆维码是正⽅形的
        int widtherweima = erweima.getWidth();
        int heighterweima = erweima.getHeight();
        // 读取背景图⽚600*900
        BufferedImage bgpi = ImageIO.read(bgp);
        // 计算图⽚放置位置
        int x = 220;
        int y = 236;
        // 构建背景的图⽚
        Graphics2D bgpiGraphics = bgpi.createGraphics();
        bgpiGraphics.drawImage(erweima, x, y, widtherweima, heighterweima,
                null);
        bgpiGraphics.dispose();
        return bgpi;
    }

    public static BufferedImage generateQrCode(BufferedImage image, String
            pressText) {
        Graphics g = image.getGraphics();
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        // 设置字体
        Font font = new Font("宋体", Font.PLAIN, 40);
        g.setFont(font);
        g.setColor(Color.white);
        FontMetrics metrics = g.getFontMetrics(font);
        // ⽂字在图⽚中的坐标 这⾥设置在中间
        int startX = (600 - metrics.stringWidth(pressText)) / 2 + 100;
        int startY = 650;
        g.drawString(pressText, startX, startY);
        g.dispose();
        return image;
    }
}
