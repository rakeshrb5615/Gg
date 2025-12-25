package com.google.android.gms.common.images;
public final class ImageManager {
    private static final Object zaa;
    private static final java.util.HashSet zab;
    private static com.google.android.gms.common.images.ImageManager zac;
    private final android.content.Context zad;
    private final android.os.Handler zae;
    private final java.util.concurrent.ExecutorService zaf;
    private final com.google.android.gms.internal.base.zam zag;
    private final java.util.Map zah;
    private final java.util.Map zai;
    private final java.util.Map zaj;

    static ImageManager()
    {
        com.google.android.gms.common.images.ImageManager.zaa = new Object();
        com.google.android.gms.common.images.ImageManager.zab = new java.util.HashSet();
        return;
    }

    private ImageManager(android.content.Context p2, boolean p3)
    {
        this.zad = p2.getApplicationContext();
        this.zae = new com.google.android.gms.internal.base.zau(android.os.Looper.getMainLooper());
        this.zaf = com.google.android.gms.internal.base.zat.zaa().zab(4, 2);
        this.zag = new com.google.android.gms.internal.base.zam();
        this.zah = new java.util.HashMap();
        this.zai = new java.util.HashMap();
        this.zaj = new java.util.HashMap();
        return;
    }

    public static com.google.android.gms.common.images.ImageManager create(android.content.Context p2)
    {
        if (com.google.android.gms.common.images.ImageManager.zac == null) {
            com.google.android.gms.common.images.ImageManager.zac = new com.google.android.gms.common.images.ImageManager(p2, 0);
        }
        return com.google.android.gms.common.images.ImageManager.zac;
    }

    public static bridge synthetic android.content.Context zaa(com.google.android.gms.common.images.ImageManager p0)
    {
        return p0.zad;
    }

    public static bridge synthetic android.os.Handler zab(com.google.android.gms.common.images.ImageManager p0)
    {
        return p0.zae;
    }

    public static bridge synthetic com.google.android.gms.internal.base.zam zac(com.google.android.gms.common.images.ImageManager p0)
    {
        return p0.zag;
    }

    public static bridge synthetic Object zad()
    {
        return com.google.android.gms.common.images.ImageManager.zaa;
    }

    public static bridge synthetic java.util.HashSet zae()
    {
        return com.google.android.gms.common.images.ImageManager.zab;
    }

    public static bridge synthetic java.util.Map zaf(com.google.android.gms.common.images.ImageManager p0)
    {
        return p0.zaj;
    }

    public static bridge synthetic java.util.Map zag(com.google.android.gms.common.images.ImageManager p0)
    {
        return p0.zah;
    }

    public static bridge synthetic java.util.Map zah(com.google.android.gms.common.images.ImageManager p0)
    {
        return p0.zai;
    }

    public static bridge synthetic java.util.concurrent.ExecutorService zai(com.google.android.gms.common.images.ImageManager p0)
    {
        return p0.zaf;
    }

    public void loadImage(android.widget.ImageView p2, int p3)
    {
        this.zaj(new com.google.android.gms.common.images.zae(p2, p3));
        return;
    }

    public void loadImage(android.widget.ImageView p2, android.net.Uri p3)
    {
        this.zaj(new com.google.android.gms.common.images.zae(p2, p3));
        return;
    }

    public void loadImage(android.widget.ImageView p2, android.net.Uri p3, int p4)
    {
        com.google.android.gms.common.images.zae v0_1 = new com.google.android.gms.common.images.zae(p2, p3);
        v0_1.zab = p4;
        this.zaj(v0_1);
        return;
    }

    public void loadImage(com.google.android.gms.common.images.ImageManager$OnImageLoadedListener p2, android.net.Uri p3)
    {
        this.zaj(new com.google.android.gms.common.images.zaf(p2, p3));
        return;
    }

    public void loadImage(com.google.android.gms.common.images.ImageManager$OnImageLoadedListener p2, android.net.Uri p3, int p4)
    {
        com.google.android.gms.common.images.zaf v0_1 = new com.google.android.gms.common.images.zaf(p2, p3);
        v0_1.zab = p4;
        this.zaj(v0_1);
        return;
    }

    public final void zaj(com.google.android.gms.common.images.zag p2)
    {
        com.google.android.gms.common.internal.Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new com.google.android.gms.common.images.zab(this, p2).run();
        return;
    }
}
