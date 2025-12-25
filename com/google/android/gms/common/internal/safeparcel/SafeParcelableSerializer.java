package com.google.android.gms.common.internal.safeparcel;
public final class SafeParcelableSerializer {

    private SafeParcelableSerializer()
    {
        return;
    }

    public static com.google.android.gms.common.internal.safeparcel.SafeParcelable deserializeFromBytes(byte[] p3, android.os.Parcelable$Creator p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        android.os.Parcel v0 = android.os.Parcel.obtain();
        v0.unmarshall(p3, 0, p3.length);
        v0.setDataPosition(0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelable v3_2 = ((com.google.android.gms.common.internal.safeparcel.SafeParcelable) p4.createFromParcel(v0));
        v0.recycle();
        return v3_2;
    }

    public static com.google.android.gms.common.internal.safeparcel.SafeParcelable deserializeFromIntentExtra(android.content.Intent p0, String p1, android.os.Parcelable$Creator p2)
    {
        com.google.android.gms.common.internal.safeparcel.SafeParcelable v0_1 = p0.getByteArrayExtra(p1);
        if (v0_1 != null) {
            return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(v0_1, p2);
        } else {
            return 0;
        }
    }

    public static com.google.android.gms.common.internal.safeparcel.SafeParcelable deserializeFromString(String p0, android.os.Parcelable$Creator p1)
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(p0), p1);
    }

    public static java.util.ArrayList deserializeIterableFromBundle(android.os.Bundle p3, String p4, android.os.Parcelable$Creator p5)
    {
        int v3_2 = ((java.util.ArrayList) p3.getSerializable(p4));
        if (v3_2 != 0) {
            java.util.ArrayList v4_2 = new java.util.ArrayList(v3_2.size());
            int v0_1 = v3_2.size();
            int v1 = 0;
            while (v1 < v0_1) {
                v4_2.add(com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(((byte[]) v3_2.get(v1)), p5));
                v1++;
            }
            return v4_2;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList deserializeIterableFromBundleSafe(android.os.Bundle p0, String p1, android.os.Parcelable$Creator p2)
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeIterableFromBytes(p0.getByteArray(p1), p2);
    }

    public static java.util.ArrayList deserializeIterableFromBytes(byte[] p3, android.os.Parcelable$Creator p4)
    {
        if (p3 != null) {
            android.os.Parcel v0 = android.os.Parcel.obtain();
            v0.unmarshall(p3, 0, p3.length);
            v0.setDataPosition(0);
            try {
                Throwable v3_4 = new java.util.ArrayList();
                v0.readTypedList(v3_4, p4);
                v0.recycle();
                return v3_4;
            } catch (Throwable v3_1) {
                v0.recycle();
                throw v3_1;
            }
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList deserializeIterableFromIntentExtra(android.content.Intent p3, String p4, android.os.Parcelable$Creator p5)
    {
        int v3_2 = ((java.util.ArrayList) p3.getSerializableExtra(p4));
        if (v3_2 != 0) {
            java.util.ArrayList v4_2 = new java.util.ArrayList(v3_2.size());
            int v0_1 = v3_2.size();
            int v1 = 0;
            while (v1 < v0_1) {
                v4_2.add(com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(((byte[]) v3_2.get(v1)), p5));
                v1++;
            }
            return v4_2;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList deserializeIterableFromIntentExtraSafe(android.content.Intent p0, String p1, android.os.Parcelable$Creator p2)
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeIterableFromBytes(p0.getByteArrayExtra(p1), p2);
    }

    public static void serializeIterableToBundle(Iterable p2, android.os.Bundle p3, String p4)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        java.util.Iterator v2_1 = p2.iterator();
        while (v2_1.hasNext()) {
            v0_1.add(com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(((com.google.android.gms.common.internal.safeparcel.SafeParcelable) v2_1.next())));
        }
        p3.putSerializable(p4, v0_1);
        return;
    }

    public static void serializeIterableToBundleSafe(Iterable p0, android.os.Bundle p1, String p2)
    {
        p1.putByteArray(p2, com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeIterableToBytes(p0));
        return;
    }

    public static byte[] serializeIterableToBytes(Iterable p1)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        try {
            v0.writeTypedList(com.google.android.gms.internal.common.zzah.zzo(p1));
            Throwable v1_2 = v0.marshall();
            v0.recycle();
            return v1_2;
        } catch (Throwable v1_3) {
            v0.recycle();
            throw v1_3;
        }
    }

    public static void serializeIterableToIntentExtra(Iterable p2, android.content.Intent p3, String p4)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        java.util.Iterator v2_1 = p2.iterator();
        while (v2_1.hasNext()) {
            v0_1.add(com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(((com.google.android.gms.common.internal.safeparcel.SafeParcelable) v2_1.next())));
        }
        p3.putExtra(p4, v0_1);
        return;
    }

    public static void serializeIterableToIntentExtraSafe(Iterable p0, android.content.Intent p1, String p2)
    {
        p1.putExtra(p2, com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeIterableToBytes(p0));
        return;
    }

    public static byte[] serializeToBytes(com.google.android.gms.common.internal.safeparcel.SafeParcelable p2)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        p2.writeToParcel(v0, 0);
        byte[] v2_1 = v0.marshall();
        v0.recycle();
        return v2_1;
    }

    public static void serializeToIntentExtra(com.google.android.gms.common.internal.safeparcel.SafeParcelable p0, android.content.Intent p1, String p2)
    {
        p1.putExtra(p2, com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(p0));
        return;
    }

    public static String serializeToString(com.google.android.gms.common.internal.safeparcel.SafeParcelable p0)
    {
        return com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(p0));
    }
}
