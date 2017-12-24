package Lab4_2;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import Lab4_2.CSVUtilities;
public class DataVisualize extends Application {

	@Override
	public void start(Stage stage) throws Exception 
	{
		stage.setTitle("Borough");
		final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Spots");
        final LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setTitle("Free Wifi Places in NYC");
        XYChart.Series series = new XYChart.Series();
        series.setName("Reference");
        File CVS = new File("wifidata.csv");
		CSVUtilities theCVS =  new CSVUtilities(CVS);
        
      /*  series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        series.getData().add(new XYChart.Data());
        */
        Scene scene  = new Scene(lineChart,500,500);
        lineChart.getData().add(series);
        
        stage.setScene(scene);
        stage.show();         
	}
	public static void main(String[] args) {
        launch(args);
    }

}

