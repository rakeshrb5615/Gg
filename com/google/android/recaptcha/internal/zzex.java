package com.google.android.recaptcha.internal;
public final class zzex {
    private final com.google.android.recaptcha.internal.zzfm zza;

    public zzex()
    {
        this(0, 1, 0);
        return;
    }

    public synthetic zzex(com.google.android.recaptcha.internal.zzfm p1, int p2, kotlin.jvm.internal.f p3)
    {
        com.google.android.recaptcha.internal.zzfm v1_1 = new com.google.android.recaptcha.internal.zzfm();
        this.zza = v1_1;
        return;
    }

    public final com.google.android.recaptcha.internal.zzew zza(String p4)
    {
        try {
            String v4_3 = this.zza.zza(p4);
            v4_3.setRequestMethod("POST");
            v4_3.setDoOutput(1);
            v4_3.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new com.google.android.recaptcha.internal.zzew(v4_3);
        } catch (String v4_4) {
            throw v4_4;
        } catch (String v4_1) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzai, v4_1.getMessage());
        }
    }
}
