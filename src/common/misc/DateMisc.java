package common.misc;

import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Calendar;

public class DateMisc {

	private static Calendar today = Calendar.getInstance();

	/*
 	 * String dateFormat 형태로 Timestamp ts 를 변환해 준다<br>
	 *<br>
 	 * 예 ) dateFormat 형태 : "yyyy-MM-dd"<br>
 	 * <br>
 	 * Field				Full Form				Short Form<br>
	 *------------------------------------------------------------------<br>
 	 * Year				yyyy( 4 digits )			yy ( 2 digits )<br>
 	 * Month			MMM( name )			MM ( 2 digits ), M ( 1 or 2 digits )<br>
 	 * Day of week	EEEE					EE<br>
 	 * Day of month	dd ( 2 digits )			d ( 1 or 2 digits )<br>
 	 * Hour( 1-12 )		hh ( 2 digits )			h ( 1 or 2 digits )<br>
 	 * Hour( 0-23 )		HH ( 2 digits )			H ( 1 or 2 digits )<br>
 	 * Hour( 0-11 )		KK						K<br>
 	 * Hour( 1-24 )		kk							k<br>
 	 * Minute			mm<br>
 	 * Second			ss<br>
 	 * Millisecond		SSS<br>
 	 * AM/PM			a<br>
 	 * Timezone		zzzz	zz<br>
	 *<br>
	 * Day of week in month		F ( e.g., 3rd Thursday )			D ( 1, 2, or 3 digits )<br>
 	 * Day in year						DDD ( 3 digits )						D ( 1, 2, or 3 digits )<br>
 	 * Week in year					ww<br>
 	 * Era ( e.g., BC/AC )			G<br>
	 *<br>
	 *
	 * @param ts java.sql.Timestamp
	 * @param dateFormat java.lang.String
	 * @return java.lang.String
	 * @exception 
	 * @author <a href="mailto:dlejrtn@unitel.co.kr">Ducksoo Lee</a>
	 * @version 1.0
	 */
	public static String getDate( Timestamp ts, String dateFormat ) {

		if ( ts == null )
			return null;

		SimpleDateFormat sdf = new SimpleDateFormat( dateFormat );

		return sdf.format( new Date( ts.getTime() ) );

	} // end method

} //end class