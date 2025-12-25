package com.google.android.gms.internal.measurement;
final class zzoa extends com.google.android.gms.internal.measurement.zzoe {

    public zzoa()
    {
        super(0);
        return;
    }

    public final void zza()
    {
        if (!this.zzb()) {
            int v0_2 = 0;
            while (v0_2 < this.zzc()) {
                java.util.Map$Entry v1_3 = this.zzd(v0_2);
                if (((com.google.android.gms.internal.measurement.zzlv) ((com.google.android.gms.internal.measurement.zzob) v1_3).zza()).zzd()) {
                    v1_3.setValue(java.util.Collections.unmodifiableList(((java.util.List) v1_3.getValue())));
                }
                v0_2++;
            }
            int v0_1 = this.zze().iterator();
            while (v0_1.hasNext()) {
                java.util.Map$Entry v1_2 = ((java.util.Map$Entry) v0_1.next());
                if (((com.google.android.gms.internal.measurement.zzlv) v1_2.getKey()).zzd()) {
                    v1_2.setValue(java.util.Collections.unmodifiableList(((java.util.List) v1_2.getValue())));
                }
            }
        }
        super.zza();
        return;
    }
}
