package com.google.android.gms.common.images;
public final class zae extends com.google.android.gms.common.images.zag {
    private final ref.WeakReference zac;

    public zae(android.widget.ImageView p2, int p3)
    {
        super(android.net.Uri.EMPTY, p3);
        com.google.android.gms.common.internal.Asserts.checkNotNull(p2);
        super.zac = new ref.WeakReference(p2);
        return;
    }

    public zae(android.widget.ImageView p2, android.net.Uri p3)
    {
        super(p3, 0);
        com.google.android.gms.common.internal.Asserts.checkNotNull(p2);
        super.zac = new ref.WeakReference(p2);
        return;
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof com.google.android.gms.common.images.zae)) {
                android.widget.ImageView v1_3 = ((android.widget.ImageView) this.zac.get());
                boolean v4_3 = ((android.widget.ImageView) ((com.google.android.gms.common.images.zae) p4).zac.get());
                if ((!v4_3) || ((v1_3 == null) || (!com.google.android.gms.common.internal.Objects.equal(v4_3, v1_3)))) {
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
        return 0;
    }

    public final void zaa(android.graphics.drawable.Drawable p3, boolean p4, boolean p5, boolean p6)
    {
        com.google.android.gms.internal.base.zal v0_2 = ((android.widget.ImageView) this.zac.get());
        if (v0_2 != null) {
            if ((p5 == null) && ((p6 == 0) && ((v0_2 instanceof com.google.android.gms.internal.base.zal)))) {
                throw 0;
            } else {
                int v6_1 = 0;
                if ((p5 == null) && (p4 == 0)) {
                    v6_1 = 1;
                }
                if (v6_1 != 0) {
                    int v4_1 = v0_2.getDrawable();
                    if (v4_1 == 0) {
                        v4_1 = 0;
                    } else {
                        if ((v4_1 instanceof com.google.android.gms.internal.base.zak)) {
                            v4_1 = ((com.google.android.gms.internal.base.zak) v4_1).zaa();
                        }
                    }
                    p3 = new com.google.android.gms.internal.base.zak(v4_1, p3);
                }
                v0_2.setImageDrawable(p3);
                if ((v0_2 instanceof com.google.android.gms.internal.base.zal)) {
                    throw 0;
                } else {
                    if ((p3 != null) && (v6_1 != 0)) {
                        ((com.google.android.gms.internal.base.zak) p3).zab(250);
                        return;
                    }
                }
            }
        }
        return;
    }
}
