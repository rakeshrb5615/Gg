package com.google.android.gms.tasks;
final class zza implements com.google.android.gms.tasks.OnSuccessListener {
    final synthetic com.google.android.gms.tasks.OnTokenCanceledListener zza;

    public zza(com.google.android.gms.tasks.zzb p1, com.google.android.gms.tasks.OnTokenCanceledListener p2)
    {
        this.zza = p2;
        return;
    }

    public final bridge synthetic void onSuccess(Object p1)
    {
        this.zza.onCanceled();
        return;
    }
}
