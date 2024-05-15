package designpatterns.template;

import java.security.Key;

public abstract class DataEncryptionTemplate {
    public final void processData(String data){
        Key key = generateKey();

        byte[] encryptedData = encrypt(data, key);

        String decryptedData = decrypt(encryptedData, key);

        displayResults(data, encryptedData, decryptedData);
    }

    protected abstract Key generateKey();

    protected abstract byte[] encrypt(String data, Key key);

    protected abstract String decrypt(byte[] encryptedData, Key key);

    protected void displayResults(String originalData, byte[] encryptedData, String decryptedData){
        System.out.println("Original Data: " + originalData);
        System.out.println("Encrypted Data: " + new String(encryptedData));
        System.out.println("Original Data: " + originalData);
    }
}
