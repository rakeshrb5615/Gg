package com.google.android.gms.common.server.converter;
public final class StringToIntConverter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    private final java.util.HashMap zab;
    private final android.util.SparseArray zac;

    static StringToIntConverter()
    {
        com.google.android.gms.common.server.converter.StringToIntConverter.CREATOR = new com.google.android.gms.common.server.converter.zad();
        return;
    }

    public StringToIntConverter()
    {
        this.zaa = 1;
        this.zab = new java.util.HashMap();
        this.zac = new android.util.SparseArray();
        return;
    }

    public StringToIntConverter(int p4, java.util.ArrayList p5)
    {
        this.zaa = p4;
        this.zab = new java.util.HashMap();
        this.zac = new android.util.SparseArray();
        int v4_5 = p5.size();
        int v0 = 0;
        while (v0 < v4_5) {
            int v1_1 = ((com.google.android.gms.common.server.converter.zac) p5.get(v0));
            this.add(v1_1.zab, v1_1.zac);
            v0++;
        }
        return;
    }

    public com.google.android.gms.common.server.converter.StringToIntConverter add(String p3, int p4)
    {
        this.zab.put(p3, Integer.valueOf(p4));
        this.zac.put(p4, p3);
        return this;
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        java.util.ArrayList v7_0 = this.zaa;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1, v7_0);
        java.util.ArrayList v7_2 = new java.util.ArrayList();
        int v1_0 = this.zab.keySet().iterator();
        while (v1_0.hasNext()) {
            int v2_3 = ((String) v1_0.next());
            v7_2.add(new com.google.android.gms.common.server.converter.zac(v2_3, ((Integer) this.zab.get(v2_3)).intValue()));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p6, 2, v7_2, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, v0);
        return;
    }

    public final int zaa()
    {
        return 7;
    }

    public final int zab()
    {
        return 0;
    }

    public final bridge synthetic Object zac(Object p2)
    {
        Integer v2_2 = ((Integer) this.zab.get(((String) p2)));
        if (v2_2 == null) {
            v2_2 = ((Integer) this.zab.get("gms_unknown"));
        }
        return v2_2;
    }

    public final bridge synthetic Object zad(Object p3)
    {
        String v3_4 = ((String) this.zac.get(((Integer) p3).intValue()));
        if ((v3_4 != null) || (!this.zab.containsKey("gms_unknown"))) {
            return v3_4;
        } else {
            return "gms_unknown";
        }
    }
}
