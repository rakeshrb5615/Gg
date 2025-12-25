package com.google.android.gms.internal.play_billing;
final class zzhb extends java.util.AbstractSet {
    final synthetic com.google.android.gms.internal.play_billing.zzhd zza;

    public synthetic zzhb(com.google.android.gms.internal.play_billing.zzhd p1, com.google.android.gms.internal.play_billing.zzhc p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final bridge synthetic boolean add(Object p3)
    {
        if (this.contains(((java.util.Map$Entry) p3))) {
            return 0;
        } else {
            this.zza.zzf(((Comparable) ((java.util.Map$Entry) p3).getKey()), ((java.util.Map$Entry) p3).getValue());
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
        return new com.google.android.gms.internal.play_billing.zzha(this.zza, 0);
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
