package com.google.android.gms.internal.firebase-auth-api;
final class zzaba implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzail zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzahk zzb;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zzc;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzahv zzd;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzafs zze;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzaar zzf;

    public zzaba(com.google.android.gms.internal.firebase-auth-api.zzaar p1, com.google.android.gms.internal.firebase-auth-api.zzail p2, com.google.android.gms.internal.firebase-auth-api.zzahk p3, com.google.android.gms.internal.firebase-auth-api.zzael p4, com.google.android.gms.internal.firebase-auth-api.zzahv p5, com.google.android.gms.internal.firebase-auth-api.zzafs p6)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        java.util.Objects.requireNonNull(p1);
        this.zzf = p1;
        return;
    }

    public final synthetic void zza(Object p7)
    {
        if (!this.zza.zzi("EMAIL")) {
            if (this.zza.zzc() != null) {
                this.zzb.zzb(this.zza.zzc());
            }
        } else {
            this.zzb.zzb(0);
        }
        if (!this.zza.zzi("DISPLAY_NAME")) {
            if (this.zza.zzb() != null) {
                this.zzb.zza(this.zza.zzb());
            }
        } else {
            this.zzb.zza(0);
        }
        if (!this.zza.zzi("PHOTO_URL")) {
            if (this.zza.zze() != null) {
                this.zzb.zzc(this.zza.zze());
            }
        } else {
            this.zzb.zzc(0);
        }
        if (!android.text.TextUtils.isEmpty(this.zza.zzd())) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(com.google.android.gms.common.util.Base64Utils.encode("redacted".getBytes()));
        }
        if (this.zza.zzi("delete_passkey")) {
            this.zzb.zza(com.google.android.gms.internal.firebase-auth-api.zzah.zzg());
        }
        com.google.android.gms.internal.firebase-auth-api.zzael v0_26 = ((com.google.android.gms.internal.firebase-auth-api.zzaik) p7).zze();
        if (v0_26 == null) {
            v0_26 = new java.util.ArrayList();
        }
        this.zzb.zza(v0_26);
        com.google.android.gms.internal.firebase-auth-api.zzael v0_28 = this.zzc;
        com.google.android.gms.internal.firebase-auth-api.zzahv v1_0 = this.zzd;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.internal.firebase-auth-api.zzaik) p7));
        String v2_6 = ((com.google.android.gms.internal.firebase-auth-api.zzaik) p7).zzc();
        String v3 = ((com.google.android.gms.internal.firebase-auth-api.zzaik) p7).zzd();
        if ((!android.text.TextUtils.isEmpty(v2_6)) && (!android.text.TextUtils.isEmpty(v3))) {
            v1_0 = new com.google.android.gms.internal.firebase-auth-api.zzahv(v3, v2_6, Long.valueOf(((com.google.android.gms.internal.firebase-auth-api.zzaik) p7).zza()), v1_0.zze());
        }
        v0_28.zza(v1_0, this.zzb);
        return;
    }

    public final void zza(String p2)
    {
        this.zze.zza(p2);
        return;
    }
}
