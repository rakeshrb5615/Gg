package i5;
public final class d {
    public final java.util.HashMap a;
    public final int b;
    public final int c;

    public d(int p2)
    {
        this.a = new java.util.HashMap();
        this.b = 64;
        this.c = p2;
        return;
    }

    public static String a(int p1, String p2)
    {
        if (p2 != null) {
            p2 = p2.trim();
            if (p2.length() > p1) {
                return p2.substring(0, p1);
            }
        }
        return p2;
    }

    public final declared_synchronized boolean b(String p6)
    {
        int v1_2 = i5.d.a(this.c, "com.crashlytics.version-control-info");
        if (this.a.size() >= this.b) {
            if (!this.a.containsKey(v1_2)) {
                String v6_2 = new StringBuilder("Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: ");
                v6_2.append(this.b);
                android.util.Log.w("FirebaseCrashlytics", v6_2.toString(), 0);
                return 0;
            } else {
            }
        }
        java.util.HashMap v0_7;
        String v6_4 = i5.d.a(this.c, p6);
        java.util.HashMap v0_6 = ((String) this.a.get(v1_2));
        if (v0_6 != null) {
            v0_7 = v0_6.equals(v6_4);
        } else {
            if (v6_4 != null) {
                v0_7 = 0;
            } else {
                v0_7 = 1;
            }
        }
        if (v0_7 == null) {
            this.a.put(v1_2, v6_4);
            return 1;
        } else {
            return 0;
        }
    }

    public final declared_synchronized void c(java.util.Map p6)
    {
        String v6_4 = p6.entrySet().iterator();
        int v0_4 = 0;
        while (v6_4.hasNext()) {
            String v1_3 = ((java.util.Map$Entry) v6_4.next());
            String v2_1 = ((String) v1_3.getKey());
            if (v2_1 == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            } else {
                String v2_2 = i5.d.a(this.c, v2_1);
                if (this.a.size() >= this.b) {
                    if (!this.a.containsKey(v2_2)) {
                        v0_4++;
                    } else {
                    }
                }
                String v1_6;
                String v1_5 = ((String) v1_3.getValue());
                java.util.HashMap v3_5 = this.a;
                if (v1_5 != null) {
                    v1_6 = i5.d.a(this.c, v1_5);
                } else {
                    v1_6 = "";
                }
                v3_5.put(v2_2, v1_6);
            }
        }
        if (v0_4 > 0) {
            String v6_2 = new StringBuilder();
            v6_2.append("Ignored ");
            v6_2.append(v0_4);
            v6_2.append(" entries when adding custom keys. Maximum allowable: ");
            v6_2.append(this.b);
            android.util.Log.w("FirebaseCrashlytics", v6_2.toString(), 0);
        }
        return;
    }
}
