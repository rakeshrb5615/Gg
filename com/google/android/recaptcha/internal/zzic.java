package com.google.android.recaptcha.internal;
public final class zzic implements com.google.android.recaptcha.internal.zzih {

    public zzic()
    {
        return;
    }

    private static final boolean zzb(int p2)
    {
        try {
            new java.net.Socket("localhost", p2).close();
            return 1;
        } catch (java.net.ConnectException) {
            return 0;
        }
    }

    public final synthetic Object cs(Object[] p1)
    {
        return com.google.android.recaptcha.internal.zzie.zza(this, p1);
    }

    public final varargs Object zza(Object[] p9)
    {
        int v1_0 = p9.length;
        int v0_1 = new java.util.ArrayList(v1_0);
        int v2 = 0;
        Integer v3_4 = 0;
        while (v3_4 < v1_0) {
            boolean v4_1 = p9[v3_4];
            if (1 != (v4_1 instanceof Integer)) {
                v4_1 = 0;
            }
            boolean v4_2 = ((Integer) v4_1);
            if (!v4_2) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                v0_1.add(Integer.valueOf(v4_2.intValue()));
                v3_4++;
            }
        }
        com.google.android.recaptcha.internal.zzce v9_4 = new java.util.ArrayList();
        int v1_2 = v0_1.size();
        while (v2 < v1_2) {
            Integer v3_0 = v0_1.get(v2);
            v2++;
            Integer v3_2 = ((Number) v3_0).intValue();
            if (com.google.android.recaptcha.internal.zzic.zzb(v3_2)) {
                v9_4.add(Integer.valueOf(v3_2));
            }
        }
        return v9_4;
    }
}
