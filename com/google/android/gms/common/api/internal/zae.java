package com.google.android.gms.common.api.internal;
public final class zae extends com.google.android.gms.common.api.internal.zai {
    protected final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zaa;

    public zae(int p1, com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        super(p1);
        super.zaa = ((com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Null methods are not runnable."));
        return;
    }

    public final void zad(com.google.android.gms.common.api.Status p3)
    {
        try {
            this.zaa.setFailedResult(p3);
            return;
        } catch (IllegalStateException v3_1) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", v3_1);
            return;
        }
    }

    public final void zae(Exception p4)
    {
        try {
            this.zaa.setFailedResult(new com.google.android.gms.common.api.Status(10, g2.g.e(p4.getClass().getSimpleName(), ": ", p4.getLocalizedMessage())));
            return;
        } catch (IllegalStateException v4_2) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", v4_2);
            return;
        }
    }

    public final void zaf(com.google.android.gms.common.api.internal.zabq p2)
    {
        try {
            this.zaa.run(p2.zaf());
            return;
        } catch (RuntimeException v2_2) {
            this.zae(v2_2);
            return;
        }
    }

    public final void zag(com.google.android.gms.common.api.internal.zaad p2, boolean p3)
    {
        p2.zac(this.zaa, p3);
        return;
    }
}
