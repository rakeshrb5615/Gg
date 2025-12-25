package com.google.android.recaptcha.internal;
 class zzlc extends com.google.android.recaptcha.internal.zzlb {
    protected final byte[] zza;

    public zzlc(byte[] p2)
    {
        super(0);
        p2.getClass();
        super.zza = p2;
        return;
    }

    public final boolean equals(Object p9)
    {
        if (p9 != this) {
            if ((p9 instanceof com.google.android.recaptcha.internal.zzle)) {
                if (this.zzd() == ((com.google.android.recaptcha.internal.zzle) p9).zzd()) {
                    if (this.zzd() != 0) {
                        if (!(p9 instanceof com.google.android.recaptcha.internal.zzlc)) {
                            return p9.equals(this);
                        } else {
                            int v1_3 = this.zzj();
                            String v3_1 = ((com.google.android.recaptcha.internal.zzlc) p9).zzj();
                            if ((v1_3 != 0) && ((v3_1 != null) && (v1_3 != v3_1))) {
                                return 0;
                            } else {
                                int v1_4 = this.zzd();
                                if (v1_4 > ((com.google.android.recaptcha.internal.zzlc) p9).zzd()) {
                                    IllegalArgumentException v0_1 = this.zzd();
                                    String v2_2 = new StringBuilder("Length too large: ");
                                    v2_2.append(v1_4);
                                    v2_2.append(v0_1);
                                    throw new IllegalArgumentException(v2_2.toString());
                                } else {
                                    if (v1_4 > ((com.google.android.recaptcha.internal.zzlc) p9).zzd()) {
                                        throw new IllegalArgumentException(v1.a.i("Ran off end of other: 0, ", v1_4, ((com.google.android.recaptcha.internal.zzlc) p9).zzd(), ", "));
                                    } else {
                                        String v3_6 = this.zza;
                                        byte[] v4 = ((com.google.android.recaptcha.internal.zzlc) p9).zza;
                                        ((com.google.android.recaptcha.internal.zzlc) p9).zzc();
                                        int v9_7 = 0;
                                        int v5 = 0;
                                        while (v9_7 < v1_4) {
                                            if (v3_6[v9_7] == v4[v5]) {
                                                v9_7++;
                                                v5++;
                                            } else {
                                                return 0;
                                            }
                                        }
                                        return 1;
                                    }
                                }
                            }
                        }
                    } else {
                        return 1;
                    }
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

    public byte zza(int p2)
    {
        return this.zza[p2];
    }

    public byte zzb(int p2)
    {
        return this.zza[p2];
    }

    public int zzc()
    {
        return 0;
    }

    public int zzd()
    {
        return this.zza.length;
    }

    public void zze(byte[] p1, int p2, int p3, int p4)
    {
        System.arraycopy(this.zza, 0, p1, 0, p4);
        return;
    }

    public final int zzf(int p2, int p3, int p4)
    {
        return com.google.android.recaptcha.internal.zznl.zzb(p2, this.zza, 0, p4);
    }

    public final com.google.android.recaptcha.internal.zzle zzg(int p3, int p4)
    {
        com.google.android.recaptcha.internal.zzle v3_2 = com.google.android.recaptcha.internal.zzle.zzi(0, p4, this.zzd());
        if (v3_2 != null) {
            return new com.google.android.recaptcha.internal.zzkz(this.zza, 0, v3_2);
        } else {
            return com.google.android.recaptcha.internal.zzle.zzb;
        }
    }

    public final void zzh(com.google.android.recaptcha.internal.zzkw p4)
    {
        ((com.google.android.recaptcha.internal.zzlk) p4).zzc(this.zza, 0, this.zzd());
        return;
    }
}
