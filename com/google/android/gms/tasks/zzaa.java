package com.google.android.gms.tasks;
final class zzaa implements com.google.android.gms.tasks.Continuation {
    final synthetic java.util.Collection zza;

    public zzaa(java.util.Collection p1)
    {
        this.zza = p1;
        return;
    }

    public final bridge synthetic Object then(com.google.android.gms.tasks.Task p3)
    {
        java.util.ArrayList v3_1 = new java.util.ArrayList();
        java.util.Iterator v0_1 = this.zza.iterator();
        while (v0_1.hasNext()) {
            v3_1.add(((com.google.android.gms.tasks.Task) v0_1.next()).getResult());
        }
        return v3_1;
    }
}
