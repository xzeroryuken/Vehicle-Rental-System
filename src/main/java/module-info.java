module com.example.vehiclerentalsystem {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.vehiclerentalsystem to javafx.fxml;
    exports com.example.vehiclerentalsystem;
    exports com.example.vehiclerentalsystem.models;
    opens com.example.vehiclerentalsystem.models to javafx.fxml;
}