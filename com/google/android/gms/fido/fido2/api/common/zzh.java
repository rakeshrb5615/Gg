package com.google.android.gms.fido.fido2.api.common;
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zza;
    private final byte[] zzb;

    static zzh()
    {
        com.google.android.gms.fido.fido2.api.common.zzh.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzi();
        return;
    }

    public zzh(boolean p1, byte[] p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.zzh)) {
            if ((this.zza != ((com.google.android.gms.fido.fido2.api.common.zzh) p4).zza) || (!java.util.Arrays.equals(this.zzb, ((com.google.android.gms.fido.fido2.api.common.zzh) p4).zzb))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Boolean.valueOf(this.zza), this.zzb}));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final org.json.JSONObject zza()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        v0_1.put("enabled", this.zza);
        RuntimeException v1_4 = new org.json.JSONObject();
        String v2_8 = this.zzb;
        if (v2_8 != null) {
            v1_4.put("first", android.util.Base64.encodeToString(java.util.Arrays.copyOfRange(v2_8, 0, 31), 11));
            String v2_2 = this.zzb;
            if (v2_2.length == 64) {
                v1_4.put("second", android.util.Base64.encodeToString(java.util.Arrays.copyOfRange(v2_2, 32, 64), 11));
            }
        }
        v0_1.put("results", v1_4);
        return v0_1;
    }
}
