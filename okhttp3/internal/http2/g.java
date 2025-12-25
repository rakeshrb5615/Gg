package okhttp3.internal.http2;
public final synthetic class g implements u7.a {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic g(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                String v0_20 = ((okhttp3.internal.http2.Http2Connection) this.b);
                o8.d v1_16 = ((okhttp3.internal.http2.Http2Stream) this.c);
                try {
                    v0_20.a.c(v1_16);
                } catch (String v2_16) {
                    okhttp3.internal.platform.Platform.a.getClass();
                    String v4_1 = new StringBuilder("Http2Connection.Listener failure for ");
                    v4_1.append(v0_20.c);
                    okhttp3.internal.platform.Platform.b.j(4, v4_1.toString(), v2_16);
                    v1_16.e(okhttp3.internal.http2.ErrorCode.d, v2_16);
                } catch (java.io.IOException) {
                }
                return h7.l.a;
            case 1:
                String v0_9 = ((okhttp3.internal.http2.Http2Connection$ReaderRunnable) this.b);
                o8.d v1_4 = ((okhttp3.internal.http2.Settings) this.c);
                String v2_3 = new kotlin.jvm.internal.r();
                String v0_11 = v0_9.b;
                try {
                } catch (String v0_15) {
                    throw v0_15;
                }
                int v7_11;
                String v4_6 = v0_11.x;
                int v5_11 = new okhttp3.internal.http2.Settings();
                v5_11.b(v4_6);
                v5_11.b(v1_4);
                v2_3.a = v5_11;
                int v5_13 = (((long) v5_11.a()) - ((long) v4_6.a()));
                o8.d v1_9 = v5_13 cmp 0;
                String v4_7 = 0;
                if (v1_9 == null) {
                    v7_11 = 0;
                } else {
                    if (!v0_11.b.isEmpty()) {
                        long v8_2 = new okhttp3.internal.http2.Http2Stream[0];
                        v7_11 = ((okhttp3.internal.http2.Http2Stream[]) v0_11.b.values().toArray(v8_2));
                    } else {
                    }
                }
                long v8_4 = ((okhttp3.internal.http2.Settings) v2_3.a);
                kotlin.jvm.internal.j.e(v8_4, "<set-?>");
                v0_11.x = v8_4;
                long v8_5 = v0_11.p;
                Integer v9_6 = new StringBuilder();
                v9_6.append(v0_11.c);
                v9_6.append(" onSettings");
                okhttp3.internal.concurrent.TaskQueue.b(v8_5, v9_6.toString(), new okhttp3.internal.http2.g(2, v0_11, v2_3), 6);
                try {
                    v0_11.C.c(((okhttp3.internal.http2.Settings) v2_3.a));
                } catch (String v2_13) {
                    v0_11.c(okhttp3.internal.http2.ErrorCode.d, okhttp3.internal.http2.ErrorCode.d, v2_13);
                }
                if (v7_11 != 0) {
                    String v0_16 = v7_11.length;
                    while (v4_7 < v0_16) {
                        String v2_14 = v7_11[v4_7];
                        try {
                            v2_14.e = (v2_14.e + v5_13);
                        } catch (String v0_18) {
                            throw v0_18;
                        }
                        if (v1_9 > null) {
                            v2_14.notifyAll();
                        }
                        v4_7++;
                    }
                }
                return h7.l.a;
            case 2:
                String v0_14 = ((okhttp3.internal.http2.Http2Connection) this.b);
                v0_14.a.a(v0_14, ((okhttp3.internal.http2.Settings) ((kotlin.jvm.internal.r) this.c).a));
                return h7.l.a;
            default:
                String v0_7 = ((q8.d) this.b);
                o8.d v1_1 = ((t8.b) this.c);
                String v2_1 = new java.util.LinkedHashMap();
                v1_1.a.getClass();
                u8.g.e(v0_7, v1_1);
                o8.d v1_2 = v0_7.d();
                String v4_3 = 0;
                while (v4_3 < v1_2) {
                    int v5_1 = v0_7.h(v4_3);
                    int v6_1 = new java.util.ArrayList();
                    int v5_2 = v5_1.iterator();
                    while (v5_2.hasNext()) {
                        int v7_3 = v5_2.next();
                        if ((v7_3 instanceof t8.e)) {
                            v6_1.add(v7_3);
                        }
                    }
                    int v5_4;
                    if (v6_1.size() != 1) {
                        v5_4 = 0;
                    } else {
                        v5_4 = v6_1.get(0);
                    }
                    int v5_5 = ((t8.e) v5_4);
                    if (v5_5 != 0) {
                        int v5_6 = v5_5.names();
                        if (v5_6 != 0) {
                            int v6_2 = v5_6.length;
                            int v7_2 = 0;
                            while (v7_2 < v6_2) {
                                Integer v9_2;
                                long v8_0 = v5_6[v7_2];
                                if (!kotlin.jvm.internal.j.a(v0_7.c(), q8.e.g)) {
                                    v9_2 = "property";
                                } else {
                                    v9_2 = "enum value";
                                }
                                if (v2_1.containsKey(v8_0)) {
                                    StringBuilder v3_5 = new StringBuilder("The suggested name \'");
                                    v3_5.append(v8_0);
                                    v3_5.append("\' for ");
                                    v3_5.append(v9_2);
                                    v3_5.append(32);
                                    v3_5.append(v0_7.e(v4_3));
                                    v3_5.append(" is already one of the names for ");
                                    v3_5.append(v9_2);
                                    v3_5.append(32);
                                    v3_5.append(v0_7.e(((Number) i7.r.k0(v2_1, v8_0)).intValue()));
                                    v3_5.append(" in ");
                                    v3_5.append(v0_7);
                                    String v0_13 = v3_5.toString();
                                    kotlin.jvm.internal.j.e(v0_13, "message");
                                    throw new o8.d(v0_13);
                                } else {
                                    v2_1.put(v8_0, Integer.valueOf(v4_3));
                                    v7_2++;
                                }
                            }
                        }
                    }
                    v4_3++;
                }
                if (v2_1.isEmpty()) {
                    v2_1 = i7.o.a;
                }
                return v2_1;
        }
    }
}
