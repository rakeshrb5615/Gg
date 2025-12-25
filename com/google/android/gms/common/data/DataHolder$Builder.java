package com.google.android.gms.common.data;
public class DataHolder$Builder {
    private final String[] zaa;
    private final java.util.ArrayList zab;
    private final java.util.HashMap zac;

    public synthetic DataHolder$Builder(String[] p1, String p2, com.google.android.gms.common.data.zac p3)
    {
        this.zaa = ((String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zab = new java.util.ArrayList();
        this.zac = new java.util.HashMap();
        return;
    }

    public static bridge synthetic java.util.ArrayList zab(com.google.android.gms.common.data.DataHolder$Builder p0)
    {
        return p0.zab;
    }

    public static bridge synthetic String[] zac(com.google.android.gms.common.data.DataHolder$Builder p0)
    {
        return p0.zaa;
    }

    public com.google.android.gms.common.data.DataHolder build(int p3)
    {
        return new com.google.android.gms.common.data.DataHolder(this, p3, 0, 0);
    }

    public com.google.android.gms.common.data.DataHolder build(int p7, android.os.Bundle p8)
    {
        return new com.google.android.gms.common.data.DataHolder(this, p7, p8, -1, 0);
    }

    public com.google.android.gms.common.data.DataHolder$Builder withRow(android.content.ContentValues p4)
    {
        com.google.android.gms.common.internal.Asserts.checkNotNull(p4);
        java.util.HashMap v0_1 = new java.util.HashMap(p4.size());
        com.google.android.gms.common.data.DataHolder$Builder v4_3 = p4.valueSet().iterator();
        while (v4_3.hasNext()) {
            Object v1_2 = ((java.util.Map$Entry) v4_3.next());
            v0_1.put(((String) v1_2.getKey()), v1_2.getValue());
        }
        return this.zaa(v0_1);
    }

    public com.google.android.gms.common.data.DataHolder$Builder zaa(java.util.HashMap p2)
    {
        com.google.android.gms.common.internal.Asserts.checkNotNull(p2);
        this.zab.add(p2);
        return this;
    }
}
