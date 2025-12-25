package com.google.android.gms.common.data;
public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.io.Closeable {
    public static final android.os.Parcelable$Creator CREATOR;
    private static final com.google.android.gms.common.data.DataHolder$Builder zaf;
    final int zaa;
    android.os.Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final String[] zag;
    private final android.database.CursorWindow[] zah;
    private final int zai;
    private final android.os.Bundle zaj;
    private boolean zak;

    static DataHolder()
    {
        com.google.android.gms.common.data.DataHolder.CREATOR = new com.google.android.gms.common.data.zaf();
        String[] v1_1 = new String[0];
        com.google.android.gms.common.data.DataHolder.zaf = new com.google.android.gms.common.data.zab(v1_1, 0);
        return;
    }

    public DataHolder(int p2, String[] p3, android.database.CursorWindow[] p4, int p5, android.os.Bundle p6)
    {
        this.zae = 0;
        this.zak = 1;
        this.zaa = p2;
        this.zag = p3;
        this.zah = p4;
        this.zai = p5;
        this.zaj = p6;
        return;
    }

    public DataHolder(android.database.Cursor p8, int p9, android.os.Bundle p10)
    {
        android.database.CursorWindow[] v0_1 = new com.google.android.gms.common.sqlite.CursorWrapper(p8);
        Throwable v8_1 = v0_1.getColumnNames();
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        int v3_0;
        int v2 = v0_1.getCount();
        int v3_3 = v0_1.getWindow();
        if ((v3_3 == 0) || (v3_3.getStartPosition() != 0)) {
            v3_0 = 0;
        } else {
            v3_3.acquireReference();
            v0_1.setWindow(0);
            v1_1.add(v3_3);
            v3_0 = v3_3.getNumRows();
        }
        while ((v3_0 < v2) && (v0_1.moveToPosition(v3_0))) {
            int v6_2 = v0_1.getWindow();
            if (v6_2 == 0) {
                v6_2 = new android.database.CursorWindow(0);
                v6_2.setStartPosition(v3_0);
                v0_1.fillWindow(v3_0, v6_2);
            } else {
                v6_2.acquireReference();
                v0_1.setWindow(0);
            }
            if (v6_2.getNumRows() != 0) {
                v1_1.add(v6_2);
                v3_0 = (v6_2.getStartPosition() + v6_2.getNumRows());
            } else {
                break;
            }
        }
        v0_1.close();
        android.database.CursorWindow[] v0_3 = new android.database.CursorWindow[v1_1.size()];
        this(v8_1, ((android.database.CursorWindow[]) v1_1.toArray(v0_3)), p9, p10);
        return;
    }

    private DataHolder(com.google.android.gms.common.data.DataHolder$Builder p2, int p3, android.os.Bundle p4)
    {
        this(com.google.android.gms.common.data.DataHolder$Builder.zac(p2), com.google.android.gms.common.data.DataHolder.zaf(p2, -1), p3, 0);
        return;
    }

    public synthetic DataHolder(com.google.android.gms.common.data.DataHolder$Builder p1, int p2, android.os.Bundle p3, int p4, com.google.android.gms.common.data.zae p5)
    {
        this(com.google.android.gms.common.data.DataHolder$Builder.zac(p1), com.google.android.gms.common.data.DataHolder.zaf(p1, -1), p2, p3);
        return;
    }

    public synthetic DataHolder(com.google.android.gms.common.data.DataHolder$Builder p1, int p2, android.os.Bundle p3, com.google.android.gms.common.data.zae p4)
    {
        this(p1, p2, 0);
        return;
    }

    public DataHolder(String[] p2, android.database.CursorWindow[] p3, int p4, android.os.Bundle p5)
    {
        this.zae = 0;
        this.zak = 1;
        this.zaa = 1;
        this.zag = ((String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zah = ((android.database.CursorWindow[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zai = p4;
        this.zaj = p5;
        this.zad();
        return;
    }

    public static com.google.android.gms.common.data.DataHolder$Builder builder(String[] p2)
    {
        return new com.google.android.gms.common.data.DataHolder$Builder(p2, 0, 0);
    }

    public static com.google.android.gms.common.data.DataHolder empty(int p3)
    {
        return new com.google.android.gms.common.data.DataHolder(com.google.android.gms.common.data.DataHolder.zaf, p3, 0);
    }

    private final void zae(String p2, int p3)
    {
        int v0_0 = this.zab;
        if ((v0_0 == 0) || (!v0_0.containsKey(p2))) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(p2)));
        } else {
            if (this.isClosed()) {
                throw new IllegalArgumentException("Buffer is closed.");
            } else {
                if ((p3 < null) || (p3 >= this.zad)) {
                    throw new android.database.CursorIndexOutOfBoundsException(p3, this.zad);
                } else {
                    return;
                }
            }
        }
    }

    private static android.database.CursorWindow[] zaf(com.google.android.gms.common.data.DataHolder$Builder p13, int p14)
    {
        int v0 = 0;
        if (com.google.android.gms.common.data.DataHolder$Builder.zac(p13).length != 0) {
            String v14_5 = com.google.android.gms.common.data.DataHolder$Builder.zab(p13);
            StringBuilder v1_4 = v14_5.size();
            String v2_0 = new android.database.CursorWindow(0);
            java.util.ArrayList v3_1 = new java.util.ArrayList();
            v3_1.add(v2_0);
            v2_0.setNumColumns(com.google.android.gms.common.data.DataHolder$Builder.zac(p13).length);
            int v4_2 = 0;
            int v5_0 = 0;
            while (v4_2 < v1_4) {
                if (!v2_0.allocRow()) {
                    String v2_4 = new StringBuilder();
                    v2_4.append("Allocating additional cursor window for large data set (row ");
                    v2_4.append(v4_2);
                    v2_4.append(")");
                    android.util.Log.d("DataHolder", v2_4.toString());
                    v2_0 = new android.database.CursorWindow(0);
                    v2_0.setStartPosition(v4_2);
                    v2_0.setNumColumns(com.google.android.gms.common.data.DataHolder$Builder.zac(p13).length);
                    v3_1.add(v2_0);
                    if (!v2_0.allocRow()) {
                        android.util.Log.e("DataHolder", "Unable to allocate row to hold data.");
                        v3_1.remove(v2_0);
                        IllegalArgumentException v13_5 = new android.database.CursorWindow[v3_1.size()];
                        return ((android.database.CursorWindow[]) v3_1.toArray(v13_5));
                    }
                }
                String v6_7 = ((java.util.Map) v14_5.get(v4_2));
                int v9 = 0;
                boolean v10_2 = 1;
                while (v9 < com.google.android.gms.common.data.DataHolder$Builder.zac(p13).length) {
                    if (!v10_2) {
                        if (v5_0 != 0) {
                            throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                        } else {
                            int v5_2 = new StringBuilder();
                            v5_2.append("Couldn\'t populate window data for row ");
                            v5_2.append(v4_2);
                            v5_2.append(" - allocating new window.");
                            android.util.Log.d("DataHolder", v5_2.toString());
                            v2_0.freeLastRow();
                            v2_0 = new android.database.CursorWindow(0);
                            v2_0.setStartPosition(v4_2);
                            v2_0.setNumColumns(com.google.android.gms.common.data.DataHolder$Builder.zac(p13).length);
                            v3_1.add(v2_0);
                            v4_2--;
                            v5_0 = 1;
                        }
                    } else {
                        boolean v10_10 = com.google.android.gms.common.data.DataHolder$Builder.zac(p13)[v9];
                        Float v11_9 = v6_7.get(v10_10);
                        if (v11_9 != null) {
                            if (!(v11_9 instanceof String)) {
                                if (!(v11_9 instanceof Long)) {
                                    if (!(v11_9 instanceof Integer)) {
                                        if (!(v11_9 instanceof Boolean)) {
                                            if (!(v11_9 instanceof byte[])) {
                                                if (!(v11_9 instanceof Double)) {
                                                    if (!(v11_9 instanceof Float)) {
                                                        String v14_1 = v11_9.toString();
                                                        StringBuilder v1_1 = new StringBuilder();
                                                        v1_1.append("Unsupported object for column ");
                                                        v1_1.append(v10_10);
                                                        v1_1.append(": ");
                                                        v1_1.append(v14_1);
                                                        throw new IllegalArgumentException(v1_1.toString());
                                                    } else {
                                                        v10_2 = v2_0.putDouble(((double) ((Float) v11_9).floatValue()), v4_2, v9);
                                                    }
                                                } else {
                                                    v10_2 = v2_0.putDouble(((Double) v11_9).doubleValue(), v4_2, v9);
                                                }
                                            } else {
                                                v10_2 = v2_0.putBlob(((byte[]) v11_9), v4_2, v9);
                                            }
                                        } else {
                                            boolean v10_5;
                                            if (1 == ((Boolean) v11_9).booleanValue()) {
                                                v10_5 = 1;
                                            } else {
                                                v10_5 = 0;
                                            }
                                            v10_2 = v2_0.putLong(v10_5, v4_2, v9);
                                        }
                                    } else {
                                        v10_2 = v2_0.putLong(((long) ((Integer) v11_9).intValue()), v4_2, v9);
                                    }
                                } else {
                                    v10_2 = v2_0.putLong(((Long) v11_9).longValue(), v4_2, v9);
                                }
                            } else {
                                v10_2 = v2_0.putString(((String) v11_9), v4_2, v9);
                            }
                        } else {
                            v10_2 = v2_0.putNull(v4_2, v9);
                        }
                        v9++;
                    }
                    v4_2++;
                }
                if (!v10_2) {
                } else {
                    v5_0 = 0;
                }
            }
            IllegalArgumentException v13_11 = new android.database.CursorWindow[v3_1.size()];
            return ((android.database.CursorWindow[]) v3_1.toArray(v13_11));
        } else {
            IllegalArgumentException v13_9 = new android.database.CursorWindow[0];
            return v13_9;
        }
    }

    public void close()
    {
        if (!this.zae) {
            this.zae = 1;
            int v0_1 = 0;
            while(true) {
                android.database.CursorWindow v1_0 = this.zah;
                if (v0_1 >= v1_0.length) {
                    break;
                }
                v1_0[v0_1].close();
                v0_1++;
            }
        }
        return;
    }

    public final void finalize()
    {
        try {
            if ((this.zak) && ((this.zah.length > 0) && (!this.isClosed()))) {
                this.close();
                String v2 = this.toString();
                StringBuilder v3_1 = new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                v3_1.append(v2);
                v3_1.append(")");
                android.util.Log.e("DataBuffer", v3_1.toString());
            }
        } catch (String v0_3) {
            super.finalize();
            throw v0_3;
        }
        super.finalize();
        return;
    }

    public boolean getBoolean(String p3, int p4, int p5)
    {
        this.zae(p3, p4);
        if (this.zah[p5].getLong(p4, this.zab.getInt(p3)) != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public byte[] getByteArray(String p2, int p3, int p4)
    {
        this.zae(p2, p3);
        return this.zah[p4].getBlob(p3, this.zab.getInt(p2));
    }

    public int getCount()
    {
        return this.zad;
    }

    public int getInteger(String p2, int p3, int p4)
    {
        this.zae(p2, p3);
        return this.zah[p4].getInt(p3, this.zab.getInt(p2));
    }

    public long getLong(String p2, int p3, int p4)
    {
        this.zae(p2, p3);
        return this.zah[p4].getLong(p3, this.zab.getInt(p2));
    }

    public android.os.Bundle getMetadata()
    {
        return this.zaj;
    }

    public int getStatusCode()
    {
        return this.zai;
    }

    public String getString(String p2, int p3, int p4)
    {
        this.zae(p2, p3);
        return this.zah[p4].getString(p3, this.zab.getInt(p2));
    }

    public int getWindowIndex(int p4)
    {
        int v1_2;
        int v0 = 0;
        if ((p4 < 0) || (p4 >= this.zad)) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v1_2);
        while(true) {
            int v1_3 = this.zac;
            int v2 = v1_3.length;
            if (v0 < v2) {
                if (p4 < v1_3[v0]) {
                    break;
                }
                v0++;
            }
            if (v0 == v2) {
                v0--;
            }
            return v0;
        }
        v0--;
    }

    public boolean hasColumn(String p2)
    {
        return this.zab.containsKey(p2);
    }

    public boolean hasNull(String p2, int p3, int p4)
    {
        this.zae(p2, p3);
        return this.zah[p4].isNull(p3, this.zab.getInt(p2));
    }

    public boolean isClosed()
    {
        try {
            return this.zae;
        } catch (Throwable v0_1) {
            throw v0_1;
        }
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        int v0_0 = this.zag;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(p6, 1, v0_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(p6, 2, this.zah, p7, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 3, this.getStatusCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p6, 4, this.getMetadata(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1000, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, v1);
        if ((p7 & 1) != 0) {
            this.close();
        }
        return;
    }

    public final double zaa(String p2, int p3, int p4)
    {
        this.zae(p2, p3);
        return this.zah[p4].getDouble(p3, this.zab.getInt(p2));
    }

    public final float zab(String p2, int p3, int p4)
    {
        this.zae(p2, p3);
        return this.zah[p4].getFloat(p3, this.zab.getInt(p2));
    }

    public final void zac(String p2, int p3, int p4, android.database.CharArrayBuffer p5)
    {
        this.zae(p2, p3);
        this.zah[p4].copyStringToBuffer(p3, this.zab.getInt(p2), p5);
        return;
    }

    public final void zad()
    {
        this.zab = new android.os.Bundle();
        int v0_2 = 0;
        int v1_2 = 0;
        while(true) {
            int v2_5 = this.zag;
            if (v1_2 >= v2_5.length) {
                break;
            }
            this.zab.putInt(v2_5[v1_2], v1_2);
            v1_2++;
        }
        int v1_0 = new int[this.zah.length];
        this.zac = v1_0;
        int v1_1 = 0;
        while(true) {
            int v2_0 = this.zah;
            if (v0_2 >= v2_0.length) {
                break;
            }
            this.zac[v0_2] = v1_1;
            v1_1 += (this.zah[v0_2].getNumRows() - (v1_1 - v2_0[v0_2].getStartPosition()));
            v0_2++;
        }
        this.zad = v1_1;
        return;
    }
}
