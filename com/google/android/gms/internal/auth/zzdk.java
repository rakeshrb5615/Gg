package com.google.android.gms.internal.auth;
final class zzdk implements java.io.Serializable, com.google.android.gms.internal.auth.zzdj {
    final com.google.android.gms.internal.auth.zzdj zza;
    transient volatile boolean zzb;
    transient Object zzc;

    public zzdk(com.google.android.gms.internal.auth.zzdj p1)
    {
        p1.getClass();
        this.zza = p1;
        return;
    }

    public final String toString()
    {
        String v1_1;
        String v0_2 = new StringBuilder("Suppliers.memoize(");
        if (!this.zzb) {
            v1_1 = this.zza;
        } else {
            String v1_5 = new StringBuilder("<supplier that returned ");
            v1_5.append(this.zzc);
            v1_5.append(">");
            v1_1 = v1_5.toString();
        }
        v0_2.append(v1_1);
        v0_2.append(")");
        return v0_2.toString();
    }

    public final Object zza()
    {
        if (!this.zzb) {
            if (this.zzb) {
            } else {
                Object v0_5 = this.zza.zza();
                this.zzc = v0_5;
                this.zzb = 1;
                return v0_5;
            }
        }
        return this.zzc;
    }
}
