package common.misc;

import java.io.UnsupportedEncodingException;
// import board.BoardTO;

public final class StringMisc {

    public static boolean isAvailable( String source ) {

        return ( source != null && source.length() > 0 );

    } // end method

    /*
	public static boolean isAvailable(BoardTO data) {

		return ( data != null );

	}	// end method
	*/

    public static String makeField( String source ) {

        if ( ! isAvailable( source ) )
            return "''";

        return " '" + source.replaceAll( "'", "''" ) + "' ";

    } // end method

    public static String fixNull( String source ) {

        if ( isAvailable( source ) )
            return source;

        return "";

    } // end method

    public static String fixNull( String source, String replace ) {

        if ( isAvailable( source ) )
            return source;

        return replace;

    } // end method

    /*
	public static BoardTO fixNull(BoardTO data) {

		if(  isAvailable(data) )
			return data;

		return null;
	
	}	// end method
	*/

    public static String uniToEuc( String source ) {

        if ( ! isAvailable( source ) )
            return source;

        try {

            return new String( source.getBytes( "8859_1" ), "EUC-KR" );

        } catch ( UnsupportedEncodingException uee ) {

            return source;

        } // end try~catch

    } // end method

    public static String eucToUni( String source ) {

        if ( ! isAvailable( source ) )
            return source;

        try {

            return new String( source.getBytes( "EUC-KR" ), "8859_1" );

        } catch ( UnsupportedEncodingException uee ) {

            return source;

        } // end try~catch

    } // end method

} // end class