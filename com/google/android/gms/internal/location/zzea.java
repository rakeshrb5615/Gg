package com.google.android.gms.internal.location;
final synthetic class zzea implements com.google.android.gms.tasks.OnCompleteListener {
    private final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public synthetic zzea(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void onComplete(com.google.android.gms.tasks.Task p2)
    {
        if (!p2.isSuccessful()) {
            com.google.android.gms.tasks.TaskCompletionSource v0_1 = this.zza;
            Exception v2_1 = p2.getException();
            java.util.Objects.requireNonNull(v2_1);
            v0_1.trySetException(v2_1);
        }
        return;
    }
}
