package com.google.android.recaptcha.internal;
public final class zzqc {
    protected static final java.nio.charset.Charset zza;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd;
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    static zzqc()
    {
        com.google.android.recaptcha.internal.zzqc.zza = java.nio.charset.StandardCharsets.UTF_16;
        return;
    }

    public zzqc()
    {
        this.zzd = new int[] {511133343, 1277647508, 107287496, 338123662});
        return;
    }

    public zzqc(byte[] p6, byte[] p7)
    {
        this.zzd = new int[] {511133343, 1277647508, 107287496, 338123662});
        if (p6.length != 32) {
            throw new IllegalArgumentException();
        } else {
            this.zze = p6;
            this.zzg = 1;
            this.zzf = p7;
            int v7_1 = new int[16];
            this.zzb = v7_1;
            int[] v0_1 = 0;
            while (v0_1 < 4) {
                this.zzb[v0_1] = com.google.android.recaptcha.internal.zzqc.zza(this.zzd[v0_1], 2131181306);
                v0_1++;
            }
            int[] v0_2 = 4;
            while (v0_2 < 12) {
                this.zzb[v0_2] = com.google.android.recaptcha.internal.zzqc.zzg(this.zze, ((v0_2 - 4) * 4));
                v0_2++;
            }
            this.zzb[12] = this.zzg;
            int[] v0_4 = 13;
            while (v0_4 < 16) {
                this.zzb[v0_4] = com.google.android.recaptcha.internal.zzqc.zzg(this.zzf, ((v0_4 - 13) * 4));
                v0_4++;
            }
            int[] v0_5 = new int[16];
            this.zzc = v0_5;
            System.arraycopy(this.zzb, 0, v0_5, 0, 16);
            return;
        }
    }

    public static int zza(int p1, int p2)
    {
        if ((p1 % 2) != 0) {
            return ((p1 | p2) - (p1 & p2));
        } else {
            return (((~ p1) & p2) | ((~ p2) & p1));
        }
    }

    public static String zze(String p4, byte[] p5, com.google.android.recaptcha.internal.zzqd p6)
    {
        byte[] v4_4 = android.util.Base64.decode(p4, 0);
        byte[] v1 = new byte[12];
        int v2_1 = (v4_4.length - 12);
        byte[] v3 = new byte[v2_1];
        System.arraycopy(v4_4, 0, v1, 0, 12);
        System.arraycopy(v4_4, 12, v3, 0, v2_1);
        return new String(new com.google.android.recaptcha.internal.zzqc(p5, v1).zzd(v3), com.google.android.recaptcha.internal.zzqc.zza);
    }

    public static String zzf(String p3, byte[] p4, com.google.android.recaptcha.internal.zzqd p5)
    {
        byte[] v0 = new byte[12];
        new java.security.SecureRandom().nextBytes(v0);
        String v3_1 = new com.google.android.recaptcha.internal.zzqc(p4, v0).zzd(p3.getBytes(com.google.android.recaptcha.internal.zzqc.zza));
        int v4_1 = v3_1.length;
        byte[] v1_1 = new byte[(v4_1 + 12)];
        System.arraycopy(v0, 0, v1_1, 0, 12);
        System.arraycopy(v3_1, 0, v1_1, 12, v4_1);
        return android.util.Base64.encodeToString(v1_1, 2);
    }

    private static final int zzg(byte[] p3, int p4)
    {
        return (((p3[(p4 + 3)] & 255) << 24) | ((((p3[(p4 + 1)] & 255) << 8) | (p3[p4] & 255)) | ((p3[(p4 + 2)] & 255) << 16)));
    }

    public final void zzb(int p2, int p3, int p4, int p5)
    {
        this.zzc(p2, p3, p5, 16);
        this.zzc(p4, p5, p3, 12);
        this.zzc(p2, p3, p5, 8);
        this.zzc(p4, p5, p3, 7);
        return;
    }

    public final void zzc(int p3, int p4, int p5, int p6)
    {
        int[] v0 = this.zzb;
        int v1_1 = (v0[p3] + v0[p4]);
        v0[p3] = v1_1;
        int v3_4 = com.google.android.recaptcha.internal.zzqc.zza(v0[p5], v1_1);
        v0[p5] = v3_4;
        v0[p5] = ((v3_4 << p6) | (v3_4 >> (32 - p6)));
        return;
    }

    public final byte[] zzd(byte[] p17)
    {
        com.google.android.recaptcha.internal.zzqc v0 = this;
        if (this.zzg != 1) {
            throw new IllegalStateException();
        } else {
            int v2_1 = p17.length;
            byte[] v4 = new byte[v2_1];
            int v6 = 0;
            while (v2_1 > 0) {
                System.arraycopy(this.zzc, 0, this.zzb, 0, 16);
                v0.zzb[12] = v0.zzg;
                int v7_2 = 0;
                while (v7_2 < 10) {
                    this.zzb(0, 4, 8, 12);
                    this.zzb(1, 5, 9, 13);
                    this.zzb(2, 6, 10, 14);
                    this.zzb(3, 7, 11, 15);
                    this.zzb(0, 5, 10, 15);
                    this.zzb(1, 6, 11, 12);
                    this.zzb(2, 7, 8, 13);
                    this.zzb(3, 4, 9, 14);
                    v7_2++;
                }
                byte[] v9_1 = new byte[64];
                int v10_1 = 0;
                while (v10_1 < 16) {
                    IllegalStateException v12_2 = this.zzb[v10_1];
                    int v13_0 = (v10_1 * 4);
                    v9_1[v13_0] = ((byte) (v12_2 & 255));
                    v9_1[(v13_0 + 1)] = ((byte) ((v12_2 >> 8) & 255));
                    v9_1[(v13_0 + 2)] = ((byte) ((v12_2 >> 16) & 255));
                    v9_1[(v13_0 + 3)] = ((byte) ((v12_2 >> 24) & 255));
                    v10_1++;
                }
                int v8_3 = 0;
                while (v8_3 < Math.min(64, v2_1)) {
                    int v10_3 = (v6 + v8_3);
                    v4[v10_3] = ((byte) com.google.android.recaptcha.internal.zzqc.zza(v9_1[v8_3], p17[v10_3]));
                    v8_3++;
                }
                this.zzg = (this.zzg + 1);
                v2_1 -= 64;
                v6 += 64;
            }
            return v4;
        }
    }
}
