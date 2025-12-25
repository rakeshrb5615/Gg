package com.google.android.gms.location;
public class DeviceOrientation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final float[] zza;
    private final float zzb;
    private final float zzc;
    private final long zzd;
    private final byte zze;
    private final float zzf;
    private final float zzg;

    static DeviceOrientation()
    {
        com.google.android.gms.location.DeviceOrientation.CREATOR = new com.google.android.gms.location.zzm();
        return;
    }

    public DeviceOrientation(float[] p6, float p7, float p8, long p9, byte p11, float p12, float p13)
    {
        int v1_0;
        com.google.android.gms.location.DeviceOrientation.zzj(p6);
        int v2 = 1;
        if ((p7 < 0) || (p7 >= 1135869952)) {
            v1_0 = 0;
        } else {
            v1_0 = 1;
        }
        int v1_3;
        com.google.android.gms.internal.location.zzer.zza(v1_0);
        if ((p8 < 0) || (p8 > 1127481344)) {
            v1_3 = 0;
        } else {
            v1_3 = 1;
        }
        long v0_3;
        com.google.android.gms.internal.location.zzer.zza(v1_3);
        if ((p13 < 0) || (p13 > 1127481344)) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        com.google.android.gms.internal.location.zzer.zza(v0_3);
        if (p9 < 0) {
            v2 = 0;
        }
        com.google.android.gms.internal.location.zzer.zza(v2);
        this.zza = p6;
        this.zzb = p7;
        this.zzc = p8;
        this.zzf = p12;
        this.zzg = p13;
        this.zzd = p9;
        this.zze = ((byte) (((byte) (((byte) (p11 | 16)) | 4)) | 8));
        return;
    }

    public static synthetic void zzb(float[] p0)
    {
        com.google.android.gms.location.DeviceOrientation.zzj(p0);
        return;
    }

    private static void zzj(float[] p4)
    {
        int v2_9;
        int v0 = 1;
        if ((!p4) || (p4.length != 4)) {
            v2_9 = 0;
        } else {
            v2_9 = 1;
        }
        com.google.android.gms.internal.location.zzer.zzb(v2_9, "Input attitude array should be of length 4.");
        if ((Float.isNaN(p4[0])) || ((Float.isNaN(p4[1])) || ((Float.isNaN(p4[2])) || (Float.isNaN(p4[3]))))) {
            v0 = 0;
        }
        com.google.android.gms.internal.location.zzer.zzb(v0, "Input attitude cannot contain NaNs.");
        return;
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.google.android.gms.location.DeviceOrientation)) {
                if ((this.zza() != ((com.google.android.gms.location.DeviceOrientation) p8).zza()) || ((this.zza()) && (Float.compare(this.zzf, ((com.google.android.gms.location.DeviceOrientation) p8).zzf) != 0))) {
                    float[] v1_3 = 0;
                } else {
                    v1_3 = 1;
                }
                if ((this.hasConservativeHeadingErrorDegrees() != ((com.google.android.gms.location.DeviceOrientation) p8).hasConservativeHeadingErrorDegrees()) || ((this.hasConservativeHeadingErrorDegrees()) && (Float.compare(this.getConservativeHeadingErrorDegrees(), ((com.google.android.gms.location.DeviceOrientation) p8).getConservativeHeadingErrorDegrees()) != 0))) {
                    long v3_5 = 0;
                } else {
                    v3_5 = 1;
                }
                if ((Float.compare(this.zzb, ((com.google.android.gms.location.DeviceOrientation) p8).zzb) != 0) || ((Float.compare(this.zzc, ((com.google.android.gms.location.DeviceOrientation) p8).zzc) != 0) || ((v1_3 == null) || ((v3_5 == 0) || ((this.zzd != ((com.google.android.gms.location.DeviceOrientation) p8).zzd) || (!java.util.Arrays.equals(this.zza, ((com.google.android.gms.location.DeviceOrientation) p8).zza))))))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public float[] getAttitude()
    {
        return ((float[]) this.zza.clone());
    }

    public float getConservativeHeadingErrorDegrees()
    {
        return this.zzg;
    }

    public long getElapsedRealtimeNs()
    {
        return this.zzd;
    }

    public float getHeadingDegrees()
    {
        return this.zzb;
    }

    public float getHeadingErrorDegrees()
    {
        return this.zzc;
    }

    public boolean hasConservativeHeadingErrorDegrees()
    {
        if ((this.zze & 64) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        Float v1 = Float.valueOf(this.zzb);
        Float.valueOf(this.zzc);
        Float.valueOf(this.zzg);
        Long.valueOf(this.zzd);
        float[] v5 = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v1, Byte.valueOf(this.zze)}));
    }

    public String toString()
    {
        String v0_1 = new StringBuilder("DeviceOrientation[attitude=");
        v0_1.append(java.util.Arrays.toString(this.zza));
        v0_1.append(", headingDegrees=");
        v0_1.append(this.zzb);
        v0_1.append(", headingErrorDegrees=");
        v0_1.append(this.zzc);
        if (this.hasConservativeHeadingErrorDegrees()) {
            v0_1.append(", conservativeHeadingErrorDegrees=");
            v0_1.append(this.zzg);
        }
        v0_1.append(", elapsedRealtimeNs=");
        v0_1.append(this.zzd);
        v0_1.append(93);
        return v0_1.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(p4, 1, this.getAttitude(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(p4, 4, this.getHeadingDegrees());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(p4, 5, this.getHeadingErrorDegrees());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 6, this.getElapsedRealtimeNs());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(p4, 7, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(p4, 8, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(p4, 9, this.getConservativeHeadingErrorDegrees());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final boolean zza()
    {
        if ((this.zze & 32) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final synthetic float[] zzc()
    {
        return this.zza;
    }

    public final synthetic float zzd()
    {
        return this.zzb;
    }

    public final synthetic float zze()
    {
        return this.zzc;
    }

    public final synthetic long zzf()
    {
        return this.zzd;
    }

    public final synthetic byte zzg()
    {
        return this.zze;
    }

    public final synthetic float zzh()
    {
        return this.zzf;
    }

    public final synthetic float zzi()
    {
        return this.zzg;
    }
}
