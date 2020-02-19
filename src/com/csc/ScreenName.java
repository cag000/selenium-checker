package com.csc;


import java.util.concurrent.TimeUnit;

import java.awt.FlowLayout;
import java.io.File;
 
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new GUI().setVisible(true);
				
			}
		});

		
	}

}
