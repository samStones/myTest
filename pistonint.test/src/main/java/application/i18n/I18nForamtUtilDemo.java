package application.i18n;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class I18nForamtUtilDemo {

	public static void main(String[] args) {
		// 格式化字符串
//		String pattern1 = "{0},你好！你与{1}支付了货款{2}元";
//		// (2)用于动态替换占位符的参数
		Object[] params = {"小磊",new GregorianCalendar().getTime(),200};
//		String format = MessageFormat.format(pattern1, params);
		
		String pattern2 = "At {1,time,short} on {1,date,long},{0} paid {2,number,currency}";
		MessageFormat messageFormat = new MessageFormat(pattern2, Locale.US);
		String format = messageFormat.format(params);
		System.out.println(format);
		
		
		

	}
}
