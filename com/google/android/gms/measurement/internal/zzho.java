package com.google.android.gms.measurement.internal;
final class zzho implements com.google.android.gms.internal.measurement.zzo {
    final synthetic String zza;
    final synthetic com.google.android.gms.measurement.internal.zzht zzb;

    public zzho(com.google.android.gms.measurement.internal.zzht p1, String p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final String zza(String p3)
    {
        java.util.Map v0_3 = ((java.util.Map) this.zzb.zzD().get(this.zza));
        if ((v0_3 != null) && (v0_3.containsKey(p3))) {
            return ((String) v0_3.get(p3));
        } else {
            return 0;
        }
    }
}
