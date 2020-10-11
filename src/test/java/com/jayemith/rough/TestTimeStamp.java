package com.jayemith.rough;

import java.util.Date;

public class TestTimeStamp {

	public static void main(String[] args) {
		
		
		Date d = new Date();
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_")+".png";
		System.err.println(screenshotName);
		System.err.println(d);

	}

}
