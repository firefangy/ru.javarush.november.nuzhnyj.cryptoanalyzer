package src.main.java.ru.javarush.cryptoanalyzer;

public class CryptoAnalyzerKey {
    private String key;
    private int keyLength;

    CryptoAnalyzerKey(String key) {
        this.key = key;
        this.keyLength = key.length();
        System.out.println("INFO: Crypto key is set (length: " + keyLength + ")");
    }

    String getKey() {
        return key;
    }

    int getKeyLength() {
        return keyLength;
    }
}
