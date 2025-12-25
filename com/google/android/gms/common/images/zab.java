package com.google.android.gms.common.images;
final class zab implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.images.ImageManager zaa;
    private final com.google.android.gms.common.images.zag zab;

    public zab(com.google.android.gms.common.images.ImageManager p1, com.google.android.gms.common.images.zag p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final void run()
    {
        com.google.android.gms.common.internal.Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        Throwable v0_20 = ((com.google.android.gms.common.images.ImageManager$ImageReceiver) com.google.android.gms.common.images.ImageManager.zag(this.zaa).get(this.zab));
        if (v0_20 != null) {
            com.google.android.gms.common.images.ImageManager.zag(this.zaa).remove(this.zab);
            v0_20.zac(this.zab);
        }
        Throwable v0_1 = this.zab;
        android.net.Uri v1_4 = v0_1.zaa;
        Object v2_1 = v1_4.zaa;
        if (v2_1 == null) {
            android.net.Uri v1_5 = this.zaa;
            v0_1.zab(com.google.android.gms.common.images.ImageManager.zaa(v1_5), com.google.android.gms.common.images.ImageManager.zac(v1_5), 1);
            return;
        } else {
            Throwable v0_6 = ((Long) com.google.android.gms.common.images.ImageManager.zaf(this.zaa).get(v2_1));
            if (v0_6 != null) {
                if ((android.os.SystemClock.elapsedRealtime() - v0_6.longValue()) >= 3600000) {
                    com.google.android.gms.common.images.ImageManager.zaf(this.zaa).remove(v1_4.zaa);
                } else {
                    android.net.Uri v1_9 = this.zaa;
                    this.zab.zab(com.google.android.gms.common.images.ImageManager.zaa(v1_9), com.google.android.gms.common.images.ImageManager.zac(v1_9), 1);
                    return;
                }
            }
            this.zab.zaa(0, 0, 1, 0);
            Throwable v0_15 = ((com.google.android.gms.common.images.ImageManager$ImageReceiver) com.google.android.gms.common.images.ImageManager.zah(this.zaa).get(v1_4.zaa));
            if (v0_15 == null) {
                java.util.HashSet v3_2 = new com.google.android.gms.common.images.ImageManager$ImageReceiver(this.zaa, v1_4.zaa);
                com.google.android.gms.common.images.ImageManager.zah(this.zaa).put(v1_4.zaa, v3_2);
                v0_15 = v3_2;
            }
            v0_15.zab(this.zab);
            Object v2_9 = this.zab;
            if (!(v2_9 instanceof com.google.android.gms.common.images.zaf)) {
                com.google.android.gms.common.images.ImageManager.zag(this.zaa).put(v2_9, v0_15);
            }
            com.google.android.gms.common.images.ImageManager.zad();
            if (!com.google.android.gms.common.images.ImageManager.zae().contains(v1_4.zaa)) {
                com.google.android.gms.common.images.ImageManager.zae().add(v1_4.zaa);
                v0_15.zad();
            }
            return;
        }
    }
}
