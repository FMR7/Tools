package master;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Fernando on 19/10/2016.
 */
public class hashes {

    /**
     * Hash a string into MD5
     * @param input String to hash
     * @return MD5 hashed string
     * @throws NoSuchAlgorithmException
     */
    public String getMD5(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(input.getBytes(), 0, input.length());
        String output = new BigInteger(1, md.digest()).toString(16);
        return new commonMethods().fillLeftZeros(output, 32);
    }

    /**
     * Hash a string into SHA-1
     * @param input String to hash
     * @return SHA-1 hashed string
     * @throws NoSuchAlgorithmException
     */
    public String getSHA1(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(input.getBytes(), 0, input.length());
        String output = new BigInteger(1, md.digest()).toString(16);
        return new commonMethods().fillLeftZeros(output, 40);
    }

    /**
     * Hash a string into SHA-256
     * @param input String to hash
     * @return SHA-256 hashed string
     * @throws NoSuchAlgorithmException
     */
    public String getSHA256(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(input.getBytes(), 0, input.length());
        String output = new BigInteger(1, md.digest()).toString(16);
        return new commonMethods().fillLeftZeros(output, 64);
    }

    /**
     * Hash a string into SHA-384
     * @param input String to hash
     * @return SHA-384 hashed string
     * @throws NoSuchAlgorithmException
     */
    public String getSHA384(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-384");
        md.update(input.getBytes(), 0, input.length());
        String output = new BigInteger(1, md.digest()).toString(16);
        return new commonMethods().fillLeftZeros(output, 96);
    }

    /**
     * Hash a string into SHA-512
     * @param input String to hash
     * @return SHA-512 hashed string
     * @throws NoSuchAlgorithmException
     */
    public String getSHA512(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(input.getBytes(), 0, input.length());
        String output = new BigInteger(1, md.digest()).toString(16);
        return new commonMethods().fillLeftZeros(output, 128);
    }

}
