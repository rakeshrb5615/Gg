package com.google.android.gms.common.images;
final class zaa implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.os.ParcelFileDescriptor zac;

    public zaa(com.google.android.gms.common.images.ImageManager p1, android.net.Uri p2, android.os.ParcelFileDescriptor p3)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public final void run()
    {
        com.google.android.gms.common.internal.Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can\'t be executed in the main thread");
        String v0_2 = this.zac;
        android.graphics.Bitmap v2 = 0;
        int v3_3 = 0;
        if (v0_2 != null) {
            try {
                v2 = android.graphics.BitmapFactory.decodeFileDescriptor(v0_2.getFileDescriptor());
                try {
                    this.zac.close();
                } catch (String v0_4) {
                    android.util.Log.e("ImageManager", "closed failed", v0_4);
                }
            } catch (String v0_1) {
                android.util.Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.zab)), v0_1);
                v3_3 = 1;
            }
        }
        android.graphics.Bitmap v9 = v2;
        int v10 = v3_3;
        java.util.concurrent.CountDownLatch v11_1 = new java.util.concurrent.CountDownLatch(1);
        com.google.android.gms.common.images.ImageManager v7 = this.zaa;
        com.google.android.gms.common.images.ImageManager.zab(v7).post(new com.google.android.gms.common.images.zac(v7, this.zab, v9, v10, v11_1));
        try {
            v11_1.await();
            return;
        } catch (InterruptedException) {
            android.util.Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.zab)));
            return;
        }
    }
}
