package com.google.android.gms.internal.fido;
public final class zzdk extends com.google.android.gms.internal.fido.zzdr {
    private final com.google.android.gms.internal.fido.zzcz zza;

    public zzdk(com.google.android.gms.internal.fido.zzcz p1)
    {
        this.zza = p1;
        return;
    }

    public final bridge synthetic int compareTo(Object p5)
    {
        if (com.google.android.gms.internal.fido.zzdr.zzd(64) == ((com.google.android.gms.internal.fido.zzdr) p5).zza()) {
            byte[] v0_5 = this.zza;
            com.google.android.gms.internal.fido.zzcz v2_0 = ((com.google.android.gms.internal.fido.zzdk) ((com.google.android.gms.internal.fido.zzdr) p5)).zza;
            if (v0_5.zzd() == v2_0.zzd()) {
                return com.google.android.gms.internal.fido.zzco.zza().compare(v0_5.zzm(), ((com.google.android.gms.internal.fido.zzdk) ((com.google.android.gms.internal.fido.zzdr) p5)).zza.zzm());
            } else {
                return (v0_5.zzd() - v2_0.zzd());
            }
        } else {
            return (com.google.android.gms.internal.fido.zzdr.zzd(64) - ((com.google.android.gms.internal.fido.zzdr) p5).zza());
        }
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if (p4) {
                if (com.google.android.gms.internal.fido.zzdk == p4.getClass()) {
                    return this.zza.equals(((com.google.android.gms.internal.fido.zzdk) p4).zza);
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return java.util.Arrays.hashCode(new Object[] {Integer.valueOf(com.google.android.gms.internal.fido.zzdr.zzd(64)), this.zza}));
    }

    public final String toString()
    {
        String v0_3 = com.google.android.gms.internal.fido.zzch.zzf().zzd();
        String v1_2 = this.zza.zzm();
        return v1.a.l("h\'", v0_3.zzg(v1_2, 0, v1_2.length), "\'");
    }

    public final int zza()
    {
        return com.google.android.gms.internal.fido.zzdr.zzd(64);
    }

    public final com.google.android.gms.internal.fido.zzcz zzc()
    {
        return this.zza;
    }
}
