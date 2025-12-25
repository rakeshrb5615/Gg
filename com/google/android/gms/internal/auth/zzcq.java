package com.google.android.gms.internal.auth;
public final class zzcq {
    static volatile com.google.android.gms.internal.auth.zzdh zza;
    private static final Object zzb;

    static zzcq()
    {
        com.google.android.gms.internal.auth.zzcq.zza = com.google.android.gms.internal.auth.zzdh.zzc();
        com.google.android.gms.internal.auth.zzcq.zzb = new Object();
        return;
    }

    public static boolean zza(android.content.Context p5, android.net.Uri p6)
    {
        Object v6_1 = p6.getAuthority();
        int v1 = 0;
        if ("com.google.android.gms.phenotype".equals(v6_1)) {
            if (!com.google.android.gms.internal.auth.zzcq.zza.zzb()) {
                if (!com.google.android.gms.internal.auth.zzcq.zza.zzb()) {
                    try {
                        if (!"com.google.android.gms".equals(p5.getPackageName())) {
                            int v3_1;
                            boolean v0_5 = p5.getPackageManager();
                            if (android.os.Build$VERSION.SDK_INT >= 29) {
                                v3_1 = 268435456;
                            } else {
                                v3_1 = 0;
                            }
                            boolean v0_6 = v0_5.resolveContentProvider("com.google.android.gms.phenotype", v3_1);
                            if (v0_6) {
                                if ("com.google.android.gms".equals(v0_6.packageName)) {
                                    if ((p5.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                        v1 = 1;
                                    }
                                } else {
                                }
                            }
                        } else {
                        }
                    } catch (android.content.pm.PackageManager$NameNotFoundException) {
                    }
                    com.google.android.gms.internal.auth.zzcq.zza = com.google.android.gms.internal.auth.zzdh.zzd(Boolean.valueOf(v1));
                    return ((Boolean) com.google.android.gms.internal.auth.zzcq.zza.zza()).booleanValue();
                } else {
                    return ((Boolean) com.google.android.gms.internal.auth.zzcq.zza.zza()).booleanValue();
                }
            } else {
                return ((Boolean) com.google.android.gms.internal.auth.zzcq.zza.zza()).booleanValue();
            }
        } else {
            android.util.Log.e("PhenotypeClientHelper", String.valueOf(v6_1).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return 0;
        }
    }
}
