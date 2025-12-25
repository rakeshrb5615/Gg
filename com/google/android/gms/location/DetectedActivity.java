package com.google.android.gms.location;
public class DetectedActivity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    public static final java.util.Comparator zza;
    final int zzb;
    final int zzc;

    static DetectedActivity()
    {
        com.google.android.gms.location.DetectedActivity.zza = new com.google.android.gms.location.zzk();
        com.google.android.gms.location.DetectedActivity.CREATOR = new com.google.android.gms.location.zzl();
        return;
    }

    public DetectedActivity(int p1, int p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((!(p4 instanceof com.google.android.gms.location.DetectedActivity)) || ((this.zzb != ((com.google.android.gms.location.DetectedActivity) p4).zzb) || (this.zzc != ((com.google.android.gms.location.DetectedActivity) p4).zzc))) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getConfidence()
    {
        return this.zzc;
    }

    public int getType()
    {
        int v0_0 = this.zzb;
        if ((v0_0 <= 22) && (v0_0 >= 0)) {
            return v0_0;
        } else {
            return 4;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zzb), Integer.valueOf(this.zzc)}));
    }

    public String toString()
    {
        String v0_1;
        String v0_0 = this.getType();
        if (v0_0 == null) {
            v0_1 = "IN_VEHICLE";
        } else {
            if (v0_0 == 1) {
                v0_1 = "ON_BICYCLE";
            } else {
                if (v0_0 == 2) {
                    v0_1 = "ON_FOOT";
                } else {
                    if (v0_0 == 3) {
                        v0_1 = "STILL";
                    } else {
                        if (v0_0 == 4) {
                            v0_1 = "UNKNOWN";
                        } else {
                            if (v0_0 == 5) {
                                v0_1 = "TILTING";
                            } else {
                                if (v0_0 == 7) {
                                    v0_1 = "WALKING";
                                } else {
                                    if (v0_0 == 8) {
                                        v0_1 = "RUNNING";
                                    } else {
                                        if (v0_0 == 16) {
                                            v0_1 = "IN_ROAD_VEHICLE";
                                        } else {
                                            if (v0_0 == 17) {
                                                v0_1 = "IN_RAIL_VEHICLE";
                                            } else {
                                                v0_1 = Integer.toString(v0_0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int v2_7 = this.zzc;
        StringBuilder v3_4 = new StringBuilder(((String.valueOf(v2_7).length() + (String.valueOf(v0_1).length() + 36)) + 1));
        v3_4.append("DetectedActivity [type=");
        v3_4.append(v0_1);
        v3_4.append(", confidence=");
        v3_4.append(v2_7);
        v3_4.append("]");
        return v3_4.toString();
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 2, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
