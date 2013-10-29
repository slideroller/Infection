package slideroller.infection.messages;

public class StringUtil {

    // DO NOT EDIT !!! (this is to Capitilize the 1st arena Letter //
    public static String getWord(String string) {
            String s = string;
            if (string != null)
            {
                    s = s.toLowerCase();
                    s = s.replaceFirst(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(0)).toUpperCase());
            }
            return s;
    }

}
