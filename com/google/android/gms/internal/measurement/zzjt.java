package com.google.android.gms.internal.measurement;
public final class zzjt {
    private final r.j zza;

    public zzjt(r.j p1)
    {
        this.zza = p1;
        return;
    }

    public final String zza(android.net.Uri p1, String p2, String p3, String p4)
    {
        String v1_3;
        if (p1 == null) {
            v1_3 = 0;
        } else {
            v1_3 = ((r.j) this.zza.get(p1.toString()));
        }
        if (v1_3 != null) {
            return ((String) v1_3.get("".concat(p4)));
        } else {
            return 0;
        }
    }
}
