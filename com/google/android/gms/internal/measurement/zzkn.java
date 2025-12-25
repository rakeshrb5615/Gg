package com.google.android.gms.internal.measurement;
final synthetic class zzkn implements android.content.SharedPreferences$OnSharedPreferenceChangeListener {
    private final synthetic com.google.android.gms.internal.measurement.zzko zza;

    public synthetic zzkn(com.google.android.gms.internal.measurement.zzko p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void onSharedPreferenceChanged(android.content.SharedPreferences p2, String p3)
    {
        this.zza.zzc(p2, p3);
        return;
    }
}
