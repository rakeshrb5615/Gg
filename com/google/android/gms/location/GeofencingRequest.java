package com.google.android.gms.location;
public class GeofencingRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final java.util.List zza;
    private final int zzb;
    private final String zzc;

    static GeofencingRequest()
    {
        com.google.android.gms.location.GeofencingRequest.CREATOR = new com.google.android.gms.location.zzp();
        return;
    }

    public GeofencingRequest(java.util.List p1, int p2, String p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public java.util.List getGeofences()
    {
        return new java.util.ArrayList(this.zza);
    }

    public int getInitialTrigger()
    {
        return this.zzb;
    }

    public String toString()
    {
        String v0_2 = String.valueOf(this.zza);
        int v2 = this.zzb;
        StringBuilder v3_1 = new StringBuilder((((v0_2.length() + 45) + String.valueOf(v2).length()) + 1));
        v3_1.append("GeofencingRequest[geofences=");
        v3_1.append(v0_2);
        v3_1.append(", initialTrigger=");
        v3_1.append(v2);
        v3_1.append("]");
        return v3_1.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, v5_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.getInitialTrigger());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
