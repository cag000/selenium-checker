package com.csc;

import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.io.File;
 
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GUI extends JFrame {
	
 
    public GUI() {
        super("Screen Name Check");
         
        setLayout(new FlowLayout());
 
        // set up a file picker component
        JFilePicker filePicker = new JFilePicker("Pick a file(.txt)", "Browse...");
        filePicker.setMode(JFilePicker.MODE_SAVE);
        filePicker.addFileTypeFilter(".txt", "Text File");
        
        // set up Driver component
//        DriverPicker filePicker2 = new DriverPicker("Driver browser", "Browse...");
//        filePicker2.setMode(JFilePicker.MODE_SAVE);
//        filePicker2.addFileTypeFilter(".exe", "Exe File");
        
        // access JFileChooser class directly
        JFileChooser fileChooser = filePicker.getFileChooser();
        fileChooser.setCurrentDirectory(new File("C:/"));
        
//        JFileChooser driverChooser = filePicker2.getFileChooser();
//        driverChooser.setCurrentDirectory(new File("C:/"));
         
        // add the component to the frame
//        add(filePicker2);
        add(filePicker);
        
        //LogicScreen lc = new LogicScreen(fileChooser);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);    // center on screen
    }


//public class GUI extends JFrame {
//	
//	 public void MainWindow(){
//	        this.setTitle("Jendela Utama");
//	        this.setSize(600,320);
//	    }
}
