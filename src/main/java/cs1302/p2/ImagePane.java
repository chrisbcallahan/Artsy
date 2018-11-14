package cs1302.p2;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ImagePane extends BorderPane
{
    private Label imgLabel;
    private ImageView img;
    private Button rotateButton;
    private Button resetButton;
    private ImageManager imgManager;

    public ImagePane(String labelText)
    {
	imgLabel = new Label(labelText);
	img = new ImageView();
	
	rotateButton = new Button("Rotate");
	resetButton = new Button("Reset");

	FlowPane buttonsPane = new FlowPane(rotateButton, resetButton);
	
	this.setBottom(buttonsPane);
	this.setTop(imgLabel);
	this.setLeft(img);
    }

    public ImageView getImageView()
    {
	return this.img;
    }

    public void setLabelText()
    {
	
    }
}