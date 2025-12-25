package com.google.android.gms.internal.common;
public final class zzw {
    private final com.google.android.gms.internal.common.zzp zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.common.zzu zzc;

    private zzw(com.google.android.gms.internal.common.zzu p1, boolean p2, com.google.android.gms.internal.common.zzp p3, int p4)
    {
        this.zzc = p1;
        this.zzb = p2;
        this.zza = p3;
        return;
    }

    public static com.google.android.gms.internal.common.zzw zza(com.google.android.gms.internal.common.zzp p4)
    {
        return new com.google.android.gms.internal.common.zzw(new com.google.android.gms.internal.common.zzu(p4), 0, com.google.android.gms.internal.common.zzo.zza, 2147483647);
    }

    public final com.google.android.gms.internal.common.zzw zzb()
    {
        return new com.google.android.gms.internal.common.zzw(this.zzc, 1, this.zza, 2147483647);
    }

    public final Iterable zzc(CharSequence p2)
    {
        return new com.google.android.gms.internal.common.zzt(this, p2);
    }

    public final java.util.List zzd(CharSequence p3)
    {
        p3.getClass();
        java.util.List v3_2 = this.zzc.zza(this, p3);
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        while (v3_2.hasNext()) {
            v0_2.add(((String) v3_2.next()));
        }
        return java.util.Collections.unmodifiableList(v0_2);
    }

    public final synthetic java.util.Iterator zze(CharSequence p2)
    {
        return this.zzc.zza(this, p2);
    }

    public final synthetic com.google.android.gms.internal.common.zzp zzf()
    {
        return this.zza;
    }

    public final synthetic boolean zzg()
    {
        return this.zzb;
    }
}
