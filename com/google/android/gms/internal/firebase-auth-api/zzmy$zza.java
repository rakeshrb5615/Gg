package com.google.android.gms.internal.firebase-auth-api;
public final class zzmy$zza {
    private android.content.Context zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private com.google.android.gms.internal.firebase-auth-api.zzba zze;
    private boolean zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzbj zzg;
    private com.google.android.gms.internal.firebase-auth-api.zzxb zzh;
    private com.google.android.gms.internal.firebase-auth-api.zzbw zzi;

    public zzmy$zza()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 1;
        this.zzg = 0;
        this.zzh = 0;
        return;
    }

    public static bridge synthetic android.content.Context zza(com.google.android.gms.internal.firebase-auth-api.zzmy$zza p0)
    {
        return p0.zza;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzbw zza(byte[] p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzbw.zza(com.google.android.gms.internal.firebase-auth-api.zzbz.zza(com.google.android.gms.internal.firebase-auth-api.zzaz.zza(p1), com.google.android.gms.internal.firebase-auth-api.zzbf.zza()));
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzba zzb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzmy.zzd();
        java.security.ProviderException v1_2 = new com.google.android.gms.internal.firebase-auth-api.zznd();
        try {
            String v3_4 = com.google.android.gms.internal.firebase-auth-api.zznd.zzc(this.zzd);
            try {
                java.security.KeyStoreException v0_1 = v1_2.zza(this.zzd);
                return v0_1;
            } catch (java.security.ProviderException v1_0) {
                if (v3_4 == null) {
                    throw new java.security.KeyStoreException(v1.a.l("the master key ", this.zzd, " exists but is unusable"), v1_0);
                } else {
                    android.util.Log.w(com.google.android.gms.internal.firebase-auth-api.zzmy.zzc(), v0_1, v1_0);
                    return 0;
                }
            } catch (java.security.ProviderException v1_0) {
            }
        } catch (java.security.ProviderException v1_3) {
            android.util.Log.w(com.google.android.gms.internal.firebase-auth-api.zzmy.zzc(), "cannot use Android Keystore, it\'ll be disabled", v1_3);
            return 0;
        } catch (java.security.ProviderException v1_3) {
            android.util.Log.w(com.google.android.gms.internal.firebase-auth-api.zzmy.zzc(), "cannot use Android Keystore, it\'ll be disabled", v1_3);
            return 0;
        }
        v0_1 = v1_2.zza(this.zzd);
        return v0_1;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzbw zzb(com.google.android.gms.internal.firebase-auth-api.zzmy$zza p0)
    {
        return p0.zzi;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzbw zzb(byte[] p4)
    {
        try {
            this.zze = new com.google.android.gms.internal.firebase-auth-api.zznd().zza(this.zzd);
            try {
                java.security.GeneralSecurityException v0_2 = new byte[0];
                com.google.android.gms.internal.firebase-auth-api.zzbw v4_2 = com.google.android.gms.internal.firebase-auth-api.zzbw.zza(com.google.android.gms.internal.firebase-auth-api.zzbm.zza(com.google.android.gms.internal.firebase-auth-api.zzaz.zza(p4), this.zze, v0_2));
                return v4_2;
            } catch (java.security.GeneralSecurityException v0_4) {
                try {
                    return com.google.android.gms.internal.firebase-auth-api.zzmy$zza.zza(v4_2);
                } catch (java.io.IOException) {
                    throw v0_4;
                }
            } catch (java.security.GeneralSecurityException v0_4) {
            }
        } catch (java.security.GeneralSecurityException v0_7) {
            try {
                com.google.android.gms.internal.firebase-auth-api.zzbw v4_1 = com.google.android.gms.internal.firebase-auth-api.zzmy$zza.zza(p4);
                android.util.Log.w(com.google.android.gms.internal.firebase-auth-api.zzmy.zzc(), "cannot use Android Keystore, it\'ll be disabled", v0_7);
                return v4_1;
            } catch (java.io.IOException) {
                throw v0_7;
            }
        } catch (java.security.GeneralSecurityException v0_7) {
        }
        v0_2 = new byte[0];
        v4_2 = com.google.android.gms.internal.firebase-auth-api.zzbw.zza(com.google.android.gms.internal.firebase-auth-api.zzbm.zza(com.google.android.gms.internal.firebase-auth-api.zzaz.zza(p4), this.zze, v0_2));
        return v4_2;
    }

    private static byte[] zzb(android.content.Context p1, String p2, String p3)
    {
        if (p2 == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        } else {
            byte[] v1_2;
            byte[] v1_8 = p1.getApplicationContext();
            if (p3 != null) {
                v1_2 = v1_8.getSharedPreferences(p3, 0);
            } else {
                v1_2 = android.preference.PreferenceManager.getDefaultSharedPreferences(v1_8);
            }
            try {
                byte[] v1_3 = v1_2.getString(p2, 0);
            } catch (IllegalArgumentException) {
                throw new java.io.CharConversionException(v1.a.l("can\'t read keyset; the pref value ", p2, " is not a valid hex string"));
            }
            if (v1_3 != null) {
                return com.google.android.gms.internal.firebase-auth-api.zzzx.zza(v1_3);
            } else {
                return 0;
            }
        }
    }

    public static bridge synthetic String zzc(com.google.android.gms.internal.firebase-auth-api.zzmy$zza p0)
    {
        return p0.zzb;
    }

    public static bridge synthetic String zzd(com.google.android.gms.internal.firebase-auth-api.zzmy$zza p0)
    {
        return p0.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzmy$zza zza(android.content.Context p1, String p2, String p3)
    {
        if (p1 == null) {
            throw new IllegalArgumentException("need an Android context");
        } else {
            this.zza = p1;
            this.zzb = p2;
            this.zzc = p3;
            return this;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzmy$zza zza(com.google.android.gms.internal.firebase-auth-api.zzxb p1)
    {
        this.zzh = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzmy$zza zza(String p2)
    {
        if (!p2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        } else {
            if (!this.zzf) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            } else {
                this.zzd = p2;
                return this;
            }
        }
    }

    public final declared_synchronized com.google.android.gms.internal.firebase-auth-api.zzmy zza()
    {
        if (this.zzb == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzbj v0_7 = this.zzh;
            if ((v0_7 != null) && (this.zzg == null)) {
                this.zzg = com.google.android.gms.internal.firebase-auth-api.zzbj.zza(com.google.android.gms.internal.firebase-auth-api.zzcj.zza(v0_7.zzk()));
            }
            com.google.android.gms.internal.firebase-auth-api.zzmy.zzb();
            com.google.android.gms.internal.firebase-auth-api.zzmy v1_1 = com.google.android.gms.internal.firebase-auth-api.zzmy$zza.zzb(this.zza, this.zzb, this.zzc);
            if (v1_1 != null) {
                if (this.zzd == null) {
                    this.zzi = com.google.android.gms.internal.firebase-auth-api.zzmy$zza.zza(v1_1);
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzmy.zzd();
                    this.zzi = this.zzb(v1_1);
                }
            } else {
                if (this.zzd != null) {
                    this.zze = this.zzb();
                }
                com.google.android.gms.internal.firebase-auth-api.zzmy v1_7 = this.zzg;
                if (v1_7 == null) {
                    throw new java.security.GeneralSecurityException("cannot read or generate keyset");
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzmy v1_10 = com.google.android.gms.internal.firebase-auth-api.zzbm.zza(v1_7);
                    com.google.android.gms.internal.firebase-auth-api.zzmy.zza(v1_10, new com.google.android.gms.internal.firebase-auth-api.zznf(this.zza, this.zzb, this.zzc), this.zze);
                    this.zzi = com.google.android.gms.internal.firebase-auth-api.zzbw.zza(v1_10);
                }
            }
            return new com.google.android.gms.internal.firebase-auth-api.zzmy(this, 0);
        }
    }
}
