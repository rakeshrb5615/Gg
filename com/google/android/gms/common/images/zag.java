package com.google.android.gms.common.images;
public abstract class zag {
    final com.google.android.gms.common.images.zad zaa;
    protected int zab;

    public zag(android.net.Uri p2, int p3)
    {
        this.zab = 0;
        this.zaa = new com.google.android.gms.common.images.zad(p2);
        this.zab = p3;
        return;
    }

    public abstract void zaa();

    public final void zab(android.content.Context p1, com.google.android.gms.internal.base.zam p2, boolean p3)
    {
        int v1_1;
        int v2_0 = this.zab;
        if (v2_0 == 0) {
            v1_1 = 0;
        } else {
            v1_1 = p1.getResources().getDrawable(v2_0);
        }
        this.zaa(v1_1, p3, 0, 0);
        return;
    }

    public final void zac(android.content.Context p1, android.graphics.Bitmap p2, boolean p3)
    {
        com.google.android.gms.common.internal.Asserts.checkNotNull(p2);
        this.zaa(new android.graphics.drawable.BitmapDrawable(p1.getResources(), p2), 0, 0, 1);
        return;
    }
}
