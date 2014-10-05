import java.io.*;
import java.util.*;
import java.net.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient {
	public static void main(String[] args){
		Chuangkou c = new Chuangkou();
		c.Struct();
	}
	
}
 class Chuangkou extends Frame{
	void Struct(){
		setBounds(400,400,300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			setVisible(false);
			System.exit(0);
		}});
		
	}
}
