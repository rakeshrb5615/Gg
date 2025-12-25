package com.google.android.gms.internal.firebase-auth-api;
 class zzanm extends java.util.AbstractSet {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzang zza;

    private zzanm(com.google.android.gms.internal.firebase-auth-api.zzang p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public synthetic zzanm(com.google.android.gms.internal.firebase-auth-api.zzang p1, com.google.android.gms.internal.firebase-auth-api.zzanl p2)
    {
        this(p1);
        return;
    }

    public synthetic boolean add(Object p3)
    {
        if (this.contains(((java.util.Map$Entry) p3))) {
            return 0;
        } else {
            this.zza.zza(((Comparable) ((java.util.Map$Entry) p3).getKey()), ((java.util.Map$Entry) p3).getValue());
            return 1;
        }
    }

    public void clear()
    {
        this.zza.clear();
        return;
    }

    public boolean contains(Object p3)
    {
        Object v0_1 = this.zza.get(((java.util.Map$Entry) p3).getKey());
        int v3_5 = ((java.util.Map$Entry) p3).getValue();
        if ((v0_1 != v3_5) && ((v0_1 == null) || (!v0_1.equals(v3_5)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzanj(this.zza, 0);
    }

    public boolean remove(Object p2)
    {
        if (!this.contains(((java.util.Map$Entry) p2))) {
            return 0;
        } else {
            this.zza.remove(((java.util.Map$Entry) p2).getKey());
            return 1;
        }
    }

    public int size()
    {
        return this.zza.size();
    }
}
