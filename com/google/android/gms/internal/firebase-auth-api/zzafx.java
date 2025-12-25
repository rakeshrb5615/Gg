package com.google.android.gms.internal.firebase-auth-api;
public final class zzafx {
    private final String zza;
    private final String zzb;

    public zzafx(android.content.Context p2)
    {
        this(p2, p2.getPackageName());
        return;
    }

    private zzafx(android.content.Context p4, String p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        String v1_2 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        this.zza = v1_2;
        try {
            String v4_8 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(p4, v1_2);
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            String v4_2 = new StringBuilder("no pkg: ");
            v4_2.append(p5);
            android.util.Log.e("FBA-PackageInfo", v4_2.toString());
            this.zzb = 0;
            return;
        }
        if (v4_8 != null) {
            this.zzb = com.google.android.gms.common.util.Hex.bytesToStringUppercase(v4_8, 0);
            return;
        } else {
            String v4_6 = new StringBuilder("single cert required: ");
            v4_6.append(p5);
            android.util.Log.e("FBA-PackageInfo", v4_6.toString());
            this.zzb = 0;
            return;
        }
    }

    public final String zza()
    {
        return this.zzb;
    }

    public final String zzb()
    {
        return this.zza;
    }
}
