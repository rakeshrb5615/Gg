package com.google.android.gms.fido.fido2.api.common;
public class UvmEntries extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final java.util.List zza;

    static UvmEntries()
    {
        com.google.android.gms.fido.fido2.api.common.UvmEntries.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaz();
        return;
    }

    public UvmEntries(java.util.List p1)
    {
        this.zza = p1;
        return;
    }

    public boolean equals(Object p5)
    {
        if ((p5 instanceof com.google.android.gms.fido.fido2.api.common.UvmEntries)) {
            java.util.List v0_3 = this.zza;
            if ((v0_3 == null) && (((com.google.android.gms.fido.fido2.api.common.UvmEntries) p5).zza == null)) {
                return 1;
            } else {
                if (v0_3 != null) {
                    java.util.List v3_0 = ((com.google.android.gms.fido.fido2.api.common.UvmEntries) p5).zza;
                    if ((v3_0 != null) && ((v0_3.containsAll(v3_0)) && (((com.google.android.gms.fido.fido2.api.common.UvmEntries) p5).zza.containsAll(this.zza)))) {
                        return 1;
                    }
                }
                return 0;
            }
        } else {
            return 0;
        }
    }

    public java.util.List getUvmEntryList()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {new java.util.HashSet(this.zza)}));
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, this.getUvmEntryList(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final org.json.JSONArray zza()
    {
        try {
            org.json.JSONException v0_1 = new org.json.JSONArray();
        } catch (org.json.JSONException v0_2) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", v0_2);
        }
        if (this.zza != null) {
            int v1_3 = 0;
            while (v1_3 < this.zza.size()) {
                short v2_3 = ((com.google.android.gms.fido.fido2.api.common.UvmEntry) this.zza.get(v1_3));
                org.json.JSONArray v3_1 = new org.json.JSONArray();
                v3_1.put(v2_3.getMatcherProtectionType());
                v3_1.put(v2_3.getKeyProtectionType());
                v3_1.put(v2_3.getMatcherProtectionType());
                v0_1.put(v1_3, v3_1);
                v1_3++;
            }
        }
        return v0_1;
    }
}
