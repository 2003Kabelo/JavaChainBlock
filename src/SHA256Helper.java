import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Helper {

    public static String generateHash(String data){

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            StringBuilder hexDecimalString = new StringBuilder();
            for(int i = 0 ; i < hash.length ; ++i) {
                String hexDecimal = Integer.toHexString(0xff & hash[i]);
                //padding
                if(hexDecimal.length()==1) hexDecimalString.append('0');
                hexDecimalString.append(hexDecimal);

            }
            return hexDecimalString.toString();

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
