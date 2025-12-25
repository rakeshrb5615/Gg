package com.google.android.gms.internal.firebase-auth-api;
public final class zzaiw {
    private java.util.List zza;

    public zzaiw()
    {
        this(0);
        return;
    }

    public zzaiw(int p2, java.util.List p3)
    {
        if ((p3 != null) && (!p3.isEmpty())) {
            java.util.List v2_1 = 0;
            while (v2_1 < p3.size()) {
                p3.set(v2_1, com.google.android.gms.common.util.Strings.emptyToNull(((String) p3.get(v2_1))));
                v2_1++;
            }
            this.zza = java.util.Collections.unmodifiableList(p3);
            return;
        } else {
            this.zza = java.util.Collections.EMPTY_LIST;
            return;
        }
    }

    private zzaiw(java.util.List p1)
    {
        this.zza = new java.util.ArrayList();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaiw zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzaiw(0);
    }

    public final java.util.List zzb()
    {
        return this.zza;
    }
}
