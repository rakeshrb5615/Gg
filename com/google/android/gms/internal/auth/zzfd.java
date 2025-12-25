package com.google.android.gms.internal.auth;
public final class zzfd extends com.google.android.gms.internal.auth.zzdq implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzfe {
    public static final com.google.android.gms.internal.auth.zzfe zza;
    private static final com.google.android.gms.internal.auth.zzfd zzb;
    private final java.util.List zzc;

    static zzfd()
    {
        com.google.android.gms.internal.auth.zzfd v0_1 = new com.google.android.gms.internal.auth.zzfd(10);
        com.google.android.gms.internal.auth.zzfd.zzb = v0_1;
        v0_1.zzb();
        com.google.android.gms.internal.auth.zzfd.zza = v0_1;
        return;
    }

    public zzfd()
    {
        this(10);
        return;
    }

    public zzfd(int p2)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(p2);
        this.zzc = v0_1;
        return;
    }

    private zzfd(java.util.ArrayList p1)
    {
        this.zzc = p1;
        return;
    }

    private static String zzh(Object p1)
    {
        if (!(p1 instanceof String)) {
            if (!(p1 instanceof com.google.android.gms.internal.auth.zzee)) {
                return com.google.android.gms.internal.auth.zzez.zzh(((byte[]) p1));
            } else {
                return ((com.google.android.gms.internal.auth.zzee) p1).zzm(com.google.android.gms.internal.auth.zzez.zzb);
            }
        } else {
            return ((String) p1);
        }
    }

    public final bridge synthetic void add(int p2, Object p3)
    {
        this.zza();
        this.zzc.add(p2, ((String) p3));
        this.modCount = (this.modCount + 1);
        return;
    }

    public final boolean addAll(int p2, java.util.Collection p3)
    {
        this.zza();
        if ((p3 instanceof com.google.android.gms.internal.auth.zzfe)) {
            p3 = ((com.google.android.gms.internal.auth.zzfe) p3).zzg();
        }
        boolean v2_1 = this.zzc.addAll(p2, p3);
        this.modCount = (this.modCount + 1);
        return v2_1;
    }

    public final boolean addAll(java.util.Collection p2)
    {
        return this.addAll(this.size(), p2);
    }

    public final void clear()
    {
        this.zza();
        this.zzc.clear();
        this.modCount = (this.modCount + 1);
        return;
    }

    public final bridge synthetic Object get(int p1)
    {
        return this.zzf(p1);
    }

    public final bridge synthetic Object remove(int p2)
    {
        this.zza();
        String v2_1 = this.zzc.remove(p2);
        this.modCount = (this.modCount + 1);
        return com.google.android.gms.internal.auth.zzfd.zzh(v2_1);
    }

    public final bridge synthetic Object set(int p2, Object p3)
    {
        this.zza();
        return com.google.android.gms.internal.auth.zzfd.zzh(this.zzc.set(p2, ((String) p3)));
    }

    public final int size()
    {
        return this.zzc.size();
    }

    public final bridge synthetic com.google.android.gms.internal.auth.zzey zzd(int p2)
    {
        if (p2 < this.size()) {
            throw new IllegalArgumentException();
        } else {
            java.util.ArrayList v0_2 = new java.util.ArrayList(p2);
            v0_2.addAll(this.zzc);
            return new com.google.android.gms.internal.auth.zzfd(v0_2);
        }
    }

    public final com.google.android.gms.internal.auth.zzfe zze()
    {
        if (!this.zzc()) {
            return this;
        } else {
            return new com.google.android.gms.internal.auth.zzhd(this);
        }
    }

    public final String zzf(int p3)
    {
        java.util.List v0_4 = this.zzc.get(p3);
        if (!(v0_4 instanceof String)) {
            if (!(v0_4 instanceof com.google.android.gms.internal.auth.zzee)) {
                java.util.List v0_8 = ((byte[]) v0_4);
                String v1_4 = com.google.android.gms.internal.auth.zzez.zzh(v0_8);
                if (com.google.android.gms.internal.auth.zzez.zzi(v0_8)) {
                    this.zzc.set(p3, v1_4);
                }
                return v1_4;
            } else {
                java.util.List v0_3 = ((com.google.android.gms.internal.auth.zzee) v0_4);
                String v1_1 = v0_3.zzm(com.google.android.gms.internal.auth.zzez.zzb);
                if (v0_3.zzh()) {
                    this.zzc.set(p3, v1_1);
                }
                return v1_1;
            }
        } else {
            return ((String) v0_4);
        }
    }

    public final java.util.List zzg()
    {
        return java.util.Collections.unmodifiableList(this.zzc);
    }
}
