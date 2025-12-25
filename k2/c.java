package k2;
public class c implements d4.c, com.google.android.gms.tasks.OnCompleteListener, g1.n, com.google.android.gms.tasks.SuccessContinuation, g8.c, z8.g, j2.i {
    public static k2.c d;
    public final synthetic int a;
    public Object b;
    public Object c;

    public c(int p5)
    {
        this.a = p5;
        switch (p5) {
            case 1:
                this.b = new android.util.SparseIntArray();
                this.c = new android.util.SparseIntArray();
                return;
            case 4:
                this.b = new r.j(0);
                this.c = new r.g();
                return;
            case 12:
                this.b = android.view.Choreographer.getInstance();
                this.c = android.os.Looper.myLooper();
                return;
            case 17:
                this.b = new java.util.concurrent.atomic.AtomicInteger();
                this.c = new java.util.concurrent.atomic.AtomicInteger();
                return;
            default:
                java.util.concurrent.atomic.AtomicInteger v5_16 = ((m6.j) q4.f.d().b(m6.j)).a();
                this.b = v5_16;
                int v0_3 = new m6.g();
                v0_3.a = 14400;
                m6.g v1_2 = new m6.g();
                v1_2.a = v0_3.a;
                com.google.android.gms.tasks.Tasks.call(v5_16.b, new j6.h(1, v5_16, v1_2));
                return;
        }
    }

