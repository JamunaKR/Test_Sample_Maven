package Generic;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author RiChi
 *
 */

public class JavaUtils {
	Date dataobj=new Date();
	/**
	 * used to generate random number start from 0 to 10000
	 * @return
	 */
	public int gernerateRandomNum()
	{
		Random random=new Random();
		int randomInt=random.nextInt(10000);
		
		return randomInt;
	}
	public String getCurrentSystemDataAndTime()
	{
		String currentDate= dataobj.toString();
		return currentDate;
	}
	public String getCurrentYear()
	{
		String currentDate=dataobj.toString();
		String[] arr=currentDate.split(" ");
		return arr[5];
	}
	public String getMonth()
	{
		String currentDate=dataobj.toString();
		String[] arr=currentDate.split(" ");
		return arr[1];		
	}
	public int getMonthInt()
	{
		dataobj.toString();
		return dataobj.getMonth();
	}
	public String getDate()
	{
		String currentDate=dataobj.toString();
		String[] arr=currentDate.split(" ");
		return arr[2];
	}

}
