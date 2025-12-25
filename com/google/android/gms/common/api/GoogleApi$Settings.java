package com.google.android.gms.common.api;
public class GoogleApi$Settings {
    public static final com.google.android.gms.common.api.GoogleApi$Settings DEFAULT_SETTINGS;
    public final com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;
    public final android.os.Looper zab;

    static GoogleApi$Settings()
    {
        com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS = new com.google.android.gms.common.api.GoogleApi$Settings$Builder().build();
        return;
    }

    private GoogleApi$Settings(com.google.android.gms.common.api.internal.StatusExceptionMapper p1, android.accounts.Account p2, android.os.Looper p3)
    {
        this.zaa = p1;
        this.zab = p3;
        return;
    }

    public synthetic GoogleApi$Settings(com.google.android.gms.common.api.internal.StatusExceptionMapper p1, android.accounts.Account p2, android.os.Looper p3, com.google.android.gms.common.api.zae p4)
    {
        this(p1, 0, p3);
        return;
    }
}
