package Welocome;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.crypto.Data;

public class CalendarDemo {
	public void LearnCalendar() {
		Calendar calendar = new GregorianCalendar();
		System.out.println("Calendar");
		System.out.println("年份：" + calendar.get(Calendar.YEAR));
		System.out.println("月份：" + calendar.get(Calendar.MONTH) + 1);
		System.out.println("日：" + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("时：" + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分：" + calendar.get(Calendar.MINUTE));
		System.out.println("秒：" + calendar.get(Calendar.SECOND));
		System.out.println("毫秒：" + calendar.get(Calendar.MILLISECOND));

		System.out.println("DateFormat");
		// dateformat
		DateFormat df1 = DateFormat.getDateInstance();
		DateFormat df2 = DateFormat.getDateTimeInstance();
		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));

		df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale("zh", "CN"));

		df2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD, DateFormat.ERA_FIELD, new Locale("ZH", "CN"));
		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));

		// simpledateformat
		String Strdate = "2017-8-1 8:13:30.345";
		String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";
		String pat2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
		Date dd = null;
		try {
			dd = sdf1.parse(Strdate);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		String d = sdf2.format(dd);
		System.out.println(dd);
		System.out.println(d);

	}
}
