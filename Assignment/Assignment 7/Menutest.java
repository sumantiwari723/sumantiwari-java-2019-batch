import java.awt.*;
import javax.swing.*;  
import java.awt.event.*; 
class Menutest extends Frame
{
	Menutest()//constructor
	{
	MenuBar mbar = new MenuBar(); //object of menu bar
	Frame f = new Frame(); // object of Frame

	//Adding or setting menubar to frame
	 f.setMenuBar(mbar);

	 //set the properties of frame class

	  f.setLayout(new FlowLayout());
	  f.setVisible(true);
	  f.setSize(500,500);

	  //creating a menu class object
	  Menu File = new Menu("File");
	  Menu File = new Menu("Edit");
	  Menu File = new Menu("View");
	  Menu File = new Menu("Open");
	  
	  //creating a menu items
       Menuitem m1,m2,m3,m4,m5,m6,m7;
       m1 = new Menuitem("New");
       File.add(m1);
       text = new Menuitem("Text");
       New.add(text);
       folder = new Menuitem("Folder");
       New.add(folder);
       m2 = new Menuitem("Save");
       File.add(m2);
       m3 = new Menuitem("Close");
       File.add(m3);
       m4 = new Menuitem("Window");
       View.add(m4);
       m5 = new Menuitem("Panel");
       View.add(m4);
       m6 = new Menuitem("open");
       Open.add(m6);
       mbar.add(File);//insert menu into bar
       mbar.add(Edit);
       mbar.add(View);
       mbar.add(Open);

	}
	public static void main(string[] args){
		Menutest m1=new menu_test();
	}
}
