package com.google.android.gms.internal.auth;
final class zzgs extends java.util.AbstractSet {
    final synthetic com.google.android.gms.internal.auth.zzgu zza;

    public synthetic zzgs(com.google.android.gms.internal.auth.zzgu p1, com.google.android.gms.internal.auth.zzgr p2)
    {
        this.zza = p1;
        return;
    }

    public final bridge synthetic boolean add(Object p3)
    {
        if (this.contains(((java.util.Map$Entry) p3))) {
            return 0;
        } else {
            this.zza.zze(((Comparable) ((java.util.Map$Entry) p3).getKey()), ((java.util.Map$Entry) p3).getValue());
            return 1;
        }
    }

    public final void clear()
    {
        this.zza.clear();
        return;
    }

    public final boolean contains(Object p4)
    {
        Object v0_1 = this.zza.get(((java.util.Map$Entry) p4).getKey());
        boolean v4_3 = ((java.util.Map$Entry) p4).getValue();
        if (v0_1 == v4_3) {
            return 1;
        } else {
            if ((v0_1 == null) || (!v0_1.equals(v4_3))) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.auth.zzgq(this.zza, 0);
    }

    public final boolean remove(Object p2)
    {
        if (!this.contains(((java.util.Map$Entry) p2))) {
            return 0;
        } else {
            this.zza.remove(((java.util.Map$Entry) p2).getKey());
            return 1;
        }
    }

    public final int size()
    {
        return this.zza.size();
    }
}
