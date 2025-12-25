package com.google.android.gms.internal.firebase-auth-api;
public final class zzzd {
    private java.security.interfaces.ECPrivateKey zza;

    public zzzd(java.security.interfaces.ECPrivateKey p1)
    {
        this.zza = p1;
        return;
    }

    public final byte[] zza(byte[] p4, String p5, byte[] p6, byte[] p7, int p8, com.google.android.gms.internal.firebase-auth-api.zzzh p9)
    {
        int v4_1 = com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {p4, com.google.android.gms.internal.firebase-auth-api.zzzf.zza(this.zza, com.google.android.gms.internal.firebase-auth-api.zzzf.zza(this.zza.getParams(), p9, p4))}));
        javax.crypto.Mac v9_3 = ((javax.crypto.Mac) com.google.android.gms.internal.firebase-auth-api.zzzj.zzb.zza(p5));
        if (p8 > (v9_3.getMacLength() * 255)) {
            throw new java.security.GeneralSecurityException("size too large");
        } else {
            if ((p6 != null) && (p6.length != 0)) {
                v9_3.init(new javax.crypto.spec.SecretKeySpec(p6, p5));
            } else {
                int v0_8 = new byte[v9_3.getMacLength()];
                v9_3.init(new javax.crypto.spec.SecretKeySpec(v0_8, p5));
            }
            byte[] v6_3 = new byte[p8];
            v9_3.init(new javax.crypto.spec.SecretKeySpec(v9_3.doFinal(v4_1), p5));
            byte[] v5_2 = new byte[0];
            int v0_11 = 1;
            int v1 = 0;
            while(true) {
                v9_3.update(v5_2);
                v9_3.update(p7);
                v9_3.update(((byte) v0_11));
                v5_2 = v9_3.doFinal();
                if ((v5_2.length + v1) >= p8) {
                    break;
                }
                System.arraycopy(v5_2, 0, v6_3, v1, v5_2.length);
                v1 += v5_2.length;
                v0_11++;
            }
            System.arraycopy(v5_2, 0, v6_3, v1, (p8 - v1));
            return v6_3;
        }
    }
}
