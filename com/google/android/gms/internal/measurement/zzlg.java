package com.google.android.gms.internal.measurement;
 class zzlg extends com.google.android.gms.internal.measurement.zzlf {
    protected final byte[] zza;

    public zzlg(byte[] p2)
    {
        super(0);
        p2.getClass();
        super.zza = p2;
        return;
    }

    public final boolean equals(Object p9)
    {
        if (p9 != this) {
            if ((p9 instanceof com.google.android.gms.internal.measurement.zzlh)) {
                if (this.zzc() == ((com.google.android.gms.internal.measurement.zzlh) p9).zzc()) {
                    if (this.zzc() != 0) {
                        if (!(p9 instanceof com.google.android.gms.internal.measurement.zzlg)) {
                            return p9.equals(this);
                        } else {
                            String v1_3 = this.zzi();
                            int v3_1 = ((com.google.android.gms.internal.measurement.zzlg) p9).zzi();
                            if ((v1_3 != null) && ((v3_1 != 0) && (v1_3 != v3_1))) {
                                return 0;
                            } else {
                                String v1_4 = this.zzc();
                                if (v1_4 > ((com.google.android.gms.internal.measurement.zzlg) p9).zzc()) {
                                    IllegalArgumentException v0_1 = this.zzc();
                                    StringBuilder v4_1 = new StringBuilder(((String.valueOf(v1_4).length() + 18) + String.valueOf(v0_1).length()));
                                    v4_1.append("Length too large: ");
                                    v4_1.append(v1_4);
                                    v4_1.append(v0_1);
                                    throw new IllegalArgumentException(v4_1.toString());
                                } else {
                                    if (v1_4 > ((com.google.android.gms.internal.measurement.zzlg) p9).zzc()) {
                                        int v9_5 = ((com.google.android.gms.internal.measurement.zzlg) p9).zzc();
                                        StringBuilder v4_3 = new StringBuilder(((String.valueOf(v1_4).length() + 27) + String.valueOf(v9_5).length()));
                                        v4_3.append("Ran off end of other: 0, ");
                                        v4_3.append(v1_4);
                                        v4_3.append(", ");
                                        v4_3.append(v9_5);
                                        throw new IllegalArgumentException(v4_3.toString());
                                    } else {
                                        int v3_10 = this.zza;
                                        StringBuilder v4_4 = ((com.google.android.gms.internal.measurement.zzlg) p9).zza;
                                        ((com.google.android.gms.internal.measurement.zzlg) p9).zzd();
                                        int v9_7 = 0;
                                        int v5 = 0;
                                        while (v9_7 < v1_4) {
                                            if (v3_10[v9_7] == v4_4[v5]) {
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
        return this.zza.length;
    }

    public int zzd()
    {
        return 0;
    }

    public final com.google.android.gms.internal.measurement.zzlh zze(int p3, int p4)
    {
        com.google.android.gms.internal.measurement.zzlh v3_2 = com.google.android.gms.internal.measurement.zzlh.zzj(0, p4, this.zzc());
        if (v3_2 != null) {
            return new com.google.android.gms.internal.measurement.zzlc(this.zza, 0, v3_2);
        } else {
            return com.google.android.gms.internal.measurement.zzlh.zzb;
        }
    }

    public final void zzf(com.google.android.gms.internal.measurement.zzkz p4)
    {
        ((com.google.android.gms.internal.measurement.zzlk) p4).zzv(this.zza, 0, this.zzc());
        return;
    }

    public final int zzg(int p2, int p3, int p4)
    {
        return com.google.android.gms.internal.measurement.zzmp.zzc(p2, this.zza, 0, p4);
    }
}
