package com.google.android.gms.security;
final class zza extends android.os.AsyncTask {
    final synthetic android.content.Context zza;
    final synthetic com.google.android.gms.security.ProviderInstaller$ProviderInstallListener zzb;

    public zza(android.content.Context p1, com.google.android.gms.security.ProviderInstaller$ProviderInstallListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final bridge synthetic Object doInBackground(Object[] p1)
    {
        try {
            com.google.android.gms.security.ProviderInstaller.installIfNeeded(this.zza);
            return Integer.valueOf(0);
        } catch (Integer v1_3) {
            Integer v1_2 = Integer.valueOf(v1_3.getConnectionStatusCode());
            return v1_2;
        } catch (Integer v1_7) {
            v1_2 = Integer.valueOf(v1_7.errorCode);
            return v1_2;
        }
    }

    public final bridge synthetic void onPostExecute(Object p5)
    {
        if (((Integer) p5).intValue() != 0) {
            this.zzb.onProviderInstallFailed(((Integer) p5).intValue(), com.google.android.gms.security.ProviderInstaller.zza().getErrorResolutionIntent(this.zza, ((Integer) p5).intValue(), "pi"));
            return;
        } else {
            this.zzb.onProviderInstalled();
            return;
        }
    }
}
