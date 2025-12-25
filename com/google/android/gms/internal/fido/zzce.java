package com.google.android.gms.internal.fido;
final class zzce extends com.google.android.gms.internal.fido.zzcg {
    final char[] zza;

    private zzce(com.google.android.gms.internal.fido.zzcd p5)
    {
        char[] v0_1;
        super(p5, 0);
        char[] v0_6 = new char[512];
        super.zza = v0_6;
        int v2 = 0;
        if (com.google.android.gms.internal.fido.zzcd.zzd(p5).length != 16) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        com.google.android.gms.internal.fido.zzap.zzc(v0_1);
        while (v2 < 256) {
            super.zza[v2] = p5.zza((v2 >> 4));
            super.zza[(v2 | 256)] = p5.zza((v2 & 15));
            v2++;
        }
        return;
    }

    public zzce(String p2, String p3)
    {
        this(new com.google.android.gms.internal.fido.zzcd("base16()", "0123456789ABCDEF".toCharArray()));
        return;
    }

    public final com.google.android.gms.internal.fido.zzch zza(com.google.android.gms.internal.fido.zzcd p1, Character p2)
    {
        return new com.google.android.gms.internal.fido.zzce(p1);
    }

    public final void zzb(Appendable p3, byte[] p4, int p5, int p6)
    {
        int v0 = 0;
        com.google.android.gms.internal.fido.zzap.zze(0, p6, p4.length);
        while (v0 < p6) {
            char v5_4 = (p4[v0] & 255);
            p3.append(this.zza[v5_4]);
            p3.append(this.zza[(v5_4 | 256)]);
            v0++;
        }
        return;
    }
}
