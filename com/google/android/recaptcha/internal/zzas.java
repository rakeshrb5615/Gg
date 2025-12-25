package com.google.android.recaptcha.internal;
public final class zzas {

    public static final com.google.android.gms.tasks.Task zza(d8.i0 p2)
    {
        com.google.android.gms.tasks.TaskCompletionSource v1_1 = new com.google.android.gms.tasks.TaskCompletionSource(new com.google.android.gms.tasks.CancellationTokenSource().getToken());
        p2.invokeOnCompletion(new com.google.android.recaptcha.internal.zzar(v1_1, p2));
        return v1_1.getTask();
    }
}
