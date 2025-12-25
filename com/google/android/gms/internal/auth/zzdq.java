package com.google.android.gms.internal.auth;
abstract class zzdq extends java.util.AbstractList implements com.google.android.gms.internal.auth.zzey {
    private boolean zza;

    public zzdq()
    {
        this.zza = 1;
        return;
    }

    public void add(int p1, Object p2)
    {
        this.zza();
        super.add(p1, p2);
        return;
    }

    public boolean add(Object p1)
    {
        this.zza();
        return super.add(p1);
    }

    public boolean addAll(int p1, java.util.Collection p2)
    {
        this.zza();
        return super.addAll(p1, p2);
    }

    public boolean addAll(java.util.Collection p1)
    {
        this.zza();
        return super.addAll(p1);
    }

    public void clear()
    {
        this.zza();
        super.clear();
        return;
    }

    public boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof java.util.List)) {
                if ((p7 instanceof java.util.RandomAccess)) {
                    int v1_2 = this.size();
                    if (v1_2 != ((java.util.List) p7).size()) {
                        return 0;
                    } else {
                        int v3_1 = 0;
                        while (v3_1 < v1_2) {
                            if (this.get(v3_1).equals(((java.util.List) p7).get(v3_1))) {
                                v3_1++;
                            } else {
                                return 0;
                            }
                        }
                        return 1;
                    }
                } else {
                    return super.equals(p7);
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        int v0 = this.size();
        int v1_0 = 1;
        int v2 = 0;
        while (v2 < v0) {
            v1_0 = ((v1_0 * 31) + this.get(v2).hashCode());
            v2++;
        }
        return v1_0;
    }

    public Object remove(int p1)
    {
        this.zza();
        return super.remove(p1);
    }

    public final boolean remove(Object p2)
    {
        this.zza();
        int v2_1 = this.indexOf(p2);
        if (v2_1 != -1) {
            this.remove(v2_1);
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean removeAll(java.util.Collection p1)
    {
        this.zza();
        return super.removeAll(p1);
    }

    public final boolean retainAll(java.util.Collection p1)
    {
        this.zza();
        return super.retainAll(p1);
    }

    public Object set(int p1, Object p2)
    {
        this.zza();
        return super.set(p1, p2);
    }

    public final void zza()
    {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final void zzb()
    {
        this.zza = 0;
        return;
    }

    public final boolean zzc()
    {
        return this.zza;
    }
}
