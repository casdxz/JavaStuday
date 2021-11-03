package top.bearcad.netty.demo.domain;

/**
 * @program: netty-demo
 * @description: 文件描述信息
 * @author: bearcad
 * @create: 2021-11-03 22:44
 **/
public class FileDescInfo {
    private String fileUrl;
    private String fileName;
    private Long fileSize;

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

}
