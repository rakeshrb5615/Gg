package com.google.android.gms.internal.fido;
public final class zzdp extends com.google.android.gms.internal.fido.zzdr {
    private final String zza;

    public zzdp(String p1)
    {
        this.zza = p1;
        return;
    }

    public final bridge synthetic int compareTo(Object p4)
    {
        int v4_4;
        int v0_0;
        if (com.google.android.gms.internal.fido.zzdr.zzd(96) == ((com.google.android.gms.internal.fido.zzdr) p4).zza()) {
            int v0_3 = this.zza;
            int v4_2 = ((com.google.android.gms.internal.fido.zzdp) ((com.google.android.gms.internal.fido.zzdr) p4)).zza;
            if (v0_3.length() == v4_2.length()) {
                return v0_3.compareTo(v4_2);
            } else {
                v0_0 = v0_3.length();
                v4_4 = v4_2.length();
            }
        } else {
            v4_4 = ((com.google.android.gms.internal.fido.zzdr) p4).zza();
            v0_0 = com.google.android.gms.internal.fido.zzdr.zzd(96);
        }
        return (v0_0 - v4_4);
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if (p4) {
                if (com.google.android.gms.internal.fido.zzdp == p4.getClass()) {
                    return this.zza.equals(((com.google.android.gms.internal.fido.zzdp) p4).zza);
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
        return java.util.Arrays.hashCode(new Object[] {Integer.valueOf(com.google.android.gms.internal.fido.zzdr.zzd(96)), this.zza}));
    }

    public final String toString()
    {
        return v1.a.l("\"", this.zza, "\"");
    }

    public final int zza()
    {
        return com.google.android.gms.internal.fido.zzdr.zzd(96);
    }
}
