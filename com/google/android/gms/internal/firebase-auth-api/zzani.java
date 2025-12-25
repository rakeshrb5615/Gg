package com.google.android.gms.internal.firebase-auth-api;
final class zzani implements java.util.Iterator {
    private int zza;
    private java.util.Iterator zzb;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzang zzc;

    private zzani(com.google.android.gms.internal.firebase-auth-api.zzang p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        this.zza = com.google.android.gms.internal.firebase-auth-api.zzang.zza(p1);
        return;
    }

    public synthetic zzani(com.google.android.gms.internal.firebase-auth-api.zzang p1, com.google.android.gms.internal.firebase-auth-api.zzanl p2)
    {
        this(p1);
        return;
    }

    private final java.util.Iterator zza()
    {
        if (this.zzb == null) {
            this.zzb = com.google.android.gms.internal.firebase-auth-api.zzang.zzc(this.zzc).entrySet().iterator();
        }
        return this.zzb;
    }

    public final boolean hasNext()
    {
        int v0_0 = this.zza;
        if (((v0_0 <= 0) || (v0_0 > com.google.android.gms.internal.firebase-auth-api.zzang.zza(this.zzc))) && (!this.zza().hasNext())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final synthetic Object next()
    {
        if (!this.zza().hasNext()) {
            com.google.android.gms.internal.firebase-auth-api.zzank v0_8 = com.google.android.gms.internal.firebase-auth-api.zzang.zze(this.zzc);
            int v1_1 = (this.zza - 1);
            this.zza = v1_1;
            return ((com.google.android.gms.internal.firebase-auth-api.zzank) v0_8[v1_1]);
        } else {
            return ((java.util.Map$Entry) this.zza().next());
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
