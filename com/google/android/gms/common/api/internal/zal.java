package com.google.android.gms.common.api.internal;
public final class zal {
    private final r.e zaa;
    private final r.e zab;
    private final com.google.android.gms.tasks.TaskCompletionSource zac;
    private int zad;
    private boolean zae;

    public zal(Iterable p4)
    {
        this.zab = new r.e(0);
        this.zac = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zae = 0;
        this.zaa = new r.e(0);
        int v4_1 = p4.iterator();
        while (v4_1.hasNext()) {
            this.zaa.put(((com.google.android.gms.common.api.HasApiKey) v4_1.next()).getApiKey(), 0);
        }
        this.zad = ((r.b) this.zaa.keySet()).a.c;
        return;
    }

    public final com.google.android.gms.tasks.Task zaa()
    {
        return this.zac.getTask();
    }

    public final java.util.Set zab()
    {
        return this.zaa.keySet();
    }

    public final void zac(com.google.android.gms.common.api.internal.ApiKey p2, com.google.android.gms.common.ConnectionResult p3, String p4)
    {
        this.zaa.put(p2, p3);
        this.zab.put(p2, p4);
        this.zad = (this.zad - 1);
        if (!p3.isSuccess()) {
            this.zae = 1;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.setResult(this.zab);
            } else {
                this.zac.setException(new com.google.android.gms.common.api.AvailabilityException(this.zaa));
                return;
            }
        }
        return;
    }
}
