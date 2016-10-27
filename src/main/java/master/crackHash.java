package master;

import java.security.NoSuchAlgorithmException;

/**
 * Created by Fernando on 27/10/2016.
 */
public class crackHash {


    /**
     * Crack numeric hash
     * @param length Length of each string. Ex.: 4 returns from "0000" to "9999"
     * @param hashType Hash types: MD5, SHA1, SHA256, SHA384, SHA512
     * @param hashToCrack Hash to crack
     * @throws NoSuchAlgorithmException
     */
    public boolean crackHashNumeric(int length, String hashType, String hashToCrack) throws NoSuchAlgorithmException{
        String[] ret = new stringGeneratorNumeric().genFixNumString(length, hashType, hashToCrack);
        System.out.println("\nHash to crack:\"" + hashToCrack + "\"");
        if (ret[1].equals("true")){
            System.out.println("Passphrase FOUND:\"" + ret[0] + "\"\n\n");
            return true;
        }else{
            System.out.println("Passphrase NOT FOUND !!!\n\n");
            return false;
        }
    }

    /**
     * Crack numeric hash. Ex.: minLength=2 maxLength=3 covers from "00" to "99" and from "000" to "999"
     * @param minLength Min length of each string
     * @param maxLength Max length of each string
     * @param hashType Hash types: MD5, SHA1, SHA256, SHA384, SHA512
     * @param hashToCrack Hash to crack
     * @throws NoSuchAlgorithmException
     */
    public boolean crackHashNumeric(int minLength, int maxLength, String hashType, String hashToCrack) throws NoSuchAlgorithmException{
        String[] ret = new stringGeneratorNumeric().genNumString(minLength, maxLength, hashType, hashToCrack);
        System.out.println("\nHash to crack:\"" + hashToCrack + "\"");
        if (ret[1].equals("true")){
            System.out.println("Passphrase FOUND:\"" + ret[0] + "\"\n\n");
            return true;
        }else{
            System.out.println("Passphrase NOT FOUND !!!\n\n");
            return false;
        }
    }
}
