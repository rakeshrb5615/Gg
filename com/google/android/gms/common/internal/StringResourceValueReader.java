package com.google.android.gms.common.internal;
public class StringResourceValueReader {
    private final android.content.res.Resources zza;
    private final String zzb;

    public StringResourceValueReader(android.content.Context p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        String v2_1 = p2.getResources();
        this.zza = v2_1;
        this.zzb = v2_1.getResourcePackageName(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        return;
    }

    public String getString(String p4)
    {
        android.content.res.Resources v1 = this.zza;
        String v4_1 = v1.getIdentifier(p4, "string", this.zzb);
        if (v4_1 != null) {
            return v1.getString(v4_1);
        } else {
            return 0;
        }
    }
}
