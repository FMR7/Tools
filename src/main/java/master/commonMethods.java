package master;

/**
 * Created by Fernando on 20/10/2016.
 */
public class commonMethods {

    /**
     * Returns a string with the max value for a given number. Ex.: 4 returns from "0000" to "9999"
     * @param length Desired string length
     * @return The string
     */
    public String getMaxValue(int length){
        String out = "";
        for (int i = 0; i < length; i++){
            out = out + "9";
        }
        return out;
    }

    /**
     * Fill a string with zeros by the left. Ex.: "123" and 5 returns "00123"
     * @param input String to fill
     * @param length String max length
     * @return The filled string
     */
    public String fillLeftZeros(String input, int length){
        String s = input;
        while(true) {
            if (s.length() < length) {
                s = "0" + s;
            }else {
                break;
            }
        }
        return s;
    }
}
