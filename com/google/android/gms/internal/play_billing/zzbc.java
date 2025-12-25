package com.google.android.gms.internal.play_billing;
public final class zzbc {
    private final String zza;
    private final com.google.android.gms.internal.play_billing.zzbb zzb;
    private com.google.android.gms.internal.play_billing.zzbb zzc;

    public synthetic zzbc(String p1, com.google.android.gms.internal.play_billing.zzbd p2)
    {
        com.google.android.gms.internal.play_billing.zzbb v2_1 = new com.google.android.gms.internal.play_billing.zzbb();
        this.zzb = v2_1;
        this.zzc = v2_1;
        p1.getClass();
        this.zza = p1;
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder(32);
        v0_2.append(this.zza);
        v0_2.append(123);
        com.google.android.gms.internal.play_billing.zzbb v1_3 = this.zzb.zzb;
        String v2_4 = "";
        while (v1_3 != null) {
            int v3_0 = v1_3.zza;
            v0_2.append(v2_4);
            if ((v3_0 == 0) || (!v3_0.getClass().isArray())) {
                v0_2.append(v3_0);
            } else {
                String v2_3 = java.util.Arrays.deepToString(new Object[] {v3_0}));
                v0_2.append(v2_3, 1, (v2_3.length() - 1));
            }
            v1_3 = v1_3.zzb;
            v2_4 = ", ";
        }
        v0_2.append(125);
        return v0_2.toString();
    }

    public final com.google.android.gms.internal.play_billing.zzbc zza(Object p3)
    {
        com.google.android.gms.internal.play_billing.zzbb v0_1 = new com.google.android.gms.internal.play_billing.zzbb();
        this.zzc.zzb = v0_1;
        this.zzc = v0_1;
        v0_1.zza = p3;
        return this;
    }
}
