package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzajm implements com.google.android.gms.internal.firebase-auth-api.zzamm {
    protected int zza;

    public zzajm()
    {
        this.zza = 0;
        return;
    }

    public int zza(com.google.android.gms.internal.firebase-auth-api.zzanb p3)
    {
        int v0 = this.zzi();
        if (v0 != -1) {
            return v0;
        } else {
            int v3_1 = p3.zza(this);
            this.zzb(v3_1);
            return v3_1;
        }
    }

    public final void zza(java.io.OutputStream p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakn v2_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(p2, com.google.android.gms.internal.firebase-auth-api.zzakn.zze(this.zzl()));
        this.zza(v2_1);
        v2_1.zzc();
        return;
    }

    public void zzb(int p1)
    {
        throw new UnsupportedOperationException();
    }

    public int zzi()
    {
        throw new UnsupportedOperationException();
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zzj()
    {
        try {
            java.io.IOException v0_2 = com.google.android.gms.internal.firebase-auth-api.zzajv.zzc(this.zzl());
            this.zza(v0_2.zzb());
            return v0_2.zza();
        } catch (java.io.IOException v0_1) {
            throw new RuntimeException(v1.a.l("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen)."), v0_1);
        }
    }

    public final byte[] zzk()
    {
        try {
            java.io.IOException v0_1 = new byte[this.zzl()];
            RuntimeException v1_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(v0_1);
            this.zza(v1_1);
            v1_1.zzb();
            return v0_1;
        } catch (java.io.IOException v0_2) {
            throw new RuntimeException(v1.a.l("Serializing ", this.getClass().getName(), " to a byte array threw an IOException (should never happen)."), v0_2);
        }
    }
}
