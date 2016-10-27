package master;


import java.security.NoSuchAlgorithmException;

/**
 * Created by Fernando on 20/10/2016.
 */
public class stringGeneratorNumeric {

    private String[] ret = new String[2];

    /**
     * Generate numeric strings
     * @param length Length of each string
     * @deprecated
     */
    public void genFixNumString(int length) {
        String out;
        String str = new commonMethods().getMaxValue(length);

        int maxValue = Integer.parseInt(str);

        for (int i = 0; i <= maxValue; i++){
            out = i + "";
            out = new commonMethods().fillLeftZeros(out, length);
            System.out.println(out);
        }
    }

    /**
     * Generate numeric strings from minLength to maxLength
     * @param minLength Min length of each string
     * @param maxLength Max length of each string
     * @deprecated
     */
    public void genNumString(int minLength, int maxLength){
        for (int i = minLength; i <= maxLength; i++) {
            genFixNumString(i);
        }
    }

    /**
     * Generate numeric strings
     * @param length Length of each string
     * @param hashType Hash types: MD5, SHA1, SHA256, SHA384, SHA512
     * @param hashToCrack
     * @throws NoSuchAlgorithmException
     */
    public String[] genFixNumString(int length, String hashType, String hashToCrack) throws NoSuchAlgorithmException {
        ret[0] = "";
        ret[1] = "false";

        String out;
        String str = new commonMethods().getMaxValue(length);

        int maxValue = Integer.parseInt(str);

        for (int i = 0; i <= maxValue; i++){
            out = i + "";
            out = new commonMethods().fillLeftZeros(out, length);
            String testHash = new hashesSwitch().hashSwitch(out, hashType);
            System.out.println("Checking:\"" + out + "\"" + " Hash:\"" + testHash + "\"");
            if(testHash.equals(hashToCrack)){
                ret[0] = out;
                ret[1] = "true";
                break;
            }
        }
        return ret;
    }

    /**
     * Generate numeric strings from minLength to maxLength
     * @param minLength Min length of each string
     * @param maxLength Max length of each string
     */
    public String[] genNumString(int minLength, int maxLength, String hashType, String hashToCrack) throws NoSuchAlgorithmException {
        ret[0] = "";
        ret[1] = "false";
        for (int i = minLength; i <= maxLength; i++) {
            genFixNumString(i, hashType, hashToCrack);
        }
        return ret;
    }

}
