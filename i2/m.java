package i2;
public class m implements i5.j, j2.i {
    public static i2.m c;
    public boolean a;
    public final Object b;

    public m()
    {
        this.b = new java.util.HashMap();
        this.a = 0;
        return;
    }

    public synthetic m(Object p1)
    {
        this.b = p1;
        this.a = 1;
        return;
    }

    public synthetic m(Object p1, boolean p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public m(o0.e p1, boolean p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public static declared_synchronized i2.m d()
    {
        if (i2.m.c == null) {
            i2.m.c = new i2.m();
        }
        return i2.m.c;
    }

    public void a()
    {
        l2.y v0_1 = ((l2.a0) this.b);
        if (v0_1.isAdded()) {
            String v1_1;
            if (!this.a) {
                v1_1 = v0_1.getString(2131951966);
            } else {
                v1_1 = v0_1.getString(2131952494);
            }
            com.chilllive.chillwallpaperproject.MainActivity v2 = v0_1.Y1;
            if ((v2 != null) && (v0_1.a != null)) {
                v2.runOnUiThread(new l2.y(this, v1_1, 1));
            }
        }
        return;
    }

    public void b(i5.i p2, int p3)
    {
        StringBuilder v2_1 = ((StringBuilder) this.b);
        if (!this.a) {
            v2_1.append(", ");
        } else {
            this.a = 0;
        }
        v2_1.append(p3);
        return;
    }

    public boolean c()
    {
        return this.a;
    }

    public float e(String p2)
    {
        float v2_2 = ((Float) ((java.util.HashMap) this.b).get(p2));
        if (v2_2 != 0) {
            return v2_2.floatValue();
        } else {
            return 0;
        }
    }

    public void f(android.content.Context p6)
    {
        if (!this.a) {
            int v0_1 = new java.io.BufferedReader(new java.io.InputStreamReader(p6.getAssets().open("element_map.json")));
            int v6_2 = new StringBuilder();
            while(true) {
                Float v1_0 = v0_1.readLine();
                if (v1_0 == null) {
                    break;
                }
                v6_2.append(v1_0);
            }
            v0_1.close();
            try {
                int v6_5 = new org.json.JSONObject(v6_2.toString()).getJSONArray("layers");
                int v0_4 = 0;
            } catch (int v6_6) {
                v6_6.printStackTrace();
                this.a = 1;
                return;
            }
            while (v0_4 < v6_5.length()) {
                Float v1_2 = v6_5.getJSONObject(v0_4);
                ((java.util.HashMap) this.b).put(v1_2.getString("name"), Float.valueOf(((float) v1_2.getDouble("z"))));
                v0_4++;
            }
            this.a = 1;
            return;
        } else {
            return;
        }
    }

    public boolean g(CharSequence p7, int p8)
    {
        if ((!p7) || ((p8 < 0) || ((p7.length() - p8) < 0))) {
            throw new IllegalArgumentException();
        } else {
            int v0_0 = ((o0.e) this.b);
            if (v0_0 != 0) {
                v0_0.getClass();
                int v2 = 0;
                int v3_0 = 2;
                while ((v2 < p8) && (v3_0 == 2)) {
                    int v3_2 = Character.getDirectionality(p7.charAt(v2));
                    if (v3_2 == 0) {
                        v3_0 = 1;
                    } else {
                        if ((v3_2 != 1) && (v3_2 != 2)) {
                            switch (v3_2) {
                                case 16:
                                case 17:
                                    break;
                                case 16:
                                case 17:
                                    break;
                                default:
                                    v3_0 = 2;
                                    v2++;
                            }
                        }
                        v3_0 = 0;
                    }
                }
                if (v3_0 == 0) {
                    return 1;
                } else {
                    if (v3_0 == 1) {
                        return 0;
                    } else {
                        return this.c();
                    }
                }
            } else {
                return this.c();
            }
        }
    }

    public void h(String p4)
    {
        l2.y v0_1 = ((l2.a0) this.b);
        if (v0_1.isAdded()) {
            com.chilllive.chillwallpaperproject.MainActivity v1_1 = v0_1.Y1;
            if ((v1_1 != null) && (v0_1.a != null)) {
                v1_1.runOnUiThread(new l2.y(this, p4, 0));
            }
        }
        return;
    }

    public void i()
    {
        this.a = 0;
        return;
    }

    public void j(char p5)
    {
        h.f v0_1 = ((h.f) this.b);
        v0_1.c(v0_1.b, 1);
        char[] v1_2 = ((char[]) v0_1.c);
        int v2_1 = v0_1.b;
        v0_1.b = (v2_1 + 1);
        v1_2[v2_1] = p5;
        return;
    }

    public void k()
    {
        return;
    }

    public void l()
    {
        return;
    }
}
