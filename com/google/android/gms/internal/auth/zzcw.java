package com.google.android.gms.internal.auth;
final class zzcw extends com.google.android.gms.internal.auth.zzdc {

    public zzcw(com.google.android.gms.internal.auth.zzcz p7, String p8, Boolean p9, boolean p10)
    {
        super(p7, p8, p9, 1, 0);
        return;
    }

    public final bridge synthetic Object zza(Object p4)
    {
        if (!com.google.android.gms.internal.auth.zzcb.zzc.matcher(p4).matches()) {
            if (!com.google.android.gms.internal.auth.zzcb.zzd.matcher(p4).matches()) {
                String v0_3 = v1.a.q("Invalid boolean value for ", this.zzc(), ": ");
                v0_3.append(((String) p4));
                android.util.Log.e("PhenotypeFlag", v0_3.toString());
                return 0;
            } else {
                return Boolean.FALSE;
            }
        } else {
            return Boolean.TRUE;
        }
    }
}
