package com.google.android.gms.common.api.internal;
final class zacz extends com.google.android.gms.internal.base.zau {
    final synthetic com.google.android.gms.common.api.internal.zada zaa;

    public zacz(com.google.android.gms.common.api.internal.zada p1, android.os.Looper p2)
    {
        this.zaa = p1;
        super(p2);
        return;
    }

    public final void handleMessage(android.os.Message p5)
    {
        String v0_0 = p5.what;
        if (v0_0 == null) {
            com.google.android.gms.common.api.Status v5_7 = ((com.google.android.gms.common.api.PendingResult) p5.obj);
            com.google.android.gms.common.api.internal.zada.zad(this.zaa);
            com.google.android.gms.common.api.internal.zada v1_1 = ((com.google.android.gms.common.api.internal.zada) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.common.api.internal.zada.zac(this.zaa)));
            if (v5_7 != null) {
                if (!(v5_7 instanceof com.google.android.gms.common.api.internal.zacp)) {
                    v1_1.zai(v5_7);
                } else {
                    com.google.android.gms.common.api.internal.zada.zag(v1_1, ((com.google.android.gms.common.api.internal.zacp) v5_7).zaa());
                }
            } else {
                com.google.android.gms.common.api.internal.zada.zag(v1_1, new com.google.android.gms.common.api.Status(13, "Transform returned null"));
            }
            return;
        } else {
            if (v0_0 == 1) {
                com.google.android.gms.common.api.Status v5_9 = ((RuntimeException) p5.obj);
                android.util.Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(v5_9.getMessage())));
                throw v5_9;
            } else {
                com.google.android.gms.common.api.Status v5_11 = new StringBuilder("TransformationResultHandler received unknown message type: ");
                v5_11.append(v0_0);
                android.util.Log.e("TransformedResultImpl", v5_11.toString());
                return;
            }
        }
    }
}
