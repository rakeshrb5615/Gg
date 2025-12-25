package com.google.android.gms.common.api.internal;
abstract class zad extends com.google.android.gms.common.api.internal.zac {
    protected final com.google.android.gms.tasks.TaskCompletionSource zaa;

    public zad(int p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        super(p1);
        super.zaa = p2;
        return;
    }

    public abstract void zac();

    public final void zad(com.google.android.gms.common.api.Status p2)
    {
        this.zaa.trySetException(new com.google.android.gms.common.api.ApiException(p2));
        return;
    }

    public final void zae(Exception p2)
    {
        this.zaa.trySetException(p2);
        return;
    }

    public final void zaf(com.google.android.gms.common.api.internal.zabq p2)
    {
        try {
            this.zac(p2);
            return;
        } catch (RuntimeException v2_1) {
            this.zad(com.google.android.gms.common.api.internal.zai.zah(v2_1));
            throw v2_1;
        } catch (RuntimeException v2_3) {
            this.zad(com.google.android.gms.common.api.internal.zai.zah(v2_3));
            return;
        } catch (RuntimeException v2_2) {
            this.zaa.trySetException(v2_2);
            return;
        }
    }

    public void zag(com.google.android.gms.common.api.internal.zaad p1, boolean p2)
    {
        return;
    }
}
