package util;

import java.text.SimpleDateFormat;
import java.util.Date;



public class DateUtil {

	//現在時刻取得メソッド

	public String getDate(){
		Date date = new Date();
		SimpleDateFormat simpleDateFomat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


		return simpleDateFomat.format(date);

	}

}
