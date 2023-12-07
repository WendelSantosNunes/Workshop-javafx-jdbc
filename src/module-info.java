module workshop_javafx_jdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens application to javafx.graphics, javafx.fxml;
    opens model.entities;
    opens gui to javafx.fxml;

    exports application;
    exports gui;
}