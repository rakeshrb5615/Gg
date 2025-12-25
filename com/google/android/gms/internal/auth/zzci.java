package com.google.android.gms.internal.auth;
public final class zzci {
    private final r.j zza;

    public zzci(r.j p1)
    {
        this.zza = p1;
        return;
    }

    public final String zza(android.net.Uri p1, String p2, String p3, String p4)
    {
        if (p1 == null) {
            return 0;
        } else {
            String v1_5 = ((r.j) this.zza.get(p1.toString()));
            if (v1_5 != null) {
                return ((String) v1_5.get("".concat(String.valueOf(p4))));
            } else {
                return 0;
            }
        }
    }
}
