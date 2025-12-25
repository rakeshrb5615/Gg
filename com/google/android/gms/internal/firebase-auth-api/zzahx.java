package com.google.android.gms.internal.firebase-auth-api;
public final class zzahx {

    public static long zza(String p4)
    {
        Long v4_1 = com.google.android.gms.internal.firebase-auth-api.zzahx.zzb(p4);
        return (v4_1.zza().longValue() - v4_1.zzb().longValue());
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzahw zzb(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        RuntimeException v0_8 = com.google.android.gms.internal.firebase-auth-api.zzt.zza(46).zza(p3);
        if (v0_8.size() < 2) {
            throw new RuntimeException(g2.g.l("Invalid idToken ", p3));
        } else {
            try {
                return com.google.android.gms.internal.firebase-auth-api.zzahw.zza(new String(com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(((String) v0_8.get(1))), "UTF-8"));
            } catch (java.io.UnsupportedEncodingException v3_7) {
                throw new RuntimeException("Unable to decode token", v3_7);
            }
        }
    }
}
