package com.google.android.gms.internal.fido;
public final synthetic class zzbd implements java.util.Comparator {
    public final synthetic java.util.Comparator zza;

    public synthetic zzbd(java.util.Comparator p1)
    {
        this.zza = p1;
        return;
    }

    public final int compare(Object p3, Object p4)
    {
        java.util.Comparator v0 = this.zza;
        Class vtmp1 = ((java.util.Map$Entry) p3).getClass();
        ((java.util.Map$Entry) p4).getClass();
        return v0.compare(((java.util.Map$Entry) p3).getKey(), ((java.util.Map$Entry) p4).getKey());
    }
}
