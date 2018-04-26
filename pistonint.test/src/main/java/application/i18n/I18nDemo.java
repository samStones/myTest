package application.i18n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class I18nDemo {
	
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println("country=" + locale.getCountry());
//		System.out.println("language=" + defaultLocale.getLanguage());
		
		NumberFormat nFormat = NumberFormat.getCurrencyInstance(locale);
		
		double amt = 123456.78;
		
		//中文本地化信息
//		System.out.println(nFormat.format(amt));
		
		//英文本地化信息
//		Locale locale2 = Locale.US;
//		NumberFormat nFormat2 = NumberFormat.getCurrencyInstance(locale2);
//		System.out.println(nFormat2.format(amt));
		
		//英文本地化信息
		Locale locale3 = new Locale("en", "US");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, locale3);
		System.out.println(dateFormat.format(new Date()));
		
	}
}
