package pt.ual.android.bhjencryption.cipher;

public abstract class Cipher {
    private CipherMessage cipherMessage;

    Cipher(CipherMessage cipherMessage) {
        this.cipherMessage = cipherMessage;
    }

    public CipherMessage getCipherMessage() {
        return cipherMessage;
    }

    protected CipherValidationResult validate() {
        if(getCipherMessage().getMessageAsText() == null)
            return new CipherResult(new CipherErrorCode(CipherErrorCode.EMPTY_MESSAGE));

        if(getCipherMessage().getMessageAsText().isEmpty())
            return new CipherResult(new CipherErrorCode(CipherErrorCode.EMPTY_MESSAGE));

        return new CipherResult();
    }

    public abstract CipherValidationResult validateEncrypt();

    public abstract CipherValidationResult validateDecrypt();

    public abstract CipherResult encrypt();

    public abstract CipherResult decrypt();
}