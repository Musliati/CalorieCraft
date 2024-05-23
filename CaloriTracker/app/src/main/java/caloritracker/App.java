package caloritracker;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{
    
    @Override
    public void start(Stage PrimaryStage){
        PrimaryStage.setTitle("Calori Tracker");
        PrimaryStage.setResizable(false);

        HBox hBox = new HBox();
        // hBox.setStyle("-fx-background-image : url('/CalorieTracker.jpg')");
        hBox.setStyle("-fx-background-image : url('/CalorieTracker.jpg'); -fx-background-repeat: no-repeat;");
        Scene scene = new Scene(hBox, 740, 480);
        // PrimaryStage.setMaximized(true);
        PrimaryStage.setScene(scene);
        PrimaryStage.show();

    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}