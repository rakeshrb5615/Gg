package com.google.android.gms.internal.firebase-auth-api;
final class zzagh extends com.google.android.gms.internal.firebase-auth-api.zzael {
    private final String zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzagc zzb;

    public zzagh(com.google.android.gms.internal.firebase-auth-api.zzagc p1, com.google.android.gms.internal.firebase-auth-api.zzael p2, String p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p2);
        super.zza = p3;
        return;
    }

    public final void zza(com.google.android.gms.common.api.Status p6)
    {
        int v2_0 = 0;
        com.google.android.gms.internal.firebase-auth-api.zzael v3_0 = new Object[0];
        com.google.android.gms.internal.firebase-auth-api.zzagc.zza().e(g2.g.f("SMS verification code request failed: ", com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(p6.getStatusCode()), " ", p6.getStatusMessage()), v3_0);
        int v0_4 = ((com.google.android.gms.internal.firebase-auth-api.zzagj) com.google.android.gms.internal.firebase-auth-api.zzagc.zza(this.zzb).get(this.zza));
        if (v0_4 != 0) {
            java.util.ArrayList v1_3 = new java.util.ArrayList();
            v1_3.addAll(v0_4.zzb);
            this.zzb.zzb(this.zza);
            int v0_7 = v1_3.size();
            while (v2_0 < v0_7) {
                com.google.android.gms.internal.firebase-auth-api.zzael v3_2 = v1_3.get(v2_0);
                v2_0++;
                ((com.google.android.gms.internal.firebase-auth-api.zzael) v3_2).zza(p6);
            }
        }
        return;
    }

    public final void zzb(String p6)
    {
        long v1_5 = new Object[0];
        com.google.android.gms.internal.firebase-auth-api.zzagc.zza().d("onCodeSent", v1_5);
        String v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzagj) com.google.android.gms.internal.firebase-auth-api.zzagc.zza(this.zzb).get(this.zza));
        if (v0_2 != null) {
            long v1_1 = v0_2.zzb.iterator();
            while (v1_1.hasNext()) {
                ((com.google.android.gms.internal.firebase-auth-api.zzael) v1_1.next()).zzb(p6);
            }
            v0_2.zzg = 1;
            v0_2.zzd = p6;
            if (v0_2.zza > 0) {
                if (v0_2.zzc) {
                    if (!com.google.android.gms.internal.firebase-auth-api.zzac.zzc(v0_2.zze)) {
                        com.google.android.gms.internal.firebase-auth-api.zzagc.zzb(this.zzb, this.zza);
                    }
                } else {
                    com.google.android.gms.internal.firebase-auth-api.zzagc.zzc(this.zzb, this.zza);
                    return;
                }
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzagc.zzd(this.zzb, this.zza);
                return;
            }
        }
        return;
    }
}
