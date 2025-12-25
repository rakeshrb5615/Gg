package j2;
public final class j {
    public final String A;
    public final android.content.Context a;
    public final android.content.SharedPreferences b;
    public final j2.h c;
    public String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public j(android.content.Context p10)
    {
        String v10_41 = p10.getApplicationContext();
        this.a = v10_41;
        this.b = j5.t1.z(v10_41);
        if (j2.g.a == null) {
            String v10_2 = new okhttp3.logging.HttpLoggingInterceptor();
            v10_2.d = okhttp3.logging.HttpLoggingInterceptor$Level.c;
            Class[] v1_3 = new okhttp3.OkHttpClient$Builder();
            v1_3.c.add(v10_2);
            String v10_36 = new okhttp3.OkHttpClient(v1_3);
            Class[] v1_5 = new java.util.ArrayList();
            String v2_4 = new java.util.ArrayList();
            okhttp3.HttpUrl.j.getClass();
            int v3_4 = new okhttp3.HttpUrl$Builder();
            v3_4.b(0, "https://api.weatherapi.com/v1/");
            int v3_5 = v3_4.a();
            java.util.List v4_1 = v3_5.f;
            if (!"".equals(v4_1.get((v4_1.size() - 1)))) {
                IllegalArgumentException v0_35 = new StringBuilder("baseUrl must end in /: ");
                v0_35.append(v3_5);
                throw new IllegalArgumentException(v0_35.toString());
            } else {
                v1_5.add(new a9.a(new w6.m()));
                java.util.List v5_6 = z8.k0.c;
                java.util.ArrayList v6_1 = new java.util.ArrayList(v2_4);
                String v2_7 = v5_6.a(z8.k0.a);
                v6_1.addAll(v2_7);
                java.util.List v4_7 = v5_6.b();
                java.util.ArrayList v7_1 = new java.util.ArrayList(((v1_5.size() + 1) + v4_7.size()));
                v7_1.add(new z8.b(0));
                v7_1.addAll(v1_5);
                v7_1.addAll(v4_7);
                java.util.List v4_8 = java.util.Collections.unmodifiableList(v7_1);
                java.util.List v5_10 = java.util.Collections.unmodifiableList(v6_1);
                v2_7.size();
                j2.g.a = new z8.s0(v10_36, v3_5, v4_8, v5_10);
            }
        }
        String v10_63 = j2.g.a;
        v10_63.getClass();
        if (!j2.h.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else {
            String v2_10 = new java.util.ArrayDeque(1);
            v2_10.add(j2.h);
            while (!v2_10.isEmpty()) {
                IllegalArgumentException v0_28 = ((Class) v2_10.removeFirst());
                if (v0_28.getTypeParameters().length == 0) {
                    java.util.Collections.addAll(v2_10, v0_28.getInterfaces());
                } else {
                    String v10_57 = new StringBuilder("Type parameters are unsupported on ");
                    v10_57.append(v0_28.getName());
                    if (v0_28 != j2.h) {
                        v10_57.append(" which is an interface of ");
                        v10_57.append(j2.h.getName());
                    }
                    throw new IllegalArgumentException(v10_57.toString());
                }
            }
            this.c = ((j2.h) reflect.Proxy.newProxyInstance(j2.h.getClassLoader(), new Class[] {j2.h}), new z8.r0(v10_63)));
            this.e = this.a.getString(2131952366);
            this.f = this.a.getString(2131952372);
            this.g = this.a.getString(2131952397);
            this.h = this.a.getString(2131952398);
            this.i = this.a.getString(2131952417);
            this.j = this.a.getString(2131952418);
            this.a.getString(2131952506);
            this.a.getString(2131952507);
            this.k = this.a.getString(2131951804);
            this.l = this.a.getString(2131951805);
            this.n = this.a.getString(2131952105);
            this.o = this.a.getString(2131952104);
            this.p = this.a.getString(2131952478);
            this.q = this.a.getString(2131951751);
            this.r = this.a.getString(2131952503);
            this.s = this.a.getString(2131952502);
            this.t = this.a.getString(2131952243);
            this.u = this.a.getString(2131951934);
            this.v = this.a.getString(2131951970);
            this.w = this.a.getString(2131951920);
            this.x = this.a.getString(2131951927);
            this.y = this.a.getString(2131951926);
            this.z = this.a.getString(2131952493);
            this.A = this.a.getString(2131951956);
            this.m = this.a.getString(2131951883);
            return;
        }
    }

