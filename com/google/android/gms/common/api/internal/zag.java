package com.google.android.gms.common.api.internal;
public final class zag extends com.google.android.gms.common.api.internal.zac {
    private final com.google.android.gms.common.api.internal.TaskApiCall zaa;
    private final com.google.android.gms.tasks.TaskCompletionSource zab;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zad;

    public zag(int p1, com.google.android.gms.common.api.internal.TaskApiCall p2, com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.common.api.internal.StatusExceptionMapper p4)
    {
        super(p1);
        super.zab = p3;
        super.zaa = p2;
        super.zad = p4;
        if ((p1 == 2) && (p2.shouldAutoResolveMissingFeatures())) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        } else {
            return;
        }
    }

    public final boolean zaa(com.google.android.gms.common.api.internal.zabq p1)
    {
        return this.zaa.shouldAutoResolveMissingFeatures();
    }

    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq p1)
    {
        return this.zaa.zab();
    }

    public final void zad(com.google.android.gms.common.api.Status p3)
    {
        this.zab.trySetException(this.zad.getException(p3));
        return;
    }

    public final void zae(Exception p2)
    {
        this.zab.trySetException(p2);
        return;
    }

    public final void zaf(com.google.android.gms.common.api.internal.zabq p3)
    {
        try {
            this.zaa.doExecute(p3.zaf(), this.zab);
            return;
        } catch (com.google.android.gms.common.api.Status v3_3) {
            throw v3_3;
        } catch (com.google.android.gms.common.api.Status v3_1) {
            this.zad(com.google.android.gms.common.api.internal.zai.zah(v3_1));
            return;
        } catch (com.google.android.gms.common.api.Status v3_5) {
            this.zab.trySetException(v3_5);
            return;
        }
    }

    public final void zag(com.google.android.gms.common.api.internal.zaad p2, boolean p3)
    {
        p2.zad(this.zab, p3);
        return;
    }
}
