package com.google.android.gms.internal.firebase-auth-api;
public final class zzbm implements com.google.android.gms.internal.firebase-auth-api.zzob {
    private final java.util.List zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzok zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzbm zzc;

    private zzbm(com.google.android.gms.internal.firebase-auth-api.zzxh p3, java.util.List p4, com.google.android.gms.internal.firebase-auth-api.zzok p5)
    {
        this.zza = p4;
        this.zzb = p5;
        if (com.google.android.gms.internal.firebase-auth-api.zziu.zza.zza()) {
            String v4_7 = new java.util.HashSet();
            String v5_2 = p3.zze().iterator();
            while (v5_2.hasNext()) {
                String v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb) v5_2.next());
                if (v4_7.contains(Integer.valueOf(v0_2.zza()))) {
                    throw new java.security.GeneralSecurityException(v1.a.j("KeyID ", v0_2.zza(), " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                } else {
                    v4_7.add(Integer.valueOf(v0_2.zza()));
                }
            }
            if (!v4_7.contains(Integer.valueOf(p3.zzb()))) {
                throw new java.security.GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = 0;
        return;
    }

    public synthetic zzbm(com.google.android.gms.internal.firebase-auth-api.zzxh p1, java.util.List p2, com.google.android.gms.internal.firebase-auth-api.zzok p3, com.google.android.gms.internal.firebase-auth-api.zzbt p4)
    {
        this(p1, p2, p3);
        return;
    }

    private zzbm(java.util.List p1, com.google.android.gms.internal.firebase-auth-api.zzok p2, com.google.android.gms.internal.firebase-auth-api.zzbm p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzbi zza(com.google.android.gms.internal.firebase-auth-api.zzxh$zzb p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzbi v3_1 = com.google.android.gms.internal.firebase-auth-api.zzbm.zzb(p3);
        com.google.android.gms.internal.firebase-auth-api.zzof v0_2 = com.google.android.gms.internal.firebase-auth-api.zzoz.zza();
        com.google.android.gms.internal.firebase-auth-api.zzch v1 = com.google.android.gms.internal.firebase-auth-api.zzch.zza();
        if (v0_2.zzb(v3_1)) {
            return v0_2.zza(v3_1, v1);
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzof(v3_1, v1);
        }
    }

    public static final com.google.android.gms.internal.firebase-auth-api.zzbm zza(com.google.android.gms.internal.firebase-auth-api.zzbj p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzbn().zza(new com.google.android.gms.internal.firebase-auth-api.zzbq(p3.zza(), 0).zzb().zza()).zza();
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzbm zza(com.google.android.gms.internal.firebase-auth-api.zzbm p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzbm.zzb(p0);
    }

    public static final com.google.android.gms.internal.firebase-auth-api.zzbm zza(com.google.android.gms.internal.firebase-auth-api.zzbv p1, com.google.android.gms.internal.firebase-auth-api.zzba p2, byte[] p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzbm v1_1 = p1.zza();
        if ((v1_1 == null) || (v1_1.zzc().zzb() == 0)) {
            throw new java.security.GeneralSecurityException("empty keyset");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzbm.zza(com.google.android.gms.internal.firebase-auth-api.zzbm.zza(v1_1, p2, p3));
        }
    }

    public static final com.google.android.gms.internal.firebase-auth-api.zzbm zza(com.google.android.gms.internal.firebase-auth-api.zzxh p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzbm.zzd(p3);
        return new com.google.android.gms.internal.firebase-auth-api.zzbm(p3, com.google.android.gms.internal.firebase-auth-api.zzbm.zzc(p3), com.google.android.gms.internal.firebase-auth-api.zzok.zza);
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzxc zza(com.google.android.gms.internal.firebase-auth-api.zzbk p1)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzbk.zza.equals(p1)) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzbk.zzb.equals(p1)) {
                if (!com.google.android.gms.internal.firebase-auth-api.zzbk.zzc.equals(p1)) {
                    throw new IllegalStateException("Unknown key status");
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzxc.zzd;
                }
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzxc.zzc;
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzxc.zzb;
        }
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzxh$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzbi p0, com.google.android.gms.internal.firebase-auth-api.zzxc p1, int p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzbm.zzb(p0, p1, p2);
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzxh zza(com.google.android.gms.internal.firebase-auth-api.zzvv p0, com.google.android.gms.internal.firebase-auth-api.zzba p1, byte[] p2)
    {
        try {
            java.security.GeneralSecurityException v0_6 = com.google.android.gms.internal.firebase-auth-api.zzxh.zza(p1.zza(p0.zzc().zzd(), p2), com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            com.google.android.gms.internal.firebase-auth-api.zzbm.zzd(v0_6);
            return v0_6;
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall) {
            throw new java.security.GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static boolean zza(com.google.android.gms.internal.firebase-auth-api.zzxc p2)
    {
        int v2_3 = com.google.android.gms.internal.firebase-auth-api.zzbo.zza[p2.ordinal()];
        if ((v2_3 == 1) || ((v2_3 == 2) || (v2_3 == 3))) {
            return 1;
        } else {
            return 0;
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzbm zzb(com.google.android.gms.internal.firebase-auth-api.zzbm p11)
    {
        com.google.android.gms.internal.firebase-auth-api.zzok v0 = p11.zzb;
        if (!v0.zza()) {
            com.google.android.gms.internal.firebase-auth-api.zzbl v8_1 = new com.google.android.gms.internal.firebase-auth-api.zzbl(p11, v0);
            java.util.ArrayList v1_0 = new java.util.ArrayList(p11.zza.size());
            java.util.Iterator v10 = p11.zza.iterator();
            while (v10.hasNext()) {
                com.google.android.gms.internal.firebase-auth-api.zzxc v4_0 = ((com.google.android.gms.internal.firebase-auth-api.zzbs) v10.next());
                int v5_0 = v4_0;
                boolean v6_0 = v5_0;
                boolean v7_0 = v6_0;
                v1_0.add(new com.google.android.gms.internal.firebase-auth-api.zzbs(com.google.android.gms.internal.firebase-auth-api.zzbs.zzb(v4_0), com.google.android.gms.internal.firebase-auth-api.zzbs.zzc(v5_0), com.google.android.gms.internal.firebase-auth-api.zzbs.zza(v6_0), com.google.android.gms.internal.firebase-auth-api.zzbs.zze(v7_0), com.google.android.gms.internal.firebase-auth-api.zzbs.zzf(v7_0), v8_1, 0));
            }
            return new com.google.android.gms.internal.firebase-auth-api.zzbm(v1_0, v0, p11);
        } else {
            return p11;
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzqb zzb(com.google.android.gms.internal.firebase-auth-api.zzxh$zzb p4)
    {
        Integer v0_1;
        Integer v0_0 = p4.zza();
        if (p4.zzf() != com.google.android.gms.internal.firebase-auth-api.zzxz.zzd) {
            v0_1 = Integer.valueOf(v0_0);
        } else {
            v0_1 = 0;
        }
        return com.google.android.gms.internal.firebase-auth-api.zzqb.zza(p4.zzb().zzf(), p4.zzb().zze(), p4.zzb().zzb(), p4.zzf(), v0_1);
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzxh$zzb zzb(com.google.android.gms.internal.firebase-auth-api.zzbi p3, com.google.android.gms.internal.firebase-auth-api.zzxc p4, int p5)
    {
        java.security.GeneralSecurityException v3_9 = ((com.google.android.gms.internal.firebase-auth-api.zzqb) com.google.android.gms.internal.firebase-auth-api.zzoz.zza().zza(p3, com.google.android.gms.internal.firebase-auth-api.zzqb, com.google.android.gms.internal.firebase-auth-api.zzch.zza()));
        com.google.android.gms.internal.firebase-auth-api.zzxh$zzb$zza v0_4 = v3_9.zze();
        if ((v0_4 != null) && (v0_4.intValue() != p5)) {
            throw new java.security.GeneralSecurityException("Wrong ID set for key with ID requirement");
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxh$zzb.zzd().zza(com.google.android.gms.internal.firebase-auth-api.zzwx.zza().zza(v3_9.zzf()).zza(v3_9.zzd()).zza(v3_9.zza())).zza(p4).zza(p5).zza(v3_9.zzb()).zze()));
        }
    }

    public static synthetic void zzb(com.google.android.gms.internal.firebase-auth-api.zzxh p0)
    {
        com.google.android.gms.internal.firebase-auth-api.zzbm.zzd(p0);
        return;
    }

    private static java.util.List zzc(com.google.android.gms.internal.firebase-auth-api.zzxh p12)
    {
        java.util.ArrayList v1_1 = new java.util.ArrayList(p12.zza());
        java.util.Iterator v2 = p12.zze().iterator();
        while (v2.hasNext()) {
            com.google.android.gms.internal.firebase-auth-api.zzxc v3_1 = ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb) v2.next());
            int v7 = v3_1.zza();
            try {
                String v0_2 = com.google.android.gms.internal.firebase-auth-api.zzbm.zza(v3_1);
                int v9 = 0;
            } catch (String v0_3) {
                if (com.google.android.gms.internal.firebase-auth-api.zziu.zza.zza()) {
                    throw v0_3;
                } else {
                    v0_2 = new com.google.android.gms.internal.firebase-auth-api.zzof(com.google.android.gms.internal.firebase-auth-api.zzbm.zzb(v3_1), com.google.android.gms.internal.firebase-auth-api.zzch.zza());
                    v9 = 1;
                }
            }
            if ((com.google.android.gms.internal.firebase-auth-api.zziu.zza.zza()) && (!com.google.android.gms.internal.firebase-auth-api.zzbm.zza(v3_1.zzc()))) {
                throw new java.security.GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            } else {
                int v8_2;
                com.google.android.gms.internal.firebase-auth-api.zzxc v3_2 = v3_1.zzc();
                if (v7 != p12.zzb()) {
                    v8_2 = 0;
                } else {
                    v8_2 = 1;
                }
                v1_1.add(new com.google.android.gms.internal.firebase-auth-api.zzbs(v0_2, v3_2, v7, v8_2, v9, com.google.android.gms.internal.firebase-auth-api.zzbs.zzd(), 0));
            }
        }
        return java.util.Collections.unmodifiableList(v1_1);
    }

    private static void zzd(com.google.android.gms.internal.firebase-auth-api.zzxh p1)
    {
        if ((p1 == null) || (p1.zza() <= 0)) {
            throw new java.security.GeneralSecurityException("empty keyset");
        } else {
            return;
        }
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzbm zze()
    {
        com.google.android.gms.internal.firebase-auth-api.zzbm v0 = this.zzc;
        if (v0 != null) {
            return v0;
        } else {
            return this;
        }
    }

    public final String toString()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzcm.zza(this.zzd()).toString();
    }

    public final int zza()
    {
        return this.zza.size();
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzoa zza(int p5)
    {
        if ((p5 < null) || (p5 >= this.zza())) {
            throw new IndexOutOfBoundsException(v1.a.i("Invalid index ", p5, this.zza(), " for keyset of size "));
        } else {
            IllegalStateException v0_3 = ((com.google.android.gms.internal.firebase-auth-api.zzbs) this.zza.get(p5));
            if (!com.google.android.gms.internal.firebase-auth-api.zzbm.zza(com.google.android.gms.internal.firebase-auth-api.zzbs.zzc(v0_3))) {
                throw new IllegalStateException(v1.a.j("Keyset-Entry at position ", p5, " has wrong status"));
            } else {
                if (com.google.android.gms.internal.firebase-auth-api.zzbs.zzf(v0_3)) {
                    throw new IllegalStateException(v1.a.j("Keyset-Entry at position ", p5, " didn\'t parse correctly"));
                } else {
                    return ((com.google.android.gms.internal.firebase-auth-api.zzbs) this.zza.get(p5));
                }
            }
        }
    }

    public final Object zza(com.google.android.gms.internal.firebase-auth-api.zzbb p4, Class p5)
    {
        if (!(p4 instanceof com.google.android.gms.internal.firebase-auth-api.zznp)) {
            throw new java.security.GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        } else {
            StringBuilder v0_1 = this.zze().zzd();
            com.google.android.gms.internal.firebase-auth-api.zzcm.zzb(v0_1);
            int v1_0 = 0;
            while (v1_0 < this.zza()) {
                if ((com.google.android.gms.internal.firebase-auth-api.zzbs.zzf(((com.google.android.gms.internal.firebase-auth-api.zzbs) this.zza.get(v1_0)))) || (!com.google.android.gms.internal.firebase-auth-api.zzbm.zza(com.google.android.gms.internal.firebase-auth-api.zzbs.zzc(((com.google.android.gms.internal.firebase-auth-api.zzbs) this.zza.get(v1_0)))))) {
                    String v4_6 = v0_1.zza(v1_0).zzb().zzf();
                    StringBuilder v0_4 = new StringBuilder("Key parsing of key with index ");
                    v0_4.append(v1_0);
                    v0_4.append(" and type_url ");
                    v0_4.append(v4_6);
                    v0_4.append(" failed, unable to get primitive");
                    throw new java.security.GeneralSecurityException(v0_4.toString());
                } else {
                    v1_0++;
                }
            }
            return ((com.google.android.gms.internal.firebase-auth-api.zznp) p4).zza(this.zze(), this.zzb, p5);
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzby p6)
    {
        String v0_0 = this.zzd();
        String v1_3 = v0_0.zze().iterator();
        while (v1_3.hasNext()) {
            String v2_1 = ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb) v1_3.next());
            if ((v2_1.zzb().zzb() == com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zza) || ((v2_1.zzb().zzb() == com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb) || (v2_1.zzb().zzb() == com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzc))) {
                throw new java.security.GeneralSecurityException(g2.g.f("keyset contains key material of type ", v2_1.zzb().zzb().name(), " for type url ", v2_1.zzb().zzf()));
            }
        }
        p6.zza(v0_0);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzby p3, com.google.android.gms.internal.firebase-auth-api.zzba p4, byte[] p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzxh v0 = this.zzd();
        p3.zza(((com.google.android.gms.internal.firebase-auth-api.zzvv) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzvv.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p4.zzb(v0.zzk(), p5))).zza(com.google.android.gms.internal.firebase-auth-api.zzcm.zza(v0)).zze())));
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbm zzb()
    {
        String v2_0 = this.zzd();
        com.google.android.gms.internal.firebase-auth-api.zzok v3_1 = com.google.android.gms.internal.firebase-auth-api.zzxh.zzc();
        java.util.ArrayList v4_1 = new java.util.ArrayList(this.zza.size());
        java.util.Iterator v5 = this.zza.iterator();
        int v7 = 0;
        while (v5.hasNext()) {
            com.google.android.gms.internal.firebase-auth-api.zzxh$zzb v0_1;
            com.google.android.gms.internal.firebase-auth-api.zzbs v9_0;
            int v8_2 = ((com.google.android.gms.internal.firebase-auth-api.zzbs) v5.next());
            if (!(v8_2.zzb() instanceof com.google.android.gms.internal.firebase-auth-api.zzce)) {
                com.google.android.gms.internal.firebase-auth-api.zzxh$zzb v0_13 = v2_0.zza(v7);
                com.google.android.gms.internal.firebase-auth-api.zzbs v9_2 = v0_13.zzb();
                if (v9_2.zzb() != com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzc) {
                    throw new java.security.GeneralSecurityException("The keyset contains a non-private key");
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzbs v9_6 = ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) ((com.google.android.gms.internal.firebase-auth-api.zzxh$zzb$zza) v0_13.zzn()).zza(com.google.android.gms.internal.firebase-auth-api.zzci.zza(v9_2.zzf(), v9_2.zze())).zze()));
                    try {
                        com.google.android.gms.internal.firebase-auth-api.zzxh$zzb v0_22 = com.google.android.gms.internal.firebase-auth-api.zzbm.zza(v9_6);
                        int v18 = 0;
                    } catch (com.google.android.gms.internal.firebase-auth-api.zzxh$zzb v0_23) {
                        if (com.google.android.gms.internal.firebase-auth-api.zziu.zza.zza()) {
                            throw v0_23;
                        } else {
                            v0_22 = new com.google.android.gms.internal.firebase-auth-api.zzof(com.google.android.gms.internal.firebase-auth-api.zzbm.zzb(v9_6), com.google.android.gms.internal.firebase-auth-api.zzch.zza());
                            v18 = 1;
                        }
                    }
                    int v17;
                    java.security.GeneralSecurityException v14_1 = v0_22;
                    com.google.android.gms.internal.firebase-auth-api.zzxh$zzb v0_26 = v9_6.zza();
                    com.google.android.gms.internal.firebase-auth-api.zzxc v15_1 = com.google.android.gms.internal.firebase-auth-api.zzbs.zzc(v8_2);
                    if (v0_26 != v2_0.zzb()) {
                        v17 = 0;
                    } else {
                        v17 = 1;
                    }
                    v0_1 = v9_6;
                    v9_0 = new com.google.android.gms.internal.firebase-auth-api.zzbs(v14_1, v15_1, v0_26, v17, v18, com.google.android.gms.internal.firebase-auth-api.zzbs.zzd(), 0);
                }
            } else {
                int v10_0 = ((com.google.android.gms.internal.firebase-auth-api.zzce) v8_2.zzb()).zzc();
                v9_0 = new com.google.android.gms.internal.firebase-auth-api.zzbs(v10_0, com.google.android.gms.internal.firebase-auth-api.zzbs.zzc(v8_2), v8_2.zza(), v8_2.zze(), 0, com.google.android.gms.internal.firebase-auth-api.zzbs.zzd(), 0);
                v0_1 = com.google.android.gms.internal.firebase-auth-api.zzbm.zzb(v10_0, com.google.android.gms.internal.firebase-auth-api.zzbs.zzc(v8_2), v8_2.zza());
            }
            v3_1.zza(v0_1);
            v4_1.add(v9_0);
            v7++;
        }
        v3_1.zza(v2_0.zzb());
        return com.google.android.gms.internal.firebase-auth-api.zzbm.zzb(new com.google.android.gms.internal.firebase-auth-api.zzbm(((com.google.android.gms.internal.firebase-auth-api.zzxh) ((com.google.android.gms.internal.firebase-auth-api.zzalf) this)), v4_1, this.zzb));
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzoa zzc()
    {
        IllegalStateException v0_2 = this.zza.iterator();
        while (v0_2.hasNext()) {
            String v1_1 = ((com.google.android.gms.internal.firebase-auth-api.zzbs) v0_2.next());
            if ((v1_1 != null) && (v1_1.zze())) {
                if (v1_1.zzc() != com.google.android.gms.internal.firebase-auth-api.zzbk.zza) {
                    throw new IllegalStateException("Keyset has primary which isn\'t enabled");
                } else {
                    return v1_1;
                }
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxh zzd()
    {
        com.google.android.gms.internal.firebase-auth-api.zzxh v0_0 = com.google.android.gms.internal.firebase-auth-api.zzxh.zzc();
        com.google.android.gms.internal.firebase-auth-api.zzql v1_3 = this.zza.iterator();
        while (v1_3.hasNext()) {
            int v2_1 = ((com.google.android.gms.internal.firebase-auth-api.zzbs) v1_3.next());
            v0_0.zza(com.google.android.gms.internal.firebase-auth-api.zzbm.zzb(v2_1.zzb(), com.google.android.gms.internal.firebase-auth-api.zzbs.zzc(v2_1), v2_1.zza()));
            if (v2_1.zze()) {
                v0_0.zza(v2_1.zza());
            }
        }
        return ((com.google.android.gms.internal.firebase-auth-api.zzxh) ((com.google.android.gms.internal.firebase-auth-api.zzalf) v0_0.zze()));
    }
}
