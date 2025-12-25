package com.google.android.gms.fido.u2f;
public interface U2fPendingIntent {

    public abstract boolean hasPendingIntent();

    public abstract void launchPendingIntent();
}
