package cs1302.p2;

import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;

import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class ControlPane extends FlowPane
{
    
    ImageManager imgManager;
    //MyArtsy myArtsy; TODO - Uncomment after MyArtsy is implemented.
    
    //TODO - Add myArtsy to Constructor.
    public ControlPane(ImageManager imgManager)
    {
	this.imgManager = imgManager;
	AppMenuBar menu = new AppMenuBar(imgManager);
	Button checkers = new Button("Checkers");
	Button horizontalStripes = new Button("Horizontal Stripes");
	Button verticalStripes = new Button("Vertical Stripes");

	checkers.setOnAction(event -> checkers());
	
	this.getChildren().addAll(menu, checkers, horizontalStripes, verticalStripes);
    }

    private void checkers()
    {
	//Create the Dialog
	TextInputDialog dialog = new TextInputDialog();
	dialog.setTitle("Checkers Options");
	dialog.setHeaderText("Please enter the desired checker width, in pixels.");

	Optional<String> input = dialog.showAndWait();

	//Image checkered = myArtsy.doCheckers(imgManager.getImage(0), imgManager.getImage(1));
	//imgManager.setImage(checkered, 2);
    }
}