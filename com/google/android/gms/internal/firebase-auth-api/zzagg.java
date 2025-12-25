package com.google.android.gms.internal.firebase-auth-api;
final class zzagg extends android.content.BroadcastReceiver {
    private final String zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzagc zzb;

    public zzagg(com.google.android.gms.internal.firebase-auth-api.zzagc p1, String p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public final void onReceive(android.content.Context p3, android.content.Intent p4)
    {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(p4.getAction())) {
            com.google.android.gms.internal.firebase-auth-api.zzagc v4_9 = p4.getExtras();
            if (((com.google.android.gms.common.api.Status) v4_9.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode() == 0) {
                String v0_8 = ((com.google.android.gms.internal.firebase-auth-api.zzagj) com.google.android.gms.internal.firebase-auth-api.zzagc.zza(this.zzb).get(this.zza));
                if (v0_8 != null) {
                    com.google.android.gms.internal.firebase-auth-api.zzagc v4_3 = com.google.android.gms.internal.firebase-auth-api.zzagc.zza(((String) v4_9.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE")));
                    v0_8.zze = v4_3;
                    if (v4_3 != null) {
                        if (!com.google.android.gms.internal.firebase-auth-api.zzac.zzc(v0_8.zzd)) {
                            com.google.android.gms.internal.firebase-auth-api.zzagc.zzb(this.zzb, this.zza);
                        }
                    } else {
                        Object[] v1_3 = new Object[0];
                        com.google.android.gms.internal.firebase-auth-api.zzagc.zza().e("Unable to extract verification code.", v1_3);
                    }
                } else {
                    Object[] v1_4 = new Object[0];
                    com.google.android.gms.internal.firebase-auth-api.zzagc.zza().e("Verification code received with no active retrieval session.", v1_4);
                }
            }
            p3.getApplicationContext().unregisterReceiver(this);
        }
        return;
    }
}
