package com.google.android.gms.common.util;
public final class ScopeUtil {

    private ScopeUtil()
    {
        return;
    }

    public static String[] toScopeString(java.util.Set p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "scopes can\'t be null.");
        int v1_2 = new com.google.android.gms.common.api.Scope[p3.size()];
        com.google.android.gms.common.api.Scope[] v3_2 = ((com.google.android.gms.common.api.Scope[]) p3.toArray(v1_2));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_2, "scopes can\'t be null.");
        String[] v0_1 = new String[v3_2.length];
        int v1_0 = 0;
        while (v1_0 < v3_2.length) {
            v0_1[v1_0] = v3_2[v1_0].getScopeUri();
            v1_0++;
        }
        return v0_1;
    }
}
