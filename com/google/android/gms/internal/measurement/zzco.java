package com.google.android.gms.internal.measurement;
public final class zzco extends com.google.android.gms.internal.measurement.zzct {
    private final java.util.concurrent.atomic.AtomicReference zza;
    private boolean zzb;

    public zzco()
    {
        this.zza = new java.util.concurrent.atomic.AtomicReference();
        return;
    }

    public static final Object zzf(android.os.Bundle p3, Class p4)
    {
        if (p3 != null) {
            String v3_4 = p3.get("r");
            if (v3_4 != null) {
                try {
                    String v3_5 = p4.cast(v3_4);
                    return v3_5;
                } catch (ClassCastException v0_1) {
                    android.util.Log.w("AM", g2.g.f("Unexpected object type. Expected, Received: ", p4.getCanonicalName(), ", ", v3_5.getClass().getCanonicalName()), v0_1);
                    throw v0_1;
                }
            }
        }
        return 0;
    }

    public final void zzb(android.os.Bundle p3)
    {
        this.zza.set(p3);
        this.zzb = 1;
        this.zza.notify();
        return;
    }

    public final String zzc(long p1)
    {
        return ((String) com.google.android.gms.internal.measurement.zzco.zzf(this.zze(p1), String));
    }

    public final Long zzd(long p1)
    {
        return ((Long) com.google.android.gms.internal.measurement.zzco.zzf(this.zze(p1), Long));
    }

    public final android.os.Bundle zze(long p3)
    {
        try {
            if (!this.zzb) {
                this.zza.wait(p3);
            }
        } catch (int v3_1) {
            throw v3_1;
        }
        return ((android.os.Bundle) this.zza.get());
    }
}
