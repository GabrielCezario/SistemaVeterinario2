package api;

public class StringUtils {
	
	public static boolean veriyStringIsInvalid(String string) {
		
		if(string.trim().isEmpty() || string.trim() == null) {
			return true;
		} else {
			return false;
		}
		
	}

}
