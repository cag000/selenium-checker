package com.csc;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JFileChooser;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.regex.*;

public class LogicScreen extends JPanel {
	
	JFilePicker gui = new JFilePicker(); //picker percobaan
	DriverPicker driver = new DriverPicker(); //picker driver
	JFileChooser file = new JFileChooser();
	private String[] screenName;
	private String path;
	
	public LogicScreen() {
		
		}
	
	public String[] screenName() {
		String[] checkScreenName = null;

		String path = "percobaan.txt";
		this.screenName = checkScreenName; 
		String screenNameTest = null;
			try {
			
				List<String> lines = new ArrayList<String>();
				BufferedReader bufferedReader = new BufferedReader(new FileReader (path));
				while((screenNameTest = bufferedReader.readLine()) != null) {
					lines.add(screenNameTest);
					}
				bufferedReader.close();
				
				//Convert to String
				checkScreenName  =  lines.toArray(new String[lines.size()]);
				
			
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
			return checkScreenName;
			

		}

	
	public void runSelenium() throws InterruptedException {
		DriverPicker driverPick = new DriverPicker();


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driverBrowser = new ChromeDriver(); //belom selesai
		String screenNamegg[] = screenName();
		String urlTw = "https://twitter.com/"+screenNamegg;
		driverBrowser.manage().window().maximize();
		for(int i=0;i<=screenNamegg.length;i++) {
			String urlBase = "https://twitter.com/"+screenNamegg[i];
			Thread.sleep(1000); //time set till next task
			for(int j=i;j<=i;j++) {
				driverBrowser.get(urlBase);
			}
		}

	}
	 
}