    public static float e(String p5)
    {
        if ((p5 != 0) && ((!p5.equalsIgnoreCase("No moonrise")) && ((!p5.equalsIgnoreCase("No moonset")) && (!p5.isEmpty())))) {
            int v1_0 = 0;
            float v0_4 = p5.substring(0, 5).split(":");
            int v2_2 = Integer.parseInt(v0_4[0]);
            float v0_6 = Integer.parseInt(v0_4[1]);
            if ((!p5.toLowerCase().contains("pm")) || (v2_2 >= 12)) {
                if ((!p5.toLowerCase().contains("am")) || (v2_2 != 12)) {
                    v1_0 = v2_2;
                }
            } else {
                v1_0 = (v2_2 + 12);
            }
            return ((((float) v0_6) / 1114636288) + ((float) v1_0));
        } else {
            return -1082130432;
        }
    }

    public final boolean a(boolean p8)
    {
        String v1_6;
        android.content.SharedPreferences v3 = this.b;
        long v4_2 = ((System.currentTimeMillis() - v3.getLong("lastEpoch", 0)) / 60000);
        long v0_3 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.US).format(new java.util.Date());
        android.content.Context v2_1 = this.a;
        if (v4_2 <= 10000) {
            v1_6 = this.d(v4_2);
        } else {
            v1_6 = v2_1.getString(2131951928);
        }
        android.content.SharedPreferences$Editor v6 = v3.edit();
        if (p8 != 0) {
            v6.putString(v2_1.getString(2131952493), v0_3);
        }
        v6.putString("lastProviderUpdate", v1_6);
        v6.putString(this.p, v3.getString("weatherSaved", ""));
        v6.apply();
        if (v4_2 >= 10) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void b(String p8, j2.i p9)
    {
        k2.c v0_0 = this.d;
        if ((v0_0 == null) || (v0_0.isEmpty())) {
            this.d = ((m6.j) q4.f.d().b(m6.j)).a().a(q4.b.l("EsHRYyAys99gO4XPhP1w8g=="));
        }
        this.c.a(this.d, p8, 3, "no", "no").f(new k2.c(this, p9, 26, 0));
        return;
    }

    public final void c(double p1, double p3, boolean p5, j2.i p6)
    {
        if (!this.a(p5)) {
            StringBuilder v5_3 = new StringBuilder();
            v5_3.append(p1);
            v5_3.append(",");
            v5_3.append(p3);
            this.b(v5_3.toString(), p6);
            return;
        } else {
            return;
        }
    }

    public final String d(long p7)
    {
        android.content.Context v1 = this.a;
        if (p7 != 0) {
            if (p7 > 15) {
                if (p7 > 30) {
                    if (p7 > 60) {
                        if (p7 < 120) {
                            return v1.getString(2131951968);
                        } else {
                            StringBuilder v0_5 = new StringBuilder();
                            v0_5.append((p7 / 60));
                            v0_5.append(v1.getString(2131952198));
                            return v0_5.toString();
                        }
                    } else {
                        return v1.getString(2131951875);
                    }
                } else {
                    return v1.getString(2131951849);
                }
            } else {
                StringBuilder v0_7 = new StringBuilder();
                v0_7.append(p7);
                v0_7.append(v1.getString(2131952083));
                return v0_7.toString();
            }
        } else {
            return v1.getString(2131951896);
        }
    }

    public final void f(double p4, double p6, android.content.SharedPreferences$Editor p8)
    {
        if ((p4 != 4651998512748167168) && (p6 != 4651998512748167168)) {
            android.content.SharedPreferences$Editor v1_1 = this.m;
            if (p4 < 0) {
                p8.putInt(v1_1, -1);
            } else {
                p8.putInt(v1_1, 1);
            }
            android.content.SharedPreferences v0_2 = this.b;
            v0_2.edit().putString(this.u, Double.toString(p4)).apply();
            v0_2.edit().putString(this.v, Double.toString(p6)).apply();
            p8.commit();
        }
        return;
    }
}
