/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectforwebcam;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author sabin
 */
public class JavaProjectForWebCam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());
        webcam.open();
        try {
        ImageIO.write(webcam.getImage(), "JPG" , new File("Sabin Photo"));
        } catch(IOException e ) 
        {
            e.printStackTrace();
        }
//        WebcamPanel webcamPanel = new WebcamPanel(webcam);
//        webcamPanel.setImageSizeDisplayed(true);
//        webcamPanel.setFPSDisplayed(true);
//        webcamPanel.setImageSizeDisplayed(true);
//        webcamPanel.setMirrored(true);
//
//
//        JFrame frame = new JFrame("WebCam By Sabin Kharel");
//        frame.add(webcamPanel);
//        frame.setLocationRelativeTo(null);
//        frame.pack();
//        frame.setResizable(true);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);
    }
    
}
