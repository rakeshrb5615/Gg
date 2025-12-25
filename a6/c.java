package a6;
public final synthetic class c implements java.util.concurrent.Callable {
    public final synthetic int a;
    public final synthetic a6.d b;

    public synthetic c(a6.d p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object call()
    {
        switch (this.a) {
            case 0:
                String v1_11 = ((a6.l) this.b.a.get());
                Throwable v2_8 = v1_11.a();
                v1_11.a.a(new a6.i(v1_11, 0));
                String v1_2 = new org.json.JSONArray();
                android.util.Base64OutputStream v3_0 = 0;
                while (v3_0 < v2_8.size()) {
                    java.util.zip.GZIPOutputStream v4_7 = ((a6.a) v2_8.get(v3_0));
                    String v5_3 = new org.json.JSONObject();
                    v5_3.put("agent", v4_7.a);
                    v5_3.put("dates", new org.json.JSONArray(v4_7.b));
                    v1_2.put(v5_3);
                    v3_0++;
                }
                Throwable v2_2 = new org.json.JSONObject();
                v2_2.put("heartbeats", v1_2);
                v2_2.put("version", "2");
                String v1_6 = new java.io.ByteArrayOutputStream();
                android.util.Base64OutputStream v3_4 = new android.util.Base64OutputStream(v1_6, 11);
                try {
                    java.util.zip.GZIPOutputStream v4_5 = new java.util.zip.GZIPOutputStream(v3_4);
                    try {
                        v4_5.write(v2_2.toString().getBytes("UTF-8"));
                    } catch (String v1_7) {
                        try {
                            v4_5.close();
                        } catch (Throwable v2_5) {
                            v1_7.addSuppressed(v2_5);
                        }
                        throw v1_7;
                    }
                    v4_5.close();
                    v3_4.close();
                    return v1_6.toString("UTF-8");
                } catch (String v1_8) {
                    try {
                        v3_4.close();
                    } catch (Throwable v2_6) {
                        v1_8.addSuppressed(v2_6);
                    }
                    throw v1_8;
                }
            default:
                int v0_2 = this.b;
                try {
                    String v1_15 = ((a6.l) v0_2.a.get());
                    Throwable v2_9 = System.currentTimeMillis();
                    java.util.zip.GZIPOutputStream v4_12 = ((l6.b) v0_2.c.get()).a();
                } catch (String v1_0) {
                    throw v1_0;
                }
                v1_15.a.a(new a6.h(v1_15, v1_15.b(v2_9), v4_12, c4.b.c0(v4_12)));
                return 0;
        }
    }
}
