package com.google.android.recaptcha.internal;
public final class zzge {
    private final java.util.Map zza;
    private final java.util.Set zzb;

    public zzge()
    {
        this.zza = new java.util.LinkedHashMap();
        this.zzb = new java.util.LinkedHashSet();
        return;
    }

    private final java.util.List zzh(java.util.List p3)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(i7.j.X(p3, 10));
        java.util.Iterator v3_1 = p3.iterator();
        while (v3_1.hasNext()) {
            v0_1.add(this.zza(((com.google.android.recaptcha.internal.zzue) v3_1.next())));
        }
        return v0_1;
    }

    public final Object zza(com.google.android.recaptcha.internal.zzue p7)
    {
        int v0_0 = p7.zzS();
        if (v0_0 == 0) {
            throw 0;
        } else {
            switch ((v0_0 - 1)) {
                case 0:
                    return this.zza.get(Integer.valueOf(p7.zzi()));
                case 1:
                    return Boolean.valueOf(p7.zzQ());
                case 2:
                    Short v7_21 = p7.zzM().zzl();
                    if (v7_21.length != 1) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 6, 0);
                    } else {
                        return Byte.valueOf(v7_21[0]);
                    }
                case 3:
                    Short v7_15 = p7.zzO();
                    if (v7_15.length() != 1) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 6, 0);
                    } else {
                        return Character.valueOf(v7_15.charAt(0));
                    }
                case 4:
                    Short v7_10 = p7.zzj();
                    if ((v7_10 < -32768) || (v7_10 > 32767)) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 6, 0);
                    } else {
                        return Short.valueOf(((short) v7_10));
                    }
                case 5:
                    return Integer.valueOf(p7.zzk());
                case 6:
                case 8:
                    throw new com.google.android.recaptcha.internal.zzce(4, 6, 0);
                    break;
                case 7:
                    return Long.valueOf(p7.zzl());
                case 9:
                    return Float.valueOf(p7.zzg());
                case 10:
                    return Double.valueOf(p7.zzf());
                case 11:
                    return p7.zzP();
                case 12:
                    return 0;
                default:
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            }
        }
    }

    public final Object zzb(int p2)
    {
        return this.zza.remove(Integer.valueOf(p2));
    }

    public final void zzc()
    {
        this.zza.clear();
        return;
    }

    public final void zzd(int p1, Object p2)
    {
        this.zze(173, p2);
        this.zzb.add(Integer.valueOf(173));
        return;
    }

    public final void zze(int p2, Object p3)
    {
        this.zza.put(Integer.valueOf(p2), p3);
        return;
    }

    public final Class[] zzf(java.util.List p3)
    {
        Class[] v3_1 = this.zzh(p3);
        java.util.ArrayList v0_1 = new java.util.ArrayList(i7.j.X(v3_1, 10));
        Class[] v3_6 = v3_1.iterator();
        while (v3_6.hasNext()) {
            v0_1.add(com.google.android.recaptcha.internal.zzgc.zza(v3_6.next()));
        }
        Class[] v3_3 = new Class[0];
        return ((Class[]) v0_1.toArray(v3_3));
    }

    public final Object[] zzg(java.util.List p2)
    {
        Object[] v0_1 = new Object[0];
        return this.zzh(p2).toArray(v0_1);
    }
}
