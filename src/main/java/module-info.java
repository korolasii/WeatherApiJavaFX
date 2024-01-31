module com.gesmedia.gesmedia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gesmedia.gesmedia to javafx.fxml;
    exports com.gesmedia.gesmedia;
}