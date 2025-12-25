package g2;
public abstract synthetic class g {

    public static synthetic int a(int p1)
    {
        int v0_0 = 1;
        if (p1 != 1) {
            v0_0 = 2;
            if (p1 != 2) {
                v0_0 = 3;
                if (p1 != 3) {
                    if (p1 != 4) {
                        throw 0;
                    } else {
                        return 4;
                    }
                }
            }
        }
        return v0_0;
    }

    public static float b(float p0, float p1, float p2, float p3)
    {
        return (((p0 - p1) * p2) + p3);
    }

    public static String c(int p1, String p2)
    {
        StringBuilder v0_1 = new StringBuilder(p2);
        v0_1.append(p1);
        return v0_1.toString();
    }

    public static String d(String p1, String p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(p1);
        v0_1.append(p2);
        return v0_1.toString();
    }

    public static String e(String p1, String p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(p1);
        v0_1.append(p2);
        v0_1.append(p3);
        return v0_1.toString();
    }

    public static String f(String p1, String p2, String p3, String p4)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        v0_1.append(p3);
        v0_1.append(p4);
        return v0_1.toString();
    }

    public static String g(String p1, StringBuilder p2)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        return v0_1.toString();
    }

    public static java.util.HashMap h(Class p1, w5.a p2)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        v0_1.put(p1, p2);
        return v0_1;
    }

    public static java.util.Map i(java.util.HashMap p1)
    {
        return java.util.Collections.unmodifiableMap(new java.util.HashMap(p1));
    }

    public static synthetic void j(int p6, String p7)
    {
        if (p6 != null) {
            return;
        } else {
            StringBuilder v0_4 = Thread.currentThread().getStackTrace();
            String v2_1 = kotlin.jvm.internal.j.getName();
            String v3_0 = 0;
            while (!v0_4[v3_0].getClassName().equals(v2_1)) {
                v3_0++;
            }
            while (v0_4[v3_0].getClassName().equals(v2_1)) {
                v3_0++;
            }
            StringBuilder v0_0 = v0_4[v3_0];
            StringBuilder v0_2 = v1.a.r("Parameter specified as non-null is null: method ", v0_0.getClassName(), ".", v0_0.getMethodName(), ", parameter ");
            v0_2.append(p7);
            NullPointerException v6_2 = new NullPointerException(v0_2.toString());
            kotlin.jvm.internal.j.h(v6_2, kotlin.jvm.internal.j.getName());
            throw v6_2;
        }
    }

    public static synthetic void k(AutoCloseable p5)
    {
        if (!(p5 instanceof AutoCloseable)) {
            if (!(p5 instanceof java.util.concurrent.ExecutorService)) {
                if (!(p5 instanceof android.content.res.TypedArray)) {
                    if (!(p5 instanceof android.media.MediaMetadataRetriever)) {
                        if (!(p5 instanceof android.media.MediaDrm)) {
                            throw new IllegalArgumentException();
                        } else {
                            ((android.media.MediaDrm) p5).release();
                            return;
                        }
                    } else {
                        ((android.media.MediaMetadataRetriever) p5).release();
                        return;
                    }
                } else {
                    ((android.content.res.TypedArray) p5).recycle();
                    return;
                }
            } else {
                if (((java.util.concurrent.ExecutorService) p5) != java.util.concurrent.ForkJoinPool.commonPool()) {
                    boolean v0_3 = ((java.util.concurrent.ExecutorService) p5).isTerminated();
                    if (!v0_3) {
                        ((java.util.concurrent.ExecutorService) p5).shutdown();
                        int v1 = 0;
                        while (!v0_3) {
                            try {
                                v0_3 = ((java.util.concurrent.ExecutorService) p5).awaitTermination(1, java.util.concurrent.TimeUnit.DAYS);
                            } catch (InterruptedException) {
                                if (v1 == 0) {
                                    ((java.util.concurrent.ExecutorService) p5).shutdownNow();
                                    v1 = 1;
                                }
                            }
                        }
                        if (v1 != 0) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                return;
            }
        } else {
            p5.close();
            return;
        }
    }

    public static String l(String p1, String p2)
    {
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(p2);
        return v0_1.toString();
    }

    public static synthetic String m(int p0)
    {
        switch (p0) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw 0;
        }
    }
}
