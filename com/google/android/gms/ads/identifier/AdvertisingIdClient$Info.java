package com.google.android.gms.ads.identifier;
public final class AdvertisingIdClient$Info {
    private final String zza;
    private final boolean zzb;

    public AdvertisingIdClient$Info(String p1, boolean p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public String getId()
    {
        return this.zza;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return this.zzb;
    }

    public String toString()
    {
        String v0_0 = this.zza;
        boolean v1 = this.zzb;
        StringBuilder v3_1 = new StringBuilder((String.valueOf(v0_0).length() + 7));
        v3_1.append("{");
        v3_1.append(v0_0);
        v3_1.append("}");
        v3_1.append(v1);
        return v3_1.toString();
    }
}
