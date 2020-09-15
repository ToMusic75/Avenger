import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.QuadCurve;
import json.com.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;

public class CubicCurveExample extends Application {
    BufferedReader br = new BufferedReader(new FileReader(file));
    String line;
    while ((line = br.readLine()) != null) {
            JSONObject json = new JSONObject(line);
            //json.getString("Slaves");
            //json.getStrng("Job Reader");

    //and so on..

    //if you want to get all avilable keys.. use
            Iterator<?> keys = json.keys();

            while( keys.hasNext() ){
                String key = (String)keys.next();
                if( json.get(key) instanceof JSONObject ){
                    //key = the key and json.get(key) the value.
                }
            }
        }
    br.close();
    @Override
    public void start(Stage stage) {
        //Drawing a cubic curve
        QuadCurve cubicCurve = new QuadCurve();

        //Setting properties to cubic curve
        cubicCurve.setStartX(9.2490356);
        cubicCurve.setStartY(0);
        cubicCurve.setEndX(100.2490356f);
        cubicCurve.setEndY(150);

//        cubicCurve.setControlX1(400.0f);
//        cubicCurve.setControlY1(40.0f);
//        cubicCurve.setControlX2(175.0f);
//        cubicCurve.setControlY2(250.0f);
//        cubicCurve.setEndX(500);
//        cubicCurve.setEndY(150);

        //Creating a Group object
        Group root = new Group(cubicCurve);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        stage.setTitle("Drawing a cubic curve");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}