package com.google.android.recaptcha.internal;
final class zzmw implements com.google.android.recaptcha.internal.zzog {
    private static final com.google.android.recaptcha.internal.zzmw zza;

    static zzmw()
    {
        com.google.android.recaptcha.internal.zzmw.zza = new com.google.android.recaptcha.internal.zzmw();
        return;
    }

    private zzmw()
    {
        return;
    }

    public static com.google.android.recaptcha.internal.zzmw zza()
    {
        return com.google.android.recaptcha.internal.zzmw.zza;
    }

    public final com.google.android.recaptcha.internal.zzof zzb(Class p4)
    {
        if (!com.google.android.recaptcha.internal.zznd.isAssignableFrom(p4)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(p4.getName()));
        } else {
            try {
                return ((com.google.android.recaptcha.internal.zzof) com.google.android.recaptcha.internal.zznd.zzu(p4.asSubclass(com.google.android.recaptcha.internal.zznd)).zzh(3, 0, 0));
            } catch (Exception v0_6) {
                throw new RuntimeException("Unable to get message info for ".concat(p4.getName()), v0_6);
            }
        }
    }

    public final boolean zzc(Class p2)
    {
        return com.google.android.recaptcha.internal.zznd.isAssignableFrom(p2);
    }
}
