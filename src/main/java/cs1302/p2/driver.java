package cs1302.p2;

import cs1302.effects.Artsy;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import java.io.File;

/**
 * This is the driver for this application.
 */
public class Driver extends Application {

    ImageManager imgManager;
    ImagePane img1Pane = new ImagePane("Image 1");
    ImagePane img2Pane = new ImagePane("Image 2");
    ImagePane resultPane = new ImagePane("Result");
    
    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root);

	// Our GUI Code.

	//Instantiate ImageManager and add the default image to each value.
	imgManager = new ImageManager(3);

	for (int i = 0; i < imgManager.getMaxNumOfImages(); i++)
	{
	    Image img = new Image("file:resources/default.png");
	    imgManager.addImage(img);
	}
	
	//Instantiate the ControlPane
        ControlPane controls = new ControlPane(imgManager);

	// Bind the ImagePane's images to the images stored in ImageManager.
	ImagePane[] imagePanes = {img1Pane, img2Pane, resultPane};
	
	for (int i = 0; i < imagePanes.length; i++) {
	    ImageView imgView = imagePanes[i].getImageView();
	    ObjectProperty<Image> imgProperty = imgView.imageProperty();
	    SimpleObjectProperty<Image> imgManagerProperty = imgManager.getImageProperty(i);
	    imgProperty.bind(imgManagerProperty);
	}
	
	//Add the components to the root.
	root.setTop(controls);
	root.setLeft(img1Pane);
	root.setCenter(img2Pane);
	root.setRight(resultPane);
	
        stage.setScene(scene);
        stage.setTitle("Artsy!");
        stage.sizeToScene();
        stage.show();
        
    } // createAndShowGUI

    public static void main(String[] args) {
        launch(args);
    } // main

} // Driver
