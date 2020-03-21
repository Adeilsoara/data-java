package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pragrama {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat stf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat stf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Date y1 = stf1.parse("25/06/2020");
		Date y2 = stf2.parse("25/06/2020 15:42:56");
		
		System.out.println(stf2.format(y1));
		System.out.println(stf2.format(y2));
		System.out.println(stf2.format(x1));
	}

}
