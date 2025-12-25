package com.google.android.gms.common.internal;
public final class Asserts {

    private Asserts()
    {
        throw new AssertionError("Uninstantiable");
    }

    public static void checkMainThread(String p4)
    {
        if (android.os.Looper.getMainLooper().getThread() != Thread.currentThread()) {
            IllegalStateException v0_1 = String.valueOf(Thread.currentThread());
            String v1_2 = String.valueOf(android.os.Looper.getMainLooper().getThread());
            StringBuilder v2_3 = new StringBuilder(((v1_2.length() + (v0_1.length() + 56)) + 1));
            v2_3.append("checkMainThread: current thread ");
            v2_3.append(v0_1);
            v2_3.append(" IS NOT the main thread ");
            v2_3.append(v1_2);
            v2_3.append("!");
            android.util.Log.e("Asserts", v2_3.toString());
            throw new IllegalStateException(p4);
        } else {
            return;
        }
    }

    public static void checkNotMainThread(String p4)
    {
        if (android.os.Looper.getMainLooper().getThread() == Thread.currentThread()) {
            IllegalStateException v0_1 = String.valueOf(Thread.currentThread());
            String v1_2 = String.valueOf(android.os.Looper.getMainLooper().getThread());
            StringBuilder v2_3 = new StringBuilder(((v1_2.length() + (v0_1.length() + 55)) + 1));
            v2_3.append("checkNotMainThread: current thread ");
            v2_3.append(v0_1);
            v2_3.append(" IS the main thread ");
            v2_3.append(v1_2);
            v2_3.append("!");
            android.util.Log.e("Asserts", v2_3.toString());
            throw new IllegalStateException(p4);
        } else {
            return;
        }
    }

    public static void checkNotNull(Object p1)
    {
        if (p1 == null) {
            throw new IllegalArgumentException("null reference");
        } else {
            return;
        }
    }

    public static void checkNotNull(Object p0, Object p1)
    {
        if (p0 == null) {
            throw new IllegalArgumentException(String.valueOf(p1));
        } else {
            return;
        }
    }

    public static void checkNull(Object p1)
    {
        if (p1 != null) {
            throw new IllegalArgumentException("non-null reference");
        } else {
            return;
        }
    }

    public static void checkNull(Object p0, Object p1)
    {
        if (p0 != null) {
            throw new IllegalArgumentException(String.valueOf(p1));
        } else {
            return;
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
}
