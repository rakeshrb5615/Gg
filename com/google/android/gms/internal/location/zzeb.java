package com.google.android.gms.internal.location;
final synthetic class zzeb implements com.google.android.gms.tasks.OnTokenCanceledListener {
    private final synthetic com.google.android.gms.common.internal.ICancelToken zza;

    public synthetic zzeb(com.google.android.gms.common.internal.ICancelToken p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void onCanceled()
    {
        try {
            this.zza.cancel();
        } catch (android.os.RemoteException) {
        }
        return;
    }
}
