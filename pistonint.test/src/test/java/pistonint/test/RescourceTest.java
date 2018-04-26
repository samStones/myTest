package pistonint.test;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@SpringBootTest
//@RunWith(SpringRunner.class)

public class RescourceTest {

//	 @Test
//	 public void bDTest() {
//	 ResourceBundle rb = ResourceBundle.getBundle("i18n/test", Locale.CHINA);
//	
//	 System.out.println(rb.getString("common"));
//	 }

	public static void main(String[] args) {
//		ResourceBundle rb = ResourceBundle.getBundle("i18n/test", Locale.CHINA);
		ResourceBundle rb = ResourceBundle.getBundle("i18n/test", Locale.US);
		ResourceBundle rb2 = ResourceBundle.getBundle("i18n/test", Locale.ENGLISH);

		System.out.println(rb.getString("common"));
		System.out.println(rb2.getString("common"));
	}

}
