package com.google.android.gms.location;
public class GeofencingEvent {
    private final int zza;
    private final int zzb;
    private final java.util.List zzc;
    private final android.location.Location zzd;

    private GeofencingEvent(int p1, int p2, java.util.List p3, android.location.Location p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public static com.google.android.gms.location.GeofencingEvent fromIntent(android.content.Intent p12)
    {
        if (p12 != null) {
            int v1_1 = p12.getIntExtra("gms_error_code", -1);
            String v3_0 = p12.getIntExtra("com.google.android.location.intent.extra.transition", -1);
            if (v3_0 != -1) {
                if ((v3_0 != 1) && (v3_0 != 2)) {
                    if (v3_0 != 4) {
                        v3_0 = -1;
                    } else {
                        v3_0 = 4;
                    }
                }
            }
            java.util.ArrayList v5_1;
            String v4_5 = ((java.util.ArrayList) p12.getSerializableExtra("com.google.android.location.intent.extra.geofence_list"));
            if (v4_5 != null) {
                v5_1 = new java.util.ArrayList(v4_5.size());
                int v6_1 = v4_5.size();
                int v8 = 0;
                while (v8 < v6_1) {
                    com.google.android.gms.internal.location.zzek v9_1 = ((byte[]) v4_5.get(v8));
                    android.os.Parcel v10 = android.os.Parcel.obtain();
                    v10.unmarshall(v9_1, 0, v9_1.length);
                    v10.setDataPosition(0);
                    com.google.android.gms.internal.location.zzek v9_4 = ((com.google.android.gms.internal.location.zzek) com.google.android.gms.internal.location.zzek.CREATOR.createFromParcel(v10));
                    v10.recycle();
                    v5_1.add(v9_4);
                    v8++;
                }
            } else {
                v5_1 = 0;
            }
            android.os.Parcelable vtmp6 = p12.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
            if ((v5_1 != null) || (v1_1 != -1)) {
                return new com.google.android.gms.location.GeofencingEvent(v1_1, v3_0, v5_1, ((android.location.Location) vtmp6));
            }
        }
        return 0;
    }

    public int getErrorCode()
    {
        return this.zza;
    }

    public int getGeofenceTransition()
    {
        return this.zzb;
    }

    public java.util.List getTriggeringGeofences()
    {
        return this.zzc;
    }

    public android.location.Location getTriggeringLocation()
    {
        return this.zzd;
    }

    public boolean hasError()
    {
        if (this.zza == -1) {
            return 0;
        } else {
            return 1;
        }
    }
}
