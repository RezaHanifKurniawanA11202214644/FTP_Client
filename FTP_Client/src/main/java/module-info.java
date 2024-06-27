module id.my.rezahanif.ftp_client {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires org.apache.commons.net;
    requires java.desktop;
    requires org.apache.tika.core;
    requires org.apache.commons.io;
    requires org.slf4j;
    requires java.sql;

    opens id.my.rezahanif.ftp_client to javafx.fxml;
    opens id.my.rezahanif.ftp_client.Controller to javafx.fxml;
    exports id.my.rezahanif.ftp_client;
}