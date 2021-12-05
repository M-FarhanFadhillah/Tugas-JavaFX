package javafxapplicationtest;

import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
// import javafx.scene.layout.Background;
// import javafx.scene.layout.BackgroundFill;
// import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
// import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
// import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class javafxapplicationtest extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Button btnRegister = new Button("Register");

        Label FirstName = new Label("First Name ");
        TextField _FirstName = new TextField();

        Label LastName = new Label("Last Name ");
        TextField _LastName = new TextField();
        
        Label Email = new Label("E-Mail Address ");
        TextField _Email = new TextField();

        Label Contact = new Label("Contact No ");
        TextField _Contact = new TextField();
        
        Label Password = new Label("Password ");
        TextField _Password = new TextField();
        
        Label ConfirmPassword = new Label("Confirm Password ");
        TextField _ConfirmPassword = new TextField();


        HBox x_FirstName = new HBox();
        HBox x_LastName = new HBox();
        HBox x_Email = new HBox();
        HBox x_Contact = new HBox();
        HBox x_Password = new HBox();
        HBox x_ConfirmPassword = new HBox();
        
        VBox v_FieldHolder = new VBox();
        
        /*Button btnCancel = new Button();
        Label labelOutput = new Label("Output: ");
        Rectangle rect = new Rectangle(5,95,290,30);
        rect.setFill(Color.BURLYWOOD);
        
        
        btnCancel.setText("Cancel");
        
        btnOk.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                labelOutput.setText("Output: "+tf.getText());
            }
        });
        
        btnCancel.setOnAction(event -> {
            System.out.println("Btn Cancel diklik");
        });
        
        btnCancel.setOnMouseEntered(event -> {
            System.out.println("Mouse masuk");
        });
        
        btnCancel.setOnMouseExited(event -> {
            System.out.println("Mouse Keluar");
        });*/
        
        x_FirstName.getChildren().addAll(FirstName, _FirstName);
        x_FirstName.setSpacing(50);

        x_LastName.getChildren().addAll(LastName, _LastName);
        x_LastName.setSpacing(51);

        x_Email.getChildren().addAll(Email, _Email);
        x_Email.setSpacing(29);

        x_Contact.getChildren().addAll(Contact, _Contact);
        x_Contact.setSpacing(49);

        x_Password.getChildren().addAll(Password, _Password);
        x_Password.setSpacing(59);
        
        x_ConfirmPassword.getChildren().addAll(ConfirmPassword, _ConfirmPassword);
        x_ConfirmPassword.setSpacing(14);

        v_FieldHolder.getChildren().addAll(x_FirstName, x_LastName, x_Email, x_Contact, x_Password, x_ConfirmPassword);
        v_FieldHolder.setSpacing(10);

        v_FieldHolder.setLayoutX(30);
        v_FieldHolder.setLayoutY(30);

        Group group = new Group();
        TilePane tp_Panel2 = new TilePane();
        
        tp_Panel2.getChildren().addAll(btnRegister);
        btnRegister.setStyle("-fx-background-color: #3d85c6; ");
        
        tp_Panel2.setLayoutX(150);
        tp_Panel2.setLayoutY(250);
        
        //labelOutput.setLayoutX(10);
        //labelOutput.setLayoutY(100);
        
        group.getChildren().addAll(v_FieldHolder, tp_Panel2);//,labelOutput);
        
        Scene scene = new Scene(group, 380, 330);
        scene.setFill(Color.WHITE);
        //hbox_Panel1.setBackground(new Background(new BackgroundFill(Color.ANTIQUEWHITE,null,null)));
        //hbox_Panel1.setPadding(new Insets(5,5,5,5));
        
        primaryStage.setTitle("Registrasi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}