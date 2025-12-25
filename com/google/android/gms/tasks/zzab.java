package com.google.android.gms.tasks;
final class zzab implements com.google.android.gms.tasks.Continuation {
    final synthetic java.util.Collection zza;

    public zzab(java.util.Collection p1)
    {
        this.zza = p1;
        return;
    }

    public final bridge synthetic Object then(com.google.android.gms.tasks.Task p2)
    {
        com.google.android.gms.tasks.Task v2_1 = new java.util.ArrayList();
        v2_1.addAll(this.zza);
        return com.google.android.gms.tasks.Tasks.forResult(v2_1);
    }
}
