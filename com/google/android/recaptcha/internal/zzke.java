package com.google.android.recaptcha.internal;
final class zzke extends com.google.android.recaptcha.internal.zzkg {

    public zzke(String p2, String p3, Character p4)
    {
        int v2_1;
        com.google.android.recaptcha.internal.zzkd v0_1 = new com.google.android.recaptcha.internal.zzkd(p2, p3.toCharArray());
        super(v0_1, p4);
        if (com.google.android.recaptcha.internal.zzkd.zze(v0_1).length != 64) {
            v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        com.google.android.recaptcha.internal.zzjf.zza(v2_1);
        return;
    }

    public final int zza(byte[] p8, CharSequence p9)
    {
        String v9_1 = this.zze(p9);
        if (!this.zza.zzc(v9_1.length())) {
            throw new com.google.android.recaptcha.internal.zzkf(g2.g.c(v9_1.length(), "Invalid input length "));
        } else {
            int v0_1 = 0;
            int v1_0 = 0;
            while (v0_1 < v9_1.length()) {
                int v4_2 = (v1_0 + 1);
                byte v2_4 = ((this.zza.zzb(v9_1.charAt(v0_1)) << 18) | (this.zza.zzb(v9_1.charAt((v0_1 + 1))) << 12));
                p8[v1_0] = ((byte) (v2_4 >> 16));
                int v3_6 = (v0_1 + 2);
                if (v3_6 >= v9_1.length()) {
                    v0_1 = v3_6;
                    v1_0 = v4_2;
                } else {
                    int v6 = (v0_1 + 3);
                    byte v2_5 = (v2_4 | (this.zza.zzb(v9_1.charAt(v3_6)) << 6));
                    int v3_10 = (v1_0 + 2);
                    p8[v4_2] = ((byte) ((v2_5 >> 8) & 255));
                    if (v6 >= v9_1.length()) {
                        v1_0 = v3_10;
                        v0_1 = v6;
                    } else {
                        v0_1 += 4;
                        v1_0 += 3;
                        p8[v3_10] = ((byte) ((v2_5 | this.zza.zzb(v9_1.charAt(v6))) & 255));
                    }
                }
            }
            return v1_0;
        }
    }

    public final void zzb(Appendable p6, byte[] p7, int p8, int p9)
    {
        int v0 = 0;
        com.google.android.recaptcha.internal.zzjf.zzd(0, p9, p7.length);
        int v8_1 = p9;
        while (v8_1 >= 3) {
            char v1_5 = ((((p7[(v0 + 1)] & 255) << 8) | ((p7[v0] & 255) << 16)) | (p7[(v0 + 2)] & 255));
            p6.append(this.zza.zza((v1_5 >> 18)));
            p6.append(this.zza.zza(((v1_5 >> 12) & 63)));
            p6.append(this.zza.zza(((v1_5 >> 6) & 63)));
            p6.append(this.zza.zza((v1_5 & 63)));
            v0 += 3;
            v8_1 -= 3;
        }
        if (v0 < p9) {
            this.zzf(p6, p7, v0, (p9 - v0));
        }
        return;
    }
}
