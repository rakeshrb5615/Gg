package com.google.android.gms.internal.play_billing;
final class zzfd implements com.google.android.gms.internal.play_billing.zzgj {
    private static final com.google.android.gms.internal.play_billing.zzfd zza;

    static zzfd()
    {
        com.google.android.gms.internal.play_billing.zzfd.zza = new com.google.android.gms.internal.play_billing.zzfd();
        return;
    }

    private zzfd()
    {
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzfd zza()
    {
        return com.google.android.gms.internal.play_billing.zzfd.zza;
    }

    public final com.google.android.gms.internal.play_billing.zzgi zzb(Class p4)
    {
        if (!com.google.android.gms.internal.play_billing.zzfi.isAssignableFrom(p4)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(p4.getName()));
        } else {
            try {
                return ((com.google.android.gms.internal.play_billing.zzgi) com.google.android.gms.internal.play_billing.zzfi.zzn(p4.asSubclass(com.google.android.gms.internal.play_billing.zzfi)).zzb(3, 0, 0));
            } catch (Exception v0_6) {
                throw new RuntimeException("Unable to get message info for ".concat(p4.getName()), v0_6);
            }
        }
    }

    public final boolean zzc(Class p2)
    {
        return com.google.android.gms.internal.play_billing.zzfi.isAssignableFrom(p2);
    }
}
