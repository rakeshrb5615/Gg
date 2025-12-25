package com.google.android.gms.internal.auth;
 class zzeb extends com.google.android.gms.internal.auth.zzea {
    protected final byte[] zza;

    public zzeb(byte[] p1)
    {
        p1.getClass();
        this.zza = p1;
        return;
    }

    public final boolean equals(Object p9)
    {
        if (p9 != this) {
            if ((p9 instanceof com.google.android.gms.internal.auth.zzee)) {
                if (this.zzd() == ((com.google.android.gms.internal.auth.zzee) p9).zzd()) {
                    if (this.zzd() != 0) {
                        if (!(p9 instanceof com.google.android.gms.internal.auth.zzeb)) {
                            return p9.equals(this);
                        } else {
                            int v1_3 = this.zzj();
                            String v3_1 = ((com.google.android.gms.internal.auth.zzeb) p9).zzj();
                            if ((v1_3 != 0) && ((v3_1 != null) && (v1_3 != v3_1))) {
                                return 0;
                            } else {
                                int v1_4 = this.zzd();
                                if (v1_4 > ((com.google.android.gms.internal.auth.zzeb) p9).zzd()) {
                                    IllegalArgumentException v0_1 = this.zzd();
                                    String v2_2 = new StringBuilder("Length too large: ");
                                    v2_2.append(v1_4);
                                    v2_2.append(v0_1);
                                    throw new IllegalArgumentException(v2_2.toString());
                                } else {
                                    if (v1_4 > ((com.google.android.gms.internal.auth.zzeb) p9).zzd()) {
                                        throw new IllegalArgumentException(v1.a.i("Ran off end of other: 0, ", v1_4, ((com.google.android.gms.internal.auth.zzeb) p9).zzd(), ", "));
                                    } else {
                                        String v3_6 = this.zza;
                                        byte[] v4 = ((com.google.android.gms.internal.auth.zzeb) p9).zza;
                                        ((com.google.android.gms.internal.auth.zzeb) p9).zzc();
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

    public final int zze(int p2, int p3, int p4)
    {
        return com.google.android.gms.internal.auth.zzez.zzd(p2, this.zza, 0, p4);
    }

    public final com.google.android.gms.internal.auth.zzee zzf(int p3, int p4)
    {
        com.google.android.gms.internal.auth.zzee v3_2 = com.google.android.gms.internal.auth.zzee.zzi(0, p4, this.zzd());
        if (v3_2 != null) {
            return new com.google.android.gms.internal.auth.zzdy(this.zza, 0, v3_2);
        } else {
            return com.google.android.gms.internal.auth.zzee.zzb;
        }
    }

    public final String zzg(java.nio.charset.Charset p5)
    {
        return new String(this.zza, 0, this.zzd(), p5);
    }

    public final boolean zzh()
    {
        return com.google.android.gms.internal.auth.zzhm.zzd(this.zza, 0, this.zzd());
    }
}
