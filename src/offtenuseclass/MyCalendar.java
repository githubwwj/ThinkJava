package offtenuseclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyCalendar {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("请输入日期（格式为：2019-3-3）");
		Scanner scanner=new Scanner(System.in);
		String time=scanner.nextLine();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(time);

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		int maxDate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int week = calendar.get(Calendar.DATE); //几号  9

		calendar.set(Calendar.DAY_OF_MONTH, 1); // 设置4月1号 示一个月中的某天

		int dow = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		for (int i = 0; i < dow - 1; i++) {
			System.out.print("\t");
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 1; i <= maxDate; i++) {
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				if (i == week) {
					stringBuilder.append(i + "*" + "\r");
				} else {
					stringBuilder.append(i + "\r");
				}
			} else {
				if (i == week) {
					stringBuilder.append(i + "*" + "\t");
				} else {
					stringBuilder.append(i + "\t");
				}
			}
			// 日期加1
			calendar.add(Calendar.DATE, 1);
		}
		System.out.print(stringBuilder.toString());

	}

}
