package com.google.android.gms.internal.firebase-auth-api;
 class zzaff$zza extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private final java.util.List zza;

    private zzaff$zza(com.google.android.gms.common.api.internal.LifecycleFragment p2, java.util.List p3)
    {
        super(p2);
        super.mLifecycleFragment.addCallback("PhoneAuthActivityStopCallback", super);
        super.zza = p3;
        return;
    }

    public static void zza(android.app.Activity p2, java.util.List p3)
    {
        com.google.android.gms.common.api.internal.LifecycleFragment v2_1 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(p2);
        if (((com.google.android.gms.internal.firebase-auth-api.zzaff$zza) v2_1.getCallbackOrNull("PhoneAuthActivityStopCallback", com.google.android.gms.internal.firebase-auth-api.zzaff$zza)) == null) {
            new com.google.android.gms.internal.firebase-auth-api.zzaff$zza(v2_1, p3);
        }
        return;
    }

    public void onStop()
    {
        try {
            this.zza.clear();
            return;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }
}
