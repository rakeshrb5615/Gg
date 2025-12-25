package g5;
public final class t {
    public static final java.util.HashMap f;
    public static final String g;
    public final android.content.Context a;
    public final g5.y b;
    public final g5.a c;
    public final n0.a d;
    public final o5.d e;

    static t()
    {
        String v0_1 = new java.util.HashMap();
        g5.t.f = v0_1;
        v0_1.put("armeabi", Integer.valueOf(5));
        v0_1.put("armeabi-v7a", Integer.valueOf(6));
        v0_1.put("arm64-v8a", Integer.valueOf(9));
        v0_1.put("x86", Integer.valueOf(0));
        v0_1.put("x86_64", Integer.valueOf(1));
        g5.t.g = "Crashlytics Android SDK/20.0.3";
        return;
    }

    public t(android.content.Context p1, g5.y p2, g5.a p3, n0.a p4, o5.d p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public static j5.t0 c(j6.s p7, int p8)
    {
        String v2_1 = ((String) p7.c);
        String v3_1 = ((String) p7.b);
        String v0_1 = ((StackTraceElement[]) p7.d);
        j5.t0 v1_4 = 0;
        if (v0_1 == null) {
            v0_1 = new StackTraceElement[0];
        }
        String v7_2 = ((j6.s) p7.e);
        if (p8 >= 8) {
            j6.s v4_1 = v7_2;
            while (v4_1 != null) {
                v4_1 = ((j6.s) v4_1.e);
                v1_4++;
            }
        }
        int v6 = v1_4;
        j6.s v4_2 = g5.t.d(v0_1, 4);
        if (v4_2 == null) {
            throw new NullPointerException("Null frames");
        } else {
            String v0_4 = ((byte) (0 | 1));
            j5.t0 v5 = 0;
            if ((v7_2 != null) && (v6 == 0)) {
                v5 = g5.t.c(v7_2, (p8 + 1));
            }
            if (v0_4 != 1) {
                String v7_6 = new StringBuilder();
                if ((v0_4 & 1) == 0) {
                    v7_6.append(" overflowCount");
                }
                throw new IllegalStateException(g2.g.g("Missing required properties:", v7_6));
            } else {
                return new j5.t0(v2_1, v3_1, v4_2, v5, v6);
            }
        }
    }

    public static java.util.List d(StackTraceElement[] p12, int p13)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = p12.length;
        int v2 = 0;
        while (v2 < v1) {
            long v8_0;
            j5.x0 v3_7 = p12[v2];
            j5.w0 v4_0 = new j5.w0();
            v4_0.e = p13;
            v4_0.f = ((byte) (v4_0.f | 4));
            long v6 = 0;
            if (!v3_7.isNativeMethod()) {
                v8_0 = 0;
            } else {
                v8_0 = Math.max(((long) v3_7.getLineNumber()), 0);
            }
            String v5_6 = new StringBuilder();
            v5_6.append(v3_7.getClassName());
            v5_6.append(".");
            v5_6.append(v3_7.getMethodName());
            String v5_7 = v5_6.toString();
            String v10_3 = v3_7.getFileName();
            if ((!v3_7.isNativeMethod()) && (v3_7.getLineNumber() > 0)) {
                v6 = ((long) v3_7.getLineNumber());
            }
            v4_0.a = v8_0;
            j5.x0 v3_3 = ((byte) (v4_0.f | 1));
            v4_0.f = v3_3;
            if (v5_7 == null) {
                throw new NullPointerException("Null symbol");
            } else {
                v4_0.b = v5_7;
                v4_0.c = v10_3;
                v4_0.d = v6;
                v4_0.f = ((byte) (v3_3 | 2));
                v0_1.add(v4_0.a());
                v2++;
            }
        }
        return java.util.Collections.unmodifiableList(v0_1);
    }