    public c(int p2, int p3)
    {
        this.a = 13;
        this.b = new int[] {p2, p3});
        float[] v2_3 = new float[2];
        v2_3 = {0, 1065353216};
        this.c = v2_3;
        return;
    }

    public c(int p2, int p3, int p4)
    {
        this.a = 13;
        this.b = new int[] {p2, p3, p4});
        float[] v2_3 = new float[3];
        v2_3 = {0, 1056964608, 1065353216};
        this.c = v2_3;
        return;
    }

    public synthetic c(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public synthetic c(int p1, boolean p2)
    {
        this.a = p1;
        return;
    }

    public c(a2.r0 p2)
    {
        this.a = 3;
        this.b = p2;
        a2.t1 v2_2 = new a2.t1();
        v2_2.a = 0;
        this.c = v2_2;
        return;
    }

    public c(android.content.Context p2)
    {
        this.a = 9;
        this.b = p2;
        this.c = 0;
        return;
    }

    public c(android.widget.EditText p6)
    {
        this.a = 24;
        this.b = p6;
        i1.a v0_3 = new i1.i(p6);
        this.c = v0_3;
        p6.addTextChangedListener(v0_3);
        if (i1.a.b == null) {
            if (i1.a.b == null) {
                i1.a v1_2 = new i1.a();
                i1.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", 0, i1.a.getClassLoader());
                i1.a.b = v1_2;
            }
        }
        p6.setEditableFactory(i1.a.b);
        return;
    }

    public c(h4.f p3)
    {
        this.a = 23;
        this.c = new android.os.Handler(android.os.Looper.getMainLooper());
        this.b = p3;
        return;
    }

    public synthetic c(Object p1, Object p2, int p3, boolean p4)
    {
        this.a = p3;
        this.c = p1;
        this.b = p2;
        return;
    }

    public c(java.util.ArrayList p5, java.util.ArrayList p6)
    {
        this.a = 13;
        int v0_1 = p5.size();
        int v1_1 = new int[v0_1];
        this.b = v1_1;
        int v1_2 = new float[v0_1];
        this.c = v1_2;
        int v1_0 = 0;
        while (v1_0 < v0_1) {
            ((int[]) this.b)[v1_0] = ((Integer) p5.get(v1_0)).intValue();
            ((float[]) this.c)[v1_0] = ((Float) p6.get(v1_0)).floatValue();
            v1_0++;
        }
        return;
    }

    public c(k2.c p6)
    {
        this.a = 8;
        String v6_9 = ((android.content.Context) p6.b);
        String v0_5 = g5.g.d(v6_9, "com.google.firebase.crashlytics.unity_version", "string");
        if (v0_5 == null) {
            try {
                if (v6_9.getAssets() != null) {
                    String v6_2 = v6_9.getAssets().open("flutter_assets/NOTICES.Z");
                    if (v6_2 != null) {
                        v6_2.close();
                    }
                    this.b = "Flutter";
                    this.c = 0;
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                        android.util.Log.v("FirebaseCrashlytics", "Development platform is: Flutter", 0);
                    }
                } else {
                    this.b = 0;
                    this.c = 0;
                }
            } catch (java.io.IOException) {
            }
        } else {
            this.b = "Unity";
            String v6_8 = v6_9.getResources().getString(v0_5);
            this.c = v6_8;
            String v6_10 = g2.g.l("Unity Editor version is: ", v6_8);
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", v6_10, 0);
            }
        }
        return;
    }

    public c(q4.f p2)
    {
        this.a = 11;
        this.c = p2;
        return;
    }

    public static k2.c g(android.content.Context p5)
    {
        try {
            int v5_1 = new java.io.RandomAccessFile(new java.io.File(p5.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                int v0_1 = v5_1.lock();
                try {
                    return new k2.c(10, v5_1, v0_1);
                } catch (java.nio.channels.OverlappingFileLockException v2_0) {
                    android.util.Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", v2_0);
                    try {
                        if (v0_1 != 0) {
                            v0_1.release();
                        }
                        try {
                            if (v5_1 != 0) {
                                v5_1.close();
                            }
                        } catch (java.io.IOException) {
                        }
                        return 0;
                    } catch (java.io.IOException) {
                    }
                } catch (java.nio.channels.OverlappingFileLockException v2_0) {
                } catch (java.nio.channels.OverlappingFileLockException v2_0) {
                }
            } catch (java.nio.channels.OverlappingFileLockException v2_0) {
                v0_1 = 0;
            } catch (java.nio.channels.OverlappingFileLockException v2_0) {
            } catch (java.nio.channels.OverlappingFileLockException v2_0) {
            }
            return new k2.c(10, v5_1, v0_1);
        } catch (java.nio.channels.OverlappingFileLockException v2_0) {
            v5_1 = 0;
            v0_1 = 0;
        } catch (java.nio.channels.OverlappingFileLockException v2_0) {
        } catch (java.nio.channels.OverlappingFileLockException v2_0) {
        }
    }

    public static declared_synchronized k2.c p()
    {
        if (k2.c.d == null) {
            k2.c.d = new k2.c(0);
        }
        return k2.c.d;
    }

    public static int q(int p5, int p6)
    {
        int v1 = 0;
        int v2_0 = 0;
        int v3 = 0;
        while (v1 < p5) {
            v2_0++;
            if (v2_0 != p6) {
                if (v2_0 > p6) {
                    v3++;
                    v2_0 = 1;
                }
            } else {
                v3++;
                v2_0 = 0;
            }
            v1++;
        }
        if ((v2_0 + 1) > p6) {
            v3++;
        }
        return v3;
    }

    public e6.b A()
    {
        IllegalStateException v0_1 = new java.io.ByteArrayOutputStream();
        String v2_1 = new byte[16384];
        try {
            e6.b v4_3 = new java.io.FileInputStream(this.o());
            try {
                while(true) {
                    String v5_0 = v4_3.read(v2_1, 0, 16384);
                    v0_1.write(v2_1, 0, v5_0);
                }
                String v1_1 = new org.json.JSONObject(v0_1.toString());
                v4_3.close();
                String v5_1 = v1_1.optString("Fid", 0);
                IllegalStateException v0_7 = v1_1.optInt("Status", 0);
                String v7 = v1_1.optString("AuthToken", 0);
                String v8 = v1_1.optString("RefreshToken", 0);
                long v11 = v1_1.optLong("TokenCreationEpochInSecs", 0);
                long v9_1 = v1_1.optLong("ExpiresInSecs", 0);
                String v13 = v1_1.optString("FisError", 0);
                int v6 = u.e.d(5)[v0_7];
                if (v6 == 0) {
                    throw new NullPointerException("Null registrationStatus");
                } else {
                    IllegalStateException v0_13 = ((byte) (((byte) (((byte) (((byte) (0 | 2)) | 1)) | 2)) | 1));
                    if ((v0_13 == 3) && (v6 != 0)) {
                        return new e6.b(v5_1, v6, v7, v8, v9_1, v11, v13);
                    } else {
                        String v1_13 = new StringBuilder();
                        if (v6 == 0) {
                            v1_13.append(" registrationStatus");
                        }
                        if ((v0_13 & 1) == 0) {
                            v1_13.append(" expiresInSecs");
                        }
                        if ((v0_13 & 2) == 0) {
                            v1_13.append(" tokenCreationEpochInSecs");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", v1_13));
                    }
                }
            } catch (IllegalStateException v0_3) {
                String v1_2 = v0_3;
                try {
                    v4_3.close();
                } catch (IllegalStateException v0_4) {
                    v1_2.addSuppressed(v0_4);
                }
                throw v1_2;
            }
            if (v5_0 >= null) {
            }
        } catch (org.json.JSONException) {
            v1_1 = new org.json.JSONObject();
        }
    }

    public void B()
    {
        try {
            ((java.nio.channels.FileLock) this.c).release();
            ((java.nio.channels.FileChannel) this.b).close();
            return;
        } catch (java.io.IOException v0_4) {
            android.util.Log.e("CrossProcessLock", "encountered error while releasing, ignoring", v0_4);
            return;
        }
    }

    public void C(a2.k1 p2)
    {
        a2.u1 v2_2 = ((a2.u1) ((r.j) this.b).get(p2));
        if (v2_2 != null) {
            v2_2.a = (v2_2.a & -2);
            return;
        } else {
            return;
        }
    }

    public void D(a2.k1 p7)
    {
        p0.c v0_1 = ((r.g) this.c);
        int v1_0 = (v0_1.g() - 1);
        while (v1_0 >= 0) {
            if (p7 != v0_1.h(v1_0)) {
                v1_0--;
            } else {
                Object[] v3_0 = v0_1.c;
                Object v5 = r.h.a;
                if (v3_0[v1_0] == v5) {
                    break;
                }
                v3_0[v1_0] = v5;
                v0_1.a = 1;
                break;
            }
        }
        a2.u1 v7_2 = ((a2.u1) ((r.j) this.b).remove(p7));
        if (v7_2 != null) {
            v7_2.a = 0;
            v7_2.b = 0;
            v7_2.c = 0;
            a2.u1.d.c(v7_2);
        }
        return;
    }

    public void a()
    {
        String v0_1 = ((l2.a0) this.c);
        com.chilllive.chillwallpaperproject.MainActivity v1 = v0_1.Y1;
        if ((v1 != null) && (v0_1.a != null)) {
            v1.runOnUiThread(new l2.z(this, ((String) this.b), 1));
        }
        return;
    }

    public void b(z8.d p3, Throwable p4)
    {
        j2.i v3_1 = ((j2.i) this.b);
        StringBuilder v0_1 = new StringBuilder("Failed to fetch weather data: ");
        v0_1.append(p4.getMessage());
        v3_1.h(v0_1.toString());
        return;
    }

    public void d(z8.d p28, z8.q0 p29)
    {
        float v2_3 = ((j2.i) this.b);
        float v4_18 = ((j2.j) this.c);
        float v5_59 = v4_18.v;
        int v6_27 = v4_18.u;
        float v7_14 = v4_18.w;
        float v8_0 = v4_18.A;
        String v9_0 = v4_18.a;
        android.content.SharedPreferences v10 = v4_18.b;
        if (p29.a.v) {
            String v12_3 = p29.b;
            if (v12_3 != null) {
                Throwable v18_4;
                String v13_0;
                String v12_4 = ((j2.k) v12_3);
                String v14_3 = (v12_4.a().d() * 1000);
                long v16_3 = ((System.currentTimeMillis() - v14_3) / 60000);
                if (v16_3 >= 0) {
                    v18_4 = v14_3;
                    v13_0 = v16_3;
                } else {
                    v18_4 = v14_3;
                    v13_0 = 0;
                }
                String v3_3;
                j2.c v0_1 = v4_18.d(v13_0);
                String v3_1 = i2.o0.c(v9_0).b();
                if ((!c4.b.H(v3_1)) && ((!c4.b.I(v3_1)) && (!c4.b.J(v3_1)))) {
                    v3_3 = 0;
                } else {
                    v3_3 = 1;
                }
                if ((v10.getBoolean(v8_0, 0)) && (v3_3 != null)) {
                    v10.edit().putString("lastProviderUpdate", v0_1).apply();
                    v10.edit().putString("lastUpdate", v12_4.a().c()).apply();
                    v10.edit().putLong("lastEpoch", v18_4).apply();
                }
                String v24;
                v10.edit().remove(v7_14).apply();
                v10.edit().remove(v6_27).apply();
                v10.edit().remove(v5_59).apply();
                String v3_8 = v4_18.g;
                String v13_2 = v4_18.l;
                String v14_1 = v4_18.k;
                String v15 = v4_18.j;
                String v11_6 = v4_18.i;
                String v1_1 = v4_18.p;
                j2.k v17 = v12_4;
                String v12_2 = v4_18.f;
                Throwable v18_0 = v2_3;
                float v2_0 = v4_18.e;
                String v19 = v4_18.h;
                j2.c v0_14 = v10.edit();
                String v21 = v3_8;
                String v3_9 = java.time.LocalDate.now(java.time.ZoneId.systemDefault());
                j2.f v20_1 = v17.c();
                if (v20_1 == null) {
                    v24 = v13_2;
                } else {
                    v24 = v13_2;
                    v0_14.putString(v6_27, String.valueOf(v20_1.a()));
                    v0_14.putString(v5_59, String.valueOf(v20_1.b()));
                    float v5_1 = new StringBuilder();
                    v5_1.append(v20_1.c());
                    v5_1.append(", ");
                    v5_1.append(v20_1.d());
                    v0_14.putString(v7_14, v5_1.toString());
                }
                float v5_7 = ((j2.e) v17.b().a().get(0)).a();
                if (v5_7 != 0) {
                    c4.b.P(v10, v2_0, j2.j.e(v5_7.e()));
                    c4.b.P(v10, v12_2, j2.j.e(v5_7.f()));
                }
                v0_14.apply();
                if ((!v10.getBoolean(v8_0, 0)) || (v17.a() == null)) {
                    v0_14.putString(v1_1, v10.getString("weatherSaved", v9_0.getString(2131951809)));
                } else {
                    v0_14.putString(v1_1, v17.a().b().a());
                    v0_14.putString("weatherSaved", v17.a().b().a());
                    v0_14.putString(v4_18.q, String.valueOf(v17.a().a()));
                    v0_14.putString(v4_18.r, String.valueOf(v17.a().g()));
                    v0_14.putString(v4_18.s, String.valueOf(v17.a().f()));
                    v0_14.putString(v4_18.t, String.valueOf(v17.a().e()));
                    String v1_14 = new java.util.Locale$Builder().setLanguage("en").setRegion("US").build();
                    float v5_32 = java.util.Calendar.getInstance();
                    v0_14.putFloat(v4_18.y, Float.parseFloat(new java.text.SimpleDateFormat("dd", v1_14).format(v5_32.getTime())));
                    int v6_14 = new java.text.SimpleDateFormat("dd/MM yyyy, HH:mm", v1_14);
                    v0_14.putString(v4_18.x, v6_14.format(v5_32.getTime()));
                    v0_14.putString(v4_18.z, v6_14.format(v5_32.getTime()));
                    v0_14.apply();
                }
                String v13_4;
                String v1_21 = ((j2.e) v17.b().a().get(0)).a();
                v0_14.putString(v4_18.n, v1_21.b());
                v0_14.putString(v4_18.o, v1_21.a());
                float v5_37 = v10.getString("astro_last_update_date", 0);
                if (v5_37 == 0) {
                    v13_4 = 0;
                } else {
                    v13_4 = java.time.LocalDate.parse(v5_37);
                }
                if ((v13_4 == null) || (!v13_4.isEqual(v3_9))) {
                    if ((v13_4 == null) || (!v13_4.plusDays(1).isEqual(v3_9))) {
                        int v6_20 = v19;
                        String v13_6 = v21;
                        String v9_1 = v24;
                        if ((v17.b() != null) && (v17.b().a().size() >= 3)) {
                            float v5_43 = ((j2.e) v17.b().a().get(0)).a();
                            v0_14.putFloat(v13_6, j2.j.e(v5_43.c()));
                            v0_14.putFloat(v6_20, j2.j.e(v5_43.d()));
                            float v5_50 = ((j2.e) v17.b().a().get(1)).a();
                            v0_14.putFloat(v11_6, j2.j.e(v5_50.c()));
                            v0_14.putFloat(v15, j2.j.e(v5_50.d()));
                            float v4_7 = ((j2.e) v17.b().a().get(2)).a();
                            v0_14.putFloat(v14_1, j2.j.e(v4_7.c()));
                            v0_14.putFloat(v9_1, j2.j.e(v4_7.d()));
                            float v4_14 = ((j2.e) v17.b().a().get(0)).a();
                            c4.b.P(v10, v2_0, j2.j.e(v4_14.e()));
                            c4.b.P(v10, v12_2, j2.j.e(v4_14.f()));
                        }
                    } else {
                        int v6_25 = v10.getFloat(v11_6, 1093664768);
                        float v8_2 = v10.getFloat(v15, 1102577664);
                        float v2_7 = v10.getFloat(v14_1, 1093664768);
                        String v9_2 = v24;
                        float v7_13 = v10.getFloat(v9_2, 1102577664);
                        v0_14.putFloat(v21, v6_25);
                        v0_14.putFloat(v19, v8_2);
                        v0_14.putFloat(v11_6, v2_7);
                        v0_14.putFloat(v15, v7_13);
                        if ((v17.b() != null) && (v17.b().a().size() >= 3)) {
                            float v2_16 = ((j2.e) v17.b().a().get(2)).a();
                            v0_14.putFloat(v14_1, j2.j.e(v2_16.c()));
                            v0_14.putFloat(v9_2, j2.j.e(v2_16.d()));
                        }
                    }
                    v0_14.putString("astro_last_update_date", v3_9.toString());
                    v0_14.apply();
                }
                v17.a().getClass();
                v18_0.a();
                return;
            }
        }
        Throwable v18_1 = v2_3;
        try {
            String v1_2 = p29.c;
            try {
                if (v1_2 == null) {
                    android.util.Log.w("", "Error body is null");
                } else {
                    float v2_2 = v1_2.i();
                    try {
                        float v5_36 = v2_2.v(okhttp3.internal._UtilJvmKt.e(v2_2, okhttp3.internal.Internal.a(v1_2.f())));
                    } catch (j2.c v0_19) {
                        String v13_5 = v0_19;
                        if (v2_2 != 0) {
                            try {
                                v2_2.close();
                            } catch (j2.c v0_20) {
                                q4.b.a(v13_5, v0_20);
                            }
                        }
                        j2.c v0_21 = v13_5;
                        String v13_7 = 0;
                        if (v0_21 != null) {
                            throw v0_21;
                        } else {
                            try {
                                v18_1.h(new org.json.JSONObject(v13_7).getJSONObject("error").getString("message"));
                            } catch (j2.c v0_28) {
                                float v2_24 = new StringBuilder("Invalid error JSON: ");
                                v2_24.append(v13_7);
                                android.util.Log.e("", v2_24.toString(), v0_28);
                            }
                        }
                    }
                    try {
                        v2_2.close();
                        String v13_8 = 0;
                    } catch (j2.c v0_22) {
                        v13_8 = v0_22;
                    }
                    v0_21 = v13_8;
                    v13_7 = v5_36;
                }
            } catch (j2.c v0_29) {
                float v2_26 = v0_29;
                if (v1_2 != null) {
                    try {
                        v1_2.close();
                    } catch (j2.c v0_30) {
                        v2_26.addSuppressed(v0_30);
                    }
                }
                throw v2_26;
            }
            if (v1_2 == null) {
                return;
            } else {
                v1_2.close();
                return;
            }
        } catch (j2.c v0_31) {
            android.util.Log.e("", "Error reading error body", v0_31);
            return;
        }
    }

    public boolean e(CharSequence p4, int p5, int p6, g1.u p7)
    {
        if ((p7.c & 4) <= 0) {
            if (((g1.x) this.b) == null) {
                android.text.SpannableString v4_1;
                if (!(p4 instanceof android.text.Spannable)) {
                    v4_1 = new android.text.SpannableString(p4);
                } else {
                    v4_1 = ((android.text.Spannable) p4);
                }
                this.b = new g1.x(v4_1);
            }
            ((a6.e) this.c).getClass();
            ((g1.x) this.b).setSpan(new g1.v(p7), p5, p6, 33);
            return 1;
        } else {
            return 1;
        }
    }

    public Object f(g8.d p7, n7.c p8)
    {
        switch (this.a) {
            case 18:
                Object v0_14;
                if (!(p8 instanceof g8.i)) {
                    v0_14 = new g8.i(this, p8);
                } else {
                    v0_14 = ((g8.i) p8);
                    h7.l v1_9 = ((g8.i) p8).b;
                    if ((v1_9 & -2147483648) == 0) {
                    } else {
                        ((g8.i) p8).b = (v1_9 - -2147483648);
                    }
                }
                r6.x0 v2_0;
                int v4_0;
                Object v7_1;
                int v8_15 = v0_14.a;
                h7.l v1_0 = m7.a.a;
                r6.x0 v2_12 = v0_14.b;
                if (v2_12 == null) {
                    c4.b.e0(v8_15);
                    int v8_17 = new h8.g(p7, v0_14.getContext());
                    try {
                        r6.x0 v2_16 = ((a1.n) this.b);
                        v0_14.d = this;
                        v0_14.e = p7;
                        v0_14.f = v8_17;
                        v0_14.b = 1;
                    } catch (Object v7_15) {
                        int v8_1 = v7_15;
                        v7_1 = v8_17;
                        v7_1.releaseIntercepted();
                        throw v8_1;
                    }
                    if (v2_16.invoke(v8_17, v0_14) != v1_0) {
                        v4_0 = this;
                        v2_0 = p7;
                        v7_1 = v8_17;
                        v7_1.releaseIntercepted();
                        Object v7_4 = ((g8.c) v4_0.c);
                        v0_14.d = 0;
                        v0_14.e = 0;
                        v0_14.f = 0;
                        v0_14.b = 2;
                        if (v7_4.f(v2_0, v0_14) != v1_0) {
                            v1_0 = h7.l.a;
                        }
                    }
                } else {
                    if (v2_12 == 1) {
                        v7_1 = v0_14.f;
                        v2_0 = v0_14.e;
                        v4_0 = v0_14.d;
                        try {
                            c4.b.e0(v8_15);
                        } catch (int v8_1) {
                        }
                    } else {
                        if (v2_12 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(v8_15);
                        }
                    }
                }
                return v1_0;
            case 19:
                Object v0_8;
                if (!(p8 instanceof g8.j)) {
                    v0_8 = new g8.j(this, p8);
                } else {
                    v0_8 = ((g8.j) p8);
                    h7.l v1_4 = ((g8.j) p8).b;
                    if ((v1_4 & -2147483648) == 0) {
                    } else {
                        ((g8.j) p8).b = (v1_4 - -2147483648);
                    }
                }
                r6.x0 v2_7;
                int v8_10 = v0_8.a;
                h7.l v1_6 = m7.a.a;
                r6.x0 v2_6 = v0_8.b;
                if (v2_6 == null) {
                    c4.b.e0(v8_10);
                    int v8_12 = ((g8.c) this.b);
                    v0_8.d = this;
                    v0_8.e = p7;
                    v0_8.b = 1;
                    v8_10 = g8.z.b(v8_12, p7, v0_8);
                    if (v8_10 != v1_6) {
                        v2_7 = this;
                        int v8_13 = ((Throwable) v8_10);
                        if (v8_13 == 0) {
                            v1_6 = h7.l.a;
                        } else {
                            r6.x0 v2_9 = ((r6.x0) v2_7.c);
                            v0_8.d = 0;
                            v0_8.e = 0;
                            v0_8.b = 2;
                            if (v2_9.b(p7, v8_13, v0_8) != v1_6) {
                            }
                        }
                    }
                } else {
                    if (v2_6 == 1) {
                        p7 = v0_8.e;
                        v2_7 = v0_8.d;
                        c4.b.e0(v8_10);
                    } else {
                        if (v2_6 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(v8_10);
                        }
                    }
                }
                return v1_6;
            case 20:
                Object v7_2 = ((k2.c) this.b).f(new g8.o(new kotlin.jvm.internal.o(), p7, ((a1.p) this.c)), p8);
                if (v7_2 != m7.a.a) {
                    v7_2 = h7.l.a;
                }
                return v7_2;
            default:
                Object v0_3;
                if (!(p8 instanceof g8.p)) {
                    v0_3 = new g8.p(this, p8);
                } else {
                    v0_3 = ((g8.p) p8);
                    h7.l v1_1 = ((g8.p) p8).b;
                    if ((v1_1 & -2147483648) == 0) {
                    } else {
                        ((g8.p) p8).b = (v1_1 - -2147483648);
                    }
                }
                int v8_5 = v0_3.a;
                h7.l v1_3 = m7.a.a;
                r6.x0 v2_2 = v0_3.b;
                if (v2_2 == null) {
                    c4.b.e0(v8_5);
                    int v8_7 = ((k2.c) this.b);
                    r6.x0 v2_4 = new g8.m(((a1.o) this.c), p7);
                    try {
                        v0_3.d = v2_4;
                        v0_3.b = 1;
                    } catch (int v8_8) {
                        Object v7_9 = v2_4;
                        if (v8_8.a != v7_9) {
                            throw v8_8;
                        } else {
                            v1_3 = h7.l.a;
                        }
                    }
                    if (v8_7.f(v2_4, v0_3) != v1_3) {
                    }
                } else {
                    if (v2_2 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v7_9 = v0_3.d;
                        try {
                            c4.b.e0(v8_5);
                        } catch (int v8_8) {
                        }
                    }
                }
                return v1_3;
        }
    }

    public Object getResult()
    {
        return ((g1.x) this.b);
    }

    public void h(String p4)
    {
        l2.z v0_1 = ((l2.a0) this.c);
        com.chilllive.chillwallpaperproject.MainActivity v1 = v0_1.Y1;
        if ((v1 != null) && (v0_1.a != null)) {
            v1.runOnUiThread(new l2.z(this, p4, 0));
        }
        return;
    }

    public void i(a2.k1 p3, a2.o0 p4)
    {
        r.j v0_1 = ((r.j) this.b);
        a2.u1 v1_1 = ((a2.u1) v0_1.get(p3));
        if (v1_1 == null) {
            v1_1 = a2.u1.a();
            v0_1.put(p3, v1_1);
        }
        v1_1.c = p4;
        v1_1.a = (v1_1.a | 8);
        return;
    }

    public void j()
    {
        int v0_1 = ((int[]) this.b);
        if (v0_1 != 0) {
            java.util.Arrays.fill(v0_1, -1);
        }
        this.c = 0;
        return;
    }

    public void k()
    {
        String v0_1 = ((String) this.b);
        try {
            java.io.IOException v1_2 = ((m5.c) this.c);
            v1_2.getClass();
            new java.io.File(((java.io.File) v1_2.d), v0_1).createNewFile();
            return;
        } catch (java.io.IOException v1_0) {
            android.util.Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(v0_1), v1_0);
            return;
        }
    }

    public void l(int p5)
    {
        int v0_1 = ((int[]) this.b);
        if (v0_1 != 0) {
            if (p5 >= v0_1.length) {
                int v2_2 = v0_1.length;
                while (v2_2 <= p5) {
                    v2_2 *= 2;
                }
                int[] v5_6 = new int[v2_2];
                this.b = v5_6;
                System.arraycopy(v0_1, 0, v5_6, 0, v0_1.length);
                int[] v5_2 = ((int[]) this.b);
                java.util.Arrays.fill(v5_2, v0_1.length, v5_2.length, -1);
            }
            return;
        } else {
            int[] v5_5 = new int[(Math.max(p5, 10) + 1)];
            this.b = v5_5;
            java.util.Arrays.fill(v5_5, -1);
            return;
        }
    }

    public void m(com.chilllive.chillwallpaperproject.MainActivity p9, android.content.Context p10, j2.j p11, boolean p12)
    {
        if (((j2.j) this.c) == null) {
            this.c = p11;
        }
        android.content.SharedPreferences v6 = j5.t1.z(p10);
        com.google.android.gms.tasks.Task v11_3 = ((m6.b) this.b);
        com.google.android.gms.tasks.Task v0_4 = v11_3.e;
        k2.a v1_1 = v0_4.h.a.getLong("minimum_fetch_interval_in_seconds", n6.i.j);
        boolean v3_2 = new java.util.HashMap(v0_4.i);
        v3_2.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        v0_4.f.b().continueWithTask(v0_4.c, new d5.a(v0_4, v1_1, v3_2)).onSuccessTask(b5.j.a, new l4.h(2)).onSuccessTask(v11_3.b, new m6.a(v11_3)).addOnCompleteListener(new k2.a(this, p12, p9, p10, v6));
        return;
    }

    public android.view.View n(int p10, int p11, int p12, int p13)
    {
        int v4;
        a2.t1 v0_1 = ((a2.t1) this.c);
        a2.r0 v1_1 = ((a2.r0) this.b);
        int v2 = v1_1.d();
        int v3 = v1_1.c();
        if (p11 <= p10) {
            v4 = -1;
        } else {
            v4 = 1;
        }
        android.view.View v5 = 0;
        while (p10 != p11) {
            android.view.View v6_2;
            switch (v1_1.a) {
                case 0:
                    v6_2 = v1_1.b.u(p10);
                    break;
                default:
                    v6_2 = v1_1.b.u(p10);
            }
            boolean v7_0 = v1_1.b(v6_2);
            int v8 = v1_1.a(v6_2);
            v0_1.b = v2;
            v0_1.c = v3;
            v0_1.d = v7_0;
            v0_1.e = v8;
            if (p12 != 0) {
                v0_1.a = p12;
                if (v0_1.a()) {
                    return v6_2;
                }
            }
            if (p13 != 0) {
                v0_1.a = p13;
                if (v0_1.a()) {
                    v5 = v6_2;
                }
            }
            p10 += v4;
        }
        return v5;
    }

    public java.io.File o()
    {
        if (((java.io.File) this.b) == null) {
            if (((java.io.File) this.b) == null) {
                java.io.File v2_3 = ((q4.f) this.c);
                v2_3.a();
                java.io.File v2_1 = v2_3.a.getFilesDir();
                StringBuilder v3_1 = new StringBuilder("PersistedInstallation.");
                v3_1.append(((q4.f) this.c).f());
                v3_1.append(".json");
                this.b = new java.io.File(v2_1, v3_1.toString());
            }
        }
        return ((java.io.File) this.b);
    }

    public void onComplete(com.google.android.gms.tasks.Task p3)
    {
        switch (this.a) {
            case 7:
                try {
                    ((d4.r) this.b).e.remove(((com.google.android.gms.tasks.TaskCompletionSource) this.c));
                    return;
                } catch (Throwable v3_6) {
                    throw v3_6;
                }
            case 25:
                try {
                    ((i4.h) this.b).e.remove(((com.google.android.gms.tasks.TaskCompletionSource) this.c));
                    return;
                } catch (Throwable v3_1) {
                    throw v3_1;
                }
            default:
                try {
                    ((k4.d) this.b).e.remove(((com.google.android.gms.tasks.TaskCompletionSource) this.c));
                    return;
                } catch (Throwable v3_11) {
                    throw v3_11;
                }
        }
    }

    public void r(e6.b p5)
    {
        try {
            String v0_1 = new org.json.JSONObject();
            v0_1.put("Fid", p5.a);
            v0_1.put("Status", u.e.c(p5.b));
            v0_1.put("AuthToken", p5.c);
            v0_1.put("RefreshToken", p5.d);
            v0_1.put("TokenCreationEpochInSecs", p5.f);
            v0_1.put("ExpiresInSecs", p5.e);
            v0_1.put("FisError", p5.g);
            String v2_5 = ((q4.f) this.c);
            v2_5.a();
            java.io.IOException v5_3 = java.io.File.createTempFile("PersistedInstallation", "tmp", v2_5.a.getFilesDir());
            java.io.FileOutputStream v1_8 = new java.io.FileOutputStream(v5_3);
            v1_8.write(v0_1.toString().getBytes("UTF-8"));
            v1_8.close();
        } catch (java.io.IOException) {
            return;
        }
        if (!v5_3.renameTo(this.o())) {
            throw new java.io.IOException("unable to rename the tmpfile to PersistedInstallation");
        } else {
            return;
        }
    }

    public void s()
    {
        ((android.util.SparseIntArray) this.b).clear();
        return;
    }

    public boolean t(android.view.View p6)
    {
        a2.t1 v0_1 = ((a2.t1) this.c);
        a2.r0 v1_1 = ((a2.r0) this.b);
        int v2 = v1_1.d();
        int v3 = v1_1.c();
        int v4 = v1_1.b(p6);
        boolean v6_1 = v1_1.a(p6);
        v0_1.b = v2;
        v0_1.c = v3;
        v0_1.d = v4;
        v0_1.e = v6_1;
        v0_1.a = 24579;
        return v0_1.a();
    }

    public com.google.android.gms.tasks.Task then(Object p5)
    {
        String v0_1 = ((g5.n) this.c);
        if (((Boolean) p5).booleanValue()) {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", "Sending cached crash reports...", 0);
            }
            java.util.List v1_2 = v0_1.b;
            if (!((Boolean) p5).booleanValue()) {
                v1_2.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            } else {
                v1_2.f.trySetResult(0);
                return ((com.google.android.gms.tasks.Task) this.b).onSuccessTask(v0_1.e.a, new l6.c(this, 20));
            }
        } else {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", 0);
            }
            com.google.android.gms.tasks.Task v5_17 = m5.c.e(((java.io.File) v0_1.g.d).listFiles(g5.n.r)).iterator();
            while (v5_17.hasNext()) {
                ((java.io.File) v5_17.next()).delete();
            }
            com.google.android.gms.tasks.Task v5_21 = ((m5.a) v0_1.m.b).b;
            m5.a.a(m5.c.e(((java.io.File) v5_21.f).listFiles()));
            m5.a.a(m5.c.e(((java.io.File) v5_21.m).listFiles()));
            m5.a.a(m5.c.e(((java.io.File) v5_21.n).listFiles()));
            v0_1.q.trySetResult(0);
            return com.google.android.gms.tasks.Tasks.forResult(0);
        }
    }

    public void u(int p4, int p5)
    {
        int v0_1 = ((int[]) this.b);
        if ((v0_1 != 0) && (p4 < v0_1.length)) {
            int v0_7 = (p4 + p5);
            this.l(v0_7);
            a2.q1 v1_7 = ((int[]) this.b);
            System.arraycopy(v1_7, p4, v1_7, v0_7, ((v1_7.length - p4) - p5));
            java.util.Arrays.fill(((int[]) this.b), p4, v0_7, -1);
            int v0_3 = ((java.util.ArrayList) this.c);
            if (v0_3 != 0) {
                int v0_5 = (v0_3.size() - 1);
                while (v0_5 >= 0) {
                    a2.q1 v1_5 = ((a2.q1) ((java.util.ArrayList) this.c).get(v0_5));
                    int v2_3 = v1_5.a;
                    if (v2_3 >= p4) {
                        v1_5.a = (v2_3 + p5);
                    }
                    v0_5--;
                }
            }
        }
        return;
    }

    public void v(int p6, int p7)
    {
        int v0_1 = ((int[]) this.b);
        if ((v0_1 != 0) && (p6 < v0_1.length)) {
            int v0_3 = (p6 + p7);
            this.l(v0_3);
            int v1_7 = ((int[]) this.b);
            System.arraycopy(v1_7, v0_3, v1_7, p6, ((v1_7.length - p6) - p7));
            int v1_1 = ((int[]) this.b);
            java.util.Arrays.fill(v1_1, (v1_1.length - p7), v1_1.length, -1);
            int v1_3 = ((java.util.ArrayList) this.c);
            if (v1_3 != 0) {
                int v1_5 = (v1_3.size() - 1);
                while (v1_5 >= 0) {
                    java.util.ArrayList v2_7 = ((a2.q1) ((java.util.ArrayList) this.c).get(v1_5));
                    int v3_1 = v2_7.a;
                    if (v3_1 >= p6) {
                        if (v3_1 >= v0_3) {
                            v2_7.a = (v3_1 - p7);
                        } else {
                            ((java.util.ArrayList) this.c).remove(v1_5);
                        }
                    }
                    v1_5--;
                }
            }
        }
        return;
    }

    public void w(l.a p4)
    {
        q0.t0 v0_1 = ((j6.s) this.b);
        ((android.view.ActionMode$Callback) v0_1.b).onDestroyActionMode(v0_1.f(p4));
        h.c0 v4_3 = ((h.c0) this.c);
        if (v4_3.C != null) {
            v4_3.r.getDecorView().removeCallbacks(v4_3.D);
        }
        if (v4_3.B != null) {
            q0.t0 v0_5 = v4_3.E;
            if (v0_5 != null) {
                v0_5.b();
            }
            q0.t0 v0_7 = q0.q0.b(v4_3.B);
            v0_7.a(0);
            v4_3.E = v0_7;
            v0_7.d(new h.s(this, 2));
        }
        v4_3.A = 0;
        q0.g0.c(v4_3.H);
        v4_3.L();
        return;
    }

    public void x(int p3, android.os.Bundle p4)
    {
        l6.c v0_5 = new StringBuilder("Analytics listener received message. ID: ");
        v0_5.append(p3);
        v0_5.append(", Extras: ");
        v0_5.append(p4);
        String v3_4 = v0_5.toString();
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
            android.util.Log.v("FirebaseCrashlytics", v3_4, 0);
        }
        String v3_2 = p4.getString("name");
        if (v3_2 != null) {
            android.os.Bundle v4_1 = p4.getBundle("params");
            if (v4_1 == null) {
                v4_1 = new android.os.Bundle();
            }
            l6.c v0_8;
            if (!"clx".equals(v4_1.getString("_o"))) {
                v0_8 = ((l6.c) this.c);
            } else {
                v0_8 = ((b8.g) this.b);
            }
            if (v0_8 != null) {
                v0_8.d(v4_1, v3_2);
            }
        }
        return;
    }

    public boolean y(l.a p6, android.view.Menu p7)
    {
        q0.g0.c(((h.c0) this.c).H);
        android.content.Context v0_6 = ((j6.s) this.b);
        android.view.ActionMode$Callback v1_1 = ((android.view.ActionMode$Callback) v0_6.b);
        boolean v6_1 = v0_6.f(p6);
        r.j v2_1 = ((r.j) v0_6.e);
        m.b0 v3_1 = ((android.view.Menu) v2_1.get(p7));
        if (v3_1 == null) {
            v3_1 = new m.b0(((android.content.Context) v0_6.c), ((m.m) p7));
            v2_1.put(p7, v3_1);
        }
        return v1_1.onPrepareActionMode(v6_1, v3_1);
    }

    public a2.o0 z(a2.k1 p6, int p7)
    {
        r.j v0_1 = ((r.j) this.b);
        p0.c v6_4 = v0_1.e(p6);
        if (v6_4 >= null) {
            a2.u1 v2_1 = ((a2.u1) v0_1.j(v6_4));
            if (v2_1 != null) {
                int v3_0 = v2_1.a;
                if ((v3_0 & p7) != 0) {
                    String v7_2;
                    int v3_1 = (v3_0 & (~ p7));
                    v2_1.a = v3_1;
                    if (p7 != 4) {
                        if (p7 != 8) {
                            throw new IllegalArgumentException("Must provide flag PRE or POST");
                        } else {
                            v7_2 = v2_1.c;
                        }
                    } else {
                        v7_2 = v2_1.b;
                    }
                    if ((v3_1 & 12) == 0) {
                        v0_1.h(v6_4);
                        v2_1.a = 0;
                        v2_1.b = 0;
                        v2_1.c = 0;
                        a2.u1.d.c(v2_1);
                    }
                    return v7_2;
                }
            }
        }
        return 0;
    }

    public Object zza()
    {
        return new c4.l(((c4.f) ((l6.c) this.b).b).a, ((c4.m) ((d4.c) this.c).zza()));
    }
}
