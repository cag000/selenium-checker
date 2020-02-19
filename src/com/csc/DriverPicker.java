package com.csc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

public class DriverPicker extends JPanel {
	private String textFieldLabel;
    private String buttonLabel;
     
    private JLabel label;
    private JTextField textField;
    private JButton button;
    protected JButton start;
    private JButton stop;
     
    private JFileChooser fileChooser;
     
    private int mode;
    public static final int MODE_OPEN = 1;
    public static final int MODE_SAVE = 2;
     
    public DriverPicker(String textFieldLabel, String buttonLabel) {
        this.textFieldLabel = textFieldLabel;
        this.buttonLabel = buttonLabel;
         
        fileChooser = new JFileChooser();
         
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
 
        // creates the GUI
        label = new JLabel(textFieldLabel);
         
        textField = new JTextField(30);
        button = new JButton(buttonLabel);        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonActionPerformed(e);            
            }
        });
        
          
        add(label);
        add(textField);
        add(button);

         
    }
    

	public DriverPicker() {
		// TODO Auto-generated constructor stub
	}


	private void buttonActionPerformed(ActionEvent e) {
        if (mode == MODE_OPEN) {
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                textField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        } else if (mode == MODE_SAVE) {
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                textField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        }
    }
    
    
    public void addFileTypeFilter(String extension, String description) {
        FileTypeFilter filter = new FileTypeFilter(extension, description);
        fileChooser.addChoosableFileFilter(filter);
    }
     
    public void setMode(int mode) {
        this.mode = mode;
    }
     
    public String getSelectedFile() {
        return textField.getText();
    }
     
    public JFileChooser getFileChooser() {
        return this.fileChooser;
    }
}
