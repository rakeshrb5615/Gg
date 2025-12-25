package com.google.android.recaptcha.internal;
public final synthetic class zzbu implements com.google.android.gms.tasks.OnCompleteListener {
    public final synthetic d8.t zza;

    public synthetic zzbu(d8.t p1)
    {
        this.zza = p1;
        return;
    }

    public final void onComplete(com.google.android.gms.tasks.Task p3)
    {
        d8.u v0_0 = this.zza;
        boolean v1_0 = p3.getException();
        if (v1_0) {
            ((d8.u) v0_0).O(v1_0);
            return;
        } else {
            if (!p3.isCanceled()) {
                ((d8.u) v0_0).A(p3.getResult());
                return;
            } else {
                ((d8.r1) v0_0).cancel(0);
                return;
            }
        }
    }
}
