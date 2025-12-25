package com.google.android.gms.internal.measurement;
public final class zzjg {
    public static final android.net.Uri zza;
    public static final android.net.Uri zzb;
    public static final java.util.regex.Pattern zzc;
    public static final java.util.regex.Pattern zzd;

    static zzjg()
    {
        com.google.android.gms.internal.measurement.zzjg.zza = android.net.Uri.parse("content://com.google.android.gsf.gservices");
        com.google.android.gms.internal.measurement.zzjg.zzb = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
        com.google.android.gms.internal.measurement.zzjg.zzc = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        com.google.android.gms.internal.measurement.zzjg.zzd = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
        return;
    }
}
