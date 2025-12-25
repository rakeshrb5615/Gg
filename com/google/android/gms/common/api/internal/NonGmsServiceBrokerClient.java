package com.google.android.gms.common.api.internal;
public final class NonGmsServiceBrokerClient implements com.google.android.gms.common.api.Api$Client, android.content.ServiceConnection {
    private static final String zaa = "NonGmsServiceBrokerClient";
    private final String zab;
    private final String zac;
    private final android.content.ComponentName zad;
    private final android.content.Context zae;
    private final com.google.android.gms.common.api.internal.ConnectionCallbacks zaf;
    private final android.os.Handler zag;
    private final com.google.android.gms.common.api.internal.OnConnectionFailedListener zah;
    private android.os.IBinder zai;
    private boolean zaj;
    private String zak;
    private String zal;

    public NonGmsServiceBrokerClient(android.content.Context p9, android.os.Looper p10, android.content.ComponentName p11, com.google.android.gms.common.api.internal.ConnectionCallbacks p12, com.google.android.gms.common.api.internal.OnConnectionFailedListener p13)
    {
        this(p9, p10, 0, 0, p11, p12, p13);
        return;
    }

    private NonGmsServiceBrokerClient(android.content.Context p2, android.os.Looper p3, String p4, String p5, android.content.ComponentName p6, com.google.android.gms.common.api.internal.ConnectionCallbacks p7, com.google.android.gms.common.api.internal.OnConnectionFailedListener p8)
    {
        this.zaj = 0;
        this.zak = 0;
        this.zae = p2;
        this.zag = new com.google.android.gms.internal.base.zau(p3);
        this.zaf = p7;
        this.zah = p8;
        if ((p4 == null) || (p5 == null)) {
            if (p6 == 0) {
                throw new AssertionError("Must specify either package or component, but not both");
            }
        } else {
            if (p6 != 0) {
            } else {
                p6 = 0;
            }
        }
        this.zab = p4;
        this.zac = p5;
        this.zad = p6;
        return;
    }

    public NonGmsServiceBrokerClient(android.content.Context p9, android.os.Looper p10, String p11, String p12, com.google.android.gms.common.api.internal.ConnectionCallbacks p13, com.google.android.gms.common.api.internal.OnConnectionFailedListener p14)
    {
        this(p9, p10, p11, p12, 0, p13, p14);
        return;
    }

    private final void zad()
    {
        if (Thread.currentThread() != this.zag.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient\'s handler thread.");
        } else {
            return;
        }
    }

    public final void connect(com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks p4)
    {
        this.zad();
        String.valueOf(this.zai);
        if (this.isConnected()) {
            this.disconnect("connect() called when already connected");
        }
        com.google.android.gms.common.ConnectionResult v0_0 = new android.content.Intent();
        int v1_0 = this.zad;
        if (v1_0 == 0) {
            v0_0.setPackage(this.zab).setAction(this.zac);
        } else {
            v0_0.setComponent(v1_0);
        }
        com.google.android.gms.common.ConnectionResult v0_2 = this.zae.bindService(v0_0, this, com.google.android.gms.common.internal.GmsClientSupervisor.getDefaultBindFlags());
        this.zaj = v0_2;
        if (v0_2 == null) {
            this.zai = 0;
            this.zah.onConnectionFailed(new com.google.android.gms.common.ConnectionResult(16));
        }
        String.valueOf(this.zai);
        return;
    }

    public final void disconnect()
    {
        this.zad();
        String.valueOf(this.zai);
        try {
            this.zae.unbindService(this);
        } catch (IllegalArgumentException) {
        }
        this.zaj = 0;
        this.zai = 0;
        return;
    }

    public final void disconnect(String p1)
    {
        this.zad();
        this.zak = p1;
        this.disconnect();
        return;
    }

    public final void dump(String p1, java.io.FileDescriptor p2, java.io.PrintWriter p3, String[] p4)
    {
        return;
    }

    public final com.google.android.gms.common.Feature[] getAvailableFeatures()
    {
        com.google.android.gms.common.Feature[] v0_1 = new com.google.android.gms.common.Feature[0];
        return v0_1;
    }

    public android.os.IBinder getBinder()
    {
        this.zad();
        return this.zai;
    }

    public final String getEndpointPackageName()
    {
        String v0_0 = this.zab;
        if (v0_0 == null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad);
            return this.zad.getPackageName();
        } else {
            return v0_0;
        }
    }

    public final String getLastDisconnectMessage()
    {
        return this.zak;
    }

    public final int getMinApkVersion()
    {
        return 0;
    }

    public final void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor p1, java.util.Set p2)
    {
        return;
    }

    public final com.google.android.gms.common.Feature[] getRequiredFeatures()
    {
        com.google.android.gms.common.Feature[] v0_1 = new com.google.android.gms.common.Feature[0];
        return v0_1;
    }

    public final java.util.Set getScopesForConnectionlessNonSignIn()
    {
        return java.util.Collections.EMPTY_SET;
    }

    public final android.os.IBinder getServiceBrokerBinder()
    {
        return 0;
    }

    public final android.content.Intent getSignInIntent()
    {
        return new android.content.Intent();
    }

    public final boolean isConnected()
    {
        this.zad();
        if (this.zai == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isConnecting()
    {
        this.zad();
        return this.zaj;
    }

    public final void onServiceConnected(android.content.ComponentName p1, android.os.IBinder p2)
    {
        this.zag.post(new com.google.android.gms.common.api.internal.zacg(this, p2));
        return;
    }

    public final void onServiceDisconnected(android.content.ComponentName p2)
    {
        this.zag.post(new com.google.android.gms.common.api.internal.zacf(this));
        return;
    }

    public final void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks p1)
    {
        return;
    }

    public final boolean providesSignIn()
    {
        return 0;
    }

    public final boolean requiresAccount()
    {
        return 0;
    }

    public final boolean requiresGooglePlayServices()
    {
        return 0;
    }

    public final boolean requiresSignIn()
    {
        return 0;
    }

    public final synthetic void zaa(android.os.IBinder p2)
    {
        this.zaj = 0;
        this.zai = p2;
        String.valueOf(p2);
        this.zaf.onConnected(new android.os.Bundle());
        return;
    }

    public final synthetic void zab()
    {
        this.zaj = 0;
        this.zai = 0;
        this.zaf.onConnectionSuspended(1);
        return;
    }

    public final void zac(String p1)
    {
        this.zal = p1;
        return;
    }
}
