package com.google.android.gms.location;
public final class Geofence$Builder {
    private String zza;
    private int zzb;
    private long zzc;
    private short zzd;
    private double zze;
    private double zzf;
    private float zzg;
    private int zzh;
    private int zzi;

    public Geofence$Builder()
    {
        this.zza = 0;
        this.zzb = 3;
        this.zzc = -1;
        this.zzd = -1;
        this.zzh = 0;
        this.zzi = -1;
        return;
    }

    public com.google.android.gms.location.Geofence build()
    {
        if (this.zza == null) {
            throw new IllegalArgumentException("Request ID not set.");
        } else {
            IllegalArgumentException v0_18 = this.zzb;
            if (v0_18 == null) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else {
                if (((v0_18 & 4) != 0) && (this.zzi < 0)) {
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                } else {
                    if (this.zzc == -9223372036854775808) {
                        throw new IllegalArgumentException("Expiration not set.");
                    } else {
                        if (this.zzd == -1) {
                            throw new IllegalArgumentException("Geofence region not set.");
                        } else {
                            if (this.zzh < 0) {
                                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                            } else {
                                return new com.google.android.gms.internal.location.zzek(this.zza, this.zzb, 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
                            }
                        }
                    }
                }
            }
        }
    }

    public com.google.android.gms.location.Geofence$Builder setCircularRegion(double p6, double p8, float p10)
    {
        String v0_13;
        int v2 = 0;
        if ((p6 < -4587338432941916160) || (p6 > 4636033603912859648)) {
            v0_13 = 0;
        } else {
            v0_13 = 1;
        }
        String v0_4;
        StringBuilder v4_1 = new StringBuilder((String.valueOf(p6).length() + 18));
        v4_1.append("Invalid latitude: ");
        v4_1.append(p6);
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_13, v4_1.toString());
        if ((p8 < -4582834833314545664) || (p8 > 4640537203540230144)) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        StringBuilder v4_3 = new StringBuilder((String.valueOf(p8).length() + 19));
        v4_3.append("Invalid longitude: ");
        v4_3.append(p8);
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_4, v4_3.toString());
        if (p10 > 0) {
            v2 = 1;
        }
        StringBuilder v3_14 = new StringBuilder((String.valueOf(p10).length() + 16));
        v3_14.append("Invalid radius: ");
        v3_14.append(p10);
        com.google.android.gms.common.internal.Preconditions.checkArgument(v2, v3_14.toString());
        this.zzd = 1;
        this.zze = p6;
        this.zzf = p8;
        this.zzg = p10;
        return this;
    }

    public com.google.android.gms.location.Geofence$Builder setExpirationDuration(long p3)
    {
        if (p3 >= 0) {
            this.zzc = (com.google.android.gms.common.util.DefaultClock.getInstance().elapsedRealtime() + p3);
            return this;
        } else {
            this.zzc = -1;
            return this;
        }
    }

    public com.google.android.gms.location.Geofence$Builder setLoiteringDelay(int p1)
    {
        this.zzi = p1;
        return this;
    }

    public com.google.android.gms.location.Geofence$Builder setNotificationResponsiveness(int p1)
    {
        this.zzh = p1;
        return this;
    }

    public com.google.android.gms.location.Geofence$Builder setRequestId(String p2)
    {
        this.zza = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Request ID can\'t be set to null"));
        return this;
    }

    public com.google.android.gms.location.Geofence$Builder setTransitionTypes(int p1)
    {
        this.zzb = p1;
        return this;
    }
}
