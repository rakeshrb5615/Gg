package com.google.android.gms.common.data;
public abstract class EntityBuffer extends com.google.android.gms.common.data.AbstractDataBuffer {
    private boolean zaa;
    private java.util.ArrayList zab;

    public EntityBuffer(com.google.android.gms.common.data.DataHolder p1)
    {
        super(p1);
        super.zaa = 0;
        return;
    }

    private final void zab()
    {
        if (!this.zaa) {
            NullPointerException v0_7 = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder)).getCount();
            String v1_5 = new java.util.ArrayList();
            this.zab = v1_5;
            if (v0_7 > null) {
                v1_5.add(Integer.valueOf(0));
                String v1_0 = this.getPrimaryDataMarkerColumn();
                String v3_1 = this.mDataHolder.getString(v1_0, 0, this.mDataHolder.getWindowIndex(0));
                int v4_3 = 1;
                while (v4_3 < v0_7) {
                    Integer v5_2 = this.mDataHolder.getWindowIndex(v4_3);
                    String v6_1 = this.mDataHolder.getString(v1_0, v4_3, v5_2);
                    if (v6_1 == null) {
                        StringBuilder v2_2 = new StringBuilder();
                        v2_2.append("Missing value for markerColumn: ");
                        v2_2.append(v1_0);
                        v2_2.append(", at row: ");
                        v2_2.append(v4_3);
                        v2_2.append(", for window: ");
                        v2_2.append(v5_2);
                        throw new NullPointerException(v2_2.toString());
                    } else {
                        if (!v6_1.equals(v3_1)) {
                            this.zab.add(Integer.valueOf(v4_3));
                            v3_1 = v6_1;
                        }
                        v4_3++;
                    }
                }
            }
            this.zaa = 1;
        }
        return;
    }

    public final Object get(int p7)
    {
        this.zab();
        int v0 = this.zaa(p7);
        int v1 = 0;
        if ((p7 >= null) && (p7 != this.zab.size())) {
            int v3_4;
            int v2_5;
            if (p7 != (this.zab.size() - 1)) {
                v2_5 = ((Integer) this.zab.get((p7 + 1))).intValue();
                v3_4 = ((Integer) this.zab.get(p7)).intValue();
            } else {
                v2_5 = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder)).getCount();
                v3_4 = ((Integer) this.zab.get(p7)).intValue();
            }
            int v2_9 = (v2_5 - v3_4);
            if (v2_9 != 1) {
                v1 = v2_9;
            } else {
                String v7_1 = this.zaa(p7);
                int v2_14 = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(v7_1);
                String v4 = this.getChildDataMarkerColumn();
                if ((v4 == null) || (this.mDataHolder.getString(v4, v7_1, v2_14) != null)) {
                    v1 = 1;
                }
            }
        }
        return this.getEntry(v0, v1);
    }

    public String getChildDataMarkerColumn()
    {
        return 0;
    }

    public int getCount()
    {
        this.zab();
        return this.zab.size();
    }

    public abstract Object getEntry();

    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int p4)
    {
        if ((p4 < 0) || (p4 >= this.zab.size())) {
            throw new IllegalArgumentException(v1.a.j("Position ", p4, " is out of bounds for this buffer"));
        } else {
            return ((Integer) this.zab.get(p4)).intValue();
        }
    }
}
