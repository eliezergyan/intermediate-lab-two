package designpatterns.template;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;

public class AESEncryption extends DataEncryptionTemplate{
    @Override
    protected Key generateKey(){
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            return keyGen.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected byte[] encrypt(String data, Key key){
        try{
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return cipher.doFinal(data.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected String decrypt(byte[] encryptedData, Key key){
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryptedData = cipher.doFinal(encryptedData);
            return new String(decryptedData);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
