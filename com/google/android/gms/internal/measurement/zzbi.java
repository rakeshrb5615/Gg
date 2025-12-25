package com.google.android.gms.internal.measurement;
public final class zzbi extends com.google.android.gms.internal.measurement.zzav {

    public zzbi()
    {
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(String p3, com.google.android.gms.internal.measurement.zzg p4, java.util.List p5)
    {
        if ((p3 == null) || ((p3.isEmpty()) || (!p4.zzd(p3)))) {
            throw new IllegalArgumentException(g2.g.l("Command not found: ", p3));
        } else {
            String v0_0 = p4.zzh(p3);
            if (!(v0_0 instanceof com.google.android.gms.internal.measurement.zzai)) {
                throw new IllegalArgumentException(v1.a.l("Function ", p3, " is not defined"));
            } else {
                return ((com.google.android.gms.internal.measurement.zzai) v0_0).zza(p4, p5);
            }
        }
    }
}
