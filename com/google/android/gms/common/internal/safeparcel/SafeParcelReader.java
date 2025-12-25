package com.google.android.gms.common.internal.safeparcel;
public class SafeParcelReader {

    private SafeParcelReader()
    {
        return;
    }

    public static java.math.BigDecimal createBigDecimal(android.os.Parcel p3, int p4)
    {
        java.math.BigInteger v4_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p3, p4);
        int v0_0 = p3.dataPosition();
        if (v4_1 != null) {
            byte[] v1 = p3.createByteArray();
            int v2 = p3.readInt();
            p3.setDataPosition((v0_0 + v4_1));
            return new java.math.BigDecimal(new java.math.BigInteger(v1), v2);
        } else {
            return 0;
        }
    }

    public static java.math.BigDecimal[] createBigDecimalArray(android.os.Parcel p8, int p9)
    {
        int v9_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p8, p9);
        int v0_1 = p8.dataPosition();
        if (v9_1 != 0) {
            int v1 = p8.readInt();
            java.math.BigDecimal[] v2 = new java.math.BigDecimal[v1];
            int v3 = 0;
            while (v3 < v1) {
                v2[v3] = new java.math.BigDecimal(new java.math.BigInteger(p8.createByteArray()), p8.readInt());
                v3++;
            }
            p8.setDataPosition((v0_1 + v9_1));
            return v2;
        } else {
            return 0;
        }
    }

    public static java.math.BigInteger createBigInteger(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            byte[] v1 = p2.createByteArray();
            p2.setDataPosition((v0_0 + v3_1));
            return new java.math.BigInteger(v1);
        } else {
            return 0;
        }
    }

    public static java.math.BigInteger[] createBigIntegerArray(android.os.Parcel p6, int p7)
    {
        int v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, p7);
        int v0_1 = p6.dataPosition();
        if (v7_1 != 0) {
            int v1 = p6.readInt();
            java.math.BigInteger[] v2 = new java.math.BigInteger[v1];
            int v3 = 0;
            while (v3 < v1) {
                v2[v3] = new java.math.BigInteger(p6.createByteArray());
                v3++;
            }
            p6.setDataPosition((v0_1 + v7_1));
            return v2;
        } else {
            return 0;
        }
    }

    public static boolean[] createBooleanArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            boolean[] v1 = p2.createBooleanArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList createBooleanList(android.os.Parcel p6, int p7)
    {
        int v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, p7);
        int v0_1 = p6.dataPosition();
        if (v7_1 != 0) {
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            int v2 = p6.readInt();
            int v4 = 0;
            while (v4 < v2) {
                Boolean v5_1;
                if (p6.readInt() == 0) {
                    v5_1 = 0;
                } else {
                    v5_1 = 1;
                }
                v1_1.add(Boolean.valueOf(v5_1));
                v4++;
            }
            p6.setDataPosition((v0_1 + v7_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static android.os.Bundle createBundle(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            android.os.Bundle v1 = p2.readBundle();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static byte[] createByteArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            byte[] v1 = p2.createByteArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static byte[][] createByteArrayArray(android.os.Parcel p5, int p6)
    {
        int v6_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p5, p6);
        int v0_1 = p5.dataPosition();
        if (v6_1 != 0) {
            int v1 = p5.readInt();
            byte[][] v2 = new byte[][v1];
            int v3 = 0;
            while (v3 < v1) {
                v2[v3] = p5.createByteArray();
                v3++;
            }
            p5.setDataPosition((v0_1 + v6_1));
            return v2;
        } else {
            return 0;
        }
    }

    public static android.util.SparseArray createByteArraySparseArray(android.os.Parcel p6, int p7)
    {
        int v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, p7);
        int v0_1 = p6.dataPosition();
        if (v7_1 != 0) {
            int v1 = p6.readInt();
            android.util.SparseArray v2_1 = new android.util.SparseArray(v1);
            int v3 = 0;
            while (v3 < v1) {
                v2_1.append(p6.readInt(), p6.createByteArray());
                v3++;
            }
            p6.setDataPosition((v0_1 + v7_1));
            return v2_1;
        } else {
            return 0;
        }
    }

    public static char[] createCharArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            char[] v1 = p2.createCharArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static double[] createDoubleArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            double[] v1 = p2.createDoubleArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList createDoubleList(android.os.Parcel p6, int p7)
    {
        int v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, p7);
        int v0_1 = p6.dataPosition();
        if (v7_1 != 0) {
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            int v2 = p6.readInt();
            int v3 = 0;
            while (v3 < v2) {
                v1_1.add(Double.valueOf(p6.readDouble()));
                v3++;
            }
            p6.setDataPosition((v0_1 + v7_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static android.util.SparseArray createDoubleSparseArray(android.os.Parcel p7, int p8)
    {
        int v8_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p7, p8);
        int v0_1 = p7.dataPosition();
        if (v8_1 != 0) {
            android.util.SparseArray v1_1 = new android.util.SparseArray();
            int v2 = p7.readInt();
            int v3 = 0;
            while (v3 < v2) {
                v1_1.append(p7.readInt(), Double.valueOf(p7.readDouble()));
                v3++;
            }
            p7.setDataPosition((v0_1 + v8_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static float[] createFloatArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            float[] v1 = p2.createFloatArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList createFloatList(android.os.Parcel p5, int p6)
    {
        int v6_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p5, p6);
        int v0_1 = p5.dataPosition();
        if (v6_1 != 0) {
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            int v2 = p5.readInt();
            int v3 = 0;
            while (v3 < v2) {
                v1_1.add(Float.valueOf(p5.readFloat()));
                v3++;
            }
            p5.setDataPosition((v0_1 + v6_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static android.util.SparseArray createFloatSparseArray(android.os.Parcel p6, int p7)
    {
        int v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, p7);
        int v0_1 = p6.dataPosition();
        if (v7_1 != 0) {
            android.util.SparseArray v1_1 = new android.util.SparseArray();
            int v2 = p6.readInt();
            int v3 = 0;
            while (v3 < v2) {
                v1_1.append(p6.readInt(), Float.valueOf(p6.readFloat()));
                v3++;
            }
            p6.setDataPosition((v0_1 + v7_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static android.os.IBinder[] createIBinderArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            android.os.IBinder[] v1 = p2.createBinderArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList createIBinderList(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            java.util.ArrayList v1 = p2.createBinderArrayList();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static android.util.SparseArray createIBinderSparseArray(android.os.Parcel p6, int p7)
    {
        int v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, p7);
        int v0_1 = p6.dataPosition();
        if (v7_1 != 0) {
            int v1 = p6.readInt();
            android.util.SparseArray v2_1 = new android.util.SparseArray(v1);
            int v3 = 0;
            while (v3 < v1) {
                v2_1.append(p6.readInt(), p6.readStrongBinder());
                v3++;
            }
            p6.setDataPosition((v0_1 + v7_1));
            return v2_1;
        } else {
            return 0;
        }
    }

    public static int[] createIntArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            int[] v1 = p2.createIntArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList createIntegerList(android.os.Parcel p5, int p6)
    {
        int v6_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p5, p6);
        int v0_1 = p5.dataPosition();
        if (v6_1 != 0) {
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            int v2 = p5.readInt();
            int v3 = 0;
            while (v3 < v2) {
                v1_1.add(Integer.valueOf(p5.readInt()));
                v3++;
            }
            p5.setDataPosition((v0_1 + v6_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static long[] createLongArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            long[] v1 = p2.createLongArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList createLongList(android.os.Parcel p6, int p7)
    {
        int v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, p7);
        int v0_1 = p6.dataPosition();
        if (v7_1 != 0) {
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            int v2 = p6.readInt();
            int v3 = 0;
            while (v3 < v2) {
                v1_1.add(Long.valueOf(p6.readLong()));
                v3++;
            }
            p6.setDataPosition((v0_1 + v7_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static android.os.Parcel createParcel(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            android.os.Parcel v1 = android.os.Parcel.obtain();
            v1.appendFrom(p2, v0_0, v3_1);
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static android.os.Parcel[] createParcelArray(android.os.Parcel p8, int p9)
    {
        int v9_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p8, p9);
        int v0_1 = p8.dataPosition();
        if (v9_1 != 0) {
            int v2 = p8.readInt();
            android.os.Parcel[] v3 = new android.os.Parcel[v2];
            int v4 = 0;
            while (v4 < v2) {
                int v5 = p8.readInt();
                if (v5 == 0) {
                    v3[v4] = 0;
                } else {
                    int v6_0 = p8.dataPosition();
                    android.os.Parcel v7 = android.os.Parcel.obtain();
                    v7.appendFrom(p8, v6_0, v5);
                    v3[v4] = v7;
                    p8.setDataPosition((v6_0 + v5));
                }
                v4++;
            }
            p8.setDataPosition((v0_1 + v9_1));
            return v3;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList createParcelList(android.os.Parcel p8, int p9)
    {
        int v9_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p8, p9);
        int v0_1 = p8.dataPosition();
        if (v9_1 != 0) {
            int v2 = p8.readInt();
            java.util.ArrayList v3_1 = new java.util.ArrayList();
            int v4 = 0;
            while (v4 < v2) {
                int v5 = p8.readInt();
                if (v5 == 0) {
                    v3_1.add(0);
                } else {
                    int v6_0 = p8.dataPosition();
                    android.os.Parcel v7 = android.os.Parcel.obtain();
                    v7.appendFrom(p8, v6_0, v5);
                    v3_1.add(v7);
                    p8.setDataPosition((v6_0 + v5));
                }
                v4++;
            }
            p8.setDataPosition((v0_1 + v9_1));
            return v3_1;
        } else {
            return 0;
        }
    }

    public static android.util.SparseArray createParcelSparseArray(android.os.Parcel p9, int p10)
    {
        int v10_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p9, p10);
        int v0_1 = p9.dataPosition();
        if (v10_1 != 0) {
            int v2 = p9.readInt();
            android.util.SparseArray v3_1 = new android.util.SparseArray();
            int v4 = 0;
            while (v4 < v2) {
                int v5 = p9.readInt();
                int v6 = p9.readInt();
                if (v6 == 0) {
                    v3_1.append(v5, 0);
                } else {
                    int v7_0 = p9.dataPosition();
                    android.os.Parcel v8 = android.os.Parcel.obtain();
                    v8.appendFrom(p9, v7_0, v6);
                    v3_1.append(v5, v8);
                    p9.setDataPosition((v7_0 + v6));
                }
                v4++;
            }
            p9.setDataPosition((v0_1 + v10_1));
            return v3_1;
        } else {
            return 0;
        }
    }

    public static android.os.Parcelable createParcelable(android.os.Parcel p1, int p2, android.os.Parcelable$Creator p3)
    {
        int v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p1, p2);
        int v0_0 = p1.dataPosition();
        if (v2_1 != 0) {
            android.os.Parcelable v3_2 = ((android.os.Parcelable) p3.createFromParcel(p1));
            p1.setDataPosition((v0_0 + v2_1));
            return v3_2;
        } else {
            return 0;
        }
    }

    public static android.util.SparseBooleanArray createSparseBooleanArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            android.util.SparseBooleanArray v1 = p2.readSparseBooleanArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static android.util.SparseIntArray createSparseIntArray(android.os.Parcel p6, int p7)
    {
        int v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, p7);
        int v0_1 = p6.dataPosition();
        if (v7_1 != 0) {
            android.util.SparseIntArray v1_1 = new android.util.SparseIntArray();
            int v2 = p6.readInt();
            int v3 = 0;
            while (v3 < v2) {
                v1_1.append(p6.readInt(), p6.readInt());
                v3++;
            }
            p6.setDataPosition((v0_1 + v7_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static android.util.SparseLongArray createSparseLongArray(android.os.Parcel p7, int p8)
    {
        int v8_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p7, p8);
        int v0_1 = p7.dataPosition();
        if (v8_1 != 0) {
            android.util.SparseLongArray v1_1 = new android.util.SparseLongArray();
            int v2 = p7.readInt();
            int v3 = 0;
            while (v3 < v2) {
                v1_1.append(p7.readInt(), p7.readLong());
                v3++;
            }
            p7.setDataPosition((v0_1 + v8_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static String createString(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            String v1 = p2.readString();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static String[] createStringArray(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            String[] v1 = p2.createStringArray();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList createStringList(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            java.util.ArrayList v1 = p2.createStringArrayList();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static android.util.SparseArray createStringSparseArray(android.os.Parcel p6, int p7)
    {
        int v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, p7);
        int v0_1 = p6.dataPosition();
        if (v7_1 != 0) {
            android.util.SparseArray v1_1 = new android.util.SparseArray();
            int v2 = p6.readInt();
            int v3 = 0;
            while (v3 < v2) {
                v1_1.append(p6.readInt(), p6.readString());
                v3++;
            }
            p6.setDataPosition((v0_1 + v7_1));
            return v1_1;
        } else {
            return 0;
        }
    }

    public static Object[] createTypedArray(android.os.Parcel p1, int p2, android.os.Parcelable$Creator p3)
    {
        int v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p1, p2);
        int v0_0 = p1.dataPosition();
        if (v2_1 != 0) {
            Object[] v3_1 = p1.createTypedArray(p3);
            p1.setDataPosition((v0_0 + v2_1));
            return v3_1;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList createTypedList(android.os.Parcel p1, int p2, android.os.Parcelable$Creator p3)
    {
        int v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p1, p2);
        int v0_0 = p1.dataPosition();
        if (v2_1 != 0) {
            java.util.ArrayList v3_1 = p1.createTypedArrayList(p3);
            p1.setDataPosition((v0_0 + v2_1));
            return v3_1;
        } else {
            return 0;
        }
    }

    public static android.util.SparseArray createTypedSparseArray(android.os.Parcel p7, int p8, android.os.Parcelable$Creator p9)
    {
        int v8_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p7, p8);
        int v0_1 = p7.dataPosition();
        if (v8_1 != 0) {
            int v2 = p7.readInt();
            android.util.SparseArray v3_1 = new android.util.SparseArray();
            int v4 = 0;
            while (v4 < v2) {
                int v6_1;
                int v5 = p7.readInt();
                if (p7.readInt() == 0) {
                    v6_1 = 0;
                } else {
                    v6_1 = p9.createFromParcel(p7);
                }
                v3_1.append(v5, v6_1);
                v4++;
            }
            p7.setDataPosition((v0_1 + v8_1));
            return v3_1;
        } else {
            return 0;
        }
    }

    public static void ensureAtEnd(android.os.Parcel p3, int p4)
    {
        if (p3.dataPosition() != p4) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(v1.a.m(new StringBuilder((String.valueOf(p4).length() + 26)), "Overread allowed size end=", p4), p3);
        } else {
            return;
        }
    }

    public static int getFieldId(int p0)
    {
        return ((char) p0);
    }

    public static boolean readBoolean(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zza(p1, p2, 4);
        if (p1.readInt() == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static Boolean readBooleanObject(android.os.Parcel p2, int p3)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        if (v0 != 0) {
            Boolean v2_4;
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zzb(p2, p3, v0, 4);
            if (p2.readInt() == 0) {
                v2_4 = 0;
            } else {
                v2_4 = 1;
            }
            return Boolean.valueOf(v2_4);
        } else {
            return 0;
        }
    }

    public static byte readByte(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zza(p1, p2, 4);
        return ((byte) p1.readInt());
    }

    public static char readChar(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zza(p1, p2, 4);
        return ((char) p1.readInt());
    }

    public static double readDouble(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zza(p1, p2, 8);
        return p1.readDouble();
    }

    public static Double readDoubleObject(android.os.Parcel p2, int p3)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        if (v0 != 0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zzb(p2, p3, v0, 8);
            return Double.valueOf(p2.readDouble());
        } else {
            return 0;
        }
    }

    public static float readFloat(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zza(p1, p2, 4);
        return p1.readFloat();
    }

    public static Float readFloatObject(android.os.Parcel p2, int p3)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        if (v0 != 0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zzb(p2, p3, v0, 4);
            return Float.valueOf(p2.readFloat());
        } else {
            return 0;
        }
    }

    public static int readHeader(android.os.Parcel p0)
    {
        return p0.readInt();
    }

    public static android.os.IBinder readIBinder(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            android.os.IBinder v1 = p2.readStrongBinder();
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static int readInt(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zza(p1, p2, 4);
        return p1.readInt();
    }

    public static Integer readIntegerObject(android.os.Parcel p2, int p3)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        if (v0 != 0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zzb(p2, p3, v0, 4);
            return Integer.valueOf(p2.readInt());
        } else {
            return 0;
        }
    }

    public static void readList(android.os.Parcel p1, int p2, java.util.List p3, ClassLoader p4)
    {
        int v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p1, p2);
        int v0_0 = p1.dataPosition();
        if (v2_1 != 0) {
            p1.readList(p3, p4);
            p1.setDataPosition((v0_0 + v2_1));
            return;
        } else {
            return;
        }
    }

    public static long readLong(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zza(p1, p2, 8);
        return p1.readLong();
    }

    public static Long readLongObject(android.os.Parcel p2, int p3)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        if (v0 != 0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zzb(p2, p3, v0, 8);
            return Long.valueOf(p2.readLong());
        } else {
            return 0;
        }
    }

    public static android.app.PendingIntent readPendingIntent(android.os.Parcel p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p2, p3);
        int v0_0 = p2.dataPosition();
        if (v3_1 != 0) {
            android.app.PendingIntent v1 = android.app.PendingIntent.readPendingIntentOrNullFromParcel(p2);
            p2.setDataPosition((v0_0 + v3_1));
            return v1;
        } else {
            return 0;
        }
    }

    public static short readShort(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.zza(p1, p2, 4);
        return ((short) p1.readInt());
    }

    public static int readSize(android.os.Parcel p2, int p3)
    {
        if ((p3 & -65536) == -65536) {
            return p2.readInt();
        } else {
            return ((char) (p3 >> 16));
        }
    }

    public static void skipUnknownField(android.os.Parcel p1, int p2)
    {
        p1.setDataPosition((p1.dataPosition() + com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p1, p2)));
        return;
    }

    public static int validateObjectHeader(android.os.Parcel p6)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException v0_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p6);
        String v1_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p6, v0_0);
        String v2_7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v0_0);
        int v3 = p6.dataPosition();
        if (v2_7 != 20293) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(v0_0))), p6);
        } else {
            String v1_2 = (v1_3 + v3);
            if ((v1_2 < v3) || (v1_2 > p6.dataSize())) {
                StringBuilder v5_1 = new StringBuilder(((String.valueOf(v3).length() + 32) + String.valueOf(v1_2).length()));
                v5_1.append("Size read is invalid start=");
                v5_1.append(v3);
                v5_1.append(" end=");
                v5_1.append(v1_2);
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(v5_1.toString(), p6);
            } else {
                return v1_2;
            }
        }
    }

    private static void zza(android.os.Parcel p5, int p6, int p7)
    {
        String v6_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readSize(p5, p6);
        if (v6_1 != p7) {
            String v1 = Integer.toHexString(v6_1);
            StringBuilder v2_4 = new StringBuilder(((String.valueOf(v1).length() + (((String.valueOf(p7).length() + 19) + String.valueOf(v6_1).length()) + 4)) + 1));
            v2_4.append("Expected size ");
            v2_4.append(p7);
            v2_4.append(" got ");
            v2_4.append(v6_1);
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(v1.a.o(v2_4, " (0x", v1, ")"), p5);
        } else {
            return;
        }
    }

    private static void zzb(android.os.Parcel p4, int p5, int p6, int p7)
    {
        if (p6 != p7) {
            String v0 = Integer.toHexString(p6);
            StringBuilder v1_4 = new StringBuilder(((String.valueOf(v0).length() + (((String.valueOf(p7).length() + 19) + String.valueOf(p6).length()) + 4)) + 1));
            v1_4.append("Expected size ");
            v1_4.append(p7);
            v1_4.append(" got ");
            v1_4.append(p6);
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(v1.a.o(v1_4, " (0x", v0, ")"), p4);
        } else {
            return;
        }
    }
}
