package com.google.android.gms.internal.common;
final class zzt implements java.lang.Iterable {
    final synthetic CharSequence zza;
    final synthetic com.google.android.gms.internal.common.zzw zzb;

    public zzt(com.google.android.gms.internal.common.zzw p1, CharSequence p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final java.util.Iterator iterator()
    {
        return this.zzb.zze(this.zza);
    }

    public final String toString()
    {
        AssertionError v1_2 = new StringBuilder();
        v1_2.append(91);
        java.util.Iterator v2_1 = this.iterator();
        try {
            if (v2_1.hasNext()) {
                v1_2.append(com.google.android.gms.internal.common.zzq.zza(v2_1.next(), ", "));
                while (v2_1.hasNext()) {
                    v1_2.append(", ");
                    v1_2.append(com.google.android.gms.internal.common.zzq.zza(v2_1.next(), ", "));
                }
            }
        } catch (String v0_1) {
            throw new AssertionError(v0_1);
        }
        v1_2.append(93);
        return v1_2.toString();
    }
}
