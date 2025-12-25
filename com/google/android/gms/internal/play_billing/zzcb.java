package com.google.android.gms.internal.play_billing;
final class zzcb extends com.google.android.gms.internal.play_billing.zzbt {
    final synthetic com.google.android.gms.internal.play_billing.zzcc zza;

    public zzcb(com.google.android.gms.internal.play_billing.zzcc p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final bridge synthetic Object get(int p4)
    {
        java.util.AbstractMap$SimpleImmutableEntry v0_0 = this.zza;
        com.google.android.gms.internal.play_billing.zzbg.zza(p4, com.google.android.gms.internal.play_billing.zzcc.zzi(v0_0), "index");
        Object v4_3 = (p4 + p4);
        Object v1_2 = com.google.android.gms.internal.play_billing.zzcc.zzj(v0_0)[v4_3];
        java.util.Objects.requireNonNull(v1_2);
        Object v4_2 = com.google.android.gms.internal.play_billing.zzcc.zzj(v0_0)[(v4_3 + 1)];
        java.util.Objects.requireNonNull(v4_2);
        return new java.util.AbstractMap$SimpleImmutableEntry(v1_2, v4_2);
    }

    public final int size()
    {
        return com.google.android.gms.internal.play_billing.zzcc.zzi(this.zza);
    }

    public final boolean zzf()
    {
        return 1;
    }
}
