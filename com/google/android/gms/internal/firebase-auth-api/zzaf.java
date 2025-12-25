package com.google.android.gms.internal.firebase-auth-api;
 class zzaf extends com.google.android.gms.internal.firebase-auth-api.zzai {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzaf(int p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzae.zza(4, "initialCapacity");
        int v2_1 = new Object[4];
        this.zza = v2_1;
        this.zzb = 0;
        return;
    }

    public com.google.android.gms.internal.firebase-auth-api.zzaf zza(Object p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p4);
        Object[] v0_0 = this.zza;
        int v1_2 = com.google.android.gms.internal.firebase-auth-api.zzai.zza(v0_0.length, (this.zzb + 1));
        if ((v1_2 > v0_0.length) || (this.zzc)) {
            this.zza = java.util.Arrays.copyOf(this.zza, v1_2);
            this.zzc = 0;
        }
        Object[] v0_4 = this.zza;
        int v1_0 = this.zzb;
        this.zzb = (v1_0 + 1);
        v0_4[v1_0] = p4;
        return this;
    }
}
