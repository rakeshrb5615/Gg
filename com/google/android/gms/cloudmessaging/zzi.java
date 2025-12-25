package com.google.android.gms.cloudmessaging;
public final synthetic class zzi implements java.lang.Runnable {
    public final synthetic com.google.android.gms.cloudmessaging.zzp zza;
    public final synthetic android.os.IBinder zzb;

    public synthetic zzi(com.google.android.gms.cloudmessaging.zzp p1, android.os.IBinder p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.google.android.gms.cloudmessaging.zzp v0 = this.zza;
        String v1_0 = this.zzb;
        try {
            if (v1_0 != null) {
                v0.zzc = new com.google.android.gms.cloudmessaging.zzq(v1_0);
                v0.zza = 2;
                v0.zzc();
                return;
            } else {
                v0.zza(0, "Null service connection");
                return;
            }
        } catch (String v1_3) {
            throw v1_3;
        }
    }
}
