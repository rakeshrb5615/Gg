package com.google.android.gms.common;
public class GmsSignatureVerifier {
    private static final com.google.android.gms.common.zzab zza;
    private static final com.google.android.gms.common.zzab zzb;
    private static final java.util.HashMap zzc;

    static GmsSignatureVerifier()
    {
        java.util.HashMap v0_1 = new com.google.android.gms.common.zzaa();
        v0_1.zza("com.google.android.gms");
        v0_1.zzb(204200000);
        com.google.android.gms.internal.common.zzah v1_6 = com.google.android.gms.common.zzo.zzf;
        v0_1.zzc(com.google.android.gms.internal.common.zzah.zzm(v1_6.zzc(), com.google.android.gms.common.zzo.zzd.zzc(), com.google.android.gms.common.zzo.zzb.zzc()));
        byte[] v2_1 = com.google.android.gms.common.zzo.zze;
        com.google.android.gms.common.zzm v4_2 = com.google.android.gms.common.zzo.zzc;
        v0_1.zzd(com.google.android.gms.internal.common.zzah.zzm(v2_1.zzc(), v4_2.zzc(), com.google.android.gms.common.zzo.zza.zzc()));
        com.google.android.gms.common.GmsSignatureVerifier.zza = v0_1.zze();
        java.util.HashMap v0_4 = new com.google.android.gms.common.zzaa();
        v0_4.zza("com.android.vending");
        v0_4.zzb(82240000);
        v0_4.zzc(com.google.android.gms.internal.common.zzah.zzk(v1_6.zzc()));
        v0_4.zzd(com.google.android.gms.internal.common.zzah.zzl(v2_1.zzc(), v4_2.zzc()));
        com.google.android.gms.common.GmsSignatureVerifier.zzb = v0_4.zze();
        com.google.android.gms.common.GmsSignatureVerifier.zzc = new java.util.HashMap();
        return;
    }
}
