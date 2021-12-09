package top.bearcad.java.basic.ioex;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @program: java-basic
 * @description: File综合操作单元测试
 * @author: bearcad
 * @create: 2021-11-17 15:16
 **/
class FileOperatorTest {

    @Test
    void createDir() {
        String path = "/Users/Bear/Desktop/File/aaa";
        boolean res = FileOperator.createDir(path);
        assertTrue(res);
    }

    @Test
    void createFile() {
        String path = "/Users/Bear/Desktop/File/aaa/hello.txt";
        boolean res = false;
        try {
            res = FileOperator.createFile(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        assertTrue(res);
    }

    @Test
    void getFileInfo() {
        File file = new File("/Users/Bear/Pictures/1.png");
        Properties fileProperties = FileOperator.getFileInfo(file);
        assertEquals(4, fileProperties.size());
    }

    @Test
    void deleteFile() {
        boolean res =
                FileOperator.deleteFile("/Users/Bear/Pictures/1.png");
        assertTrue(res);
    }
}