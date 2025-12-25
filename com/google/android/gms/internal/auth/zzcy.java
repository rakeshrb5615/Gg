package com.google.android.gms.internal.auth;
final class zzcy extends com.google.android.gms.internal.auth.zzdc {
    final synthetic com.google.android.gms.internal.auth.zzhu zza;

    public zzcy(com.google.android.gms.internal.auth.zzcz p1, String p2, Object p3, boolean p4, com.google.android.gms.internal.auth.zzhu p5, byte[] p6)
    {
        this.zza = p5;
        super(p1, "getTokenRefactor__blocked_packages", p3, 1, 0);
        return;
    }

    public final Object zza(Object p4)
    {
        try {
            int v4_4 = com.google.android.gms.internal.auth.zzhr.zzk(android.util.Base64.decode(((String) p4), 3));
            return v4_4;
        } catch (IllegalArgumentException) {
            String v0_2 = v1.a.q("Invalid byte[] value for ", this.zzc(), ": ");
            v0_2.append(((String) v4_4));
            android.util.Log.e("PhenotypeFlag", v0_2.toString());
            return 0;
        }
    }
}
