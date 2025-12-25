package com.google.android.gms.internal.fido;
final class zzcn {
    static final String zza;
    static final java.util.Comparator zzb;

    static zzcn()
    {
        com.google.android.gms.internal.fido.zzcm v0_5 = com.google.android.gms.internal.fido.zzcn.getName().concat("$UnsafeComparator");
        com.google.android.gms.internal.fido.zzcn.zza = v0_5;
        try {
            com.google.android.gms.internal.fido.zzcm v0_1 = Class.forName(v0_5).getEnumConstants();
            v0_1.getClass();
            com.google.android.gms.internal.fido.zzcm v0_3 = ((java.util.Comparator) v0_1[0]);
        } catch (Throwable) {
            v0_3 = com.google.android.gms.internal.fido.zzcm.zza;
        }
        com.google.android.gms.internal.fido.zzcn.zzb = v0_3;
        return;
    }

    public zzcn()
    {
        return;
    }
}
