package com.google.android.gms.internal.fido;
public final class zzam {
    private final String zza;
    private final com.google.android.gms.internal.fido.zzak zzb;
    private com.google.android.gms.internal.fido.zzak zzc;

    public synthetic zzam(String p2, com.google.android.gms.internal.fido.zzal p3)
    {
        com.google.android.gms.internal.fido.zzak v3_1 = new com.google.android.gms.internal.fido.zzak(0);
        this.zzb = v3_1;
        this.zzc = v3_1;
        p2.getClass();
        this.zza = p2;
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder(32);
        v0_2.append(this.zza);
        v0_2.append(123);
        com.google.android.gms.internal.fido.zzak v1_3 = this.zzb.zzc;
        String v2_6 = "";
        while (v1_3 != null) {
            int v3_0 = v1_3.zzb;
            v0_2.append(v2_6);
            String v2_0 = v1_3.zza;
            if (v2_0 != null) {
                v0_2.append(v2_0);
                v0_2.append(61);
            }
            if ((v3_0 == 0) || (!v3_0.getClass().isArray())) {
                v0_2.append(v3_0);
            } else {
                String v2_5 = java.util.Arrays.deepToString(new Object[] {v3_0}));
                v0_2.append(v2_5, 1, (v2_5.length() - 1));
            }
            v1_3 = v1_3.zzc;
            v2_6 = ", ";
        }
        v0_2.append(125);
        return v0_2.toString();
    }

    public final com.google.android.gms.internal.fido.zzam zza(String p2, int p3)
    {
        String v2_0 = String.valueOf(p3);
        com.google.android.gms.internal.fido.zzai v3_2 = new com.google.android.gms.internal.fido.zzai(0);
        this.zzc.zzc = v3_2;
        this.zzc = v3_2;
        v3_2.zzb = v2_0;
        v3_2.zza = "errorCode";
        return this;
    }

    public final com.google.android.gms.internal.fido.zzam zzb(String p3, Object p4)
    {
        com.google.android.gms.internal.fido.zzak v0_1 = new com.google.android.gms.internal.fido.zzak(0);
        this.zzc.zzc = v0_1;
        this.zzc = v0_1;
        v0_1.zzb = p4;
        v0_1.zza = p3;
        return this;
    }
}
