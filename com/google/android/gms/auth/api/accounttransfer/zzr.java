package com.google.android.gms.auth.api.accounttransfer;
public final class zzr implements com.google.android.gms.common.api.Api$ApiOptions$Optional {
    public static final com.google.android.gms.auth.api.accounttransfer.zzr zza;
    private final android.os.Bundle zzb;

    static zzr()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        if (!v0_1.containsKey("accountTypes")) {
            v0_1.putStringArrayList("accountTypes", new java.util.ArrayList(0));
        }
        com.google.android.gms.auth.api.accounttransfer.zzr.zza = new com.google.android.gms.auth.api.accounttransfer.zzr(v0_1, 0);
        return;
    }

    public synthetic zzr(android.os.Bundle p1, com.google.android.gms.auth.api.accounttransfer.zzq p2)
    {
        this.zzb = p1;
        return;
    }

    public final boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof com.google.android.gms.auth.api.accounttransfer.zzr)) {
                android.os.Bundle v1_1 = this.zza();
                android.os.Bundle v7_2 = ((com.google.android.gms.auth.api.accounttransfer.zzr) p7).zza();
                if (v1_1.size() == v7_2.size()) {
                    java.util.Iterator v3_2 = v1_1.keySet().iterator();
                    while (v3_2.hasNext()) {
                        boolean v4_3 = ((String) v3_2.next());
                        if (v7_2.containsKey(v4_3)) {
                            if (!com.google.android.gms.common.internal.Objects.equal(v1_1.get(v4_3), v7_2.get(v4_3))) {
                                return 0;
                            }
                        } else {
                            return 0;
                        }
                    }
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.zza();
        java.util.ArrayList v1_1 = new java.util.ArrayList((v0_0.size() + v0_0.size()));
        java.util.ArrayList v2_0 = new java.util.ArrayList(v0_0.keySet());
        java.util.Collections.sort(v2_0);
        int v3_0 = v2_0.size();
        int v4 = 0;
        while (v4 < v3_0) {
            Object v5_1 = ((String) v2_0.get(v4));
            v1_1.add(v5_1);
            v1_1.add(v0_0.get(v5_1));
            v4++;
        }
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v1_1}));
    }

    public final android.os.Bundle zza()
    {
        return new android.os.Bundle(this.zzb);
    }
}
