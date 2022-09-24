package Generic;

import java.util.Date;

import org.openqa.selenium.By;

public class DateSample {
	public static void main(String[] args) {
		Date dateobj=new Date();
		String currentDate=dateobj.toString();
		System.out.println(currentDate);
		String[] arr=currentDate.split(" ");
		
		String date=arr[2];
		int month=dateobj.getMonth(); //deplicate () in future versions this () doesn't exits
		String year=arr[5];
	}

}
