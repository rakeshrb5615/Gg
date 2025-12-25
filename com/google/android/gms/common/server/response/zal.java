package com.google.android.gms.common.server.response;
public final class zal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    final String zab;
    final java.util.ArrayList zac;

    static zal()
    {
        com.google.android.gms.common.server.response.zal.CREATOR = new com.google.android.gms.common.server.response.zap();
        return;
    }

    public zal(int p1, String p2, java.util.ArrayList p3)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public zal(String p5, java.util.Map p6)
    {
        java.util.ArrayList v5_1;
        this.zaa = 1;
        this.zab = p5;
        if (p6 != null) {
            v5_1 = new java.util.ArrayList();
            java.util.Iterator v0_1 = p6.keySet().iterator();
            while (v0_1.hasNext()) {
                String v1_2 = ((String) v0_1.next());
                v5_1.add(new com.google.android.gms.common.server.response.zam(v1_2, ((com.google.android.gms.common.server.response.FastJsonResponse$Field) p6.get(v1_2))));
            }
        } else {
            v5_1 = 0;
        }
        this.zac = v5_1;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zaa;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, v5_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zab, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 3, this.zac, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
