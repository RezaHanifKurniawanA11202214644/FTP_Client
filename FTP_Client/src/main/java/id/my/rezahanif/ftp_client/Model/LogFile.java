package id.my.rezahanif.ftp_client.Model;

import javafx.beans.property.SimpleStringProperty;

public class LogFile {
    private String fileName;
    private String direction;
    private String remoteFile;
    private long size;
    private String status;

    // Constructor, getters, and setters
    // Constructor, getters, and setters
    public LogFile(String fileName, String direction, String remoteFile, long size, String status) {
        this.fileName = fileName;
        this.direction = direction;
        this.remoteFile = remoteFile;
        this.size = size;
        this.status = status;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getRemoteFile() {
        return remoteFile;
    }

    public void setRemoteFile(String remoteFile) {
        this.remoteFile = remoteFile;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}