    public static j5.u0 e()
    {
        if (((byte) 1) != 1) {
            String v0_5 = new StringBuilder();
            if (((byte) 1) == 0) {
                v0_5.append(" address");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", v0_5));
        } else {
            return new j5.u0("0", "0", 0);
        }
    }

    public final java.util.List a()
    {
        IllegalStateException v0_10 = ((byte) (((byte) (0 | 1)) | 2));
        String v1_4 = this.c;
        String v7 = v1_4.e;
        if (v7 == null) {
            throw new NullPointerException("Null name");
        } else {
            if (v0_10 != 3) {
                String v1_2 = new StringBuilder();
                if ((v0_10 & 1) == 0) {
                    v1_2.append(" baseAddress");
                }
                if ((v0_10 & 2) == 0) {
                    v1_2.append(" size");
                }
                throw new IllegalStateException(g2.g.g("Missing required properties:", v1_2));
            } else {
                return java.util.Collections.singletonList(new j5.s0(0, 0, v7, v1_4.b));
            }
        }
    }

    public final j5.b1 b(int p17)
    {
        j5.a1 v2_0 = this.a;
        int v5 = 0;
        Double v6 = 0;
        try {
            int v7_1;
            j5.b1 v0_15;
            j5.b1 v0_21 = v2_0.registerReceiver(0, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (j5.b1 v0_1) {
            v7_1 = 0;
            android.util.Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", v0_1);
            v0_15 = 0;
            if (v0_15 != null) {
                v6 = Double.valueOf(v0_15.doubleValue());
            }
            if ((v7_1 != 0) && (v0_15 != null)) {
                if (((double) v0_15.floatValue()) >= 4607092346807469998) {
                    j5.b1 v0_19 = 3;
                } else {
                    v0_19 = 2;
                }
            } else {
                v0_19 = 1;
            }
            if ((!g5.g.f()) && (((android.hardware.SensorManager) v2_0.getSystemService("sensor")).getDefaultSensor(8) != null)) {
                v5 = 1;
            }
            long v9_5 = g5.g.a(v2_0);
            int v7_12 = new android.app.ActivityManager$MemoryInfo();
            ((android.app.ActivityManager) v2_0.getSystemService("activity")).getMemoryInfo(v7_12);
            long v9_6 = (v9_5 - v7_12.availMem);
            if (v9_6 <= 0) {
                v9_6 = 0;
            }
            int v7_14 = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            long v11_4 = ((long) v7_14.getBlockSize());
            long v13_0 = ((((long) v7_14.getBlockCount()) * v11_4) - (v11_4 * ((long) v7_14.getAvailableBlocks())));
            j5.a1 v2_2 = new j5.a1();
            v2_2.a = v6;
            v2_2.b = v0_19;
            j5.b1 v0_3 = ((byte) (v2_2.g | 1));
            v2_2.c = v5;
            j5.b1 v0_5 = ((byte) (v0_3 | 2));
            v2_2.d = p17;
            j5.b1 v0_7 = ((byte) (v0_5 | 4));
            v2_2.e = v9_6;
            j5.b1 v0_9 = ((byte) (v0_7 | 8));
            v2_2.f = v13_0;
            v2_2.g = ((byte) (v0_9 | 16));
            return v2_2.a();
        }
        if (v0_21 == null) {
            v7_1 = 0;
        } else {
            int v7_3 = v0_21.getIntExtra("status", -1);
            if ((v7_3 == -1) || ((v7_3 != 2) && (v7_3 != 5))) {
                v7_1 = 0;
            } else {
                v7_1 = 1;
            }
            try {
                long v9_2 = v0_21.getIntExtra("level", -1);
                j5.b1 v0_13 = v0_21.getIntExtra("scale", -1);
            } catch (j5.b1 v0_1) {
            }
            if (v9_2 == -1) {
            } else {
                if (v0_13 != -1) {
                    v0_15 = Float.valueOf((((float) v9_2) / ((float) v0_13)));
                } else {
                }
            }
        }
    }
}
