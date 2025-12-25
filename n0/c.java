package n0;
public abstract class c {
    public static final r.i a;
    public static final g5.i b;

    static c()
    {
        n0.c.a = new r.i(2);
        n0.c.b = new g5.i(4);
        return;
    }

    public static h.f a(android.content.Context p5, java.util.List p6)
    {
        j5.t1.c("FontProvider.getFontFamilyResult");
        try {
            java.util.ArrayList v0_2 = new java.util.ArrayList();
            int v1 = 0;
        } catch (h.f v5_1) {
            android.os.Trace.endSection();
            throw v5_1;
        }
        while (v1 < p6.size()) {
            n0.i[] v2_1 = ((n0.d) p6.get(v1));
            String v3_1 = n0.c.b(p5.getPackageManager(), v2_1, p5.getResources());
            if (v3_1 != null) {
                v0_2.add(n0.c.c(p5, v2_1, v3_1.authority));
                v1++;
            } else {
                h.f v5_3 = new h.f(5);
                android.os.Trace.endSection();
                return v5_3;
            }
        }
        h.f v5_5 = new h.f(v0_2);
        android.os.Trace.endSection();
        return v5_5;
    }

    public static android.content.pm.ProviderInfo b(android.content.pm.PackageManager p9, n0.d p10, android.content.res.Resources p11)
    {
        String v0_0 = n0.c.b;
        r.i v1 = n0.c.a;
        j5.t1.c("FontProvider.getProvider");
        try {
            java.util.List v4_0 = p10.d;
            boolean v5_0 = p10.a;
            String v10_8 = p10.b;
        } catch (int v9_1) {
            android.os.Trace.endSection();
            throw v9_1;
        }
        if (v4_0 == null) {
            v4_0 = g0.b.k(p11, 0);
        }
        StringBuilder v11_2 = new n0.b();
        v11_2.a = v5_0;
        v11_2.b = v10_8;
        v11_2.c = v4_0;
        android.content.pm.ProviderInfo v7_1 = ((android.content.pm.ProviderInfo) v1.get(v11_2));
        if (v7_1 == null) {
            android.content.pm.ProviderInfo v7_2 = p9.resolveContentProvider(v5_0, 0);
            if (v7_2 == null) {
                String v10_2 = new StringBuilder("No package found for authority: ");
                v10_2.append(v5_0);
                throw new android.content.pm.PackageManager$NameNotFoundException(v10_2.toString());
            } else {
                if (!v7_2.packageName.equals(v10_8)) {
                    StringBuilder v11_4 = new StringBuilder("Found content provider ");
                    v11_4.append(v5_0);
                    v11_4.append(", but package was not ");
                    v11_4.append(v10_8);
                    throw new android.content.pm.PackageManager$NameNotFoundException(v11_4.toString());
                } else {
                    int v9_7 = p9.getPackageInfo(v7_2.packageName, 64).signatures;
                    String v10_7 = new java.util.ArrayList();
                    java.util.ArrayList v2_2 = v9_7.length;
                    int v3_3 = 0;
                    while (v3_3 < v2_2) {
                        v10_7.add(v9_7[v3_3].toByteArray());
                        v3_3++;
                    }
                    java.util.Collections.sort(v10_7, v0_0);
                    int v9_8 = 0;
                    while (v9_8 < v4_0.size()) {
                        java.util.ArrayList v2_5 = new java.util.ArrayList(((java.util.Collection) v4_0.get(v9_8)));
                        java.util.Collections.sort(v2_5, v0_0);
                        if (v10_7.size() == v2_5.size()) {
                            int v3_7 = 0;
                            while (v3_7 < v10_7.size()) {
                                if (java.util.Arrays.equals(((byte[]) v10_7.get(v3_7)), ((byte[]) v2_5.get(v3_7)))) {
                                    v3_7++;
                                }
                            }
                            v1.put(v11_2, v7_2);
                            android.os.Trace.endSection();
                            return v7_2;
                        } else {
                        }
                        v9_8++;
                    }
                    android.os.Trace.endSection();
                    return 0;
                }
            }
        } else {
            android.os.Trace.endSection();
            return v7_1;
        }
    }

    public static n0.i[] c(android.content.Context p18, n0.d p19, String p20)
    {
        j5.t1.c("FontProvider.query");
        try {
            String v2_2 = new java.util.ArrayList();
            android.net.Uri v5 = new android.net.Uri$Builder().scheme("content").authority(p20).build();
            android.net.Uri v1_3 = new android.net.Uri$Builder().scheme("content").authority(p20).appendPath("file").build();
            android.content.ContentProviderClient v4 = p18.getContentResolver().acquireUnstableContentProviderClient(v5);
            android.database.Cursor v3_3 = 0;
        } catch (int v0_3) {
            android.os.Trace.endSection();
            throw v0_3;
        }
        int v8 = "font_ttc_index";
        int v10 = "font_weight";
        j5.t1.c("ContentQueryWrapper.query");
        try {
            if (v4 != null) {
                try {
                    v3_3 = v4.query(v5, new String[] {"_id", "result_code"}), "query = ?", new String[] {p19.c}), 0, 0);
                } catch (int v0_10) {
                    android.util.Log.w("FontsProvider", "Unable to query the content provider", v0_10);
                }
            }
        } catch (int v0_11) {
            android.os.Trace.endSection();
            throw v0_11;
        }
        android.os.Trace.endSection();
        if ((v3_3 != null) && (v3_3.getCount() > 0)) {
            String v2_4 = v3_3.getColumnIndex("result_code");
            String v6_5 = new java.util.ArrayList();
            String v7_3 = v3_3.getColumnIndex("_id");
            int v8_2 = v3_3.getColumnIndex("file_id");
            int v9_2 = v3_3.getColumnIndex("font_ttc_index");
            int v10_2 = v3_3.getColumnIndex("font_weight");
            int v11_1 = v3_3.getColumnIndex("font_italic");
            while (v3_3.moveToNext()) {
                int v17;
                if (v2_4 == -1) {
                    v17 = 0;
                } else {
                    v17 = v3_3.getInt(v2_4);
                }
                int v14;
                if (v9_2 == -1) {
                    v14 = 0;
                } else {
                    v14 = v3_3.getInt(v9_2);
                }
                n0.i v12_1;
                if (v8_2 != -1) {
                    v12_1 = android.content.ContentUris.withAppendedId(v1_3, v3_3.getLong(v8_2));
                } else {
                    v12_1 = android.content.ContentUris.withAppendedId(v5, v3_3.getLong(v7_3));
                }
                android.net.Uri v13_2 = v12_1;
                int v15;
                if (v10_2 == -1) {
                    v15 = 400;
                } else {
                    v15 = v3_3.getInt(v10_2);
                }
                if ((v11_1 == -1) || (v3_3.getInt(v11_1) != 1)) {
                    int v16 = 0;
                } else {
                    v16 = 1;
                }
                v6_5.add(new n0.i(v13_2, v14, v15, v16, v17));
            }
            v2_2 = v6_5;
        }
        if (v3_3 != null) {
            v3_3.close();
        }
        if (v4 != null) {
            v4.close();
        }
        int v0_13 = new n0.i[0];
        int v0_15 = ((n0.i[]) v2_2.toArray(v0_13));
        android.os.Trace.endSection();
        return v0_15;
    }
}
