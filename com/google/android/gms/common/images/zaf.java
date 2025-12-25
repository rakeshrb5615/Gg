package com.google.android.gms.common.images;
public final class zaf extends com.google.android.gms.common.images.zag {
    private final ref.WeakReference zac;

    public zaf(com.google.android.gms.common.images.ImageManager$OnImageLoadedListener p2, android.net.Uri p3)
    {
        super(p3, 0);
        com.google.android.gms.common.internal.Asserts.checkNotNull(p2);
        super.zac = new ref.WeakReference(p2);
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.common.images.zaf)) {
                com.google.android.gms.common.images.zad v1_5 = ((com.google.android.gms.common.images.ImageManager$OnImageLoadedListener) this.zac.get());
                com.google.android.gms.common.images.ImageManager$OnImageLoadedListener v3_2 = ((com.google.android.gms.common.images.ImageManager$OnImageLoadedListener) ((com.google.android.gms.common.images.zaf) p5).zac.get());
                if ((v3_2 == null) || ((v1_5 == null) || ((!com.google.android.gms.common.internal.Objects.equal(v3_2, v1_5)) || (!com.google.android.gms.common.internal.Objects.equal(((com.google.android.gms.common.images.zaf) p5).zaa, this.zaa))))) {
                    return 0;
                } else {
                    return 1;
                }
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

    public final void zaa(android.graphics.drawable.Drawable p1, boolean p2, boolean p3, boolean p4)
    {
        if (p3 == null) {
            com.google.android.gms.common.images.ImageManager$OnImageLoadedListener v2_2 = ((com.google.android.gms.common.images.ImageManager$OnImageLoadedListener) this.zac.get());
            if (v2_2 != null) {
                v2_2.onImageLoaded(this.zaa.zaa, p1, p4);
            }
        }
        return;
    }
}
