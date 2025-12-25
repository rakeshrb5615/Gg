package com.google.android.gms.internal.firebase-auth-api;
public final class zzaia {
    private java.util.List zza;

    public zzaia()
    {
        this.zza = new java.util.ArrayList();
        return;
    }

    private zzaia(java.util.List p2)
    {
        if (p2.isEmpty()) {
            this.zza = java.util.Collections.EMPTY_LIST;
            return;
        } else {
            this.zza = java.util.Collections.unmodifiableList(p2);
            return;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaia zza(org.json.JSONArray p11)
    {
        if ((p11 != null) && (p11.length() != 0)) {
            java.util.ArrayList v0_2 = new java.util.ArrayList();
            int v1 = 0;
            while (v1 < p11.length()) {
                com.google.android.gms.internal.firebase-auth-api.zzaib v2_2;
                com.google.android.gms.internal.firebase-auth-api.zzaib v2_0 = p11.getJSONObject(v1);
                if (v2_0 != null) {
                    v2_2 = new com.google.android.gms.internal.firebase-auth-api.zzaib(com.google.android.gms.common.util.Strings.emptyToNull(v2_0.optString("federatedId")), com.google.android.gms.common.util.Strings.emptyToNull(v2_0.optString("displayName")), com.google.android.gms.common.util.Strings.emptyToNull(v2_0.optString("photoUrl")), com.google.android.gms.common.util.Strings.emptyToNull(v2_0.optString("providerId")), 0, com.google.android.gms.common.util.Strings.emptyToNull(v2_0.optString("phoneNumber")), com.google.android.gms.common.util.Strings.emptyToNull(v2_0.optString("email")));
                } else {
                    v2_2 = new com.google.android.gms.internal.firebase-auth-api.zzaib();
                }
                v0_2.add(v2_2);
                v1++;
            }
            return new com.google.android.gms.internal.firebase-auth-api.zzaia(v0_2);
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzaia(new java.util.ArrayList());
        }
    }

    public final java.util.List zza()
    {
        return this.zza;
    }
}
