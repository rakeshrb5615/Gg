package com.google.android.gms.internal.measurement;
abstract class zzku extends java.util.AbstractList implements com.google.android.gms.internal.measurement.zzmo {
    private boolean zza;

    public zzku(boolean p1)
    {
        this.zza = p1;
        return;
    }

    public void add(int p1, Object p2)
    {
        this.zzcF();
        super.add(p1, p2);
        return;
    }

    public boolean add(Object p1)
    {
        this.zzcF();
        return super.add(p1);
    }

    public final boolean addAll(int p1, java.util.Collection p2)
    {
        this.zzcF();
        return super.addAll(p1, p2);
    }

    public boolean addAll(java.util.Collection p1)
    {
        this.zzcF();
        return super.addAll(p1);
    }

    public final void clear()
    {
        this.zzcF();
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
        int v1 = 0;
        int v2_0 = 1;
        while (v1 < v0) {
            v2_0 = ((v2_0 * 31) + this.get(v1).hashCode());
            v1++;
        }
        return v2_0;
    }

    public Object remove(int p1)
    {
        this.zzcF();
        return super.remove(p1);
    }

    public final boolean remove(Object p2)
    {
        this.zzcF();
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
        this.zzcF();
        return super.removeAll(p1);
    }

    public final boolean retainAll(java.util.Collection p1)
    {
        this.zzcF();
        return super.retainAll(p1);
    }

    public Object set(int p1, Object p2)
    {
        this.zzcF();
        return super.set(p1, p2);
    }

    public final boolean zza()
    {
        return this.zza;
    }

    public final void zzb()
    {
        if (this.zza) {
            this.zza = 0;
        }
        return;
    }

    public final void zzcF()
    {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }
}
