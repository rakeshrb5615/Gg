package com.google.android.gms.internal.auth;
public final class zzgx extends java.lang.RuntimeException {

    public zzgx(com.google.android.gms.internal.auth.zzfw p1)
    {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        return;
    }

    public final com.google.android.gms.internal.auth.zzfa zza()
    {
        return new com.google.android.gms.internal.auth.zzfa(this.getMessage());
    }
}
