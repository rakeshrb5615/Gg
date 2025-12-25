package com.google.android.gms.common.data;
public class BitmapTeleporter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    android.os.ParcelFileDescriptor zab;
    final int zac;
    private android.graphics.Bitmap zad;
    private boolean zae;
    private java.io.File zaf;

    static BitmapTeleporter()
    {
        com.google.android.gms.common.data.BitmapTeleporter.CREATOR = new com.google.android.gms.common.data.zaa();
        return;
    }

    public BitmapTeleporter(int p1, android.os.ParcelFileDescriptor p2, int p3)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = 0;
        this.zae = 0;
        return;
    }

    public BitmapTeleporter(android.graphics.Bitmap p3)
    {
        this.zaa = 1;
        this.zab = 0;
        this.zac = 0;
        this.zad = p3;
        this.zae = 1;
        return;
    }

    private static final void zaa(java.io.Closeable p2)
    {
        try {
            p2.close();
            return;
        } catch (java.io.IOException v2_1) {
            android.util.Log.w("BitmapTeleporter", "Could not close stream", v2_1);
            return;
        }
    }

    public android.graphics.Bitmap get()
    {
        if (!this.zae) {
            int v0_5 = new java.io.DataInputStream(new android.os.ParcelFileDescriptor$AutoCloseInputStream(((android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zab))));
            try {
                Throwable v1_1 = new byte[v0_5.readInt()];
                IllegalStateException v2_0 = v0_5.readInt();
                String v3_0 = v0_5.readInt();
                android.graphics.Bitmap$Config v4_1 = android.graphics.Bitmap$Config.valueOf(v0_5.readUTF());
                v0_5.read(v1_1);
                com.google.android.gms.common.data.BitmapTeleporter.zaa(v0_5);
                int v0_2 = java.nio.ByteBuffer.wrap(v1_1);
                Throwable v1_2 = android.graphics.Bitmap.createBitmap(v2_0, v3_0, v4_1);
                v1_2.copyPixelsFromBuffer(v0_2);
                this.zad = v1_2;
                this.zae = 1;
            } catch (Throwable v1_4) {
                throw new IllegalStateException("Could not read from parcel file descriptor", v1_4);
            } catch (Throwable v1_5) {
                com.google.android.gms.common.data.BitmapTeleporter.zaa(1);
                throw v1_5;
            }
        }
        return this.zad;
    }

    public void release()
    {
        if (!this.zae) {
            try {
                ((android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zab)).close();
                return;
            } catch (java.io.IOException v0_4) {
                android.util.Log.w("BitmapTeleporter", "Could not close PFD", v0_4);
            }
        }
        return;
    }

    public void setTempDir(java.io.File p2)
    {
        if (p2 == null) {
            throw new NullPointerException("Cannot set null temp directory");
        } else {
            this.zaf = p2;
            return;
        }
    }

    public final void writeToParcel(android.os.Parcel p7, int p8)
    {
        if (this.zab == null) {
            String v0_4 = ((android.graphics.Bitmap) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad));
            int v1_0 = java.nio.ByteBuffer.allocate((v0_4.getHeight() * v0_4.getRowBytes()));
            v0_4.copyPixelsToBuffer(v1_0);
            int v1_1 = v1_0.array();
            java.io.DataOutputStream v3_0 = this.zaf;
            if (v3_0 == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            } else {
                try {
                    java.io.DataOutputStream v3_1 = java.io.File.createTempFile("teleporter", ".tmp", v3_0);
                    try {
                        java.io.FileOutputStream v4_2 = new java.io.FileOutputStream(v3_1);
                        this.zab = android.os.ParcelFileDescriptor.open(v3_1, 268435456);
                        v3_1.delete();
                        java.io.DataOutputStream v3_3 = new java.io.DataOutputStream(new java.io.BufferedOutputStream(v4_2));
                        try {
                            v3_3.writeInt(v1_1.length);
                            v3_3.writeInt(v0_4.getWidth());
                            v3_3.writeInt(v0_4.getHeight());
                            v3_3.writeUTF(v0_4.getConfig().toString());
                            v3_3.write(v1_1);
                            com.google.android.gms.common.data.BitmapTeleporter.zaa(v3_3);
                        } catch (Throwable v7_6) {
                            throw new IllegalStateException("Could not write into unlinked file", v7_6);
                        } catch (Throwable v7_7) {
                            com.google.android.gms.common.data.BitmapTeleporter.zaa(v3_3);
                            throw v7_7;
                        }
                    } catch (java.io.FileNotFoundException) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (Throwable v7_3) {
                    throw new IllegalStateException("Could not create temporary file", v7_3);
                }
            }
        }
        IllegalStateException v8_7 = (p8 | 1);
        int v1_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p7);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p7, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p7, 2, this.zab, v8_7, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p7, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p7, v1_3);
        this.zab = 0;
        return;
    }
}
