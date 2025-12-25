package com.google.android.gms.internal.auth;
final class zzdl implements com.google.android.gms.internal.auth.zzdj {
    volatile com.google.android.gms.internal.auth.zzdj zza;
    volatile boolean zzb;
    Object zzc;

    public zzdl(com.google.android.gms.internal.auth.zzdj p1)
    {
        p1.getClass();
        this.zza = p1;
        return;
    }

    public final String toString()
    {
        String v0_0 = this.zza;
        StringBuilder v1_1 = new StringBuilder("Suppliers.memoize(");
        if (v0_0 == null) {
            String v0_4 = new StringBuilder("<supplier that returned ");
            v0_4.append(this.zzc);
            v0_4.append(">");
            v0_0 = v0_4.toString();
        }
        v1_1.append(v0_0);
        v1_1.append(")");
        return v1_1.toString();
    }

    public final Object zza()
    {
        if (!this.zzb) {
            if (this.zzb) {
            } else {
                Object v0_4 = this.zza;
                v0_4.getClass();
                Object v0_5 = v0_4.zza();
                this.zzc = v0_5;
                this.zzb = 1;
                this.zza = 0;
                return v0_5;
            }
        }
        return this.zzc;
    }
}
