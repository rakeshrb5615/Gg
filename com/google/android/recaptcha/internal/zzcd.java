package com.google.android.recaptcha.internal;
public final class zzcd {

    public zzcd(android.content.Context p1)
    {
        return;
    }

    public static final byte[] zza(java.io.File p9)
    {
        kotlin.jvm.internal.j.e(p9, "<this>");
        java.io.FileInputStream v0_2 = new java.io.FileInputStream(p9);
        try {
            OutOfMemoryError v1_2 = p9.length();
        } catch (String v9_7) {
            try {
                throw v9_7;
            } catch (OutOfMemoryError v1_4) {
                j5.t1.f(v0_2, v9_7);
                throw v1_4;
            }
        }
        if (v1_2 > 2147483647) {
            int v5_1 = new StringBuilder("File ");
            v5_1.append(p9);
            v5_1.append(" is too big (");
            v5_1.append(v1_2);
            v5_1.append(" bytes) to fit in memory.");
            throw new OutOfMemoryError(v5_1.toString());
        } else {
            OutOfMemoryError v1_0 = ((int) v1_2);
            StringBuilder v2_0 = new byte[v1_0];
            int v5_2 = v1_0;
            s7.a v6_0 = 0;
            while (v5_2 > 0) {
                String v7_0 = v0_2.read(v2_0, v6_0, v5_2);
                if (v7_0 < null) {
                    break;
                }
                v5_2 -= v7_0;
                v6_0 += v7_0;
            }
            if (v5_2 <= 0) {
                int v5_3 = v0_2.read();
                if (v5_3 != -1) {
                    s7.a v6_3 = new s7.a(8193);
                    v6_3.write(v5_3);
                    c4.b.o(v0_2, v6_3);
                    int v5_5 = (v6_3.size() + v1_0);
                    if (v5_5 < 0) {
                        StringBuilder v2_2 = new StringBuilder();
                        v2_2.append("File ");
                        v2_2.append(p9);
                        v2_2.append(" is too big to fit in memory.");
                        throw new OutOfMemoryError(v2_2.toString());
                    } else {
                        String v9_6 = v6_3.c();
                        v2_0 = java.util.Arrays.copyOf(v2_0, v5_5);
                        kotlin.jvm.internal.j.d(v2_0, "copyOf(...)");
                        i7.h.Y(v9_6, v1_0, v2_0, 0, v6_3.size());
                    }
                } else {
                }
            } else {
                v2_0 = java.util.Arrays.copyOf(v2_0, v6_0);
                kotlin.jvm.internal.j.d(v2_0, "copyOf(...)");
            }
            v0_2.close();
            return v2_0;
        }
    }

    public static final void zzb(java.io.File p1, byte[] p2)
    {
        if ((p1.exists()) && (!p1.delete())) {
            throw new java.io.IOException("Unable to delete existing encrypted file");
        } else {
            kotlin.jvm.internal.j.e(p2, "array");
            java.io.FileOutputStream v0_3 = new java.io.FileOutputStream(p1);
            try {
                v0_3.write(p2);
                v0_3.close();
                return;
            } catch (Throwable v1_1) {
                try {
                    throw v1_1;
                } catch (Throwable v2_1) {
                    j5.t1.f(v0_3, v1_1);
                    throw v2_1;
                }
            }
        }
    }
}
