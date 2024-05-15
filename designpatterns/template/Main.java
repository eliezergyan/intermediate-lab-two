package designpatterns.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("Using AES encryption:");
        DataEncryptionTemplate aesEncryption = new AESEncryption();
        aesEncryption.processData("Hello, World!");

        System.out.println("\nUsing DES encryption:");
        DataEncryptionTemplate desEncryption = new DESEncryption();
        desEncryption.processData("Hello, World!");
    }
}
