package com.google.android.recaptcha.internal;
public final class zzbm implements com.google.android.recaptcha.internal.zzaq {
    private final android.content.Context zza;
    private final String zzb;

    public zzbm(android.content.Context p2)
    {
        this.zza = p2;
        this.zzb = "rce_";
        new com.google.android.recaptcha.internal.zzcd(p2);
        return;
    }

    public final String zza(String p4)
    {
        java.io.File v2_1 = new java.io.File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(p4)));
        if (!v2_1.exists()) {
            return 0;
        } else {
            return new String(com.google.android.recaptcha.internal.zzcd.zza(v2_1), java.nio.charset.StandardCharsets.UTF_8);
        }
    }

    public final void zzb()
    {
        try {
            int v0_3 = this.zza.getCacheDir().listFiles();
        } catch (Exception) {
            return;
        }
        if (v0_3 == 0) {
            return;
        } else {
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            java.io.File v2_2 = v0_3.length;
            int v3 = 0;
            int v4 = 0;
            while (v4 < v2_2) {
                java.io.File v5 = v0_3[v4];
                if (b8.p.p0(v5.getName(), this.zzb)) {
                    v1_1.add(v5);
                }
                v4++;
            }
            int v0_1 = v1_1.size();
            while (v3 < v0_1) {
                java.io.File v2_0 = v1_1.get(v3);
                v3++;
                ((java.io.File) v2_0).delete();
            }
            return;
        }
    }

    public final void zzc(String p12, String p13)
    {
        String v0_5 = new y7.c(65, 122);
        java.io.File v1_7 = new java.util.ArrayList(i7.j.X(v0_5, 10));
        String v0_1 = v0_5.iterator();
        while(true) {
            Character v2_1 = ((y7.b) v0_1);
            int v3_0 = v2_1.d;
            if (v3_0 == 0) {
                String v0_2 = i7.i.m0(v1_7);
                java.util.Collections.shuffle(v0_2);
                int v3_2 = new java.io.File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(i7.i.c0(((java.util.ArrayList) v0_2).subList(0, 8), "", 0, 0, 0, 62))));
                com.google.android.recaptcha.internal.zzcd.zzb(v3_2, String.valueOf(p13).getBytes(java.nio.charset.StandardCharsets.UTF_8));
                v3_2.renameTo(new java.io.File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(p12))));
                return;
            } else {
                java.util.List v5_1 = v2_1.e;
                if (v5_1 != v2_1.c) {
                    v2_1.e = (v2_1.b + v5_1);
                } else {
                    if (v3_0 == 0) {
                        break;
                    }
                    v2_1.d = 0;
                }
                v1_7.add(Character.valueOf(((char) v5_1)));
            }
        }
        throw new java.util.NoSuchElementException();
    }

    public final boolean zzd(String p10)
    {
        try {
            java.io.File[] v1_2 = this.zza.getCacheDir().listFiles();
            java.io.File v2 = 0;
        } catch (Exception) {
            return 0;
        }
        if (v1_2 != null) {
            int v3 = v1_2.length;
            int v4 = 0;
            while (v4 < v3) {
                java.io.File v5 = v1_2[v4];
                boolean v6_0 = v5.getName();
                String v7_0 = this.zzb;
                StringBuilder v8_1 = new StringBuilder();
                v8_1.append(v7_0);
                v8_1.append(p10);
                if (!kotlin.jvm.internal.j.a(v6_0, v8_1.toString())) {
                    v4++;
                } else {
                    v2 = v5;
                    break;
                }
            }
        }
        if (v2 == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
