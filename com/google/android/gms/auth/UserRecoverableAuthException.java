package com.google.android.gms.auth;
public class UserRecoverableAuthException extends com.google.android.gms.auth.GoogleAuthException {
    private final android.content.Intent zza;

    public UserRecoverableAuthException(String p1, android.content.Intent p2)
    {
        super(p1);
        super.zza = p2;
        return;
    }

    public android.content.Intent getIntent()
    {
        int v0_0 = this.zza;
        if (v0_0 != 0) {
            return new android.content.Intent(v0_0);
        } else {
            return 0;
        }
    }
}
