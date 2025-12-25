package com.google.android.gms.fido.u2f.api.common;
public class ChannelIdValue extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue ABSENT;
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue UNAVAILABLE;
    public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue UNUSED;
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType zza;
    private final String zzb;
    private final String zzc;

    static ChannelIdValue()
    {
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzb();
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ABSENT = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue();
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UNAVAILABLE = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue("unavailable");
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UNUSED = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue("unused");
        return;
    }

    private ChannelIdValue()
    {
        this.zza = com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.ABSENT;
        this.zzc = 0;
        this.zzb = 0;
        return;
    }

    public ChannelIdValue(int p1, String p2, String p3)
    {
        try {
            this.zza = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.toChannelIdValueType(p1);
            this.zzb = p2;
            this.zzc = p3;
            return;
        } catch (com.google.android.gms.fido.u2f.api.common.ChannelIdValue$UnsupportedChannelIdValueTypeException v1_2) {
            throw new IllegalArgumentException(v1_2);
        }
    }

    private ChannelIdValue(String p1)
    {
        this.zzb = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zza = com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.STRING;
        this.zzc = 0;
        return;
    }

    public ChannelIdValue(org.json.JSONObject p1)
    {
        this.zzc = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1.toString()));
        this.zza = com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.OBJECT;
        this.zzb = 0;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType toChannelIdValueType(int p5)
    {
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue$UnsupportedChannelIdValueTypeException v0_0 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.values();
        int v2 = 0;
        while (v2 < v0_0.length) {
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType v3 = v0_0[v2];
            if (p5 != com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.zza(v3)) {
                v2++;
            } else {
                return v3;
            }
        }
        throw new com.google.android.gms.fido.u2f.api.common.ChannelIdValue$UnsupportedChannelIdValueTypeException(p5);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.fido.u2f.api.common.ChannelIdValue)) {
                if (this.zza.equals(((com.google.android.gms.fido.u2f.api.common.ChannelIdValue) p5).zza)) {
                    int v1_1 = this.zza.ordinal();
                    if (v1_1 == 0) {
                        return 1;
                    } else {
                        if (v1_1 == 1) {
                            return this.zzb.equals(((com.google.android.gms.fido.u2f.api.common.ChannelIdValue) p5).zzb);
                        } else {
                            if (v1_1 == 2) {
                                return this.zzc.equals(((com.google.android.gms.fido.u2f.api.common.ChannelIdValue) p5).zzc);
                            } else {
                                return 0;
                            }
                        }
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public org.json.JSONObject getObjectValue()
    {
        if (this.zzc != null) {
            try {
                return new org.json.JSONObject(this.zzc);
            } catch (org.json.JSONException v0_4) {
                throw new RuntimeException(v0_4);
            }
        } else {
            return 0;
        }
    }

    public String getObjectValueAsString()
    {
        return this.zzc;
    }

    public String getStringValue()
    {
        return this.zzb;
    }

    public com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType getType()
    {
        return this.zza;
    }

    public int getTypeAsInt()
    {
        return com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType.zza(this.zza);
    }

    public int hashCode()
    {
        int v1_1;
        int v0_1;
        int v0_3 = (this.zza.hashCode() + 31);
        int v1_5 = this.zza.ordinal();
        if (v1_5 == 1) {
            v0_1 = (v0_3 * 31);
            v1_1 = this.zzb.hashCode();
        } else {
            if (v1_5 == 2) {
                v0_1 = (v0_3 * 31);
                v1_1 = this.zzc.hashCode();
            } else {
                return v0_3;
            }
        }
        return (v1_1 + v0_1);
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.getTypeAsInt());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.getStringValue(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.getObjectValueAsString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
