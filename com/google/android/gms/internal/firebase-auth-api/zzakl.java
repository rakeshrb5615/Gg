package com.google.android.gms.internal.firebase-auth-api;
final class zzakl implements com.google.android.gms.internal.firebase-auth-api.zzanc {
    private final com.google.android.gms.internal.firebase-auth-api.zzakh zza;
    private int zzb;
    private int zzc;
    private int zzd;

    private zzakl(com.google.android.gms.internal.firebase-auth-api.zzakh p2)
    {
        this.zzd = 0;
        com.google.android.gms.internal.firebase-auth-api.zzakh v2_2 = ((com.google.android.gms.internal.firebase-auth-api.zzakh) com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p2, "input"));
        this.zza = v2_2;
        v2_2.zzc = this;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzakl zza(com.google.android.gms.internal.firebase-auth-api.zzakh p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakl v0_0 = p1.zzc;
        if (v0_0 == null) {
            return new com.google.android.gms.internal.firebase-auth-api.zzakl(p1);
        } else {
            return v0_0;
        }
    }

    private final Object zza(com.google.android.gms.internal.firebase-auth-api.zzanb p2, com.google.android.gms.internal.firebase-auth-api.zzaku p3)
    {
        Object v0 = p2.zza();
        this.zzc(v0, p2, p3);
        p2.zzd(v0);
        return v0;
    }

