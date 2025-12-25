package com.google.android.gms.internal.firebase-auth-api;
final class zzaga extends y4.u {
    private final synthetic y4.u zza;
    private final synthetic String zzb;

    public zzaga(y4.u p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void onCodeAutoRetrievalTimeOut(String p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(p2);
        return;
    }

    public final void onCodeSent(String p2, y4.t p3)
    {
        this.zza.onCodeSent(p2, p3);
        return;
    }

    public final void onVerificationCompleted(y4.s p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza(this.zzb);
        this.zza.onVerificationCompleted(p2);
        return;
    }

    public final void onVerificationFailed(q4.h p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza(this.zzb);
        this.zza.onVerificationFailed(p2);
        return;
    }
}
