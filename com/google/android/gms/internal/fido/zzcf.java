package com.google.android.gms.internal.fido;
final class zzcf extends com.google.android.gms.internal.fido.zzcg {

    private zzcf(com.google.android.gms.internal.fido.zzcd p1, Character p2)
    {
        int v1_3;
        super(p1, p2);
        if (com.google.android.gms.internal.fido.zzcd.zzd(p1).length != 64) {
            v1_3 = 0;
        } else {
            v1_3 = 1;
        }
        com.google.android.gms.internal.fido.zzap.zzc(v1_3);
        return;
    }

    public zzcf(String p2, String p3, Character p4)
    {
        this(new com.google.android.gms.internal.fido.zzcd(p2, p3.toCharArray()), p4);
        return;
    }

    public final com.google.android.gms.internal.fido.zzch zza(com.google.android.gms.internal.fido.zzcd p2, Character p3)
    {
        return new com.google.android.gms.internal.fido.zzcf(p2, p3);
    }

    public final void zzb(Appendable p6, byte[] p7, int p8, int p9)
    {
        int v0 = 0;
        com.google.android.gms.internal.fido.zzap.zze(0, p9, p7.length);
        int v8_1 = p9;
        while (v8_1 >= 3) {
            char v1_5 = ((((p7[(v0 + 1)] & 255) << 8) | ((p7[v0] & 255) << 16)) | (p7[(v0 + 2)] & 255));
            p6.append(this.zzb.zza((v1_5 >> 18)));
            p6.append(this.zzb.zza(((v1_5 >> 12) & 63)));
            p6.append(this.zzb.zza(((v1_5 >> 6) & 63)));
            p6.append(this.zzb.zza((v1_5 & 63)));
            v0 += 3;
            v8_1 -= 3;
        }
        if (v0 < p9) {
            this.zze(p6, p7, v0, (p9 - v0));
        }
        return;
    }
}
