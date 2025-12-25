package com.google.android.gms.measurement.internal;
public final class zzgz extends com.google.android.gms.measurement.internal.zzos {

    public zzgz(com.google.android.gms.measurement.internal.zzpg p1)
    {
        super(p1);
        return;
    }

    public final boolean zzb()
    {
        this.zzaw();
        int v0_6 = ((android.net.ConnectivityManager) this.zzu.zzaY().getSystemService("connectivity"));
        android.net.NetworkInfo v1_0 = 0;
        if (v0_6 != 0) {
            v1_0 = v0_6.getActiveNetworkInfo();
        }
        if ((v1_0 == null) || (!v1_0.isConnected())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzbb()
    {
        return 0;
    }

    public final void zzc(String p10, com.google.android.gms.measurement.internal.zzot p11, com.google.android.gms.internal.measurement.zzib p12, com.google.android.gms.measurement.internal.zzgw p13)
    {
        this.zzg();
        this.zzaw();
        try {
            java.net.URL v5 = new java.net.URI(p11.zza()).toURL();
            this.zzg.zzp();
            com.google.android.gms.measurement.internal.zzgz v3 = this;
            String v4 = p10;
        } catch (java.net.URISyntaxException) {
            v3 = this;
            v4 = p10;
            v3.zzu.zzaV().zzb().zzc("Failed to parse URL. Not uploading MeasurementBatch. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v4), p11.zza());
            return;
        } catch (java.net.URISyntaxException) {
            v3.zzu.zzaV().zzb().zzc("Failed to parse URL. Not uploading MeasurementBatch. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v4), p11.zza());
            return;
        }
        this.zzu.zzaW().zzm(new com.google.android.gms.measurement.internal.zzgy(this, p10, v5, p12.zzcc(), p11.zzb(), p13));
        return;
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzh p10, java.util.Map p11, com.google.android.gms.measurement.internal.zzgw p12)
    {
        this.zzg();
        this.zzaw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p10);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p12);
        String v0_7 = this.zzg.zzf();
        com.google.android.gms.measurement.internal.zzhz v1_5 = new android.net.Uri$Builder();
        com.google.android.gms.measurement.internal.zzgy v2_4 = v1_5.scheme(((String) com.google.android.gms.measurement.internal.zzfy.zze.zzb(0))).encodedAuthority(((String) com.google.android.gms.measurement.internal.zzfy.zzf.zzb(0))).path("config/app/".concat(String.valueOf(p10.zzf()))).appendQueryParameter("platform", "android");
        v0_7.zzu.zzc().zzi();
        v2_4.appendQueryParameter("gmp_version", String.valueOf(133005)).appendQueryParameter("runtime_version", "0");
        String v0_6 = v1_5.build().toString();
        try {
            com.google.android.gms.measurement.internal.zzgz v3_9 = this;
        } catch (java.net.URISyntaxException) {
            v3_9 = this;
            v3_9.zzu.zzaV().zzb().zzc("Failed to parse config URL. Not fetching. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p10.zzc()), v0_6);
            return;
        } catch (java.net.URISyntaxException) {
            v3_9.zzu.zzaV().zzb().zzc("Failed to parse config URL. Not fetching. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p10.zzc()), v0_6);
            return;
        }
        this.zzu.zzaW().zzm(new com.google.android.gms.measurement.internal.zzgy(this, p10.zzc(), new java.net.URI(v0_6).toURL(), 0, p11, p12));
        return;
    }
}
