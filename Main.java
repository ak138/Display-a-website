import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
//sets scene
    @Override
    public void start(Stage Stage) throws Exception{
    try{
        Parent root=FXMLLoader.load(getClass().getResource("weather.fxml"));
        Scene scene=new Scene(root,Color.BLACK);
        Stage.setScene(scene);
        Stage.setTitle("Weather");
        Image icon=new Image("cloud.png");
        Stage.getIcons().add(icon);
        Stage.show();
    }   
      //catch file to provent crashing
    catch(Exception e) 
        {
            e.printStackTrace();
        }
}
  //lauches files
    public static void main(String[] args) {

        launch(args);
    }
}
