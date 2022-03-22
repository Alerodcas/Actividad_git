module com.example.activiadd_git {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.activiadd_git to javafx.fxml;
    exports com.example.activiadd_git;
}