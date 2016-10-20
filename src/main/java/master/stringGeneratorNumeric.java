package master;


/**
 * Created by Fernando on 20/10/2016.
 */
public class stringGeneratorNumeric {

    /**
     * Generate numeric strings
     * @param length Length of each string
     */
    public void genFixNumString(int length){
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
     */
    public void genNumString(int minLength, int maxLength){
        for (int i = minLength; i <= maxLength; i++) {
            genFixNumString(i);
        }
    }

}
