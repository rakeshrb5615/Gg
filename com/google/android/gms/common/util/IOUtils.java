package com.google.android.gms.common.util;
public final class IOUtils {

    private IOUtils()
    {
        return;
    }

    public static void closeQuietly(android.os.ParcelFileDescriptor p0)
    {
        try {
            if (p0 != null) {
                p0.close();
            }
        } catch (java.io.IOException) {
        }
        return;
    }

    public static void closeQuietly(java.io.Closeable p0)
    {
        try {
            if (p0 != null) {
                p0.close();
            }
        } catch (java.io.IOException) {
        }
        return;
    }

    public static long copyStream(java.io.InputStream p2, java.io.OutputStream p3)
    {
        return com.google.android.gms.common.util.IOUtils.copyStream(p2, p3, 0, 1024);
    }

    public static long copyStream(java.io.InputStream p7, java.io.OutputStream p8, boolean p9, int p10)
    {
        byte[] v0 = new byte[p10];
        long v1 = 0;
        try {
            while(true) {
                int v4 = p7.read(v0, 0, p10);
                v1 += ((long) v4);
                p8.write(v0, 0, v4);
            }
            if (p9) {
                com.google.android.gms.common.util.IOUtils.closeQuietly(p7);
                com.google.android.gms.common.util.IOUtils.closeQuietly(p8);
            }
            return v1;
        } catch (Throwable v10_1) {
            if (p9) {
                com.google.android.gms.common.util.IOUtils.closeQuietly(p7);
                com.google.android.gms.common.util.IOUtils.closeQuietly(p8);
            }
            throw v10_1;
        }
        if (v4 != -1) {
        }
    }

    public static boolean isGzipByteBuffer(byte[] p3)
    {
        if ((p3.length <= 1) || ((((p3[1] & 255) << 8) | (p3[0] & 255)) != 35615)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static byte[] readInputStreamFully(java.io.InputStream p1)
    {
        return com.google.android.gms.common.util.IOUtils.readInputStreamFully(p1, 1);
    }

    public static byte[] readInputStreamFully(java.io.InputStream p2, boolean p3)
    {
        java.io.ByteArrayOutputStream v0_1 = new java.io.ByteArrayOutputStream();
        com.google.android.gms.common.util.IOUtils.copyStream(p2, v0_1, p3, 1024);
        return v0_1.toByteArray();
    }

    public static byte[] toByteArray(java.io.InputStream p4)
    {
        java.io.ByteArrayOutputStream v0_1 = new java.io.ByteArrayOutputStream();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
        byte[] v1_1 = new byte[4096];
        while(true) {
            int v2 = p4.read(v1_1);
            if (v2 == -1) {
                break;
            }
            v0_1.write(v1_1, 0, v2);
        }
        return v0_1.toByteArray();
    }
}
