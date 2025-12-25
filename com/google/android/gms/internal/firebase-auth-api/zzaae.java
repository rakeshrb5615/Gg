package com.google.android.gms.internal.firebase-auth-api;
public final class zzaae implements com.google.android.gms.internal.firebase-auth-api.zzsq {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private final ThreadLocal zzb;
    private final String zzc;
    private final java.security.Key zzd;
    private final int zze;

    static zzaae()
    {
        com.google.android.gms.internal.firebase-auth-api.zzaae.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zzb;
        return;
    }

    public zzaae(String p3, java.security.Key p4)
    {
        String v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzaad(this);
        this.zzb = v0_1;
        if (!com.google.android.gms.internal.firebase-auth-api.zzaae.zza.zza()) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        } else {
            this.zzc = p3;
            this.zzd = p4;
            if (p4.getEncoded().length < 16) {
                throw new java.security.InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
            } else {
                p3.getClass();
                int v1_1 = -1;
                switch (p3.hashCode()) {
                    case -1823053428:
                        if (p3.equals("HMACSHA1")) {
                            v1_1 = 0;
                        } else {
                        }
                        break;
                    case 392315023:
                        if (p3.equals("HMACSHA224")) {
                            v1_1 = 1;
                        } else {
                        }
                        break;
                    case 392315118:
                        if (p3.equals("HMACSHA256")) {
                            v1_1 = 2;
                        } else {
                        }
                        break;
                    case 392316170:
                        if (p3.equals("HMACSHA384")) {
                            v1_1 = 3;
                        } else {
                        }
                        break;
                    case 392317873:
                        if (p3.equals("HMACSHA512")) {
                            v1_1 = 4;
                        } else {
                        }
                        break;
                    default:
                }
                switch (v1_1) {
                    case 0:
                        this.zze = 20;
                        break;
                    case 1:
                        this.zze = 28;
                        break;
                    case 2:
                        this.zze = 32;
                        break;
                    case 3:
                        this.zze = 48;
                        break;
                    case 4:
                        this.zze = 64;
                        break;
                    default:
                        throw new java.security.NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(p3));
                }
                v0_1.get();
                return;
            }
        }
    }

    public static bridge synthetic String zza(com.google.android.gms.internal.firebase-auth-api.zzaae p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic java.security.Key zzb(com.google.android.gms.internal.firebase-auth-api.zzaae p0)
    {
        return p0.zzd;
    }

    public final byte[] zza(byte[] p2, int p3)
    {
        if (p3 > this.zze) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too big");
        } else {
            ((javax.crypto.Mac) this.zzb.get()).update(p2);
            return java.util.Arrays.copyOf(((javax.crypto.Mac) this.zzb.get()).doFinal(), p3);
        }
    }
}
