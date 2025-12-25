package com.google.android.gms.internal.location;
final synthetic class zzbq implements com.google.android.gms.tasks.Continuation {
    private final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public synthetic zzbq(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic Object then(com.google.android.gms.tasks.Task p3)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0 = this.zza;
        if (!p3.isSuccessful()) {
            int v3_4 = p3.getException();
            java.util.Objects.requireNonNull(v3_4);
            v0.trySetException(v3_4);
        } else {
            v0.trySetResult(((android.location.Location) p3.getResult()));
        }
        return 0;
    }
}
