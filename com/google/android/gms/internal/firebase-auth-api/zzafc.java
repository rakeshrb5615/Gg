package com.google.android.gms.internal.firebase-auth-api;
public final class zzafc {
    private final int zza;

    private zzafc(String p1)
    {
        this.zza = com.google.android.gms.internal.firebase-auth-api.zzafc.zza(p1);
        return;
    }

    private static int zza(String p5)
    {
        String v1_5 = com.google.android.gms.internal.firebase-auth-api.zzt.zza("[.-]").zza(p5);
        if (v1_5.size() != 1) {
            if (v1_5.size() < 3) {
                return -1;
            } else {
                return (((Integer.parseInt(((String) v1_5.get(1))) * 1000) + (Integer.parseInt(((String) v1_5.get(0))) * 1000000)) + Integer.parseInt(((String) v1_5.get(2))));
            }
        } else {
            p5 = Integer.parseInt(p5);
            return p5;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzafc zza()
    {
        String v1_0 = com.google.android.gms.common.internal.LibraryVersion.getInstance().getVersion("firebase-auth");
        if ((android.text.TextUtils.isEmpty(v1_0)) || (v1_0.equals("UNKNOWN"))) {
            v1_0 = "-1";
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzafc(v1_0);
    }

    public final String zzb()
    {
        return g2.g.l("X", Integer.toString(this.zza));
    }
}
