package com.google.android.gms.internal.play_billing;
final class zzs extends com.google.android.gms.internal.play_billing.zzo {
    final synthetic com.google.android.gms.internal.play_billing.zzt zzg;

    public zzs(com.google.android.gms.internal.play_billing.zzt p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzg = p1;
        return;
    }

    public final String zza()
    {
        String v0_5 = ((com.google.android.gms.internal.play_billing.zzp) this.zzg.zza.get());
        if (v0_5 != null) {
            return v1.a.l("tag=[", String.valueOf(v0_5.zza), "]");
        } else {
            return "Completer object has been garbage collected, future will fail soon";
        }
    }
}
