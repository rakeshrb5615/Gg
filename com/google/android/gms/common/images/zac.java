package com.google.android.gms.common.images;
final class zac implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.graphics.Bitmap zac;
    private final java.util.concurrent.CountDownLatch zad;

    public zac(com.google.android.gms.common.images.ImageManager p1, android.net.Uri p2, android.graphics.Bitmap p3, boolean p4, java.util.concurrent.CountDownLatch p5)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p5;
        return;
    }

    public final void run()
    {
        com.google.android.gms.common.internal.Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        Object v0_6 = ((com.google.android.gms.common.images.ImageManager$ImageReceiver) com.google.android.gms.common.images.ImageManager.zah(this.zaa).remove(this.zab));
        if (v0_6 != null) {
            Object v0_1 = com.google.android.gms.common.images.ImageManager$ImageReceiver.zaa(v0_6);
            Throwable v1_0 = v0_1.size();
            int v3 = 0;
            while (v3 < v1_0) {
                com.google.android.gms.common.images.zag v4_1 = ((com.google.android.gms.common.images.zag) v0_1.get(v3));
                java.util.Map v5_0 = this.zac;
                if (v5_0 == null) {
                    com.google.android.gms.common.images.ImageManager.zaf(this.zaa).put(this.zab, Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                    java.util.Map v5_3 = this.zaa;
                    v4_1.zab(com.google.android.gms.common.images.ImageManager.zaa(v5_3), com.google.android.gms.common.images.ImageManager.zac(v5_3), 0);
                } else {
                    v4_1.zac(com.google.android.gms.common.images.ImageManager.zaa(this.zaa), v5_0, 0);
                }
                if (!(v4_1 instanceof com.google.android.gms.common.images.zaf)) {
                    com.google.android.gms.common.images.ImageManager.zag(this.zaa).remove(v4_1);
                }
                v3++;
            }
        }
        this.zad.countDown();
        com.google.android.gms.common.images.ImageManager.zad();
        try {
            com.google.android.gms.common.images.ImageManager.zae().remove(this.zab);
            return;
        } catch (Throwable v1_2) {
            throw v1_2;
        }
    }
}
