package com.google.android.gms.internal.play_billing;
final class zzgy extends com.google.android.gms.internal.play_billing.zzhd {

    public zzgy()
    {
        super(0);
        return;
    }

    public final void zza()
    {
        if (!this.zzj()) {
            int v0_2 = 0;
            while (v0_2 < this.zzc()) {
                java.util.Map$Entry v1_3 = this.zzg(v0_2);
                if (((com.google.android.gms.internal.play_billing.zzey) ((com.google.android.gms.internal.play_billing.zzgz) v1_3).zza()).zze()) {
                    v1_3.setValue(java.util.Collections.unmodifiableList(((java.util.List) v1_3.getValue())));
                }
                v0_2++;
            }
            int v0_1 = this.zzd().iterator();
            while (v0_1.hasNext()) {
                java.util.Map$Entry v1_2 = ((java.util.Map$Entry) v0_1.next());
                if (((com.google.android.gms.internal.play_billing.zzey) v1_2.getKey()).zze()) {
                    v1_2.setValue(java.util.Collections.unmodifiableList(((java.util.List) v1_2.getValue())));
                }
            }
        }
        super.zza();
        return;
    }
}