    private final Object zza(com.google.android.gms.internal.firebase-auth-api.zzaog p2, Class p3, com.google.android.gms.internal.firebase-auth-api.zzaku p4)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzako.zza[p2.ordinal()]) {
            case 1:
                return Boolean.valueOf(this.zzs());
            case 2:
                return this.zzp();
            case 3:
                return Double.valueOf(this.zza());
            case 4:
                return Integer.valueOf(this.zze());
            case 5:
                return Integer.valueOf(this.zzf());
            case 6:
                return Long.valueOf(this.zzk());
            case 7:
                return Float.valueOf(this.zzb());
            case 8:
                return Integer.valueOf(this.zzg());
            case 9:
                return Long.valueOf(this.zzl());
            case 10:
                this.zzb(2);
                return this.zzb(com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(p3), p4);
            case 11:
                return Integer.valueOf(this.zzh());
            case 12:
                return Long.valueOf(this.zzm());
            case 13:
                return Integer.valueOf(this.zzi());
            case 14:
                return Long.valueOf(this.zzn());
            case 15:
                return this.zzr();
            case 16:
                return Integer.valueOf(this.zzj());
            case 17:
                return Long.valueOf(this.zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final void zza(int p2)
    {
        if (this.zza.zzc() != p2) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
        } else {
            return;
        }
    }

    private final void zza(java.util.List p3, boolean p4)
    {
        if ((this.zzb & 7) != 2) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
        } else {
            if ((!(p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzalt)) || (p4 != 0)) {
                do {
                    int v0_2;
                    if (p4 != 0) {
                        v0_2 = this.zzr();
                    } else {
                        v0_2 = this.zzq();
                    }
                    p3.add(v0_2);
                    if (!this.zza.zzw()) {
                        int v0_6 = this.zza.zzi();
                    }
                } while(v0_6 == this.zzb);
                this.zzd = v0_6;
                return;
            } else {
                do {
                    ((com.google.android.gms.internal.firebase-auth-api.zzalt) p3).zza(this.zzp());
                    if (!this.zza.zzw()) {
                        int v3_5 = this.zza.zzi();
                    }
                } while(v3_5 == this.zzb);
                this.zzd = v3_5;
                return;
            }
            return;
        }
    }

    private final Object zzb(com.google.android.gms.internal.firebase-auth-api.zzanb p2, com.google.android.gms.internal.firebase-auth-api.zzaku p3)
    {
        Object v0 = p2.zza();
        this.zzd(v0, p2, p3);
        p2.zzd(v0);
        return v0;
    }

    private final void zzb(int p2)
    {
        if ((this.zzb & 7) != p2) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
        } else {
            return;
        }
    }

    private static void zzc(int p0)
    {
        if ((p0 & 3) != 0) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
        } else {
            return;
        }
    }

    private final void zzc(Object p3, com.google.android.gms.internal.firebase-auth-api.zzanb p4, com.google.android.gms.internal.firebase-auth-api.zzaku p5)
    {
        int v0 = this.zzc;
        this.zzc = (((this.zzb >> 3) << 3) | 4);
        try {
            p4.zza(p3, this, p5);
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v3_2) {
            this.zzc = v0;
            throw v3_2;
        }
        if (this.zzb != this.zzc) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
        } else {
            this.zzc = v0;
            return;
        }
    }

    private static void zzd(int p0)
    {
        if ((p0 & 7) != 0) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
        } else {
            return;
        }
    }

    private final void zzd(Object p4, com.google.android.gms.internal.firebase-auth-api.zzanb p5, com.google.android.gms.internal.firebase-auth-api.zzaku p6)
    {
        int v0_1 = this.zza.zzj();
        this.zza.zzt();
        int v0_2 = this.zza.zzb(v0_1);
        com.google.android.gms.internal.firebase-auth-api.zzakh v1_2 = this.zza;
        v1_2.zza = (v1_2.zza + 1);
        p5.zza(p4, this, p6);
        this.zza.zzc(0);
        com.google.android.gms.internal.firebase-auth-api.zzakh v4_2 = this.zza;
        v4_2.zza = (v4_2.zza - 1);
        v4_2.zzd(v0_2);
        return;
    }

    public final double zza()
    {
        this.zzb(1);
        return this.zza.zza();
    }

    public final void zza(Object p2, com.google.android.gms.internal.firebase-auth-api.zzanb p3, com.google.android.gms.internal.firebase-auth-api.zzaku p4)
    {
        this.zzb(3);
        this.zzc(p2, p3, p4);
        return;
    }

    public final void zza(java.util.List p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzajt)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_4 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        p3.add(Boolean.valueOf(this.zza.zzx()));
                    } while(this.zza.zzc() < v1_4);
                    this.zza(v1_4);
                    return;
                }
                return;
            }
            do {
                p3.add(Boolean.valueOf(this.zza.zzx()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v3_3 = (this.zzb & 7);
            if (v3_3 != 0) {
                if (v3_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_8 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzajt) p3).zza(this.zza.zzx());
                    } while(this.zza.zzc() < v1_8);
                    this.zza(v1_8);
                    return;
                }
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzajt) p3).zza(this.zza.zzx());
                if (!this.zza.zzw()) {
                    int v3_9 = this.zza.zzi();
                }
            } while(v3_9 == this.zzb);
            this.zzd = v3_9;
            return;
        }
        return;
    }

    public final void zza(java.util.List p4, com.google.android.gms.internal.firebase-auth-api.zzanb p5, com.google.android.gms.internal.firebase-auth-api.zzaku p6)
    {
        int v0 = this.zzb;
        if ((v0 & 7) != 3) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
        }
        do {
            p4.add(this.zza(p5, p6));
            if ((!this.zza.zzw()) && (this.zzd == 0)) {
                int v1_5 = this.zza.zzi();
            }
            return;
        } while(v1_5 == v0);
        this.zzd = v1_5;
        return;
    }

    public final void zza(java.util.Map p8, com.google.android.gms.internal.firebase-auth-api.zzamd p9, com.google.android.gms.internal.firebase-auth-api.zzaku p10)
    {
        this.zzb(2);
        int v1_2 = this.zza.zzb(this.zza.zzj());
        Object v2_0 = p9.zzb;
        Object v3 = p9.zzd;
        while(true) {
            com.google.android.gms.internal.firebase-auth-api.zzall v4_0 = this.zzc();
            if ((v4_0 == 2147483647) || (this.zza.zzw())) {
                break;
            }
            if (v4_0 == 1) {
                v2_0 = this.zza(p9.zza, 0, 0);
            } else {
                if (v4_0 == 2) {
                    v3 = this.zza(p9.zzc, p9.zzd.getClass(), p10);
                } else {
                    if (!this.zzt()) {
                        throw new com.google.android.gms.internal.firebase-auth-api.zzall("Unable to parse map entry.");
                    } else {
                    }
                }
            }
        }
        p8.put(v2_0, v3);
        this.zza.zzd(v1_2);
        return;
    }

    public final float zzb()
    {
        this.zzb(5);
        return this.zza.zzb();
    }

    public final void zzb(Object p2, com.google.android.gms.internal.firebase-auth-api.zzanb p3, com.google.android.gms.internal.firebase-auth-api.zzaku p4)
    {
        this.zzb(2);
        this.zzd(p2, p3, p4);
        return;
    }

    public final void zzb(java.util.List p3)
    {
        if ((this.zzb & 7) != 2) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
        }
        do {
            p3.add(this.zzp());
            if (!this.zza.zzw()) {
                int v0_5 = this.zza.zzi();
            } else {
                return;
            }
        } while(v0_5 == this.zzb);
        this.zzd = v0_5;
        return;
    }

    public final void zzb(java.util.List p4, com.google.android.gms.internal.firebase-auth-api.zzanb p5, com.google.android.gms.internal.firebase-auth-api.zzaku p6)
    {
        int v0 = this.zzb;
        if ((v0 & 7) != 2) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
        }
        do {
            p4.add(this.zzb(p5, p6));
            if ((!this.zza.zzw()) && (this.zzd == 0)) {
                int v1_5 = this.zza.zzi();
            }
            return;
        } while(v1_5 == v0);
        this.zzd = v1_5;
        return;
    }

    public final int zzc()
    {
        int v0_0 = this.zzd;
        if (v0_0 == 0) {
            this.zzb = this.zza.zzi();
        } else {
            this.zzb = v0_0;
            this.zzd = 0;
        }
        int v0_6 = this.zzb;
        if ((v0_6 != 0) && (v0_6 != this.zzc)) {
            return (v0_6 >> 3);
        } else {
            return 2147483647;
        }
    }

    public final void zzc(java.util.List p5)
    {
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzaks)) {
            int v0_15 = (this.zzb & 7);
            if (v0_15 != 1) {
                if (v0_15 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v0_7 = this.zza.zzj();
                    com.google.android.gms.internal.firebase-auth-api.zzakl.zzd(v0_7);
                    int v1_4 = (this.zza.zzc() + v0_7);
                    do {
                        p5.add(Double.valueOf(this.zza.zza()));
                    } while(this.zza.zzc() < v1_4);
                }
                return;
            }
            do {
                p5.add(Double.valueOf(this.zza.zza()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v5_3 = (this.zzb & 7);
            if (v5_3 != 1) {
                if (v5_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v5_11 = this.zza.zzj();
                    com.google.android.gms.internal.firebase-auth-api.zzakl.zzd(v5_11);
                    int v1_9 = (this.zza.zzc() + v5_11);
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzaks) p5).zza(this.zza.zza());
                    } while(this.zza.zzc() < v1_9);
                }
                return;
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzaks) p5).zza(this.zza.zza());
                if (!this.zza.zzw()) {
                    int v5_8 = this.zza.zzi();
                }
            } while(v5_8 == this.zzb);
            this.zzd = v5_8;
            return;
        }
        return;
    }

    public final int zzd()
    {
        return this.zzb;
    }

    public final void zzd(java.util.List p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_4 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        p3.add(Integer.valueOf(this.zza.zzd()));
                    } while(this.zza.zzc() < v1_4);
                    this.zza(v1_4);
                    return;
                }
                return;
            }
            do {
                p3.add(Integer.valueOf(this.zza.zzd()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v3_3 = (this.zzb & 7);
            if (v3_3 != 0) {
                if (v3_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_8 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzali) p3).zzc(this.zza.zzd());
                    } while(this.zza.zzc() < v1_8);
                    this.zza(v1_8);
                    return;
                }
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzali) p3).zzc(this.zza.zzd());
                if (!this.zza.zzw()) {
                    int v3_9 = this.zza.zzi();
                }
            } while(v3_9 == this.zzb);
            this.zzd = v3_9;
            return;
        }
        return;
    }

    public final int zze()
    {
        this.zzb(0);
        return this.zza.zzd();
    }

    public final void zze(java.util.List p5)
    {
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            int v0_16 = (this.zzb & 7);
            if (v0_16 == 2) {
                int v0_18 = this.zza.zzj();
                com.google.android.gms.internal.firebase-auth-api.zzakl.zzc(v0_18);
                int v1_3 = (this.zza.zzc() + v0_18);
                do {
                    p5.add(Integer.valueOf(this.zza.zze()));
                } while(this.zza.zzc() < v1_3);
            } else {
                if (v0_16 != 5) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                }
                do {
                    p5.add(Integer.valueOf(this.zza.zze()));
                    if (!this.zza.zzw()) {
                        int v0_13 = this.zza.zzi();
                    }
                } while(v0_13 == this.zzb);
                this.zzd = v0_13;
                return;
            }
        } else {
            int v5_3 = (this.zzb & 7);
            if (v5_3 == 2) {
                int v5_5 = this.zza.zzj();
                com.google.android.gms.internal.firebase-auth-api.zzakl.zzc(v5_5);
                int v3 = (this.zza.zzc() + v5_5);
                do {
                    ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzc(this.zza.zze());
                } while(this.zza.zzc() < v3);
            } else {
                if (v5_3 != 5) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                }
                do {
                    ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzc(this.zza.zze());
                    if (!this.zza.zzw()) {
                        int v5_16 = this.zza.zzi();
                    }
                } while(v5_16 == this.zzb);
                this.zzd = v5_16;
                return;
            }
        }
        return;
    }

    public final int zzf()
    {
        this.zzb(5);
        return this.zza.zze();
    }

    public final void zzf(java.util.List p5)
    {
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            int v0_15 = (this.zzb & 7);
            if (v0_15 != 1) {
                if (v0_15 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v0_7 = this.zza.zzj();
                    com.google.android.gms.internal.firebase-auth-api.zzakl.zzd(v0_7);
                    int v1_4 = (this.zza.zzc() + v0_7);
                    do {
                        p5.add(Long.valueOf(this.zza.zzk()));
                    } while(this.zza.zzc() < v1_4);
                }
                return;
            }
            do {
                p5.add(Long.valueOf(this.zza.zzk()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v5_3 = (this.zzb & 7);
            if (v5_3 != 1) {
                if (v5_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v5_11 = this.zza.zzj();
                    com.google.android.gms.internal.firebase-auth-api.zzakl.zzd(v5_11);
                    int v1_9 = (this.zza.zzc() + v5_11);
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzk());
                    } while(this.zza.zzc() < v1_9);
                }
                return;
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzk());
                if (!this.zza.zzw()) {
                    int v5_8 = this.zza.zzi();
                }
            } while(v5_8 == this.zzb);
            this.zzd = v5_8;
            return;
        }
        return;
    }

    public final int zzg()
    {
        this.zzb(0);
        return this.zza.zzf();
    }

    public final void zzg(java.util.List p5)
    {
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzald)) {
            int v0_16 = (this.zzb & 7);
            if (v0_16 == 2) {
                int v0_18 = this.zza.zzj();
                com.google.android.gms.internal.firebase-auth-api.zzakl.zzc(v0_18);
                int v1_3 = (this.zza.zzc() + v0_18);
                do {
                    p5.add(Float.valueOf(this.zza.zzb()));
                } while(this.zza.zzc() < v1_3);
            } else {
                if (v0_16 != 5) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                }
                do {
                    p5.add(Float.valueOf(this.zza.zzb()));
                    if (!this.zza.zzw()) {
                        int v0_13 = this.zza.zzi();
                    }
                } while(v0_13 == this.zzb);
                this.zzd = v0_13;
                return;
            }
        } else {
            int v5_3 = (this.zzb & 7);
            if (v5_3 == 2) {
                int v5_5 = this.zza.zzj();
                com.google.android.gms.internal.firebase-auth-api.zzakl.zzc(v5_5);
                int v3 = (this.zza.zzc() + v5_5);
                do {
                    ((com.google.android.gms.internal.firebase-auth-api.zzald) p5).zza(this.zza.zzb());
                } while(this.zza.zzc() < v3);
            } else {
                if (v5_3 != 5) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                }
                do {
                    ((com.google.android.gms.internal.firebase-auth-api.zzald) p5).zza(this.zza.zzb());
                    if (!this.zza.zzw()) {
                        int v5_16 = this.zza.zzi();
                    }
                } while(v5_16 == this.zzb);
                this.zzd = v5_16;
                return;
            }
        }
        return;
    }

    public final int zzh()
    {
        this.zzb(5);
        return this.zza.zzg();
    }

    public final void zzh(java.util.List p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_4 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        p3.add(Integer.valueOf(this.zza.zzf()));
                    } while(this.zza.zzc() < v1_4);
                    this.zza(v1_4);
                    return;
                }
                return;
            }
            do {
                p3.add(Integer.valueOf(this.zza.zzf()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v3_3 = (this.zzb & 7);
            if (v3_3 != 0) {
                if (v3_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_8 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzali) p3).zzc(this.zza.zzf());
                    } while(this.zza.zzc() < v1_8);
                    this.zza(v1_8);
                    return;
                }
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzali) p3).zzc(this.zza.zzf());
                if (!this.zza.zzw()) {
                    int v3_9 = this.zza.zzi();
                }
            } while(v3_9 == this.zzb);
            this.zzd = v3_9;
            return;
        }
        return;
    }

    public final int zzi()
    {
        this.zzb(0);
        return this.zza.zzh();
    }

    public final void zzi(java.util.List p5)
    {
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            int v0_11 = (this.zzb & 7);
            if (v0_11 != 0) {
                if (v0_11 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_4 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        p5.add(Long.valueOf(this.zza.zzl()));
                    } while(this.zza.zzc() < v1_4);
                    this.zza(v1_4);
                    return;
                }
                return;
            }
            do {
                p5.add(Long.valueOf(this.zza.zzl()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v5_3 = (this.zzb & 7);
            if (v5_3 != 0) {
                if (v5_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_9 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzl());
                    } while(this.zza.zzc() < v1_9);
                    this.zza(v1_9);
                    return;
                }
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzl());
                if (!this.zza.zzw()) {
                    int v5_8 = this.zza.zzi();
                }
            } while(v5_8 == this.zzb);
            this.zzd = v5_8;
            return;
        }
        return;
    }

    public final int zzj()
    {
        this.zzb(0);
        return this.zza.zzj();
    }

    public final void zzj(java.util.List p5)
    {
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            int v0_16 = (this.zzb & 7);
            if (v0_16 == 2) {
                int v0_18 = this.zza.zzj();
                com.google.android.gms.internal.firebase-auth-api.zzakl.zzc(v0_18);
                int v1_3 = (this.zza.zzc() + v0_18);
                do {
                    p5.add(Integer.valueOf(this.zza.zzg()));
                } while(this.zza.zzc() < v1_3);
            } else {
                if (v0_16 != 5) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                }
                do {
                    p5.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzw()) {
                        int v0_13 = this.zza.zzi();
                    }
                } while(v0_13 == this.zzb);
                this.zzd = v0_13;
                return;
            }
        } else {
            int v5_3 = (this.zzb & 7);
            if (v5_3 == 2) {
                int v5_5 = this.zza.zzj();
                com.google.android.gms.internal.firebase-auth-api.zzakl.zzc(v5_5);
                int v3 = (this.zza.zzc() + v5_5);
                do {
                    ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzc(this.zza.zzg());
                } while(this.zza.zzc() < v3);
            } else {
                if (v5_3 != 5) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                }
                do {
                    ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzc(this.zza.zzg());
                    if (!this.zza.zzw()) {
                        int v5_16 = this.zza.zzi();
                    }
                } while(v5_16 == this.zzb);
                this.zzd = v5_16;
                return;
            }
        }
        return;
    }

    public final long zzk()
    {
        this.zzb(1);
        return this.zza.zzk();
    }

    public final void zzk(java.util.List p5)
    {
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            int v0_15 = (this.zzb & 7);
            if (v0_15 != 1) {
                if (v0_15 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v0_7 = this.zza.zzj();
                    com.google.android.gms.internal.firebase-auth-api.zzakl.zzd(v0_7);
                    int v1_4 = (this.zza.zzc() + v0_7);
                    do {
                        p5.add(Long.valueOf(this.zza.zzn()));
                    } while(this.zza.zzc() < v1_4);
                }
                return;
            }
            do {
                p5.add(Long.valueOf(this.zza.zzn()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v5_3 = (this.zzb & 7);
            if (v5_3 != 1) {
                if (v5_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v5_11 = this.zza.zzj();
                    com.google.android.gms.internal.firebase-auth-api.zzakl.zzd(v5_11);
                    int v1_9 = (this.zza.zzc() + v5_11);
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzn());
                    } while(this.zza.zzc() < v1_9);
                }
                return;
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzn());
                if (!this.zza.zzw()) {
                    int v5_8 = this.zza.zzi();
                }
            } while(v5_8 == this.zzb);
            this.zzd = v5_8;
            return;
        }
        return;
    }

    public final long zzl()
    {
        this.zzb(0);
        return this.zza.zzl();
    }

    public final void zzl(java.util.List p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_4 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        p3.add(Integer.valueOf(this.zza.zzh()));
                    } while(this.zza.zzc() < v1_4);
                    this.zza(v1_4);
                    return;
                }
                return;
            }
            do {
                p3.add(Integer.valueOf(this.zza.zzh()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v3_3 = (this.zzb & 7);
            if (v3_3 != 0) {
                if (v3_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_8 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzali) p3).zzc(this.zza.zzh());
                    } while(this.zza.zzc() < v1_8);
                    this.zza(v1_8);
                    return;
                }
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzali) p3).zzc(this.zza.zzh());
                if (!this.zza.zzw()) {
                    int v3_9 = this.zza.zzi();
                }
            } while(v3_9 == this.zzb);
            this.zzd = v3_9;
            return;
        }
        return;
    }

    public final long zzm()
    {
        this.zzb(1);
        return this.zza.zzn();
    }

    public final void zzm(java.util.List p5)
    {
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            int v0_11 = (this.zzb & 7);
            if (v0_11 != 0) {
                if (v0_11 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_4 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        p5.add(Long.valueOf(this.zza.zzo()));
                    } while(this.zza.zzc() < v1_4);
                    this.zza(v1_4);
                    return;
                }
                return;
            }
            do {
                p5.add(Long.valueOf(this.zza.zzo()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v5_3 = (this.zzb & 7);
            if (v5_3 != 0) {
                if (v5_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_9 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzo());
                    } while(this.zza.zzc() < v1_9);
                    this.zza(v1_9);
                    return;
                }
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzo());
                if (!this.zza.zzw()) {
                    int v5_8 = this.zza.zzi();
                }
            } while(v5_8 == this.zzb);
            this.zzd = v5_8;
            return;
        }
        return;
    }

    public final long zzn()
    {
        this.zzb(0);
        return this.zza.zzo();
    }

    public final void zzn(java.util.List p2)
    {
        this.zza(p2, 0);
        return;
    }

    public final long zzo()
    {
        this.zzb(0);
        return this.zza.zzp();
    }

    public final void zzo(java.util.List p2)
    {
        this.zza(p2, 1);
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zzp()
    {
        this.zzb(2);
        return this.zza.zzq();
    }

    public final void zzp(java.util.List p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_4 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        p3.add(Integer.valueOf(this.zza.zzj()));
                    } while(this.zza.zzc() < v1_4);
                    this.zza(v1_4);
                    return;
                }
                return;
            }
            do {
                p3.add(Integer.valueOf(this.zza.zzj()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v3_3 = (this.zzb & 7);
            if (v3_3 != 0) {
                if (v3_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_8 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzali) p3).zzc(this.zza.zzj());
                    } while(this.zza.zzc() < v1_8);
                    this.zza(v1_8);
                    return;
                }
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzali) p3).zzc(this.zza.zzj());
                if (!this.zza.zzw()) {
                    int v3_9 = this.zza.zzi();
                }
            } while(v3_9 == this.zzb);
            this.zzd = v3_9;
            return;
        }
        return;
    }

    public final String zzq()
    {
        this.zzb(2);
        return this.zza.zzr();
    }

    public final void zzq(java.util.List p5)
    {
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            int v0_11 = (this.zzb & 7);
            if (v0_11 != 0) {
                if (v0_11 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_4 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        p5.add(Long.valueOf(this.zza.zzp()));
                    } while(this.zza.zzc() < v1_4);
                    this.zza(v1_4);
                    return;
                }
                return;
            }
            do {
                p5.add(Long.valueOf(this.zza.zzp()));
                if (!this.zza.zzw()) {
                    int v0_5 = this.zza.zzi();
                }
            } while(v0_5 == this.zzb);
            this.zzd = v0_5;
            return;
        } else {
            int v5_3 = (this.zzb & 7);
            if (v5_3 != 0) {
                if (v5_3 != 2) {
                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zza();
                } else {
                    int v1_9 = (this.zza.zzc() + this.zza.zzj());
                    do {
                        ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzp());
                    } while(this.zza.zzc() < v1_9);
                    this.zza(v1_9);
                    return;
                }
            }
            do {
                ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zza(this.zza.zzp());
                if (!this.zza.zzw()) {
                    int v5_8 = this.zza.zzi();
                }
            } while(v5_8 == this.zzb);
            this.zzd = v5_8;
            return;
        }
        return;
    }

    public final String zzr()
    {
        this.zzb(2);
        return this.zza.zzs();
    }

    public final boolean zzs()
    {
        this.zzb(0);
        return this.zza.zzx();
    }

    public final boolean zzt()
    {
        if (!this.zza.zzw()) {
            boolean v0_3 = this.zzb;
            if (v0_3 != this.zzc) {
                return this.zza.zze(v0_3);
            }
        }
        return 0;
    }
}
