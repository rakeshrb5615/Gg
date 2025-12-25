package com.google.android.gms.common.internal;
public final class Preconditions {

    private Preconditions()
    {
        throw new AssertionError("Uninstantiable");
    }

    public static void checkArgument(boolean p0)
    {
        if (p0 == null) {
            throw new IllegalArgumentException();
        } else {
            return;
        }
    }

    public static void checkArgument(boolean p0, Object p1)
    {
        if (p0 == null) {
            throw new IllegalArgumentException(String.valueOf(p1));
        } else {
            return;
        }
    }

    public static varargs void checkArgument(boolean p0, String p1, Object[] p2)
    {
        if (p0 == null) {
            throw new IllegalArgumentException(String.format(p1, p2));
        } else {
            return;
        }
    }

    public static double checkArgumentInRange(double p1, double p3, double p5, String p7)
    {
        if (p1 < p3) {
            throw new IllegalArgumentException(com.google.android.gms.common.internal.Preconditions.zza("%s is out of range of [%f, %f] (too low)", new Object[] {p7, Double.valueOf(p3), Double.valueOf(p5)})));
        } else {
            if (p1 > p5) {
                throw new IllegalArgumentException(com.google.android.gms.common.internal.Preconditions.zza("%s is out of range of [%f, %f] (too high)", new Object[] {p7, Double.valueOf(p3), Double.valueOf(p5)})));
            } else {
                return p1;
            }
        }
    }

    public static float checkArgumentInRange(float p1, float p2, float p3, String p4)
    {
        if (p1 < p2) {
            throw new IllegalArgumentException(com.google.android.gms.common.internal.Preconditions.zza("%s is out of range of [%f, %f] (too low)", new Object[] {p4, Float.valueOf(p2), Float.valueOf(p3)})));
        } else {
            if (p1 > p3) {
                throw new IllegalArgumentException(com.google.android.gms.common.internal.Preconditions.zza("%s is out of range of [%f, %f] (too high)", new Object[] {p4, Float.valueOf(p2), Float.valueOf(p3)})));
            } else {
                return p1;
            }
        }
    }

    public static int checkArgumentInRange(int p0, int p1, int p2, String p3)
    {
        if (p0 < p1) {
            throw new IllegalArgumentException(com.google.android.gms.common.internal.Preconditions.zza("%s is out of range of [%d, %d] (too low)", new Object[] {p3, Integer.valueOf(p1), Integer.valueOf(p2)})));
        } else {
            if (p0 > p2) {
                throw new IllegalArgumentException(com.google.android.gms.common.internal.Preconditions.zza("%s is out of range of [%d, %d] (too high)", new Object[] {p3, Integer.valueOf(p1), Integer.valueOf(p2)})));
            } else {
                return p0;
            }
        }
    }

    public static long checkArgumentInRange(long p1, long p3, long p5, String p7)
    {
        if (p1 < p3) {
            throw new IllegalArgumentException(com.google.android.gms.common.internal.Preconditions.zza("%s is out of range of [%d, %d] (too low)", new Object[] {p7, Long.valueOf(p3), Long.valueOf(p5)})));
        } else {
            if (p1 > p5) {
                throw new IllegalArgumentException(com.google.android.gms.common.internal.Preconditions.zza("%s is out of range of [%d, %d] (too high)", new Object[] {p7, Long.valueOf(p3), Long.valueOf(p5)})));
            } else {
                return p1;
            }
        }
    }

    public static int checkArgumentNonnegative(int p1)
    {
        if (p1 < null) {
            throw new IllegalArgumentException("Given value is negative");
        } else {
            return p1;
        }
    }

    public static int checkArgumentNonnegative(int p0, String p1)
    {
        if (p0 < null) {
            throw new IllegalArgumentException(p1);
        } else {
            return p0;
        }
    }

    public static long checkArgumentNonnegative(long p2)
    {
        if (p2 < 0) {
            throw new IllegalArgumentException("Given value is negative");
        } else {
            return p2;
        }
    }

    public static long checkArgumentNonnegative(long p2, String p4)
    {
        if (p2 < 0) {
            throw new IllegalArgumentException(p4);
        } else {
            return p2;
        }
    }

    public static void checkHandlerThread(android.os.Handler p4)
    {
        String v0_0 = android.os.Looper.myLooper();
        if (v0_0 == p4.getLooper()) {
            return;
        } else {
            String v0_1;
            if (v0_0 == null) {
                v0_1 = "null current looper";
            } else {
                v0_1 = v0_0.getThread().getName();
            }
            String v4_3 = p4.getLooper().getThread().getName();
            StringBuilder v2_4 = new StringBuilder(((String.valueOf(v0_1).length() + (String.valueOf(v4_3).length() + 35)) + 1));
            v2_4.append("Must be called on ");
            v2_4.append(v4_3);
            v2_4.append(" thread, but got ");
            v2_4.append(v0_1);
            v2_4.append(".");
            throw new IllegalStateException(v2_4.toString());
        }
    }

    public static void checkHandlerThread(android.os.Handler p1, String p2)
    {
        if (android.os.Looper.myLooper() != p1.getLooper()) {
            throw new IllegalStateException(p2);
        } else {
            return;
        }
    }

    public static void checkMainThread()
    {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the main application thread");
        return;
    }

    public static void checkMainThread(String p1)
    {
        if (!com.google.android.gms.common.util.zze.zza()) {
            throw new IllegalStateException(p1);
        } else {
            return;
        }
    }

    public static String checkNotEmpty(String p1)
    {
        if (android.text.TextUtils.isEmpty(p1)) {
            throw new IllegalArgumentException("Given String is empty or null");
        } else {
            return p1;
        }
    }

    public static String checkNotEmpty(String p1, Object p2)
    {
        if (android.text.TextUtils.isEmpty(p1)) {
            throw new IllegalArgumentException(String.valueOf(p2));
        } else {
            return p1;
        }
    }

    public static void checkNotGoogleApiHandlerThread()
    {
        com.google.android.gms.common.internal.Preconditions.checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
        return;
    }

    public static void checkNotGoogleApiHandlerThread(String p2)
    {
        IllegalStateException v0_0 = android.os.Looper.myLooper();
        if ((v0_0 != null) && (java.util.Objects.equals(v0_0.getThread().getName(), "GoogleApiHandler"))) {
            throw new IllegalStateException(p2);
        } else {
            return;
        }
    }

    public static void checkNotMainThread()
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Must not be called on the main application thread");
        return;
    }

    public static void checkNotMainThread(String p1)
    {
        if (com.google.android.gms.common.util.zze.zza()) {
            throw new IllegalStateException(p1);
        } else {
            return;
        }
    }

    public static Object checkNotNull(Object p1)
    {
        if (p1 == null) {
            throw new NullPointerException("null reference");
        } else {
            return p1;
        }
    }

    public static Object checkNotNull(Object p0, Object p1)
    {
        if (p0 == null) {
            throw new NullPointerException(String.valueOf(p1));
        } else {
            return p0;
        }
    }

    public static int checkNotZero(int p1)
    {
        if (p1 == null) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else {
            return p1;
        }
    }

    public static int checkNotZero(int p0, Object p1)
    {
        if (p0 == null) {
            throw new IllegalArgumentException(String.valueOf(p1));
        } else {
            return p0;
        }
    }

    public static long checkNotZero(long p2)
    {
        if (p2 == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        } else {
            return p2;
        }
    }

    public static long checkNotZero(long p2, Object p4)
    {
        if (p2 == 0) {
            throw new IllegalArgumentException(String.valueOf(p4));
        } else {
            return p2;
        }
    }

    public static void checkState(boolean p0)
    {
        if (p0 == null) {
            throw new IllegalStateException();
        } else {
            return;
        }
    }

    public static void checkState(boolean p0, Object p1)
    {
        if (p0 == null) {
            throw new IllegalStateException(String.valueOf(p1));
        } else {
            return;
        }
    }

    public static varargs void checkState(boolean p0, String p1, Object[] p2)
    {
        if (p0 == null) {
            throw new IllegalStateException(String.format(p1, p2));
        } else {
            return;
        }
    }

    public static varargs String zza(String p7, Object[] p8)
    {
        StringBuilder v1_1 = new StringBuilder((p7.length() + 48));
        int v0_3 = 0;
        int v2_2 = 0;
        while (v0_3 < 3) {
            int v4_0 = p7.indexOf("%s", v2_2);
            if (v4_0 == -1) {
                break;
            }
            v1_1.append(p7.substring(v2_2, v4_0));
            int v2_1 = (v0_3 + 1);
            v1_1.append(p8[v0_3]);
            v2_2 = (v4_0 + 2);
            v0_3 = v2_1;
        }
        v1_1.append(p7.substring(v2_2));
        if (v0_3 < 3) {
            v1_1.append(" [");
            String v7_3 = (v0_3 + 1);
            v1_1.append(p8[v0_3]);
            while (v7_3 < 3) {
                v1_1.append(", ");
                int v0_7 = (v7_3 + 1);
                v1_1.append(p8[v7_3]);
                v7_3 = v0_7;
            }
            v1_1.append("]");
        }
        return v1_1.toString();
    }
}
