package com.google.android.gms.measurement.internal;
public final class zzba extends com.google.android.gms.measurement.internal.zzjf {
    private long zza;
    private String zzb;

    public zzba(com.google.android.gms.measurement.internal.zzic p1)
    {
        super(p1);
        return;
    }

    public final boolean zza()
    {
        int v0_0 = java.util.Calendar.getInstance();
        this.zza = java.util.concurrent.TimeUnit.MINUTES.convert(((long) (v0_0.get(16) + v0_0.get(15))), java.util.concurrent.TimeUnit.MILLISECONDS);
        int v0_3 = java.util.Locale.getDefault();
        String v2_1 = java.util.Locale.ENGLISH;
        String v1_2 = v0_3.getLanguage().toLowerCase(v2_1);
        int v0_5 = v0_3.getCountry().toLowerCase(v2_1);
        this.zzb = v1.a.o(new StringBuilder(((String.valueOf(v1_2).length() + 1) + String.valueOf(v0_5).length())), v1_2, "-", v0_5);
        return 0;
    }

    public final long zzb()
    {
        this.zzw();
        return this.zza;
    }

    public final String zzc()
    {
        this.zzw();
        return this.zzb;
    }
}
