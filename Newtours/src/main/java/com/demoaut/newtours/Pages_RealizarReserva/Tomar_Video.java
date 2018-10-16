package com.demoaut.newtours.Pages_RealizarReserva;

import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_QUICKTIME;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_QUICKTIME_JPEG;
import static org.monte.media.VideoFormatKeys.QualityKey;


import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.File;


import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;


public class Tomar_Video {
	
	public static void videopantallazo() throws Exception {
		
		
		GraphicsConfiguration gc = GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice()
				.getDefaultConfiguration();
		ScreenRecorder screenRecorder = new ScreenRecorder(
				 gc, 
				 null,
				 new Format(MediaTypeKey, FormatKeys.MediaType.FILE, MimeTypeKey, 
						 MIME_QUICKTIME),
				 new Format(MediaTypeKey, FormatKeys.MediaType.VIDEO, 
						 EncodingKey,ENCODING_QUICKTIME_JPEG, CompressorNameKey,
						 ENCODING_QUICKTIME_JPEG,  DepthKey, 24, FrameRateKey, 
						 Rational.valueOf(15), 
						 QualityKey, 0.5f, KeyFrameIntervalKey,   15 * 60),
				 new Format(MediaTypeKey, FormatKeys.MediaType.VIDEO, 
						 EncodingKey, "black", FrameRateKey,
				  Rational.valueOf(30)),
				 null, 
				 new File("C:\\Users\\SBMEDADMIN\\Documents\\Tests-Newtours\\Video_NewTours"));
		         screenRecorder.start();
				
				/*screenRecorder.start();
				System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver-v0.22.0-win32\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://demosite.center/wordpress/wp-login.php");
				Thread.sleep(2000);
				driver.quit();
				*/
		         Thread.sleep(5500);
		         screenRecorder.stop();
		        //stopRecording(screenRecorder);
	}
	
	public static void stopRecording(ScreenRecorder screenRecorder) throws Exception
    {
     screenRecorder.stop();
    }
	}
	
	

