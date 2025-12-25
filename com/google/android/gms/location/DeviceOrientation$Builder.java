package com.google.android.gms.location;
public final class DeviceOrientation$Builder {
    private final float[] zza;
    private float zzb;
    private float zzc;
    private long zzd;
    private byte zze;
    private float zzf;
    private float zzg;

    public DeviceOrientation$Builder(com.google.android.gms.location.DeviceOrientation p3)
    {
        this.zze = 0;
        com.google.android.gms.location.DeviceOrientation.zzb(p3.zzc());
        this.zza = java.util.Arrays.copyOf(p3.zzc(), p3.zzc().length);
        this.setHeadingDegrees(p3.zzd());
        this.setHeadingErrorDegrees(p3.zze());
        this.setConservativeHeadingErrorDegrees(p3.zzi());
        this.setElapsedRealtimeNs(p3.zzf());
        this.zzf = p3.zzh();
        this.zze = p3.zzg();
        return;
    }

    public DeviceOrientation$Builder(float[] p3, float p4, float p5, long p6)
    {
        this.zze = 0;
        com.google.android.gms.location.DeviceOrientation.zzb(p3);
        this.zza = java.util.Arrays.copyOf(p3, p3.length);
        this.setHeadingDegrees(p4);
        this.setHeadingErrorDegrees(p5);
        this.setElapsedRealtimeNs(p6);
        this.zzf = 0;
        this.zzg = 1127481344;
        this.zze = 0;
        return;
    }

    public com.google.android.gms.location.DeviceOrientation build()
    {
        return new com.google.android.gms.location.DeviceOrientation(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public com.google.android.gms.location.DeviceOrientation$Builder clearConservativeHeadingErrorDegrees()
    {
        this.zzg = 1127481344;
        byte v0_2 = (this.zze & -65);
        this.zzf = 0;
        this.zze = ((byte) (((byte) v0_2) & -33));
        return this;
    }

    public com.google.android.gms.location.DeviceOrientation$Builder setAttitude(float[] p4)
    {
        com.google.android.gms.location.DeviceOrientation.zzb(p4);
        System.arraycopy(p4, 0, this.zza, 0, p4.length);
        return this;
    }

    public com.google.android.gms.location.DeviceOrientation$Builder setConservativeHeadingErrorDegrees(float p5)
    {
        float v0_0 = 0;
        double v2_0 = 0;
        if ((p5 >= 0) && (p5 <= 1127481344)) {
            v2_0 = 1;
        }
        com.google.android.gms.internal.location.zzer.zzb(v2_0, "conservativeHeadingErrorDegrees should be between 0 and 180.");
        this.zzg = p5;
        this.zze = ((byte) (this.zze | 64));
        if (p5 < 1127481344) {
            v0_0 = ((float) (4611686018427387904 / (4607182418800017408 - Math.cos(Math.toRadians(((double) p5))))));
        }
        this.zzf = v0_0;
        this.zze = ((byte) (this.zze | 32));
        return this;
    }

    public com.google.android.gms.location.DeviceOrientation$Builder setElapsedRealtimeNs(long p3)
    {
        int v0_2;
        if (p3 < 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.internal.location.zzer.zzb(v0_2, "elapsedRealtimeNs should be greater than or equal to 0.");
        this.zzd = p3;
        return this;
    }

    public com.google.android.gms.location.DeviceOrientation$Builder setHeadingDegrees(float p3)
    {
        int v1 = 0;
        if ((p3 >= 0) && (p3 < 1135869952)) {
            v1 = 1;
        }
        com.google.android.gms.internal.location.zzer.zzb(v1, "headingDegrees should be greater than or equal to 0 and less than 360.");
        this.zzb = p3;
        return this;
    }

    public com.google.android.gms.location.DeviceOrientation$Builder setHeadingErrorDegrees(float p3)
    {
        int v1 = 0;
        if ((p3 >= 0) && (p3 <= 1127481344)) {
            v1 = 1;
        }
        com.google.android.gms.internal.location.zzer.zzb(v1, "headingErrorDegrees should be between 0 and 180.");
        this.zzc = p3;
        return this;
    }
}
