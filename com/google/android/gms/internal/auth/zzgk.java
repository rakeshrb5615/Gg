package com.google.android.gms.internal.auth;
final class zzgk extends com.google.android.gms.internal.auth.zzgu {

    public zzgk(int p2)
    {
        super(p2, 0);
        return;
    }

    public final void zza()
    {
        if (!this.zzj()) {
            int v0_2 = 0;
            while (v0_2 < this.zzb()) {
                java.util.Map$Entry v1_3 = this.zzg(v0_2);
                if (((com.google.android.gms.internal.auth.zzeo) v1_3.getKey()).zzc()) {
                    v1_3.setValue(java.util.Collections.unmodifiableList(((java.util.List) v1_3.getValue())));
                }
                v0_2++;
            }
            int v0_1 = this.zzc().iterator();
            while (v0_1.hasNext()) {
                java.util.Map$Entry v1_2 = ((java.util.Map$Entry) v0_1.next());
                if (((com.google.android.gms.internal.auth.zzeo) v1_2.getKey()).zzc()) {
                    v1_2.setValue(java.util.Collections.unmodifiableList(((java.util.List) v1_2.getValue())));
                }
            }
        }
        super.zza();
        return;
    }
}
