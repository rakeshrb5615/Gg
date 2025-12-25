package com.google.android.recaptcha.internal;
final class zzlj implements com.google.android.recaptcha.internal.zzov {
    private final com.google.android.recaptcha.internal.zzli zza;
    private int zzb;
    private int zzc;
    private int zzd;

    private zzlj(com.google.android.recaptcha.internal.zzli p2)
    {
        this.zzd = 0;
        this.zza = p2;
        p2.zzc = this;
        return;
    }

    private final void zzP(Object p3, com.google.android.recaptcha.internal.zzow p4, com.google.android.recaptcha.internal.zzmo p5)
    {
        int v0 = this.zzc;
        this.zzc = (((this.zzb >> 3) << 3) | 4);
        try {
            p4.zzh(p3, this, p5);
        } catch (com.google.android.recaptcha.internal.zznn v3_3) {
            this.zzc = v0;
            throw v3_3;
        }
        if (this.zzb != this.zzc) {
            throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
        } else {
            this.zzc = v0;
            return;
        }
    }

    private final void zzQ(Object p5, com.google.android.recaptcha.internal.zzow p6, com.google.android.recaptcha.internal.zzmo p7)
    {
        int v0_0 = this.zza;
        com.google.android.recaptcha.internal.zzli v1_1 = v0_0.zzn();
        if (v0_0.zza >= v0_0.zzb) {
            throw new com.google.android.recaptcha.internal.zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        } else {
            int v0_1 = v0_0.zze(v1_1);
            com.google.android.recaptcha.internal.zzli v1_0 = this.zza;
            v1_0.zza = (v1_0.zza + 1);
            p6.zzh(p5, this, p7);
            this.zza.zzz(0);
            com.google.android.recaptcha.internal.zznn v5_2 = this.zza;
            v5_2.zza = (v5_2.zza - 1);
            v5_2.zzA(v0_1);
            return;
        }
    }

