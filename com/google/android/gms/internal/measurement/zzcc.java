package com.google.android.gms.internal.measurement;
final class zzcc implements android.content.SharedPreferences$Editor {
    boolean zza;
    final java.util.Set zzb;
    final java.util.Map zzc;
    final synthetic com.google.android.gms.internal.measurement.zzcd zzd;

    public synthetic zzcc(com.google.android.gms.internal.measurement.zzcd p1, byte[] p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        this.zza = 0;
        this.zzb = new java.util.HashSet();
        this.zzc = new java.util.HashMap();
        return;
    }

    private final void zza(String p2, Object p3)
    {
        if (p3 == null) {
            this.remove(p2);
            return;
        } else {
            this.zzc.put(p2, p3);
            return;
        }
    }

    public final void apply()
    {
        this.commit();
        return;
    }

    public final android.content.SharedPreferences$Editor clear()
    {
        this.zza = 1;
        return this;
    }

    public final boolean commit()
    {
        if (this.zza) {
            this.zzd.zza().clear();
        }
        int v0_8 = this.zzd;
        java.util.Set v1 = this.zzb;
        v0_8.zza().keySet().removeAll(v1);
        java.util.Map v2_1 = this.zzc;
        java.util.Iterator v3_1 = v2_1.entrySet().iterator();
        while (v3_1.hasNext()) {
            android.content.SharedPreferences$OnSharedPreferenceChangeListener v4_5 = ((java.util.Map$Entry) v3_1.next());
            v0_8.zza().put(((String) v4_5.getKey()), v4_5.getValue());
        }
        java.util.Iterator v3_3 = v0_8.zzb().iterator();
        while (v3_3.hasNext()) {
            android.content.SharedPreferences$OnSharedPreferenceChangeListener v4_3 = ((android.content.SharedPreferences$OnSharedPreferenceChangeListener) v3_3.next());
            m4.p v5_0 = v2_1.keySet();
            a.a.g(v1, "set1");
            a.a.g(v5_0, "set2");
            m4.p v5_2 = new m4.p(new m4.q(v1, v5_0));
            while (v5_2.hasNext()) {
                v4_3.onSharedPreferenceChanged(v0_8, ((String) v5_2.next()));
            }
        }
        if ((!this.zza) && ((v1.isEmpty()) && (v2_1.isEmpty()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final android.content.SharedPreferences$Editor putBoolean(String p1, boolean p2)
    {
        this.zza(p1, Boolean.valueOf(p2));
        return this;
    }

    public final android.content.SharedPreferences$Editor putFloat(String p1, float p2)
    {
        this.zza(p1, Float.valueOf(p2));
        return this;
    }

    public final android.content.SharedPreferences$Editor putInt(String p1, int p2)
    {
        this.zza(p1, Integer.valueOf(p2));
        return this;
    }

    public final android.content.SharedPreferences$Editor putLong(String p1, long p2)
    {
        this.zza(p1, Long.valueOf(p2));
        return this;
    }

    public final android.content.SharedPreferences$Editor putString(String p1, String p2)
    {
        this.zza(p1, p2);
        return this;
    }

    public final android.content.SharedPreferences$Editor putStringSet(String p1, java.util.Set p2)
    {
        this.zza(p1, p2);
        return this;
    }

    public final android.content.SharedPreferences$Editor remove(String p2)
    {
        this.zzb.add(p2);
        return this;
    }
}
