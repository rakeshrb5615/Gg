package com.google.android.gms.internal.auth;
final class zzco implements com.google.android.gms.internal.auth.zzcl {
    private static com.google.android.gms.internal.auth.zzco zza;
    private final android.content.Context zzb;
    private final android.database.ContentObserver zzc;

    private zzco()
    {
        this.zzb = 0;
        this.zzc = 0;
        return;
    }

    private zzco(android.content.Context p4)
    {
        this.zzb = p4;
        com.google.android.gms.internal.auth.zzcn v0_1 = new com.google.android.gms.internal.auth.zzcn(this, 0);
        this.zzc = v0_1;
        p4.getContentResolver().registerContentObserver(com.google.android.gms.internal.auth.zzcb.zza, 1, v0_1);
        return;
    }

    public static com.google.android.gms.internal.auth.zzco zza(android.content.Context p2)
    {
        if (com.google.android.gms.internal.auth.zzco.zza == null) {
            com.google.android.gms.internal.auth.zzco v1_1;
            if (a.a.k(p2, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
                v1_1 = new com.google.android.gms.internal.auth.zzco();
            } else {
                v1_1 = new com.google.android.gms.internal.auth.zzco(p2);
            }
            com.google.android.gms.internal.auth.zzco.zza = v1_1;
        }
        return com.google.android.gms.internal.auth.zzco.zza;
    }

    public static declared_synchronized void zze()
    {
        android.content.ContentResolver v1_0 = com.google.android.gms.internal.auth.zzco.zza;
        if (v1_0 != null) {
            android.database.ContentObserver v2_1 = v1_0.zzb;
            if ((v2_1 != null) && (v1_0.zzc != null)) {
                v2_1.getContentResolver().unregisterContentObserver(com.google.android.gms.internal.auth.zzco.zza.zzc);
            }
        }
        com.google.android.gms.internal.auth.zzco.zza = 0;
        return;
    }

    public final bridge synthetic Object zzb(String p1)
    {
        return this.zzc(p1);
    }

    public final String zzc(String p4)
    {
        NullPointerException v0_0 = this.zzb;
        if ((v0_0 != null) && (!com.google.android.gms.internal.auth.zzcc.zza(v0_0))) {
            try {
                return ((String) com.google.android.gms.internal.auth.zzcj.zza(new com.google.android.gms.internal.auth.zzcm(this, p4)));
            } catch (NullPointerException v0_2) {
                android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(p4)), v0_2);
            } catch (NullPointerException v0_2) {
            } catch (NullPointerException v0_2) {
            }
        }
        return 0;
    }

    public final synthetic String zzd(String p3)
    {
        return com.google.android.gms.internal.auth.zzcb.zza(this.zzb.getContentResolver(), p3, 0);
    }
}
