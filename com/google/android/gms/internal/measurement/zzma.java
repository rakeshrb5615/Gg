package com.google.android.gms.internal.measurement;
final class zzma implements com.google.android.gms.internal.measurement.zznk {
    private static final com.google.android.gms.internal.measurement.zzma zza;

    static zzma()
    {
        com.google.android.gms.internal.measurement.zzma.zza = new com.google.android.gms.internal.measurement.zzma();
        return;
    }

    private zzma()
    {
        return;
    }

    public static com.google.android.gms.internal.measurement.zzma zza()
    {
        return com.google.android.gms.internal.measurement.zzma.zza;
    }

    public final boolean zzb(Class p2)
    {
        return com.google.android.gms.internal.measurement.zzmf.isAssignableFrom(p2);
    }

    public final com.google.android.gms.internal.measurement.zznj zzc(Class p4)
    {
        if (!com.google.android.gms.internal.measurement.zzmf.isAssignableFrom(p4)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(p4.getName()));
        } else {
            try {
                return ((com.google.android.gms.internal.measurement.zznj) com.google.android.gms.internal.measurement.zzmf.zzco(p4.asSubclass(com.google.android.gms.internal.measurement.zzmf)).zzl(3, 0, 0));
            } catch (Exception v0_6) {
                throw new RuntimeException("Unable to get message info for ".concat(p4.getName()), v0_6);
            }
        }
    }
}
