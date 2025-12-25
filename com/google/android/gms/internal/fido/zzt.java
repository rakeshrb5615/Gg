package com.google.android.gms.internal.fido;
public final class zzt implements com.google.android.gms.fido.u2f.U2fPendingIntent {
    private final android.app.PendingIntent zza;

    public zzt(android.app.PendingIntent p1)
    {
        this.zza = p1;
        return;
    }

    public final boolean hasPendingIntent()
    {
        if (this.zza == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void launchPendingIntent(android.app.Activity p9, int p10)
    {
        android.app.PendingIntent v0 = this.zza;
        if (v0 == null) {
            throw new IllegalStateException("No PendingIntent available");
        } else {
            p9.startIntentSenderForResult(v0.getIntentSender(), p10, 0, 0, 0, 0);
            return;
        }
    }
}
