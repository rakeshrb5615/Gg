package com.google.android.gms.location;
public final class LocationResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    static final java.util.List zza;
    private final java.util.List zzb;

    static LocationResult()
    {
        com.google.android.gms.location.LocationResult.zza = java.util.Collections.EMPTY_LIST;
        com.google.android.gms.location.LocationResult.CREATOR = new com.google.android.gms.location.zzag();
        return;
    }

    public LocationResult(java.util.List p1)
    {
        this.zzb = p1;
        return;
    }

    public static com.google.android.gms.location.LocationResult create(java.util.List p1)
    {
        if (p1 == null) {
            p1 = com.google.android.gms.location.LocationResult.zza;
        }
        return new com.google.android.gms.location.LocationResult(p1);
    }

    public static com.google.android.gms.location.LocationResult extractResult(android.content.Intent p2)
    {
        if (com.google.android.gms.location.LocationResult.hasResult(p2)) {
            String v0_4 = ((com.google.android.gms.location.LocationResult) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(p2, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", com.google.android.gms.location.LocationResult.CREATOR));
            if (v0_4 != null) {
                return v0_4;
            } else {
                return ((com.google.android.gms.location.LocationResult) p2.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT"));
            }
        } else {
            return 0;
        }
    }

    public static boolean hasResult(android.content.Intent p2)
    {
        if (p2 != 0) {
            if ((!p2.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT")) && (!p2.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES"))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public boolean equals(Object p9)
    {
        if (!(p9 instanceof com.google.android.gms.location.LocationResult)) {
            return 0;
        } else {
            if (android.os.Build$VERSION.SDK_INT < 31) {
                if (this.zzb.size() == ((com.google.android.gms.location.LocationResult) p9).zzb.size()) {
                    java.util.Iterator v0_3 = this.zzb.iterator();
                    int v9_2 = ((com.google.android.gms.location.LocationResult) p9).zzb.iterator();
                    while (v0_3.hasNext()) {
                        boolean v2_4 = ((android.location.Location) v0_3.next());
                        String v3_1 = ((android.location.Location) v9_2.next());
                        if (Double.compare(v2_4.getLatitude(), v3_1.getLatitude()) == 0) {
                            if (Double.compare(v2_4.getLongitude(), v3_1.getLongitude()) == 0) {
                                if (v2_4.getTime() == v3_1.getTime()) {
                                    if (v2_4.getElapsedRealtimeNanos() == v3_1.getElapsedRealtimeNanos()) {
                                        if (!com.google.android.gms.common.internal.Objects.equal(v2_4.getProvider(), v3_1.getProvider())) {
                                            return 0;
                                        }
                                    } else {
                                        return 0;
                                    }
                                } else {
                                    return 0;
                                }
                            } else {
                                return 0;
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
                return this.zzb.equals(((com.google.android.gms.location.LocationResult) p9).zzb);
            }
        }
    }

    public android.location.Location getLastLocation()
    {
        android.location.Location v0_2 = this.zzb.size();
        if (v0_2 != null) {
            return ((android.location.Location) this.zzb.get((v0_2 - 1)));
        } else {
            return 0;
        }
    }

    public java.util.List getLocations()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zzb}));
    }

    public String toString()
    {
        String v0_1 = new StringBuilder("LocationResult");
        String v1_5 = this.zzb;
        v0_1.ensureCapacity((v1_5.size() * 100));
        v0_1.append("[");
        String v1_1 = v1_5.iterator();
        int v2_0 = 0;
        while (v1_1.hasNext()) {
            com.google.android.gms.location.zzak.zza(((android.location.Location) v1_1.next()), v0_1);
            v0_1.append(", ");
            v2_0 = 1;
        }
        if (v2_0 != 0) {
            v0_1.setLength((v0_1.length() - 2));
        }
        v0_1.append("]");
        return v0_1.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, this.getLocations(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
