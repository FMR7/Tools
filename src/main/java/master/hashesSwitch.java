package master;

import java.security.NoSuchAlgorithmException;

/**
 * Created by Fernando on 20/10/2016.
 */
public class hashesSwitch {

    /**
     *
     * @param passphrase String to hash
     * @param hashType Hash types: MD5, SHA1, SHA256, SHA384, SHA512
     * @return Hash string
     * @throws NoSuchAlgorithmException
     */
    public String hashSwitch(String passphrase, String hashType) throws NoSuchAlgorithmException {
        String out = "";

        switch (hashType){
            case "MD5":
                out = new hashes().getMD5(passphrase);
                break;
            case "SHA1":
                out = new hashes().getSHA1(passphrase);
                break;
            case "SHA256":
                out = new hashes().getSHA256(passphrase);
                break;
            case "SHA384":
                out = new hashes().getSHA384(passphrase);
                break;
            case "SHA512":
                out = new hashes().getSHA512(passphrase);
                break;
            default:
                break;
        }

        return out;
    }
}
