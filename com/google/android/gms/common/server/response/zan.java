package com.google.android.gms.common.server.response;
public final class zan extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    private final java.util.HashMap zab;
    private final String zac;

    static zan()
    {
        com.google.android.gms.common.server.response.zan.CREATOR = new com.google.android.gms.common.server.response.zao();
        return;
    }

    public zan(int p11, java.util.ArrayList p12, String p13)
    {
        this.zaa = p11;
        String v11_4 = new java.util.HashMap();
        int v0 = p12.size();
        int v2 = 0;
        while (v2 < v0) {
            com.google.android.gms.common.server.response.zal v3_1 = ((com.google.android.gms.common.server.response.zal) p12.get(v2));
            String v4 = v3_1.zab;
            java.util.HashMap v5_1 = new java.util.HashMap();
            int v6_3 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_1.zac)).size();
            int v7 = 0;
            while (v7 < v6_3) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field v8_2 = ((com.google.android.gms.common.server.response.zam) v3_1.zac.get(v7));
                v5_1.put(v8_2.zab, v8_2.zac);
                v7++;
            }
            v11_4.put(v4, v5_1);
            v2++;
        }
        this.zab = v11_4;
        this.zac = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p13));
        this.zad();
        return;
    }

    public zan(Class p2)
    {
        this.zaa = 1;
        this.zab = new java.util.HashMap();
        this.zac = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.getCanonicalName()));
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        java.util.Iterator v1_2 = this.zab.keySet().iterator();
        while (v1_2.hasNext()) {
            java.util.Map v2_1 = ((String) v1_2.next());
            v0_1.append(v2_1);
            v0_1.append(":\n");
            java.util.Map v2_3 = ((java.util.Map) this.zab.get(v2_1));
            java.util.Iterator v3_3 = v2_3.keySet().iterator();
            while (v3_3.hasNext()) {
                Object v4_2 = ((String) v3_3.next());
                v0_1.append("  ");
                v0_1.append(v4_2);
                v0_1.append(": ");
                v0_1.append(v2_3.get(v4_2));
            }
        }
        return v0_1.toString();
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        p7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1, this.zaa);
        int v0_3 = new java.util.ArrayList();
        String v1_0 = this.zab.keySet().iterator();
        while (v1_0.hasNext()) {
            int v2_3 = ((String) v1_0.next());
            v0_3.add(new com.google.android.gms.common.server.response.zal(v2_3, ((java.util.Map) this.zab.get(v2_3))));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p6, 2, v0_3, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 3, this.zac, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, p7);
        return;
    }

    public final String zaa()
    {
        return this.zac;
    }

    public final java.util.Map zab(String p2)
    {
        return ((java.util.Map) this.zab.get(p2));
    }

    public final void zac()
    {
        java.util.Iterator v0_2 = this.zab.keySet().iterator();
        while (v0_2.hasNext()) {
            String v1_1 = ((String) v0_2.next());
            java.util.HashMap v2_2 = ((java.util.Map) this.zab.get(v1_1));
            java.util.HashMap v3_1 = new java.util.HashMap();
            java.util.Iterator v4_1 = v2_2.keySet().iterator();
            while (v4_1.hasNext()) {
                String v5_2 = ((String) v4_1.next());
                v3_1.put(v5_2, ((com.google.android.gms.common.server.response.FastJsonResponse$Field) v2_2.get(v5_2)).zab());
            }
            this.zab.put(v1_1, v3_1);
        }
        return;
    }

    public final void zad()
    {
        java.util.Iterator v0_2 = this.zab.keySet().iterator();
        while (v0_2.hasNext()) {
            java.util.Map v1_3 = ((java.util.Map) this.zab.get(((String) v0_2.next())));
            java.util.Iterator v2_2 = v1_3.keySet().iterator();
            while (v2_2.hasNext()) {
                ((com.google.android.gms.common.server.response.FastJsonResponse$Field) v1_3.get(((String) v2_2.next()))).zai(this);
            }
        }
        return;
    }

    public final void zae(Class p2, java.util.Map p3)
    {
        this.zab.put(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.getCanonicalName())), p3);
        return;
    }

    public final boolean zaf(Class p2)
    {
        return this.zab.containsKey(com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.getCanonicalName()));
    }
}
