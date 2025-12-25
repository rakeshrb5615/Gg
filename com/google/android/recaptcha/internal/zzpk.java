package com.google.android.recaptcha.internal;
public final class zzpk extends java.lang.RuntimeException {

    public zzpk(com.google.android.recaptcha.internal.zzoi p1)
    {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        return;
    }

    public final com.google.android.recaptcha.internal.zznn zza()
    {
        return new com.google.android.recaptcha.internal.zznn(this.getMessage());
    }
}