    private final void zzR(int p2)
    {
        if (this.zza.zzd() != p2) {
            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else {
            return;
        }
    }

    private final void zzS(int p2)
    {
        if ((this.zzb & 7) != p2) {
            throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
        } else {
            return;
        }
    }

    private static final void zzT(int p1)
    {
        if ((p1 & 3) != 0) {
            throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
        } else {
            return;
        }
    }

    private static final void zzU(int p1)
    {
        if ((p1 & 7) != 0) {
            throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
        } else {
            return;
        }
    }

    public static com.google.android.recaptcha.internal.zzlj zzq(com.google.android.recaptcha.internal.zzli p1)
    {
        com.google.android.recaptcha.internal.zzlj v0_0 = p1.zzc;
        if (v0_0 == null) {
            return new com.google.android.recaptcha.internal.zzlj(p1);
        } else {
            return v0_0;
        }
    }

    public final void zzA(java.util.List p5)
    {
        int v5_1;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zznx)) {
            int v0_13 = (this.zzb & 7);
            if (v0_13 != 1) {
                if (v0_13 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_8 = this.zza.zzn();
                    com.google.android.recaptcha.internal.zzlj.zzU(v0_8);
                    int v0_9 = (v0_8 + this.zza.zzd());
                    do {
                        p5.add(Long.valueOf(this.zza.zzo()));
                    } while(this.zza.zzd() < v0_9);
                }
                return;
            }
            do {
                p5.add(Long.valueOf(this.zza.zzo()));
                if (!this.zza.zzC()) {
                    int v0_6 = this.zza.zzm();
                }
            } while(v0_6 == this.zzb);
            v5_1 = v0_6;
            this.zzd = v5_1;
        } else {
            int v5_5 = (this.zzb & 7);
            if (v5_5 != 1) {
                if (v5_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v5_13 = this.zza.zzn();
                    com.google.android.recaptcha.internal.zzlj.zzU(v5_13);
                    int v5_14 = (v5_13 + this.zza.zzd());
                    do {
                        ((com.google.android.recaptcha.internal.zznx) p5).zzg(this.zza.zzo());
                    } while(this.zza.zzd() < v5_14);
                }
                return;
            }
            do {
                ((com.google.android.recaptcha.internal.zznx) p5).zzg(this.zza.zzo());
                if (!this.zza.zzC()) {
                    v5_1 = this.zza.zzm();
                }
            } while(v5_1 == this.zzb);
        }
        return;
    }

    public final void zzB(java.util.List p6)
    {
        int v6_3;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzmv)) {
            int v0_17 = (this.zzb & 7);
            if (v0_17 == 2) {
                int v0_1 = this.zza.zzn();
                com.google.android.recaptcha.internal.zzlj.zzT(v0_1);
                int v1_3 = (this.zza.zzd() + v0_1);
                do {
                    p6.add(Float.valueOf(this.zza.zzc()));
                } while(this.zza.zzd() < v1_3);
                return;
            } else {
                if (v0_17 != 5) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                }
                do {
                    p6.add(Float.valueOf(this.zza.zzc()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        int v0_13 = this.zza.zzm();
                    }
                } while(v0_13 == this.zzb);
                v6_3 = v0_13;
            }
        } else {
            int v6_5 = (this.zzb & 7);
            if (v6_5 == 2) {
                int v6_7 = this.zza.zzn();
                com.google.android.recaptcha.internal.zzlj.zzT(v6_7);
                int v4 = (this.zza.zzd() + v6_7);
                do {
                    ((com.google.android.recaptcha.internal.zzmv) p6).zzf(this.zza.zzc());
                } while(this.zza.zzd() < v4);
                return;
            } else {
                if (v6_5 != 5) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                }
                do {
                    ((com.google.android.recaptcha.internal.zzmv) p6).zzf(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        v6_3 = this.zza.zzm();
                    }
                } while(v6_3 == this.zzb);
            }
        }
        this.zzd = v6_3;
        return;
    }

    public final void zzC(java.util.List p4, com.google.android.recaptcha.internal.zzow p5, com.google.android.recaptcha.internal.zzmo p6)
    {
        int v0 = this.zzb;
        if ((v0 & 7) != 3) {
            throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
        }
        do {
            int v1_6 = p5.zze();
            this.zzP(v1_6, p5, p6);
            p5.zzf(v1_6);
            p4.add(v1_6);
            if ((!this.zza.zzC()) && (this.zzd == 0)) {
                int v1_5 = this.zza.zzm();
            }
            return;
        } while(v1_5 == v0);
        this.zzd = v1_5;
        return;
    }

    public final void zzD(java.util.List p4)
    {
        int v4_1;
        if (!(p4 instanceof com.google.android.recaptcha.internal.zzne)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_6 = this.zza;
                    int v0_8 = (v0_6.zzd() + v0_6.zzn());
                    do {
                        p4.add(Integer.valueOf(this.zza.zzh()));
                    } while(this.zza.zzd() < v0_8);
                    this.zzR(v0_8);
                    return;
                }
                return;
            }
            do {
                p4.add(Integer.valueOf(this.zza.zzh()));
                if (!this.zza.zzC()) {
                    int v0_5 = this.zza.zzm();
                }
            } while(v0_5 == this.zzb);
            v4_1 = v0_5;
            this.zzd = v4_1;
        } else {
            int v4_5 = (this.zzb & 7);
            if (v4_5 != 0) {
                if (v4_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v4_13 = this.zza;
                    int v4_15 = (v4_13.zzd() + v4_13.zzn());
                    do {
                        ((com.google.android.recaptcha.internal.zzne) p4).zzh(this.zza.zzh());
                    } while(this.zza.zzd() < v4_15);
                    this.zzR(v4_15);
                    return;
                }
            }
            do {
                ((com.google.android.recaptcha.internal.zzne) p4).zzh(this.zza.zzh());
                if (!this.zza.zzC()) {
                    v4_1 = this.zza.zzm();
                }
            } while(v4_1 == this.zzb);
        }
        return;
    }

    public final void zzE(java.util.List p4)
    {
        int v4_1;
        if (!(p4 instanceof com.google.android.recaptcha.internal.zznx)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_6 = this.zza;
                    int v0_8 = (v0_6.zzd() + v0_6.zzn());
                    do {
                        p4.add(Long.valueOf(this.zza.zzp()));
                    } while(this.zza.zzd() < v0_8);
                    this.zzR(v0_8);
                    return;
                }
                return;
            }
            do {
                p4.add(Long.valueOf(this.zza.zzp()));
                if (!this.zza.zzC()) {
                    int v0_5 = this.zza.zzm();
                }
            } while(v0_5 == this.zzb);
            v4_1 = v0_5;
            this.zzd = v4_1;
        } else {
            int v4_5 = (this.zzb & 7);
            if (v4_5 != 0) {
                if (v4_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v4_12 = this.zza;
                    int v4_14 = (v4_12.zzd() + v4_12.zzn());
                    do {
                        ((com.google.android.recaptcha.internal.zznx) p4).zzg(this.zza.zzp());
                    } while(this.zza.zzd() < v4_14);
                    this.zzR(v4_14);
                    return;
                }
            }
            do {
                ((com.google.android.recaptcha.internal.zznx) p4).zzg(this.zza.zzp());
                if (!this.zza.zzC()) {
                    v4_1 = this.zza.zzm();
                }
            } while(v4_1 == this.zzb);
        }
        return;
    }

    public final void zzF(java.util.List p4, com.google.android.recaptcha.internal.zzow p5, com.google.android.recaptcha.internal.zzmo p6)
    {
        int v0 = this.zzb;
        if ((v0 & 7) != 2) {
            throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
        }
        do {
            int v1_6 = p5.zze();
            this.zzQ(v1_6, p5, p6);
            p5.zzf(v1_6);
            p4.add(v1_6);
            if ((!this.zza.zzC()) && (this.zzd == 0)) {
                int v1_5 = this.zza.zzm();
            }
            return;
        } while(v1_5 == v0);
        this.zzd = v1_5;
        return;
    }

    public final void zzG(java.util.List p6)
    {
        int v6_3;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzne)) {
            int v0_17 = (this.zzb & 7);
            if (v0_17 == 2) {
                int v0_1 = this.zza.zzn();
                com.google.android.recaptcha.internal.zzlj.zzT(v0_1);
                int v1_3 = (this.zza.zzd() + v0_1);
                do {
                    p6.add(Integer.valueOf(this.zza.zzk()));
                } while(this.zza.zzd() < v1_3);
                return;
            } else {
                if (v0_17 != 5) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                }
                do {
                    p6.add(Integer.valueOf(this.zza.zzk()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        int v0_13 = this.zza.zzm();
                    }
                } while(v0_13 == this.zzb);
                v6_3 = v0_13;
            }
        } else {
            int v6_5 = (this.zzb & 7);
            if (v6_5 == 2) {
                int v6_7 = this.zza.zzn();
                com.google.android.recaptcha.internal.zzlj.zzT(v6_7);
                int v4 = (this.zza.zzd() + v6_7);
                do {
                    ((com.google.android.recaptcha.internal.zzne) p6).zzh(this.zza.zzk());
                } while(this.zza.zzd() < v4);
                return;
            } else {
                if (v6_5 != 5) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                }
                do {
                    ((com.google.android.recaptcha.internal.zzne) p6).zzh(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        v6_3 = this.zza.zzm();
                    }
                } while(v6_3 == this.zzb);
            }
        }
        this.zzd = v6_3;
        return;
    }

    public final void zzH(java.util.List p5)
    {
        int v5_1;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zznx)) {
            int v0_13 = (this.zzb & 7);
            if (v0_13 != 1) {
                if (v0_13 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_8 = this.zza.zzn();
                    com.google.android.recaptcha.internal.zzlj.zzU(v0_8);
                    int v0_9 = (v0_8 + this.zza.zzd());
                    do {
                        p5.add(Long.valueOf(this.zza.zzt()));
                    } while(this.zza.zzd() < v0_9);
                }
                return;
            }
            do {
                p5.add(Long.valueOf(this.zza.zzt()));
                if (!this.zza.zzC()) {
                    int v0_6 = this.zza.zzm();
                }
            } while(v0_6 == this.zzb);
            v5_1 = v0_6;
            this.zzd = v5_1;
        } else {
            int v5_5 = (this.zzb & 7);
            if (v5_5 != 1) {
                if (v5_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v5_13 = this.zza.zzn();
                    com.google.android.recaptcha.internal.zzlj.zzU(v5_13);
                    int v5_14 = (v5_13 + this.zza.zzd());
                    do {
                        ((com.google.android.recaptcha.internal.zznx) p5).zzg(this.zza.zzt());
                    } while(this.zza.zzd() < v5_14);
                }
                return;
            }
            do {
                ((com.google.android.recaptcha.internal.zznx) p5).zzg(this.zza.zzt());
                if (!this.zza.zzC()) {
                    v5_1 = this.zza.zzm();
                }
            } while(v5_1 == this.zzb);
        }
        return;
    }

    public final void zzI(java.util.List p4)
    {
        int v4_1;
        if (!(p4 instanceof com.google.android.recaptcha.internal.zzne)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_6 = this.zza;
                    int v0_8 = (v0_6.zzd() + v0_6.zzn());
                    do {
                        p4.add(Integer.valueOf(this.zza.zzl()));
                    } while(this.zza.zzd() < v0_8);
                    this.zzR(v0_8);
                    return;
                }
                return;
            }
            do {
                p4.add(Integer.valueOf(this.zza.zzl()));
                if (!this.zza.zzC()) {
                    int v0_5 = this.zza.zzm();
                }
            } while(v0_5 == this.zzb);
            v4_1 = v0_5;
            this.zzd = v4_1;
        } else {
            int v4_5 = (this.zzb & 7);
            if (v4_5 != 0) {
                if (v4_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v4_13 = this.zza;
                    int v4_15 = (v4_13.zzd() + v4_13.zzn());
                    do {
                        ((com.google.android.recaptcha.internal.zzne) p4).zzh(this.zza.zzl());
                    } while(this.zza.zzd() < v4_15);
                    this.zzR(v4_15);
                    return;
                }
            }
            do {
                ((com.google.android.recaptcha.internal.zzne) p4).zzh(this.zza.zzl());
                if (!this.zza.zzC()) {
                    v4_1 = this.zza.zzm();
                }
            } while(v4_1 == this.zzb);
        }
        return;
    }

    public final void zzJ(java.util.List p4)
    {
        int v4_1;
        if (!(p4 instanceof com.google.android.recaptcha.internal.zznx)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_6 = this.zza;
                    int v0_8 = (v0_6.zzd() + v0_6.zzn());
                    do {
                        p4.add(Long.valueOf(this.zza.zzu()));
                    } while(this.zza.zzd() < v0_8);
                    this.zzR(v0_8);
                    return;
                }
                return;
            }
            do {
                p4.add(Long.valueOf(this.zza.zzu()));
                if (!this.zza.zzC()) {
                    int v0_5 = this.zza.zzm();
                }
            } while(v0_5 == this.zzb);
            v4_1 = v0_5;
            this.zzd = v4_1;
        } else {
            int v4_5 = (this.zzb & 7);
            if (v4_5 != 0) {
                if (v4_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v4_12 = this.zza;
                    int v4_14 = (v4_12.zzd() + v4_12.zzn());
                    do {
                        ((com.google.android.recaptcha.internal.zznx) p4).zzg(this.zza.zzu());
                    } while(this.zza.zzd() < v4_14);
                    this.zzR(v4_14);
                    return;
                }
            }
            do {
                ((com.google.android.recaptcha.internal.zznx) p4).zzg(this.zza.zzu());
                if (!this.zza.zzC()) {
                    v4_1 = this.zza.zzm();
                }
            } while(v4_1 == this.zzb);
        }
        return;
    }

    public final void zzK(java.util.List p3, boolean p4)
    {
        if ((this.zzb & 7) != 2) {
            throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
        } else {
            if ((!(p3 instanceof com.google.android.recaptcha.internal.zznu)) || (p4 != 0)) {
                do {
                    int v0_3;
                    if (p4 != 0) {
                        v0_3 = this.zzs();
                    } else {
                        v0_3 = this.zzr();
                    }
                    p3.add(v0_3);
                    if (!this.zza.zzC()) {
                        int v0_7 = this.zza.zzm();
                    }
                } while(v0_7 == this.zzb);
                int v4_4 = v0_7;
                this.zzd = v4_4;
                return;
            } else {
                do {
                    this.zzp();
                    ((com.google.android.recaptcha.internal.zznu) p3).zzb();
                    if (!this.zza.zzC()) {
                        v4_4 = this.zza.zzm();
                    }
                } while(v4_4 == this.zzb);
                this.zzd = v4_4;
                return;
            }
            return;
        }
    }

    public final void zzL(java.util.List p4)
    {
        int v4_1;
        if (!(p4 instanceof com.google.android.recaptcha.internal.zzne)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_6 = this.zza;
                    int v0_8 = (v0_6.zzd() + v0_6.zzn());
                    do {
                        p4.add(Integer.valueOf(this.zza.zzn()));
                    } while(this.zza.zzd() < v0_8);
                    this.zzR(v0_8);
                    return;
                }
                return;
            }
            do {
                p4.add(Integer.valueOf(this.zza.zzn()));
                if (!this.zza.zzC()) {
                    int v0_5 = this.zza.zzm();
                }
            } while(v0_5 == this.zzb);
            v4_1 = v0_5;
            this.zzd = v4_1;
        } else {
            int v4_5 = (this.zzb & 7);
            if (v4_5 != 0) {
                if (v4_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v4_13 = this.zza;
                    int v4_15 = (v4_13.zzd() + v4_13.zzn());
                    do {
                        ((com.google.android.recaptcha.internal.zzne) p4).zzh(this.zza.zzn());
                    } while(this.zza.zzd() < v4_15);
                    this.zzR(v4_15);
                    return;
                }
            }
            do {
                ((com.google.android.recaptcha.internal.zzne) p4).zzh(this.zza.zzn());
                if (!this.zza.zzC()) {
                    v4_1 = this.zza.zzm();
                }
            } while(v4_1 == this.zzb);
        }
        return;
    }

    public final void zzM(java.util.List p4)
    {
        int v4_1;
        if (!(p4 instanceof com.google.android.recaptcha.internal.zznx)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_6 = this.zza;
                    int v0_8 = (v0_6.zzd() + v0_6.zzn());
                    do {
                        p4.add(Long.valueOf(this.zza.zzv()));
                    } while(this.zza.zzd() < v0_8);
                    this.zzR(v0_8);
                    return;
                }
                return;
            }
            do {
                p4.add(Long.valueOf(this.zza.zzv()));
                if (!this.zza.zzC()) {
                    int v0_5 = this.zza.zzm();
                }
            } while(v0_5 == this.zzb);
            v4_1 = v0_5;
            this.zzd = v4_1;
        } else {
            int v4_5 = (this.zzb & 7);
            if (v4_5 != 0) {
                if (v4_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v4_12 = this.zza;
                    int v4_14 = (v4_12.zzd() + v4_12.zzn());
                    do {
                        ((com.google.android.recaptcha.internal.zznx) p4).zzg(this.zza.zzv());
                    } while(this.zza.zzd() < v4_14);
                    this.zzR(v4_14);
                    return;
                }
            }
            do {
                ((com.google.android.recaptcha.internal.zznx) p4).zzg(this.zza.zzv());
                if (!this.zza.zzC()) {
                    v4_1 = this.zza.zzm();
                }
            } while(v4_1 == this.zzb);
        }
        return;
    }

    public final boolean zzN()
    {
        this.zzS(0);
        return this.zza.zzD();
    }

    public final boolean zzO()
    {
        if (!this.zza.zzC()) {
            boolean v0_3 = this.zzb;
            if (v0_3 != this.zzc) {
                return this.zza.zzE(v0_3);
            }
        }
        return 0;
    }

    public final double zza()
    {
        this.zzS(1);
        return this.zza.zzb();
    }

    public final float zzb()
    {
        this.zzS(5);
        return this.zza.zzc();
    }

    public final int zzc()
    {
        int v0_0 = this.zzd;
        if (v0_0 == 0) {
            v0_0 = this.zza.zzm();
            this.zzb = v0_0;
        } else {
            this.zzb = v0_0;
            this.zzd = 0;
        }
        if ((v0_0 != 0) && (v0_0 != this.zzc)) {
            return (v0_0 >> 3);
        } else {
            return 2147483647;
        }
    }

    public final int zzd()
    {
        return this.zzb;
    }

    public final int zze()
    {
        this.zzS(0);
        return this.zza.zzf();
    }

    public final int zzf()
    {
        this.zzS(5);
        return this.zza.zzg();
    }

    public final int zzg()
    {
        this.zzS(0);
        return this.zza.zzh();
    }

    public final int zzh()
    {
        this.zzS(5);
        return this.zza.zzk();
    }

    public final int zzi()
    {
        this.zzS(0);
        return this.zza.zzl();
    }

    public final int zzj()
    {
        this.zzS(0);
        return this.zza.zzn();
    }

    public final long zzk()
    {
        this.zzS(1);
        return this.zza.zzo();
    }

    public final long zzl()
    {
        this.zzS(0);
        return this.zza.zzp();
    }

    public final long zzm()
    {
        this.zzS(1);
        return this.zza.zzt();
    }

    public final long zzn()
    {
        this.zzS(0);
        return this.zza.zzu();
    }

    public final long zzo()
    {
        this.zzS(0);
        return this.zza.zzv();
    }

    public final com.google.android.recaptcha.internal.zzle zzp()
    {
        this.zzS(2);
        return this.zza.zzw();
    }

    public final String zzr()
    {
        this.zzS(2);
        return this.zza.zzx();
    }

    public final String zzs()
    {
        this.zzS(2);
        return this.zza.zzy();
    }

    public final void zzt(Object p2, com.google.android.recaptcha.internal.zzow p3, com.google.android.recaptcha.internal.zzmo p4)
    {
        this.zzS(3);
        this.zzP(p2, p3, p4);
        return;
    }

    public final void zzu(Object p2, com.google.android.recaptcha.internal.zzow p3, com.google.android.recaptcha.internal.zzmo p4)
    {
        this.zzS(2);
        this.zzQ(p2, p3, p4);
        return;
    }

    public final void zzv(java.util.List p4)
    {
        int v4_1;
        if (!(p4 instanceof com.google.android.recaptcha.internal.zzkv)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_6 = this.zza;
                    int v0_8 = (v0_6.zzd() + v0_6.zzn());
                    do {
                        p4.add(Boolean.valueOf(this.zza.zzD()));
                    } while(this.zza.zzd() < v0_8);
                    this.zzR(v0_8);
                    return;
                }
                return;
            }
            do {
                p4.add(Boolean.valueOf(this.zza.zzD()));
                if (!this.zza.zzC()) {
                    int v0_5 = this.zza.zzm();
                }
            } while(v0_5 == this.zzb);
            v4_1 = v0_5;
            this.zzd = v4_1;
        } else {
            int v4_5 = (this.zzb & 7);
            if (v4_5 != 0) {
                if (v4_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v4_13 = this.zza;
                    int v4_15 = (v4_13.zzd() + v4_13.zzn());
                    do {
                        ((com.google.android.recaptcha.internal.zzkv) p4).zze(this.zza.zzD());
                    } while(this.zza.zzd() < v4_15);
                    this.zzR(v4_15);
                    return;
                }
            }
            do {
                ((com.google.android.recaptcha.internal.zzkv) p4).zze(this.zza.zzD());
                if (!this.zza.zzC()) {
                    v4_1 = this.zza.zzm();
                }
            } while(v4_1 == this.zzb);
        }
        return;
    }

    public final void zzw(java.util.List p3)
    {
        if ((this.zzb & 7) != 2) {
            throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
        }
        do {
            p3.add(this.zzp());
            if (!this.zza.zzC()) {
                int v0_5 = this.zza.zzm();
            } else {
                return;
            }
        } while(v0_5 == this.zzb);
        this.zzd = v0_5;
        return;
    }

    public final void zzx(java.util.List p5)
    {
        int v5_1;
        if (!(p5 instanceof com.google.android.recaptcha.internal.zzmi)) {
            int v0_13 = (this.zzb & 7);
            if (v0_13 != 1) {
                if (v0_13 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_8 = this.zza.zzn();
                    com.google.android.recaptcha.internal.zzlj.zzU(v0_8);
                    int v0_9 = (v0_8 + this.zza.zzd());
                    do {
                        p5.add(Double.valueOf(this.zza.zzb()));
                    } while(this.zza.zzd() < v0_9);
                }
                return;
            }
            do {
                p5.add(Double.valueOf(this.zza.zzb()));
                if (!this.zza.zzC()) {
                    int v0_6 = this.zza.zzm();
                }
            } while(v0_6 == this.zzb);
            v5_1 = v0_6;
            this.zzd = v5_1;
        } else {
            int v5_5 = (this.zzb & 7);
            if (v5_5 != 1) {
                if (v5_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v5_13 = this.zza.zzn();
                    com.google.android.recaptcha.internal.zzlj.zzU(v5_13);
                    int v5_14 = (v5_13 + this.zza.zzd());
                    do {
                        ((com.google.android.recaptcha.internal.zzmi) p5).zzf(this.zza.zzb());
                    } while(this.zza.zzd() < v5_14);
                }
                return;
            }
            do {
                ((com.google.android.recaptcha.internal.zzmi) p5).zzf(this.zza.zzb());
                if (!this.zza.zzC()) {
                    v5_1 = this.zza.zzm();
                }
            } while(v5_1 == this.zzb);
        }
        return;
    }

    public final void zzy(java.util.List p4)
    {
        int v4_1;
        if (!(p4 instanceof com.google.android.recaptcha.internal.zzne)) {
            int v0_12 = (this.zzb & 7);
            if (v0_12 != 0) {
                if (v0_12 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v0_6 = this.zza;
                    int v0_8 = (v0_6.zzd() + v0_6.zzn());
                    do {
                        p4.add(Integer.valueOf(this.zza.zzf()));
                    } while(this.zza.zzd() < v0_8);
                    this.zzR(v0_8);
                    return;
                }
                return;
            }
            do {
                p4.add(Integer.valueOf(this.zza.zzf()));
                if (!this.zza.zzC()) {
                    int v0_5 = this.zza.zzm();
                }
            } while(v0_5 == this.zzb);
            v4_1 = v0_5;
            this.zzd = v4_1;
        } else {
            int v4_5 = (this.zzb & 7);
            if (v4_5 != 0) {
                if (v4_5 != 2) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                } else {
                    int v4_13 = this.zza;
                    int v4_15 = (v4_13.zzd() + v4_13.zzn());
                    do {
                        ((com.google.android.recaptcha.internal.zzne) p4).zzh(this.zza.zzf());
                    } while(this.zza.zzd() < v4_15);
                    this.zzR(v4_15);
                    return;
                }
            }
            do {
                ((com.google.android.recaptcha.internal.zzne) p4).zzh(this.zza.zzf());
                if (!this.zza.zzC()) {
                    v4_1 = this.zza.zzm();
                }
            } while(v4_1 == this.zzb);
        }
        return;
    }

    public final void zzz(java.util.List p6)
    {
        int v6_3;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzne)) {
            int v0_17 = (this.zzb & 7);
            if (v0_17 == 2) {
                int v0_1 = this.zza.zzn();
                com.google.android.recaptcha.internal.zzlj.zzT(v0_1);
                int v1_3 = (this.zza.zzd() + v0_1);
                do {
                    p6.add(Integer.valueOf(this.zza.zzg()));
                } while(this.zza.zzd() < v1_3);
                return;
            } else {
                if (v0_17 != 5) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                }
                do {
                    p6.add(Integer.valueOf(this.zza.zzg()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        int v0_13 = this.zza.zzm();
                    }
                } while(v0_13 == this.zzb);
                v6_3 = v0_13;
            }
        } else {
            int v6_5 = (this.zzb & 7);
            if (v6_5 == 2) {
                int v6_7 = this.zza.zzn();
                com.google.android.recaptcha.internal.zzlj.zzT(v6_7);
                int v4 = (this.zza.zzd() + v6_7);
                do {
                    ((com.google.android.recaptcha.internal.zzne) p6).zzh(this.zza.zzg());
                } while(this.zza.zzd() < v4);
                return;
            } else {
                if (v6_5 != 5) {
                    throw new com.google.android.recaptcha.internal.zznm("Protocol message tag had invalid wire type.");
                }
                do {
                    ((com.google.android.recaptcha.internal.zzne) p6).zzh(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        v6_3 = this.zza.zzm();
                    }
                } while(v6_3 == this.zzb);
            }
        }
        this.zzd = v6_3;
        return;
    }
}
