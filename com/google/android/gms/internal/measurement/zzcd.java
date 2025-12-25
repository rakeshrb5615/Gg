package com.google.android.gms.internal.measurement;
public final class zzcd implements android.content.SharedPreferences {
    private final java.util.Map zza;
    private final java.util.Set zzb;

    public zzcd()
    {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashSet();
        return;
    }

    private final Object zzc(String p2, Object p3)
    {
        Object v2_1 = this.zza.get(p2);
        if (v2_1 == null) {
            return p3;
        } else {
            return v2_1;
        }
    }

    public final boolean contains(String p2)
    {
        return this.zza.containsKey(p2);
    }

    public final android.content.SharedPreferences$Editor edit()
    {
        return new com.google.android.gms.internal.measurement.zzcc(this, 0);
    }

    public final java.util.Map getAll()
    {
        return this.zza;
    }

    public final boolean getBoolean(String p1, boolean p2)
    {
        return ((Boolean) this.zzc(p1, Boolean.valueOf(p2))).booleanValue();
    }

    public final float getFloat(String p1, float p2)
    {
        return ((Float) this.zzc(p1, Float.valueOf(p2))).floatValue();
    }

    public final int getInt(String p1, int p2)
    {
        return ((Integer) this.zzc(p1, Integer.valueOf(p2))).intValue();
    }

    public final long getLong(String p1, long p2)
    {
        return ((Long) this.zzc(p1, Long.valueOf(p2))).longValue();
    }

    public final String getString(String p1, String p2)
    {
        return ((String) this.zzc(p1, p2));
    }

    public final java.util.Set getStringSet(String p1, java.util.Set p2)
    {
        return ((java.util.Set) this.zzc(p1, p2));
    }

    public final void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences$OnSharedPreferenceChangeListener p2)
    {
        this.zzb.add(p2);
        return;
    }

    public final void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences$OnSharedPreferenceChangeListener p2)
    {
        this.zzb.remove(p2);
        return;
    }

    public final synthetic java.util.Map zza()
    {
        return this.zza;
    }

    public final synthetic java.util.Set zzb()
    {
        return this.zzb;
    }
}
