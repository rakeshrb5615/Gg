package com.google.android.gms.internal.auth;
final class zzdm implements java.io.Serializable, com.google.android.gms.internal.auth.zzdj {
    final Object zza;

    public zzdm(Object p1)
    {
        this.zza = p1;
        return;
    }

    public final boolean equals(Object p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.auth.zzdm)) {
            return 0;
        } else {
            Object v0_1 = this.zza;
            int v3_3 = ((com.google.android.gms.internal.auth.zzdm) p3).zza;
            if ((v0_1 != v3_3) && (!v0_1.equals(v3_3))) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final int hashCode()
    {
        return java.util.Arrays.hashCode(new Object[] {this.zza}));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Suppliers.ofInstance(");
        v0_1.append(this.zza);
        v0_1.append(")");
        return v0_1.toString();
    }

    public final Object zza()
    {
        return this.zza;
    }
}
