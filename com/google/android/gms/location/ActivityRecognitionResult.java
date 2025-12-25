package com.google.android.gms.location;
public class ActivityRecognitionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    java.util.List zza;
    long zzb;
    long zzc;
    int zzd;
    android.os.Bundle zze;

    static ActivityRecognitionResult()
    {
        com.google.android.gms.location.ActivityRecognitionResult.CREATOR = new com.google.android.gms.location.zzd();
        return;
    }

    public ActivityRecognitionResult(com.google.android.gms.location.DetectedActivity p9, long p10, long p12)
    {
        this(java.util.Collections.singletonList(p9), p10, p12, 0, 0);
        return;
    }

    public ActivityRecognitionResult(java.util.List p9, long p10, long p12)
    {
        this(p9, p10, p12, 0, 0);
        return;
    }

    public ActivityRecognitionResult(java.util.List p6, long p7, long p9, int p11, android.os.Bundle p12)
    {
        long v2_3;
        int v0 = 1;
        if ((p6 == null) || (p6.isEmpty())) {
            v2_3 = 0;
        } else {
            v2_3 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v2_3, "Must have at least 1 detected activity");
        if ((p7 <= 0) || (p9 <= 0)) {
            v0 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "Must set times");
        this.zza = p6;
        this.zzb = p7;
        this.zzc = p9;
        this.zzd = p11;
        this.zze = p12;
        return;
    }

    public static com.google.android.gms.location.ActivityRecognitionResult extractResult(android.content.Intent p3)
    {
        int v0_1;
        if (com.google.android.gms.location.ActivityRecognitionResult.hasResult(p3)) {
            int v0_7 = p3.getExtras();
            if (v0_7 != 0) {
                int v0_8 = v0_7.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
                if (!(v0_8 instanceof byte[])) {
                    if (!(v0_8 instanceof com.google.android.gms.location.ActivityRecognitionResult)) {
                        v0_1 = 0;
                    } else {
                        v0_1 = ((com.google.android.gms.location.ActivityRecognitionResult) v0_8);
                    }
                } else {
                    v0_1 = ((com.google.android.gms.location.ActivityRecognitionResult) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(((byte[]) v0_8), com.google.android.gms.location.ActivityRecognitionResult.CREATOR));
                }
            }
        }
        if (v0_1 == 0) {
            com.google.android.gms.location.ActivityRecognitionResult v3_1 = com.google.android.gms.location.ActivityRecognitionResult.zza(p3);
            if ((v3_1 != null) && (!v3_1.isEmpty())) {
                return ((com.google.android.gms.location.ActivityRecognitionResult) v3_1.get((v3_1.size() - 1)));
            } else {
                return 0;
            }
        } else {
            return v0_1;
        }
    }

    public static boolean hasResult(android.content.Intent p3)
    {
        if (p3) {
            if (!p3.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
                boolean v3_2 = com.google.android.gms.location.ActivityRecognitionResult.zza(p3);
                if ((!v3_2) || (v3_2.isEmpty())) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static java.util.List zza(android.content.Intent p2)
    {
        if ((p2 == null) || (!p2.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST"))) {
            return 0;
        } else {
            return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeIterableFromIntentExtra(p2, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", com.google.android.gms.location.ActivityRecognitionResult.CREATOR);
        }
    }

    private static boolean zzb(android.os.Bundle p9, android.os.Bundle p10)
    {
        if (p9 != null) {
            if (p10 != null) {
                if (p9.size() == p10.size()) {
                    java.util.Iterator v2_1 = p9.keySet().iterator();
                    while (v2_1.hasNext()) {
                        int v3_2 = ((String) v2_1.next());
                        if (p10.containsKey(v3_2)) {
                            android.os.Bundle v4_1 = p9.get(v3_2);
                            Object v5 = p10.get(v3_2);
                            if (v4_1 != null) {
                                if (!(v4_1 instanceof android.os.Bundle)) {
                                    if (!v4_1.getClass().isArray()) {
                                        if (v4_1.equals(v5)) {
                                        } else {
                                            return 0;
                                        }
                                    } else {
                                        if ((v5 != null) && (v5.getClass().isArray())) {
                                            int v3_8 = reflect.Array.getLength(v4_1);
                                            if (v3_8 == reflect.Array.getLength(v5)) {
                                                int v6_2 = 0;
                                                while (v6_2 < v3_8) {
                                                    if (com.google.android.gms.common.internal.Objects.equal(reflect.Array.get(v4_1, v6_2), reflect.Array.get(v5, v6_2))) {
                                                        v6_2++;
                                                    }
                                                }
                                            }
                                        }
                                        return 0;
                                    }
                                } else {
                                    if (com.google.android.gms.location.ActivityRecognitionResult.zzb(p9.getBundle(v3_2), p10.getBundle(v3_2))) {
                                    } else {
                                        return 0;
                                    }
                                }
                            } else {
                                if (v5 == null) {
                                } else {
                                    return 0;
                                }
                            }
                        } else {
                            return 0;
                        }
                    }
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            if (p10 != null) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final boolean equals(Object p7)
    {
        if (this != p7) {
            if ((!p7) || ((this.getClass() != p7.getClass()) || ((this.zzb != ((com.google.android.gms.location.ActivityRecognitionResult) p7).zzb) || ((this.zzc != ((com.google.android.gms.location.ActivityRecognitionResult) p7).zzc) || ((this.zzd != ((com.google.android.gms.location.ActivityRecognitionResult) p7).zzd) || ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.location.ActivityRecognitionResult) p7).zza)) || (!com.google.android.gms.location.ActivityRecognitionResult.zzb(this.zze, ((com.google.android.gms.location.ActivityRecognitionResult) p7).zze)))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public int getActivityConfidence(int p4)
    {
        java.util.Iterator v0_1 = this.zza.iterator();
        while (v0_1.hasNext()) {
            com.google.android.gms.location.DetectedActivity v1_0 = ((com.google.android.gms.location.DetectedActivity) v0_1.next());
            if (v1_0.getType() == p4) {
                return v1_0.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis()
    {
        return this.zzc;
    }

    public com.google.android.gms.location.DetectedActivity getMostProbableActivity()
    {
        return ((com.google.android.gms.location.DetectedActivity) this.zza.get(0));
    }

    public java.util.List getProbableActivities()
    {
        return this.zza;
    }

    public long getTime()
    {
        return this.zzb;
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zza, this.zze}));
    }

    public String toString()
    {
        String v0_1 = String.valueOf(this.zza);
        long v1 = this.zzb;
        long v3 = this.zzc;
        StringBuilder v6_2 = new StringBuilder((((((v0_1.length() + 59) + String.valueOf(v1).length()) + 24) + String.valueOf(v3).length()) + 1));
        v6_2.append("ActivityRecognitionResult [probableActivities=");
        v6_2.append(v0_1);
        v6_2.append(", timeMillis=");
        v6_2.append(v1);
        v6_2.append(", elapsedRealtimeMillis=");
        v6_2.append(v3);
        v6_2.append("]");
        return v6_2.toString();
    }

    public void writeToParcel(android.os.Parcel p6, int p7)
    {
        p7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p6, 1, this.zza, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p6, 5, this.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, p7);
        return;
    }
}
