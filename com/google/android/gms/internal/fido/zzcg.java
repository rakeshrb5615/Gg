package com.google.android.gms.internal.fido;
 class zzcg extends com.google.android.gms.internal.fido.zzch {
    private volatile com.google.android.gms.internal.fido.zzch zza;
    final com.google.android.gms.internal.fido.zzcd zzb;
    final Character zzc;

    public zzcg(com.google.android.gms.internal.fido.zzcd p2, Character p3)
    {
        this.zzb = p2;
        if ((p3 != null) && (p2.zzc(61))) {
            throw new IllegalArgumentException(com.google.android.gms.internal.fido.zzaq.zza("Padding character %s was already in alphabet", new Object[] {p3})));
        } else {
            this.zzc = p3;
            return;
        }
    }

    public zzcg(String p2, String p3, Character p4)
    {
        this(new com.google.android.gms.internal.fido.zzcd(p2, p3.toCharArray()), p4);
        return;
    }

    public final boolean equals(Object p4)
    {
        if (((p4 instanceof com.google.android.gms.internal.fido.zzcg)) && (this.zzb.equals(((com.google.android.gms.internal.fido.zzcg) p4).zzb))) {
            Character v0_3 = this.zzc;
            boolean v4_1 = ((com.google.android.gms.internal.fido.zzcg) p4).zzc;
            if ((v0_3 == v4_1) || ((v0_3 != null) && (v0_3.equals(v4_1)))) {
                return 1;
            }
        }
        return 0;
    }

    public final int hashCode()
    {
        int v1_1;
        int v0_1 = this.zzb.hashCode();
        int v1_0 = this.zzc;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        return (v0_1 ^ v1_1);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("BaseEncoding.");
        v0_1.append(this.zzb);
        if ((8 % this.zzb.zzb) != 0) {
            if (this.zzc != null) {
                v0_1.append(".withPadChar(\'");
                v0_1.append(this.zzc);
                v0_1.append("\')");
            } else {
                v0_1.append(".omitPadding()");
            }
        }
        return v0_1.toString();
    }

    public com.google.android.gms.internal.fido.zzch zza(com.google.android.gms.internal.fido.zzcd p2, Character p3)
    {
        return new com.google.android.gms.internal.fido.zzcg(p2, p3);
    }

    public void zzb(Appendable p3, byte[] p4, int p5, int p6)
    {
        int v0 = 0;
        com.google.android.gms.internal.fido.zzap.zze(0, p6, p4.length);
        while (v0 < p6) {
            this.zze(p3, p4, v0, Math.min(this.zzb.zzd, (p6 - v0)));
            v0 += this.zzb.zzd;
        }
        return;
    }

    public final int zzc(int p4)
    {
        int v0_0 = this.zzb;
        return (com.google.android.gms.internal.fido.zzcj.zza(p4, v0_0.zzd, java.math.RoundingMode.CEILING) * v0_0.zzc);
    }

    public final com.google.android.gms.internal.fido.zzch zzd()
    {
        com.google.android.gms.internal.fido.zzch v0_0 = this.zza;
        if (v0_0 == null) {
            com.google.android.gms.internal.fido.zzch v0_2 = this.zzb.zzb();
            if (v0_2 != this.zzb) {
                v0_0 = this.zza(v0_2, this.zzc);
            } else {
                v0_0 = this;
            }
            this.zza = v0_0;
        }
        return v0_0;
    }

    public final void zze(Appendable p8, byte[] p9, int p10, int p11)
    {
        int v0_6;
        com.google.android.gms.internal.fido.zzap.zze(p10, (p10 + p11), p9.length);
        int v1_1 = 0;
        if (p11 > this.zzb.zzd) {
            v0_6 = 0;
        } else {
            v0_6 = 1;
        }
        com.google.android.gms.internal.fido.zzap.zzc(v0_6);
        long v2_0 = 0;
        int v0_1 = 0;
        while (v0_1 < p11) {
            v2_0 = ((v2_0 | ((long) (p9[(p10 + v0_1)] & 255))) << 8);
            v0_1++;
        }
        while (v1_1 < (p11 * 8)) {
            int v10_5 = this.zzb;
            p8.append(v10_5.zza((v10_5.zza & ((int) (v2_0 >> ((((p11 + 1) * 8) - this.zzb.zzb) - v1_1))))));
            v1_1 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (v1_1 < (this.zzb.zzd * 8)) {
                this.zzc.getClass();
                p8.append(61);
                v1_1 += this.zzb.zzb;
            }
        }
        return;
    }
}
