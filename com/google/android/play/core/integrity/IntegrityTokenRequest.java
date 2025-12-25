package com.google.android.play.core.integrity;
public abstract class IntegrityTokenRequest {

    public IntegrityTokenRequest()
    {
        return;
    }

    public static com.google.android.play.core.integrity.IntegrityTokenRequest$Builder builder()
    {
        return new com.google.android.play.core.integrity.am();
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
