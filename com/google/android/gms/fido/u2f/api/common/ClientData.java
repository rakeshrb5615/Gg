package com.google.android.gms.fido.u2f.api.common;
public class ClientData {
    public static final String KEY_CHALLENGE = "challenge";
    public static final String KEY_CID_PUBKEY = "cid_pubkey";
    public static final String KEY_ORIGIN = "origin";
    public static final String KEY_TYPE = "typ";
    public static final String TYPE_FINISH_ENROLLMENT = "navigator.id.finishEnrollment";
    public static final String TYPE_GET_ASSERTION = "navigator.id.getAssertion";
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzd;

    public ClientData(String p1, String p2, String p3, com.google.android.gms.fido.u2f.api.common.ChannelIdValue p4)
    {
        this.zza = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzc = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzd = ((com.google.android.gms.fido.u2f.api.common.ChannelIdValue) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        return;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.fido.u2f.api.common.ClientData)) {
                if ((!this.zza.equals(((com.google.android.gms.fido.u2f.api.common.ClientData) p5).zza)) || ((!this.zzb.equals(((com.google.android.gms.fido.u2f.api.common.ClientData) p5).zzb)) || ((!this.zzc.equals(((com.google.android.gms.fido.u2f.api.common.ClientData) p5).zzc)) || (!this.zzd.equals(((com.google.android.gms.fido.u2f.api.common.ClientData) p5).zzd))))) {
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

    public int hashCode()
    {
        return (((((((this.zza.hashCode() + 31) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd.hashCode());
    }

    public String toJsonString()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("typ", this.zza);
        v0_1.put("challenge", this.zzb);
        v0_1.put("origin", this.zzc);
        org.json.JSONObject v1_2 = this.zzd.getType().ordinal();
        if (v1_2 == 1) {
            v0_1.put("cid_pubkey", this.zzd.getStringValue());
        } else {
            if (v1_2 == 2) {
                v0_1.put("cid_pubkey", this.zzd.getObjectValue());
            }
        }
        return v0_1.toString();
    }
}
