package com.google.android.recaptcha.internal;
 class zzkg extends com.google.android.recaptcha.internal.zzkh {
    final com.google.android.recaptcha.internal.zzkd zza;
    final Character zzb;

    public zzkg(com.google.android.recaptcha.internal.zzkd p2, Character p3)
    {
        this.zza = p2;
        if ((p3 != null) && (p2.zzd(61))) {
            throw new IllegalArgumentException(com.google.android.recaptcha.internal.zzji.zza("Padding character %s was already in alphabet", new Object[] {p3})));
        } else {
            this.zzb = p3;
            return;
        }
    }

    public zzkg(String p2, String p3, Character p4)
    {
        this(new com.google.android.recaptcha.internal.zzkd(p2, p3.toCharArray()), p4);
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((!(p4 instanceof com.google.android.recaptcha.internal.zzkg)) || ((!this.zza.equals(((com.google.android.recaptcha.internal.zzkg) p4).zza)) || (!java.util.Objects.equals(this.zzb, ((com.google.android.recaptcha.internal.zzkg) p4).zzb)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (java.util.Objects.hashCode(this.zzb) ^ this.zza.hashCode());
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("BaseEncoding.");
        v0_1.append(this.zza);
        if ((8 % this.zza.zzb) != 0) {
            if (this.zzb != null) {
                v0_1.append(".withPadChar(\'");
                v0_1.append(this.zzb);
                v0_1.append("\')");
            } else {
                v0_1.append(".omitPadding()");
            }
        }
        return v0_1.toString();
    }

    public int zza(byte[] p14, CharSequence p15)
    {
        String v15_1 = this.zze(p15);
        if (!this.zza.zzc(v15_1.length())) {
            throw new com.google.android.recaptcha.internal.zzkf(g2.g.c(v15_1.length(), "Invalid input length "));
        } else {
            int v1_0 = 0;
            int v2 = 0;
            while (v1_0 < v15_1.length()) {
                int v3_1 = 0;
                int v5_0 = 0;
                int v6_0 = 0;
                while(true) {
                    int v7_0 = this.zza;
                    if (v5_0 >= v7_0.zzc) {
                        break;
                    }
                    v3_1 <<= v7_0.zzb;
                    if ((v1_0 + v5_0) < v15_1.length()) {
                        v3_1 |= ((long) this.zza.zzb(v15_1.charAt((v6_0 + v1_0))));
                        v6_0++;
                    }
                    v5_0++;
                }
                int v5_1 = v7_0.zzd;
                int v6_1 = (v6_0 * v7_0.zzb);
                int v7_3 = ((v5_1 - 1) * 8);
                while (v7_3 >= ((v5_1 * 8) - v6_1)) {
                    int v8_3 = (v2 + 1);
                    p14[v2] = ((byte) ((int) ((v3_1 >> v7_3) & 255)));
                    v7_3 -= 8;
                    v2 = v8_3;
                }
                v1_0 += this.zza.zzc;
            }
            return v2;
        }
    }

    public void zzb(Appendable p3, byte[] p4, int p5, int p6)
    {
        int v0 = 0;
        com.google.android.recaptcha.internal.zzjf.zzd(0, p6, p4.length);
        while (v0 < p6) {
            this.zzf(p3, p4, v0, Math.min(this.zza.zzd, (p6 - v0)));
            v0 += this.zza.zzd;
        }
        return;
    }

    public final int zzc(int p5)
    {
        return ((int) (((((long) this.zza.zzb) * ((long) p5)) + 7) / 8));
    }

    public final int zzd(int p4)
    {
        int v0_0 = this.zza;
        return (v0_0.zzc * com.google.android.recaptcha.internal.zzkj.zza(p4, v0_0.zzd, java.math.RoundingMode.CEILING));
    }

    public final CharSequence zze(CharSequence p4)
    {
        p4.getClass();
        if (this.zzb != null) {
            int v0_2 = p4.length();
            do {
                v0_2--;
            } while((v0_2 >= 0) && (p4.charAt(v0_2) == 61));
            return p4.subSequence(0, (v0_2 + 1));
        } else {
            return p4;
        }
    }

    public final void zzf(Appendable p8, byte[] p9, int p10, int p11)
    {
        int v0_12;
        com.google.android.recaptcha.internal.zzjf.zzd(p10, (p10 + p11), p9.length);
        int v1_1 = 0;
        if (p11 > this.zza.zzd) {
            v0_12 = 0;
        } else {
            v0_12 = 1;
        }
        com.google.android.recaptcha.internal.zzjf.zza(v0_12);
        long v2_0 = 0;
        int v0_1 = 0;
        while (v0_1 < p11) {
            v2_0 = ((v2_0 | ((long) (p9[(p10 + v0_1)] & 255))) << 8);
            v0_1++;
        }
        while (v1_1 < (p11 * 8)) {
            int v0_7 = this.zza;
            p8.append(v0_7.zza((((int) (v2_0 >> ((((p11 + 1) * 8) - this.zza.zzb) - v1_1))) & v0_7.zza)));
            v1_1 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (v1_1 < (this.zza.zzd * 8)) {
                this.zzb.getClass();
                p8.append(61);
                v1_1 += this.zza.zzb;
            }
        }
        return;
    }
}
