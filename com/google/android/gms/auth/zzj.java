package com.google.android.gms.auth;
final class zzj implements com.google.android.gms.auth.zzk {
    final synthetic String zza;

    public zzj(String p1)
    {
        this.zza = p1;
        return;
    }

    public final bridge synthetic Object zza(android.os.IBinder p5)
    {
        com.google.android.gms.auth.GoogleAuthException v5_7 = com.google.android.gms.internal.auth.zze.zzb(p5).zzg(this.zza);
        com.google.android.gms.auth.zzl.zzd(v5_7);
        String v0_2 = v5_7.getString("Error");
        com.google.android.gms.auth.GoogleAuthException v5_3 = ((android.content.Intent) v5_7.getParcelable("userRecoveryIntent"));
        com.google.android.gms.auth.UserRecoverableAuthException v1_0 = com.google.android.gms.internal.auth.zzby.zza(v0_2);
        if (!com.google.android.gms.internal.auth.zzby.zzc.equals(v1_0)) {
            if (!com.google.android.gms.internal.auth.zzby.zzb(v1_0)) {
                throw new com.google.android.gms.auth.GoogleAuthException(v0_2);
            } else {
                Object[] v3_2 = new Object[0];
                com.google.android.gms.auth.zzl.zzc().w("isUserRecoverableError status: ".concat(String.valueOf(v1_0)), v3_2);
                throw new com.google.android.gms.auth.UserRecoverableAuthException(v0_2, v5_3);
            }
        } else {
            return Boolean.TRUE;
        }
    }
}
