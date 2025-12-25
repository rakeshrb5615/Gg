package com.google.android.gms.common.api.internal;
final class zabs {
    private final com.google.android.gms.common.api.internal.ApiKey zaa;
    private final com.google.android.gms.common.Feature zab;

    public synthetic zabs(com.google.android.gms.common.api.internal.ApiKey p1, com.google.android.gms.common.Feature p2, com.google.android.gms.common.api.internal.zabr p3)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public static bridge synthetic com.google.android.gms.common.Feature zaa(com.google.android.gms.common.api.internal.zabs p0)
    {
        return p0.zab;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.ApiKey zab(com.google.android.gms.common.api.internal.zabs p0)
    {
        return p0.zaa;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 == 0) || ((!(p4 instanceof com.google.android.gms.common.api.internal.zabs)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zaa, ((com.google.android.gms.common.api.internal.zabs) p4).zaa)) || (!com.google.android.gms.common.internal.Objects.equal(this.zab, ((com.google.android.gms.common.api.internal.zabs) p4).zab))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zaa, this.zab}));
    }

    public final String toString()
    {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.zab).toString();
    }
}
