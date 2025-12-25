package com.google.android.gms.internal.firebase-auth-api;
public class zzafo {
    com.google.android.gms.internal.firebase-auth-api.zzaeo zza;
    java.util.concurrent.Executor zzb;

    public zzafo()
    {
        return;
    }

    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.internal.firebase-auth-api.zzafq p4)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zzb.execute(new com.google.android.gms.internal.firebase-auth-api.zzafr(this, p4, v0_1));
        return v0_1.getTask();
    }
}
