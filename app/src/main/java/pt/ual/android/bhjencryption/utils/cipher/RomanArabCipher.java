package pt.ual.android.bhjencryption.utils.cipher;

public class RomanArabCipher extends Cipher {
    public RomanArabCipher(String message) {
        super(message);
    }

    @Override
    public CipherValidationResult validateEncrypt() {
        return null;
    }

    @Override
    public CipherValidationResult validateDecrypt() {
        return null;
    }

    @Override
    public CipherResult encrypt() {
        return new CipherResult(CipherUtils.romaArabEncode(getMessage()));
    }

    @Override
    public CipherResult decrypt() {
        return new CipherResult(CipherUtils.romaArabDecode(getMessage()));
    }
}
