package com.google.android.gms.internal.firebase-auth-api;
 class zzakg extends com.google.android.gms.internal.firebase-auth-api.zzakd {
    protected final byte[] zzb;

    public zzakg(byte[] p2)
    {
        super(0);
        p2.getClass();
        super.zzb = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                if (this.zzb() == ((com.google.android.gms.internal.firebase-auth-api.zzajv) p5).zzb()) {
                    if (this.zzb() != 0) {
                        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzakg)) {
                            return p5.equals(this);
                        } else {
                            int v0_2 = this.zza();
                            int v1_2 = ((com.google.android.gms.internal.firebase-auth-api.zzakg) p5).zza();
                            if ((v0_2 == 0) || ((v1_2 == 0) || (v0_2 == v1_2))) {
                                return this.zza(((com.google.android.gms.internal.firebase-auth-api.zzakg) p5), 0, this.zzb());
                            } else {
                                return 0;
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
        return this.zzb[p2];
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zza(int p3, int p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzajv v3_2 = com.google.android.gms.internal.firebase-auth-api.zzajv.zza(0, p4, this.zzb());
        if (v3_2 != null) {
            return new com.google.android.gms.internal.firebase-auth-api.zzajz(this.zzb, this.zze(), v3_2);
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzajw p4)
    {
        p4.zza(this.zzb, this.zze(), this.zzb());
        return;
    }

    public void zza(byte[] p1, int p2, int p3, int p4)
    {
        System.arraycopy(this.zzb, 0, p1, 0, p4);
        return;
    }

    public final boolean zza(com.google.android.gms.internal.firebase-auth-api.zzajv p6, int p7, int p8)
    {
        if (p8 > p6.zzb()) {
            com.google.android.gms.internal.firebase-auth-api.zzajv v7_8 = this.zzb();
            String v0_3 = new StringBuilder("Length too large: ");
            v0_3.append(p8);
            v0_3.append(v7_8);
            throw new IllegalArgumentException(v0_3.toString());
        } else {
            if (p8 > p6.zzb()) {
                throw new IllegalArgumentException(v1.a.i("Ran off end of other: 0, ", p8, p6.zzb(), ", "));
            } else {
                if (!(p6 instanceof com.google.android.gms.internal.firebase-auth-api.zzakg)) {
                    return p6.zza(0, p8).equals(this.zza(0, p8));
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzajv v7_7 = this.zzb;
                    byte[] v1_1 = ((com.google.android.gms.internal.firebase-auth-api.zzakg) p6).zzb;
                    int v2_1 = (this.zze() + p8);
                    int v8_1 = this.zze();
                    int v6_8 = ((com.google.android.gms.internal.firebase-auth-api.zzakg) p6).zze();
                    while (v8_1 < v2_1) {
                        if (v7_7[v8_1] == v1_1[v6_8]) {
                            v8_1++;
                            v6_8++;
                        } else {
                            return 0;
                        }
                    }
                    return 1;
                }
            }
        }
    }

    public byte zzb(int p2)
    {
        return this.zzb[p2];
    }

    public int zzb()
    {
        return this.zzb.length;
    }

    public final int zzb(int p2, int p3, int p4)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p2, this.zzb, this.zze(), p4);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzakh zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzakh.zza(this.zzb, this.zze(), this.zzb(), 1);
    }

    public int zze()
    {
        return 0;
    }
}
