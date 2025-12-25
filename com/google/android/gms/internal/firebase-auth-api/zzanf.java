package com.google.android.gms.internal.firebase-auth-api;
final class zzanf extends com.google.android.gms.internal.firebase-auth-api.zzang {

    public zzanf()
    {
        super(0);
        return;
    }

    public final void zza()
    {
        if (!this.zze()) {
            int v0_2 = 0;
            while (v0_2 < this.zzb()) {
                java.util.Map$Entry v1_3 = this.zza(v0_2);
                if (((com.google.android.gms.internal.firebase-auth-api.zzakz) v1_3.getKey()).zze()) {
                    v1_3.setValue(java.util.Collections.unmodifiableList(((java.util.List) v1_3.getValue())));
                }
                v0_2++;
            }
            int v0_1 = this.zzc().iterator();
            while (v0_1.hasNext()) {
                java.util.Map$Entry v1_2 = ((java.util.Map$Entry) v0_1.next());
                if (((com.google.android.gms.internal.firebase-auth-api.zzakz) v1_2.getKey()).zze()) {
                    v1_2.setValue(java.util.Collections.unmodifiableList(((java.util.List) v1_2.getValue())));
                }
            }
        }
        super.zza();
        return;
    }
}
