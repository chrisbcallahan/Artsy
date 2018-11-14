package cs1302.p2;

import javafx.scene.control.MenuBar;

public class AppMenuBar extends MenuBar
{
    //TEMP - Create OpenMenu directly.
    OpenMenu open;

    public AppMenuBar(ImageManager imgManager)
    {
	super();
	
	//TEMP - Create OpenMenu directly.
	open = new OpenMenu(imgManager);
	getMenus().add(open);
    }
}