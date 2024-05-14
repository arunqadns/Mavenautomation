package com.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.WebElement;

public class Utilities {
	
	public static void dropdown(String check_value,WebElement l) throws AWTException 
	{
		String field_value=" ";
		Robot robo=new Robot();
		int count=1;
		do
		{		
		for(int i=1;i<=count;i++)
		{
		robo.keyPress (KeyEvent.VK_DOWN);
		}	
		robo.keyPress (KeyEvent.VK_ENTER);	
		
		field_value = l.getAttribute("value");
		count=count+1;
		if(count>60)
		{
			System.out.println(check_value+" "+ " not found");
			break;
		}
	
		}
		while (!check_value.equals(field_value));
	}
	
	public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();

    }

}
