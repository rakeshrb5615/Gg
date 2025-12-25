package com.google.android.gms.common.internal;
public class ClientIdentity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String packageName;
    public final int uid;

    static ClientIdentity()
    {
        com.google.android.gms.common.internal.ClientIdentity.CREATOR = new com.google.android.gms.common.internal.zaa();
        return;
    }

    public ClientIdentity(int p1, String p2)
    {
        this.uid = p1;
        this.packageName = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof com.google.android.gms.common.internal.ClientIdentity)) {
                if ((((com.google.android.gms.common.internal.ClientIdentity) p5).uid != this.uid) || (!com.google.android.gms.common.internal.Objects.equal(((com.google.android.gms.common.internal.ClientIdentity) p5).packageName, this.packageName))) {
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

    public final int hashCode()
    {
        return this.uid;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.uid);
        v0_1.append(":");
        v0_1.append(this.packageName);
        return v0_1.toString();
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        String v5_0 = this.uid;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, v5_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.packageName, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
