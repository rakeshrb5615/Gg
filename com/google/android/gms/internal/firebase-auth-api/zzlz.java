package com.google.android.gms.internal.firebase-auth-api;
final class zzlz implements com.google.android.gms.internal.firebase-auth-api.zzmc {
    private final String zza;

    public zzlz(String p1)
    {
        this.zza = p1;
        return;
    }

    private final byte[] zza(byte[] p4, byte[] p5)
    {
        javax.crypto.Mac v0_2 = ((javax.crypto.Mac) com.google.android.gms.internal.firebase-auth-api.zzzj.zzb.zza(this.zza));
        if ((p5 != null) && (p5.length != 0)) {
            v0_2.init(new javax.crypto.spec.SecretKeySpec(p5, this.zza));
        } else {
            javax.crypto.spec.SecretKeySpec v1_3 = new byte[v0_2.getMacLength()];
            v0_2.init(new javax.crypto.spec.SecretKeySpec(v1_3, this.zza));
        }
        return v0_2.doFinal(p4);
    }

    private final byte[] zza(byte[] p7, byte[] p8, int p9)
    {
        javax.crypto.Mac v0_2 = ((javax.crypto.Mac) com.google.android.gms.internal.firebase-auth-api.zzzj.zzb.zza(this.zza));
        if (p9 > (v0_2.getMacLength() * 255)) {
            throw new java.security.GeneralSecurityException("size too large");
        } else {
            byte[] v1_1 = new byte[p9];
            v0_2.init(new javax.crypto.spec.SecretKeySpec(p7, this.zza));
            byte[] v2_2 = new byte[0];
            int v3_1 = 1;
            int v4 = 0;
            while(true) {
                v0_2.update(v2_2);
                v0_2.update(p8);
                v0_2.update(((byte) v3_1));
                v2_2 = v0_2.doFinal();
                if ((v2_2.length + v4) >= p9) {
                    break;
                }
                System.arraycopy(v2_2, 0, v1_1, v4, v2_2.length);
                v4 += v2_2.length;
                v3_1++;
            }
            System.arraycopy(v2_2, 0, v1_1, v4, (p9 - v4));
            return v1_1;
        }
    }

    public final int zza()
    {
        return javax.crypto.Mac.getInstance(this.zza).getMacLength();
    }

    public final byte[] zza(byte[] p1, byte[] p2, String p3, byte[] p4)
    {
        return this.zza(com.google.android.gms.internal.firebase-auth-api.zzmk.zza(p3, p2, p4), p1);
    }

    public final byte[] zza(byte[] p1, byte[] p2, String p3, byte[] p4, int p5)
    {
        return this.zza(p1, com.google.android.gms.internal.firebase-auth-api.zzmk.zza(p3, p2, p4, p5), p5);
    }

    public final byte[] zza(byte[] p1, byte[] p2, String p3, byte[] p4, String p5, byte[] p6, int p7)
    {
        return this.zza(this.zza(com.google.android.gms.internal.firebase-auth-api.zzmk.zza(p3, p2, p6), 0), com.google.android.gms.internal.firebase-auth-api.zzmk.zza(p5, p4, p6, p7), p7);
    }

    public final byte[] zzb()
    {
        byte[] v0_0 = this.zza;
        v0_0.getClass();
        int v2 = -1;
        switch (v0_0.hashCode()) {
            case 984523022:
                if (v0_0.equals("HmacSha256")) {
                    v2 = 0;
                } else {
                }
                break;
            case 984524074:
                if (v0_0.equals("HmacSha384")) {
                    v2 = 1;
                } else {
                }
                break;
            case 984525777:
                if (v0_0.equals("HmacSha512")) {
                    v2 = 2;
                } else {
                }
                break;
            default:
        }
        switch (v2) {
            case 0:
                return com.google.android.gms.internal.firebase-auth-api.zzmk.zzf;
            case 1:
                return com.google.android.gms.internal.firebase-auth-api.zzmk.zzg;
            case 2:
                return com.google.android.gms.internal.firebase-auth-api.zzmk.zzh;
            default:
                throw new java.security.GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }
}
