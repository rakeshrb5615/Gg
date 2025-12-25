package com.google.android.gms.ads.identifier;
final class zza extends java.lang.Thread {
    final synthetic java.util.Map zza;

    public zza(com.google.android.gms.ads.identifier.AdvertisingIdClient p1, java.util.Map p2)
    {
        this.zza = p2;
        return;
    }

    public final void run()
    {
        String v0_0 = this.zza;
        android.net.Uri$Builder v1_2 = android.net.Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        java.util.Iterator v2_1 = v0_0.keySet().iterator();
        while (v2_1.hasNext()) {
            String v3_2 = ((String) v2_1.next());
            v1_2.appendQueryParameter(v3_2, ((String) v0_0.get(v3_2)));
        }
        com.google.android.gms.ads.identifier.zzc.zza(v1_2.build().toString());
        return;
    }
}
