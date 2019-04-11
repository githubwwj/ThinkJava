package offtenuseclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		Date date = new Date(2000);
		System.out.println(date);

		SimpleDateFormat s1 = new SimpleDateFormat("MM月dd日   hh时mm分ss秒");
		String strDate = s1.format(date);
		System.out.println(strDate);

		// new出SimpleDateFormat对象
		SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String strDate2=s2.format(new Date());
		System.out.println(strDate2);
		
		try {
			Date date2=s2.parse("2030-04-05 18:18:18");
			System.out.println(date2.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat s3 = new SimpleDateFormat("yyyy-MM-dd");
		String time = "2007-10-7";
		Date date3 = s3.parse(time);
        System.out.println("date1: " + date3);
        
        Calendar calendar=new GregorianCalendar(); 
        calendar.setTime(date3);
        
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));  //2019	哪一年
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH)); //3	一年中的哪一月
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR)); //15 一年中的第几周
        
        System.out.println("DATE: " + calendar.get(Calendar.DATE)); //一月后中的哪一天  9
        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH)); //一月后中的哪一天 9
        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR)); //: 99 一年中的哪一天
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));  //星期几 3
        System.out.println("DAY_OF_WEEK_IN_MONTH: " 
                           + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //2 一月中的第二周
        
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM)); //上午或者下午
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR)); //7
        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY)); //19
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE)); //分钟 44
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND)); //51 秒
        System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND)); //毫秒995
        
        calendar.set(Calendar.YEAR, 1987);
        calendar.set(Calendar.MONTH, 9);
        calendar.set(Calendar.DATE, 2);
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));  //1987	哪一年
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH)); //9	一年中的哪一月
        System.out.println("DATE: " + calendar.get(Calendar.DATE)); //一月后中的哪一天 2
        
        
        

	}

}
