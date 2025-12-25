package com.google.android.gms.internal.firebase-auth-api;
public final class zzao {
    com.google.android.gms.internal.firebase-auth-api.zzan zza;
    private Object[] zzb;
    private int zzc;

    public zzao()
    {
        this(4);
        return;
    }

    public zzao(int p1)
    {
        int v1_2 = new Object[(p1 * 2)];
        this.zzb = v1_2;
        this.zzc = 0;
        return;
    }

    private final void zza(int p3)
    {
        Object[] v3_1 = (p3 << 1);
        Object[] v0 = this.zzb;
        if (v3_1 > v0.length) {
            this.zzb = java.util.Arrays.copyOf(v0, com.google.android.gms.internal.firebase-auth-api.zzai.zza(v0.length, v3_1));
        }
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzal zza()
    {
        IllegalArgumentException v0_0 = this.zza;
        if (v0_0 != null) {
            throw v0_0.zza();
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzas vtmp1 = com.google.android.gms.internal.firebase-auth-api.zzas.zza(this.zzc, this.zzb, this);
            com.google.android.gms.internal.firebase-auth-api.zzan v1_1 = this.zza;
            if (v1_1 != null) {
                throw v1_1.zza();
            } else {
                return vtmp1;
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzao zza(Iterable p6)
    {
        if ((p6 instanceof java.util.Collection)) {
            this.zza((((java.util.Collection) p6).size() + this.zzc));
        }
        java.util.Iterator v6_1 = p6.iterator();
        while (v6_1.hasNext()) {
            Object v0_3 = ((java.util.Map$Entry) v6_1.next());
            int v1_0 = v0_3.getKey();
            Object v0_5 = v0_3.getValue();
            this.zza((this.zzc + 1));
            com.google.android.gms.internal.firebase-auth-api.zzae.zza(v1_0, v0_5);
            Object[] v2_2 = this.zzb;
            int v3_0 = this.zzc;
            v2_2[(v3_0 * 2)] = v1_0;
            v2_2[((v3_0 * 2) + 1)] = v0_5;
            this.zzc = (v3_0 + 1);
        }
        return this;
    }
}
