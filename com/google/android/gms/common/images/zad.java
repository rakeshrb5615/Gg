package com.google.android.gms.common.images;
final class zad {
    public final android.net.Uri zaa;

    public zad(android.net.Uri p1)
    {
        this.zaa = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.google.android.gms.common.images.zad)) {
                return com.google.android.gms.common.internal.Objects.equal(((com.google.android.gms.common.images.zad) p2).zaa, this.zaa);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zaa}));
    }
}
