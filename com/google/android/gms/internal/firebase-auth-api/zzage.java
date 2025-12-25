package com.google.android.gms.internal.firebase-auth-api;
final class zzage implements com.google.android.gms.tasks.OnFailureListener {

    public zzage(com.google.android.gms.internal.firebase-auth-api.zzagc p1)
    {
        java.util.Objects.requireNonNull(p1);
        return;
    }

    public final void onFailure(Exception p3)
    {
        Object[] v1_2 = new Object[0];
        com.google.android.gms.internal.firebase-auth-api.zzagc.zza().e(g2.g.l("SmsRetrieverClient failed to start: ", p3.getMessage()), v1_2);
        return;
    }
}
