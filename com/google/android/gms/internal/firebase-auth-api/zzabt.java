package com.google.android.gms.internal.firebase-auth-api;
final class zzabt implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzaio zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zzb;

    public zzabt(com.google.android.gms.internal.firebase-auth-api.zzaar p1, com.google.android.gms.internal.firebase-auth-api.zzaio p2, com.google.android.gms.internal.firebase-auth-api.zzael p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        return;
    }

    public final synthetic void zza(Object p4)
    {
        String v0_0 = this.zza;
        if (!(v0_0 instanceof com.google.android.gms.internal.firebase-auth-api.zzais)) {
            if (!(v0_0 instanceof com.google.android.gms.internal.firebase-auth-api.zzaiu)) {
                throw new IllegalArgumentException(v1.a.l("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", this.zza.getClass().getName(), "."));
            } else {
                this.zzb.zza(((com.google.android.gms.internal.firebase-auth-api.zzair) p4));
                return;
            }
        } else {
            this.zzb.zzb(((com.google.android.gms.internal.firebase-auth-api.zzair) p4).zza());
            return;
        }
    }

    public final void zza(String p2)
    {
        this.zzb.zza(w0.a.k(p2));
        return;
    }
}
