package com.google.android.recaptcha.internal;
public final class zzbf {
    private final android.content.SharedPreferences zza;

    public zzbf(android.content.Context p3)
    {
        this.zza = p3.getSharedPreferences("_GRECAPTCHA", 0);
        return;
    }

    public final String zza()
    {
        String v0_1 = this.zza.getString("_GRECAPTCHA_KC", 0);
        if (v0_1 == null) {
            v0_1 = "";
        }
        return v0_1;
    }

    public final void zzb(java.util.Map p4)
    {
        android.content.SharedPreferences$Editor v0_1 = this.zza.edit();
        java.util.Iterator v4_2 = p4.entrySet().iterator();
        while (v4_2.hasNext()) {
            String v1_1 = ((java.util.Map$Entry) v4_2.next());
            v0_1.putString(((String) v1_1.getKey()), ((String) v1_1.getValue()));
        }
        v0_1.commit();
        return;
    }
}
