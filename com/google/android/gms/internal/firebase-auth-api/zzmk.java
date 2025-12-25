package com.google.android.gms.internal.firebase-auth-api;
public final class zzmk {
    public static final byte[] zza;
    public static final byte[] zzb;
    public static final byte[] zzc;
    public static final byte[] zzd;
    public static final byte[] zze;
    public static final byte[] zzf;
    public static final byte[] zzg;
    public static final byte[] zzh;
    public static final byte[] zzi;
    public static final byte[] zzj;
    public static final byte[] zzk;
    public static final byte[] zzl;
    private static final byte[] zzm;
    private static final byte[] zzn;
    private static final byte[] zzo;

    static zzmk()
    {
        com.google.android.gms.internal.firebase-auth-api.zzmk.zza = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(1, 0);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zza(1, 2);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzb = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 32);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzc = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 16);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzd = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 17);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zze = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 18);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzf = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 1);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzg = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzh = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 3);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzi = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 1);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzj = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 2);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzk = com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, 3);
        byte[] v0_4 = new byte[0];
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzl = v0_4;
        byte[] v0_5 = com.google.android.gms.internal.firebase-auth-api.zzqn.zza;
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzm = "KEM".getBytes(v0_5);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzn = "HPKE".getBytes(v0_5);
        com.google.android.gms.internal.firebase-auth-api.zzmk.zzo = "HPKE-v1".getBytes(v0_5);
        return;
    }

    public static int zza(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf p2)
    {
        if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd) {
            if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza) {
                if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) {
                    if (p2 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc) {
                        throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    } else {
                        return 66;
                    }
                } else {
                    return 48;
                }
            } else {
                return 32;
            }
        } else {
            return 32;
        }
    }

    private static byte[] zza(int p4, int p5)
    {
        if ((p4 > 4) || (p4 < null)) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        } else {
            if ((p5 < null) || ((p4 < 4) && (p5 >= (1 << (p4 << 3))))) {
                throw new IllegalArgumentException("value too large");
            } else {
                byte[] v0_3 = new byte[p4];
                int v2 = 0;
                while (v2 < p4) {
                    v0_3[v2] = ((byte) (p5 >> (((p4 - v2) - 1) * 8)));
                    v2++;
                }
                return v0_3;
            }
        }
    }

    public static byte[] zza(String p2, byte[] p3, byte[] p4)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {com.google.android.gms.internal.firebase-auth-api.zzmk.zzo, p4, p2.getBytes(com.google.android.gms.internal.firebase-auth-api.zzqn.zza), p3}));
    }

    public static byte[] zza(String p2, byte[] p3, byte[] p4, int p5)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {com.google.android.gms.internal.firebase-auth-api.zzmk.zza(2, p5), com.google.android.gms.internal.firebase-auth-api.zzmk.zzo, p4, p2.getBytes(com.google.android.gms.internal.firebase-auth-api.zzqn.zza), p3}));
    }

    public static byte[] zza(byte[] p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {com.google.android.gms.internal.firebase-auth-api.zzmk.zzm, p1}));
    }

    public static byte[] zza(byte[] p1, byte[] p2, byte[] p3)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {com.google.android.gms.internal.firebase-auth-api.zzmk.zzn, p1, p2, p3}));
    }

    public static int zzb(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf p1)
    {
        if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd) {
            if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza) {
                if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) {
                    if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc) {
                        throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    } else {
                        return 133;
                    }
                } else {
                    return 97;
                }
            } else {
                return 65;
            }
        } else {
            return 32;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzzi zzc(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf p1)
    {
        if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza) {
            if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb) {
                if (p1 != com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc) {
                    throw new java.security.GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzzi.zzc;
                }
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzzi.zzb;
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzzi.zza;
        }
    }
}
