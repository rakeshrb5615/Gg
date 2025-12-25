package com.google.android.gms.internal.firebase-auth-api;
final class zzanj implements java.util.Iterator {
    private int zza;
    private boolean zzb;
    private java.util.Iterator zzc;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzang zzd;

    private zzanj(com.google.android.gms.internal.firebase-auth-api.zzang p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        this.zza = -1;
        return;
    }

    public synthetic zzanj(com.google.android.gms.internal.firebase-auth-api.zzang p1, com.google.android.gms.internal.firebase-auth-api.zzanl p2)
    {
        this(p1);
        return;
    }

    private final java.util.Iterator zza()
    {
        if (this.zzc == null) {
            this.zzc = com.google.android.gms.internal.firebase-auth-api.zzang.zzb(this.zzd).entrySet().iterator();
        }
        return this.zzc;
    }

    public final boolean hasNext()
    {
        if (((this.zza + 1) >= com.google.android.gms.internal.firebase-auth-api.zzang.zza(this.zzd)) && ((com.google.android.gms.internal.firebase-auth-api.zzang.zzb(this.zzd).isEmpty()) || (!this.zza().hasNext()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final synthetic Object next()
    {
        this.zzb = 1;
        int v1_2 = (this.zza + 1);
        this.zza = v1_2;
        if (v1_2 >= com.google.android.gms.internal.firebase-auth-api.zzang.zza(this.zzd)) {
            return ((java.util.Map$Entry) this.zza().next());
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzank) com.google.android.gms.internal.firebase-auth-api.zzang.zze(this.zzd)[this.zza]);
        }
    }

    public final void remove()
    {
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        } else {
            this.zzb = 0;
            com.google.android.gms.internal.firebase-auth-api.zzang.zzd(this.zzd);
            if (this.zza >= com.google.android.gms.internal.firebase-auth-api.zzang.zza(this.zzd)) {
                this.zza().remove();
                return;
            } else {
                java.util.Iterator v0_3 = this.zzd;
                int v1_2 = this.zza;
                this.zza = (v1_2 - 1);
                com.google.android.gms.internal.firebase-auth-api.zzang.zza(v0_3, v1_2);
                return;
            }
        }
    }
}
