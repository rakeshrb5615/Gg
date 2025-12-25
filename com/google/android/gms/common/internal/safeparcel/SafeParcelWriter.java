package com.google.android.gms.common.internal.safeparcel;
public class SafeParcelWriter {

    private SafeParcelWriter()
    {
        return;
    }

    public static int beginObjectHeader(android.os.Parcel p1)
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p1, 20293);
    }

    public static void finishObjectHeader(android.os.Parcel p0, int p1)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, p1);
        return;
    }

    public static void writeBigDecimal(android.os.Parcel p0, int p1, java.math.BigDecimal p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeByteArray(p2.unscaledValue().toByteArray());
            p0.writeInt(p2.scale());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3 != null) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeBigDecimalArray(android.os.Parcel p2, int p3, java.math.BigDecimal[] p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.length;
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeByteArray(p4[v0].unscaledValue().toByteArray());
                p2.writeInt(p4[v0].scale());
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeBigInteger(android.os.Parcel p0, int p1, java.math.BigInteger p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeByteArray(p2.toByteArray());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeBigIntegerArray(android.os.Parcel p2, int p3, java.math.BigInteger[] p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.length;
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeByteArray(p4[v0].toByteArray());
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeBoolean(android.os.Parcel p1, int p2, boolean p3)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p1, p2, 4);
        p1.writeInt(p3);
        return;
    }

    public static void writeBooleanArray(android.os.Parcel p0, int p1, boolean[] p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeBooleanArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeBooleanList(android.os.Parcel p2, int p3, java.util.List p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.size();
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeInt(((Boolean) p4.get(v0)).booleanValue());
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeBooleanObject(android.os.Parcel p0, int p1, Boolean p2, boolean p3)
    {
        if (p2 != 0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 4);
            p0.writeInt(p2.booleanValue());
            return;
        } else {
            if (p3 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeBundle(android.os.Parcel p0, int p1, android.os.Bundle p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeBundle(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeByte(android.os.Parcel p1, int p2, byte p3)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p1, p2, 4);
        p1.writeInt(p3);
        return;
    }

    public static void writeByteArray(android.os.Parcel p0, int p1, byte[] p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeByteArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeByteArrayArray(android.os.Parcel p2, int p3, byte[][] p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.length;
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeByteArray(p4[v0]);
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeByteArraySparseArray(android.os.Parcel p2, int p3, android.util.SparseArray p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.size();
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeInt(p4.keyAt(v0));
                p2.writeByteArray(((byte[]) p4.valueAt(v0)));
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeChar(android.os.Parcel p1, int p2, char p3)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p1, p2, 4);
        p1.writeInt(p3);
        return;
    }

    public static void writeCharArray(android.os.Parcel p0, int p1, char[] p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeCharArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeDouble(android.os.Parcel p1, int p2, double p3)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p1, p2, 8);
        p1.writeDouble(p3);
        return;
    }

    public static void writeDoubleArray(android.os.Parcel p0, int p1, double[] p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeDoubleArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeDoubleList(android.os.Parcel p3, int p4, java.util.List p5, boolean p6)
    {
        int v0 = 0;
        if (p5 != null) {
            int v4_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p3, p4);
            int v6_1 = p5.size();
            p3.writeInt(v6_1);
            while (v0 < v6_1) {
                p3.writeDouble(((Double) p5.get(v0)).doubleValue());
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p3, v4_1);
            return;
        } else {
            if (p6 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p3, p4, 0);
            }
            return;
        }
    }

    public static void writeDoubleObject(android.os.Parcel p0, int p1, Double p2, boolean p3)
    {
        if (p2 != 0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 8);
            p0.writeDouble(p2.doubleValue());
            return;
        } else {
            if (p3 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeDoubleSparseArray(android.os.Parcel p3, int p4, android.util.SparseArray p5, boolean p6)
    {
        int v0 = 0;
        if (p5 != null) {
            int v4_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p3, p4);
            int v6_1 = p5.size();
            p3.writeInt(v6_1);
            while (v0 < v6_1) {
                p3.writeInt(p5.keyAt(v0));
                p3.writeDouble(((Double) p5.valueAt(v0)).doubleValue());
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p3, v4_1);
            return;
        } else {
            if (p6 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p3, p4, 0);
            }
            return;
        }
    }

    public static void writeFloat(android.os.Parcel p1, int p2, float p3)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p1, p2, 4);
        p1.writeFloat(p3);
        return;
    }

    public static void writeFloatArray(android.os.Parcel p0, int p1, float[] p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeFloatArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeFloatList(android.os.Parcel p2, int p3, java.util.List p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.size();
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeFloat(((Float) p4.get(v0)).floatValue());
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeFloatObject(android.os.Parcel p0, int p1, Float p2, boolean p3)
    {
        if (p2 != 0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 4);
            p0.writeFloat(p2.floatValue());
            return;
        } else {
            if (p3 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeFloatSparseArray(android.os.Parcel p2, int p3, android.util.SparseArray p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.size();
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeInt(p4.keyAt(v0));
                p2.writeFloat(((Float) p4.valueAt(v0)).floatValue());
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeIBinder(android.os.Parcel p0, int p1, android.os.IBinder p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeStrongBinder(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeIBinderArray(android.os.Parcel p0, int p1, android.os.IBinder[] p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeBinderArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeIBinderList(android.os.Parcel p0, int p1, java.util.List p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeBinderList(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeIBinderSparseArray(android.os.Parcel p2, int p3, android.util.SparseArray p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.size();
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeInt(p4.keyAt(v0));
                p2.writeStrongBinder(((android.os.IBinder) p4.valueAt(v0)));
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeInt(android.os.Parcel p1, int p2, int p3)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p1, p2, 4);
        p1.writeInt(p3);
        return;
    }

    public static void writeIntArray(android.os.Parcel p0, int p1, int[] p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeIntArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeIntegerList(android.os.Parcel p2, int p3, java.util.List p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.size();
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeInt(((Integer) p4.get(v0)).intValue());
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeIntegerObject(android.os.Parcel p0, int p1, Integer p2, boolean p3)
    {
        if (p2 != 0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 4);
            p0.writeInt(p2.intValue());
            return;
        } else {
            if (p3 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeList(android.os.Parcel p0, int p1, java.util.List p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeList(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeLong(android.os.Parcel p1, int p2, long p3)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p1, p2, 8);
        p1.writeLong(p3);
        return;
    }

    public static void writeLongArray(android.os.Parcel p0, int p1, long[] p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeLongArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeLongList(android.os.Parcel p3, int p4, java.util.List p5, boolean p6)
    {
        int v0 = 0;
        if (p5 != null) {
            int v4_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p3, p4);
            int v6_1 = p5.size();
            p3.writeInt(v6_1);
            while (v0 < v6_1) {
                p3.writeLong(((Long) p5.get(v0)).longValue());
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p3, v4_1);
            return;
        } else {
            if (p6 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p3, p4, 0);
            }
            return;
        }
    }

    public static void writeLongObject(android.os.Parcel p0, int p1, Long p2, boolean p3)
    {
        if (p2 != 0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 8);
            p0.writeLong(p2.longValue());
            return;
        } else {
            if (p3 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeParcel(android.os.Parcel p1, int p2, android.os.Parcel p3, boolean p4)
    {
        if (p3 != null) {
            int v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p1, p2);
            p1.appendFrom(p3, 0, p3.dataSize());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p1, v2_1);
            return;
        } else {
            if (p4 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p1, p2, 0);
            }
            return;
        }
    }

    public static void writeParcelArray(android.os.Parcel p4, int p5, android.os.Parcel[] p6, boolean p7)
    {
        if (p6 != null) {
            int v5_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p4, p5);
            int v7_1 = p6.length;
            p4.writeInt(v7_1);
            int v1 = 0;
            while (v1 < v7_1) {
                android.os.Parcel v2 = p6[v1];
                if (v2 == null) {
                    p4.writeInt(0);
                } else {
                    p4.writeInt(v2.dataSize());
                    p4.appendFrom(v2, 0, v2.dataSize());
                }
                v1++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p4, v5_1);
            return;
        } else {
            if (p7 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p4, p5, 0);
            }
            return;
        }
    }

    public static void writeParcelList(android.os.Parcel p4, int p5, java.util.List p6, boolean p7)
    {
        if (p6 != null) {
            int v5_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p4, p5);
            int v7_1 = p6.size();
            p4.writeInt(v7_1);
            int v1 = 0;
            while (v1 < v7_1) {
                android.os.Parcel v2_1 = ((android.os.Parcel) p6.get(v1));
                if (v2_1 == null) {
                    p4.writeInt(0);
                } else {
                    p4.writeInt(v2_1.dataSize());
                    p4.appendFrom(v2_1, 0, v2_1.dataSize());
                }
                v1++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p4, v5_1);
            return;
        } else {
            if (p7 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p4, p5, 0);
            }
            return;
        }
    }

    public static void writeParcelSparseArray(android.os.Parcel p4, int p5, android.util.SparseArray p6, boolean p7)
    {
        if (p6 != null) {
            int v5_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p4, p5);
            int v7_1 = p6.size();
            p4.writeInt(v7_1);
            int v1 = 0;
            while (v1 < v7_1) {
                p4.writeInt(p6.keyAt(v1));
                android.os.Parcel v2_2 = ((android.os.Parcel) p6.valueAt(v1));
                if (v2_2 == null) {
                    p4.writeInt(0);
                } else {
                    p4.writeInt(v2_2.dataSize());
                    p4.appendFrom(v2_2, 0, v2_2.dataSize());
                }
                v1++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p4, v5_1);
            return;
        } else {
            if (p7 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p4, p5, 0);
            }
            return;
        }
    }

    public static void writeParcelable(android.os.Parcel p0, int p1, android.os.Parcelable p2, int p3, boolean p4)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p2.writeToParcel(p0, p3);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writePendingIntent(android.os.Parcel p0, int p1, android.app.PendingIntent p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            android.app.PendingIntent.writePendingIntentOrNullToParcel(p2, p0);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeShort(android.os.Parcel p1, int p2, short p3)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p1, p2, 4);
        p1.writeInt(p3);
        return;
    }

    public static void writeSparseBooleanArray(android.os.Parcel p0, int p1, android.util.SparseBooleanArray p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeSparseBooleanArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeSparseIntArray(android.os.Parcel p2, int p3, android.util.SparseIntArray p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.size();
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeInt(p4.keyAt(v0));
                p2.writeInt(p4.valueAt(v0));
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeSparseLongArray(android.os.Parcel p3, int p4, android.util.SparseLongArray p5, boolean p6)
    {
        int v0 = 0;
        if (p5 != null) {
            int v4_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p3, p4);
            int v6_1 = p5.size();
            p3.writeInt(v6_1);
            while (v0 < v6_1) {
                p3.writeInt(p5.keyAt(v0));
                p3.writeLong(p5.valueAt(v0));
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p3, v4_1);
            return;
        } else {
            if (p6 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p3, p4, 0);
            }
            return;
        }
    }

    public static void writeString(android.os.Parcel p0, int p1, String p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeString(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeStringArray(android.os.Parcel p0, int p1, String[] p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeStringArray(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeStringList(android.os.Parcel p0, int p1, java.util.List p2, boolean p3)
    {
        if (p2 != 0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p0, p1);
            p0.writeStringList(p2);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p0, v1_1);
            return;
        } else {
            if (p3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p0, p1, 0);
            }
            return;
        }
    }

    public static void writeStringSparseArray(android.os.Parcel p2, int p3, android.util.SparseArray p4, boolean p5)
    {
        int v0 = 0;
        if (p4 != null) {
            int v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p2, p3);
            int v5_1 = p4.size();
            p2.writeInt(v5_1);
            while (v0 < v5_1) {
                p2.writeInt(p4.keyAt(v0));
                p2.writeString(((String) p4.valueAt(v0)));
                v0++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p2, v3_1);
            return;
        } else {
            if (p5 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p2, p3, 0);
            }
            return;
        }
    }

    public static void writeTypedArray(android.os.Parcel p3, int p4, android.os.Parcelable[] p5, int p6, boolean p7)
    {
        if (p5 != null) {
            int v4_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p3, p4);
            int v7_1 = p5.length;
            p3.writeInt(v7_1);
            int v1 = 0;
            while (v1 < v7_1) {
                android.os.Parcelable v2 = p5[v1];
                if (v2 != null) {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzd(p3, v2, p6);
                } else {
                    p3.writeInt(0);
                }
                v1++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p3, v4_1);
            return;
        } else {
            if (p7 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p3, p4, 0);
            }
            return;
        }
    }

    public static void writeTypedList(android.os.Parcel p3, int p4, java.util.List p5, boolean p6)
    {
        if (p5 != null) {
            int v4_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p3, p4);
            int v6_1 = p5.size();
            p3.writeInt(v6_1);
            int v1 = 0;
            while (v1 < v6_1) {
                android.os.Parcelable v2_1 = ((android.os.Parcelable) p5.get(v1));
                if (v2_1 != null) {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzd(p3, v2_1, 0);
                } else {
                    p3.writeInt(0);
                }
                v1++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p3, v4_1);
            return;
        } else {
            if (p6 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p3, p4, 0);
            }
            return;
        }
    }

    public static void writeTypedSparseArray(android.os.Parcel p3, int p4, android.util.SparseArray p5, boolean p6)
    {
        if (p5 != null) {
            int v4_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzb(p3, p4);
            int v6_1 = p5.size();
            p3.writeInt(v6_1);
            int v1 = 0;
            while (v1 < v6_1) {
                p3.writeInt(p5.keyAt(v1));
                android.os.Parcelable v2_2 = ((android.os.Parcelable) p5.valueAt(v1));
                if (v2_2 != null) {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzd(p3, v2_2, 0);
                } else {
                    p3.writeInt(0);
                }
                v1++;
            }
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zzc(p3, v4_1);
            return;
        } else {
            if (p6 != 0) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.zza(p3, p4, 0);
            }
            return;
        }
    }

    private static void zza(android.os.Parcel p0, int p1, int p2)
    {
        p0.writeInt((p1 | (p2 << 16)));
        return;
    }

    private static int zzb(android.os.Parcel p1, int p2)
    {
        p1.writeInt((p2 | -65536));
        p1.writeInt(0);
        return p1.dataPosition();
    }

    private static void zzc(android.os.Parcel p2, int p3)
    {
        int v0 = p2.dataPosition();
        int v1 = (v0 - p3);
        p2.setDataPosition((p3 - 4));
        p2.writeInt(v1);
        p2.setDataPosition(v0);
        return;
    }

    private static void zzd(android.os.Parcel p2, android.os.Parcelable p3, int p4)
    {
        int v0 = p2.dataPosition();
        p2.writeInt(1);
        int v1_1 = p2.dataPosition();
        p3.writeToParcel(p2, p4);
        int v3_1 = p2.dataPosition();
        p2.setDataPosition(v0);
        p2.writeInt((v3_1 - v1_1));
        p2.setDataPosition(v3_1);
        return;
    }
}
