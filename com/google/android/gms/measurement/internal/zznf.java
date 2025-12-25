package com.google.android.gms.measurement.internal;
public final class zznf implements android.content.ServiceConnection, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener {
    final synthetic com.google.android.gms.measurement.internal.zznl zza;
    private volatile boolean zzb;
    private volatile com.google.android.gms.measurement.internal.zzgo zzc;

    public zznf(com.google.android.gms.measurement.internal.zznl p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void onConnected(android.os.Bundle p3)
    {
        this.zza.zzu.zzaW().zzd();
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
            this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzna(this, ((com.google.android.gms.measurement.internal.zzgb) this.zzc.getService())));
        } catch (int v3_5) {
            throw v3_5;
        }
        return;
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult p3)
    {
        com.google.android.gms.measurement.internal.zzhz v0_0 = this.zza;
        v0_0.zzu.zzaW().zzd();
        com.google.android.gms.measurement.internal.zzhz v0_8 = v0_0.zzu.zzf();
        if (v0_8 != null) {
            v0_8.zzk().zzb("Service connection failed", p3);
        }
        this.zzb = 0;
        this.zzc = 0;
        this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzne(this, p3));
        return;
    }

    public final void onConnectionSuspended(int p3)
    {
        com.google.android.gms.measurement.internal.zzhz v3_1 = this.zza.zzu;
        v3_1.zzaW().zzd();
        v3_1.zzaV().zzj().zza("Service connection suspended");
        v3_1.zzaW().zzj(new com.google.android.gms.measurement.internal.zznb(this));
        return;
    }

    public final void onServiceConnected(android.content.ComponentName p4, android.os.IBinder p5)
    {
        this.zza.zzu.zzaW().zzd();
        try {
            if (p5 != null) {
                android.content.Context v0_0 = 0;
                String v1_6 = p5.getInterfaceDescriptor();
                if (!"com.google.android.gms.measurement.internal.IMeasurementService".equals(v1_6)) {
                    this.zza.zzu.zzaV().zzb().zzb("Got binder with a wrong descriptor", v1_6);
                    if (v0_0 != null) {
                        this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzmy(this, v0_0));
                    } else {
                        this.zzb = 0;
                        com.google.android.gms.measurement.internal.zzgs v5_15 = this.zza;
                        com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(v5_15.zzu.zzaY(), v5_15.zzY());
                    }
                    return;
                } else {
                    String v1_3;
                    String v1_1 = p5.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (!(v1_1 instanceof com.google.android.gms.measurement.internal.zzgb)) {
                        v1_3 = new com.google.android.gms.measurement.internal.zzfz(p5);
                    } else {
                        v1_3 = ((com.google.android.gms.measurement.internal.zzgb) v1_1);
                    }
                    v0_0 = v1_3;
                    this.zza.zzu.zzaV().zzk().zza("Bound to IMeasurementService interface");
                }
            } else {
                this.zzb = 0;
                this.zza.zzu.zzaV().zzb().zza("Service connected with null binder");
                return;
            }
        } catch (com.google.android.gms.common.stats.ConnectionTracker v4_12) {
            throw v4_12;
        }
    }

    public final void onServiceDisconnected(android.content.ComponentName p4)
    {
        com.google.android.gms.measurement.internal.zzhz v0_1 = this.zza.zzu;
        v0_1.zzaW().zzd();
        v0_1.zzaV().zzj().zza("Service disconnected");
        v0_1.zzaW().zzj(new com.google.android.gms.measurement.internal.zzmz(this, p4));
        return;
    }

    public final void zza(android.content.Intent p6)
    {
        String v0_0 = this.zza;
        v0_0.zzg();
        String v0_3 = v0_0.zzu.zzaY();
        com.google.android.gms.common.stats.ConnectionTracker v1 = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        if (!this.zzb) {
            com.google.android.gms.measurement.internal.zznf v2_2 = this.zza;
            v2_2.zzu.zzaV().zzk().zza("Using local app measurement service");
            this.zzb = 1;
            v1.bindService(v0_3, p6, v2_2.zzY(), 129);
            return;
        } else {
            this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
            return;
        }
    }

    public final void zzb()
    {
        if ((this.zzc != null) && ((this.zzc.isConnected()) || (this.zzc.isConnecting()))) {
            this.zzc.disconnect();
        }
        this.zzc = 0;
        return;
    }

    public final void zzc()
    {
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zza;
        v0_0.zzg();
        com.google.android.gms.measurement.internal.zzgs v0_11 = v0_0.zzu.zzaY();
        if (!this.zzb) {
            if ((this.zzc == null) || ((!this.zzc.isConnecting()) && (!this.zzc.isConnected()))) {
                this.zzc = new com.google.android.gms.measurement.internal.zzgo(v0_11, android.os.Looper.getMainLooper(), this, this);
                this.zza.zzu.zzaV().zzk().zza("Connecting to remote service");
                this.zzb = 1;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
                return;
            } else {
                this.zza.zzu.zzaV().zzk().zza("Already awaiting connection attempt");
                return;
            }
        } else {
            this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
            return;
        }
    }

    public final synthetic void zzd(boolean p1)
    {
        this.zzb = 0;
        return;
    }
}
