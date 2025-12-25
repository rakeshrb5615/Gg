package com.google.android.gms.common.internal;
public final class Objects$ToStringHelper {
    private final java.util.List zza;
    private final Object zzb;

    public synthetic Objects$ToStringHelper(Object p1, byte[] p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zzb = p1;
        this.zza = new java.util.ArrayList();
        return;
    }

    public com.google.android.gms.common.internal.Objects$ToStringHelper add(String p4, Object p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        String v0_1 = p4.length();
        java.util.List v5_2 = String.valueOf(p5);
        this.zza.add(v1.a.o(new StringBuilder(((v0_1 + 1) + v5_2.length())), p4, "=", v5_2));
        return this;
    }

    public String toString()
    {
        String v0_2 = new StringBuilder(100);
        v0_2.append(this.zzb.getClass().getSimpleName());
        v0_2.append(123);
        int v1_1 = this.zza;
        int v2 = v1_1.size();
        int v3 = 0;
        while (v3 < v2) {
            v0_2.append(((String) v1_1.get(v3)));
            if (v3 < (v2 - 1)) {
                v0_2.append(", ");
            }
            v3++;
        }
        v0_2.append(125);
        return v0_2.toString();
    }
}
