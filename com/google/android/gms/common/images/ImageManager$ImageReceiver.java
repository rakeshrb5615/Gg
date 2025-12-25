package com.google.android.gms.common.images;
final class ImageManager$ImageReceiver extends android.os.ResultReceiver {
    final synthetic com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final java.util.ArrayList zac;

    public ImageManager$ImageReceiver(com.google.android.gms.common.images.ImageManager p2, android.net.Uri p3)
    {
        this.zaa = p2;
        super(new com.google.android.gms.internal.base.zau(android.os.Looper.getMainLooper()));
        super.zab = p3;
        super.zac = new java.util.ArrayList();
        return;
    }

    public static bridge synthetic java.util.ArrayList zaa(com.google.android.gms.common.images.ImageManager$ImageReceiver p0)
    {
        return p0.zac;
    }

    public final void onReceiveResult(int p4, android.os.Bundle p5)
    {
        com.google.android.gms.common.images.ImageManager v5_1 = this.zaa;
        com.google.android.gms.common.images.ImageManager.zai(v5_1).execute(new com.google.android.gms.common.images.zaa(v5_1, this.zab, ((android.os.ParcelFileDescriptor) p5.getParcelable("com.google.android.gms.extra.fileDescriptor"))));
        return;
    }

    public final void zab(com.google.android.gms.common.images.zag p2)
    {
        com.google.android.gms.common.internal.Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
        this.zac.add(p2);
        return;
    }

    public final void zac(com.google.android.gms.common.images.zag p2)
    {
        com.google.android.gms.common.internal.Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
        this.zac.remove(p2);
        return;
    }

    public final void zad()
    {
        android.content.Intent v0_1 = new android.content.Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        v0_1.setPackage("com.google.android.gms");
        v0_1.putExtra("com.google.android.gms.extras.uri", this.zab);
        v0_1.putExtra("com.google.android.gms.extras.resultReceiver", this);
        v0_1.putExtra("com.google.android.gms.extras.priority", 3);
        com.google.android.gms.common.images.ImageManager.zaa(this.zaa).sendBroadcast(v0_1);
        return;
    }
}
