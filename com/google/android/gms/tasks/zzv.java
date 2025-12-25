package com.google.android.gms.tasks;
final class zzv extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private final java.util.List zza;

    private zzv(com.google.android.gms.common.api.internal.LifecycleFragment p2)
    {
        super(p2);
        super.zza = new java.util.ArrayList();
        super.mLifecycleFragment.addCallback("TaskOnStopCallback", super);
        return;
    }

    public static com.google.android.gms.tasks.zzv zza(android.app.Activity p2)
    {
        com.google.android.gms.common.api.internal.LifecycleFragment v2_1 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(p2);
        com.google.android.gms.tasks.zzv v0_3 = ((com.google.android.gms.tasks.zzv) v2_1.getCallbackOrNull("TaskOnStopCallback", com.google.android.gms.tasks.zzv));
        if (v0_3 == null) {
            v0_3 = new com.google.android.gms.tasks.zzv(v2_1);
        }
        return v0_3;
    }

    public final void onStop()
    {
        java.util.List v1_2 = this.zza.iterator();
        while (v1_2.hasNext()) {
            com.google.android.gms.tasks.zzq v2_3 = ((com.google.android.gms.tasks.zzq) ((ref.WeakReference) v1_2.next()).get());
            if (v2_3 != null) {
                v2_3.zzc();
            }
        }
        this.zza.clear();
        return;
    }

    public final void zzb(com.google.android.gms.tasks.zzq p4)
    {
        try {
            this.zza.add(new ref.WeakReference(p4));
            return;
        } catch (Throwable v4_1) {
            throw v4_1;
        }
    }
}
