package com.google.android.gms.common;
public class UserRecoverableException extends java.lang.Exception {
    private final android.content.Intent zza;

    public UserRecoverableException(String p1, android.content.Intent p2)
    {
        super(p1);
        super.zza = p2;
        return;
    }

    public android.content.Intent getIntent()
    {
        return new android.content.Intent(this.zza);
    }
}
