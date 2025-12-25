package com.google.android.gms.internal.fido;
final enum class zzcm extends java.lang.Enum implements java.util.Comparator {
    public static final enum com.google.android.gms.internal.fido.zzcm zza;
    private static final synthetic com.google.android.gms.internal.fido.zzcm[] zzb;

    static zzcm()
    {
        com.google.android.gms.internal.fido.zzcm[] v0_1 = new com.google.android.gms.internal.fido.zzcm("INSTANCE", 0);
        com.google.android.gms.internal.fido.zzcm.zza = v0_1;
        com.google.android.gms.internal.fido.zzcm.zzb = new com.google.android.gms.internal.fido.zzcm[] {v0_1});
        return;
    }

    private zzcm(String p1, int p2)
    {
        super("INSTANCE", 0);
        return;
    }

    public static com.google.android.gms.internal.fido.zzcm[] values()
    {
        return ((com.google.android.gms.internal.fido.zzcm[]) com.google.android.gms.internal.fido.zzcm.zzb.clone());
    }

    public final bridge synthetic int compare(Object p5, Object p6)
    {
        int vtmp1 = Math.min(((byte[]) p5).length, ((byte[]) p6).length);
        int v1_0 = 0;
        while (v1_0 < vtmp1) {
            int v2_2 = ((((byte[]) p5)[v1_0] & 255) - (((byte[]) p6)[v1_0] & 255));
            if (v2_2 == 0) {
                v1_0++;
            } else {
                return v2_2;
            }
        }
        return (((byte[]) p5).length - ((byte[]) p6).length);
    }

    public final String toString()
    {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
