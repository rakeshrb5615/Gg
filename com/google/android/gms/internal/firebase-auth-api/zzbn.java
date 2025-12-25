package com.google.android.gms.internal.firebase-auth-api;
public final class zzbn {
    private final java.util.List zza;
    private com.google.android.gms.internal.firebase-auth-api.zzok zzb;
    private boolean zzc;

    public zzbn()
    {
        this.zza = new java.util.ArrayList();
        this.zzb = com.google.android.gms.internal.firebase-auth-api.zzok.zza;
        this.zzc = 0;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzbn p0)
    {
        p0.zzb();
        return;
    }

    private final void zzb()
    {
        java.util.Iterator v0_1 = this.zza.iterator();
        while (v0_1.hasNext()) {
            com.google.android.gms.internal.firebase-auth-api.zzbq.zza(((com.google.android.gms.internal.firebase-auth-api.zzbq) v0_1.next()), 0);
        }
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbm zza()
    {
        if (this.zzc) {
            throw new java.security.GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        } else {
            this.zzc = 1;
            String v2_0 = com.google.android.gms.internal.firebase-auth-api.zzxh.zzc();
            String v3_1 = new java.util.ArrayList(this.zza.size());
            com.google.android.gms.internal.firebase-auth-api.zzok v4_2 = this.zza;
            int v6_0 = 0;
            while (v6_0 < (v4_2.size() - 1)) {
                if ((com.google.android.gms.internal.firebase-auth-api.zzbq.zzb(((com.google.android.gms.internal.firebase-auth-api.zzbq) v4_2.get(v6_0))) == com.google.android.gms.internal.firebase-auth-api.zzbp.zza()) && (com.google.android.gms.internal.firebase-auth-api.zzbq.zzb(((com.google.android.gms.internal.firebase-auth-api.zzbq) v4_2.get((v6_0 + 1)))) != com.google.android.gms.internal.firebase-auth-api.zzbp.zza())) {
                    throw new java.security.GeneralSecurityException("Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'.");
                } else {
                    v6_0++;
                }
            }
            java.security.GeneralSecurityException v1_8 = new java.util.HashSet();
            com.google.android.gms.internal.firebase-auth-api.zzok v4_4 = this.zza.iterator();
            Integer v7_0 = 0;
            while (v4_4.hasNext()) {
                com.google.android.gms.internal.firebase-auth-api.zzbk v8_5 = ((com.google.android.gms.internal.firebase-auth-api.zzbq) v4_4.next());
                if (com.google.android.gms.internal.firebase-auth-api.zzbq.zza(v8_5) == null) {
                    throw new java.security.GeneralSecurityException("Key Status not set.");
                } else {
                    if (com.google.android.gms.internal.firebase-auth-api.zzbq.zzb(v8_5) == null) {
                        throw new java.security.GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzbk v9_9;
                        if (com.google.android.gms.internal.firebase-auth-api.zzbq.zzb(v8_5) != com.google.android.gms.internal.firebase-auth-api.zzbp.zza()) {
                            v9_9 = com.google.android.gms.internal.firebase-auth-api.zzbp.zza(com.google.android.gms.internal.firebase-auth-api.zzbq.zzb(v8_5));
                        } else {
                            v9_9 = 0;
                            while ((v9_9 == null) || (v1_8.contains(Integer.valueOf(v9_9)))) {
                                v9_9 = com.google.android.gms.internal.firebase-auth-api.zzqn.zza();
                            }
                        }
                        int v13 = v9_9;
                        if (v1_8.contains(Integer.valueOf(v13))) {
                            throw new java.security.GeneralSecurityException(v1.a.j("Id ", v13, " is used twice in the keyset"));
                        } else {
                            com.google.android.gms.internal.firebase-auth-api.zzbk v9_2;
                            v1_8.add(Integer.valueOf(v13));
                            if (!com.google.android.gms.internal.firebase-auth-api.zzbq.zzd(v8_5).zza()) {
                                v9_2 = 0;
                            } else {
                                v9_2 = Integer.valueOf(v13);
                            }
                            com.google.android.gms.internal.firebase-auth-api.zzbi v11_1 = com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzbq.zzd(v8_5), v9_2);
                            com.google.android.gms.internal.firebase-auth-api.zzbs v10_2 = new com.google.android.gms.internal.firebase-auth-api.zzbs(v11_1, com.google.android.gms.internal.firebase-auth-api.zzbm.zza(com.google.android.gms.internal.firebase-auth-api.zzbq.zza(v8_5)), v13, com.google.android.gms.internal.firebase-auth-api.zzbq.zze(v8_5), 0, com.google.android.gms.internal.firebase-auth-api.zzbs.zzd(), 0);
                            v2_0.zza(com.google.android.gms.internal.firebase-auth-api.zzbm.zza(v11_1, com.google.android.gms.internal.firebase-auth-api.zzbm.zza(com.google.android.gms.internal.firebase-auth-api.zzbq.zza(v8_5)), v13));
                            if (com.google.android.gms.internal.firebase-auth-api.zzbq.zze(v8_5)) {
                                if (v7_0 != null) {
                                    throw new java.security.GeneralSecurityException("Two primaries were set");
                                } else {
                                    v7_0 = Integer.valueOf(v13);
                                    if (com.google.android.gms.internal.firebase-auth-api.zzbq.zza(v8_5) != com.google.android.gms.internal.firebase-auth-api.zzbk.zza) {
                                        throw new java.security.GeneralSecurityException("Primary key is not enabled");
                                    }
                                }
                            }
                            v3_1.add(v10_2);
                        }
                    }
                }
            }
            if (v7_0 == null) {
                throw new java.security.GeneralSecurityException("No primary was set");
            } else {
                v2_0.zza(v7_0.intValue());
                java.security.GeneralSecurityException v1_15 = ((com.google.android.gms.internal.firebase-auth-api.zzxh) ((com.google.android.gms.internal.firebase-auth-api.zzalf) v2_0.zze()));
                com.google.android.gms.internal.firebase-auth-api.zzbm.zzb(v1_15);
                return com.google.android.gms.internal.firebase-auth-api.zzbm.zza(new com.google.android.gms.internal.firebase-auth-api.zzbm(v1_15, v3_1, this.zzb, 0));
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbn zza(com.google.android.gms.internal.firebase-auth-api.zzbq p2)
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzbq.zzc(p2) != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        } else {
            if (com.google.android.gms.internal.firebase-auth-api.zzbq.zze(p2)) {
                this.zzb();
            }
            com.google.android.gms.internal.firebase-auth-api.zzbq.zza(p2, this);
            this.zza.add(p2);
            return this;
        }
    }
}
