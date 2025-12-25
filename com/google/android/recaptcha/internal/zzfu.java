package com.google.android.recaptcha.internal;
public final class zzfu {
    private java.util.Set zza;
    private java.util.Set zzb;
    private Long zzc;
    private int zzd;

    public zzfu()
    {
        return;
    }

    private static final boolean zzc(String p4, java.util.Set p5)
    {
        String v1_0 = new char[1];
        v1_0[0] = 46;
        java.util.Iterator v4_2 = b8.i.E0(p4, v1_0).iterator();
        String v1_2 = "";
        while (v4_2.hasNext()) {
            String v1_1 = v1_2.concat(String.valueOf(((String) v4_2.next())));
            if (!p5.contains(v1_1)) {
                v1_2 = v1_1.concat(".");
            } else {
                return 1;
            }
        }
        return 0;
    }

    public final void zza(com.google.android.recaptcha.internal.zzrv p2)
    {
        this.zza = i7.i.n0(p2.zzf().zzi());
        this.zzb = i7.i.n0(p2.zzg().zzi());
        return;
    }

    public final boolean zzb(String p5)
    {
        java.util.Set v0 = this.zza;
        if ((v0 != null) && (this.zzb != null)) {
            if (!v0.isEmpty()) {
                boolean v1_2 = this.zzb;
                kotlin.jvm.internal.j.c(v1_2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                if (!com.google.android.recaptcha.internal.zzfu.zzc(p5, v1_2)) {
                    return com.google.android.recaptcha.internal.zzfu.zzc(p5, v0);
                } else {
                    return 0;
                }
            } else {
                return 1;
            }
        } else {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd = (this.zzd + 1);
            return 1;
        }
    }
}
