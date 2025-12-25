package com.google.android.gms.internal.firebase-auth-api;
public final class zzafp implements com.google.android.gms.internal.firebase-auth-api.zzafg {
    private final com.google.android.gms.internal.firebase-auth-api.zzaff zza;
    private final com.google.android.gms.tasks.TaskCompletionSource zzb;

    public zzafp(com.google.android.gms.internal.firebase-auth-api.zzaff p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void zza(Object p4, com.google.android.gms.common.api.Status p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb, "completion source cannot be null");
        if (p5 == null) {
            this.zzb.setResult(p4);
            return;
        } else {
            y4.j v4_7 = this.zza;
            if (v4_7.zzq == null) {
                int v0_1 = v4_7.zzn;
                if (v0_1 == 0) {
                    this.zzb.setException(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(p5));
                    return;
                } else {
                    this.zzb.setException(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(p5, v0_1, v4_7.zzo, v4_7.zzp));
                    return;
                }
            } else {
                int v0_8;
                q4.h v5_2 = this.zzb;
                y4.j v4_5 = com.google.firebase.auth.FirebaseAuth.getInstance(v4_7.zzc);
                int v0_2 = this.zza;
                if ((!"reauthenticateWithCredential".equals(v0_2.zza())) && (!"reauthenticateWithCredentialWithData".equals(this.zza.zza()))) {
                    v0_8 = 0;
                } else {
                    v0_8 = this.zza.zzd;
                }
                v5_2.setException(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v4_5, v0_2.zzq, v0_8));
                return;
            }
        }
    }
}
