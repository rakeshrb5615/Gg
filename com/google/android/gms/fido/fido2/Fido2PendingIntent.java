package com.google.android.gms.fido.fido2;
public interface Fido2PendingIntent {

    public abstract boolean hasPendingIntent();

    public abstract void launchPendingIntent();
}
