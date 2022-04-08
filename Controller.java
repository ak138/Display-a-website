import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller implements Initializable{
    @FXML
    private WebView webViwer1; 
    @FXML                             //retrive files from scene builder
    private WebView webViwer2; 
    private WebEngine engine;
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {  //initializer to complete 
        engine=webViwer2.getEngine();
        engine.load("https://weather.com/weather/tenday/l/62e0efebee1ac0e8fa9b21fd17d57a6a0001753ab6be8a4874bb78bbb52eda02");  //looks up file
    }
    public void refresh(){
        engine.reload();           //refreshs file
    }
}
