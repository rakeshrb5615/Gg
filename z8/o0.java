package z8;
public final class o0 {
    public static final java.util.regex.Pattern x;
    public static final java.util.regex.Pattern y;
    public final z8.s0 a;
    public final reflect.Method b;
    public final otation.Annotation[] c;
    public final otation.Annotation[][] d;
    public final reflect.Type[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;
    public okhttp3.Headers s;
    public okhttp3.MediaType t;
    public java.util.LinkedHashSet u;
    public z8.z0[] v;
    public boolean w;

    static o0()
    {
        z8.o0.x = java.util.regex.Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        z8.o0.y = java.util.regex.Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        return;
    }

    public o0(z8.s0 p1, reflect.Method p2)
    {
        this.a = p1;
        this.b = p2;
        this.c = p2.getAnnotations();
        this.e = p2.getGenericParameterTypes();
        this.d = p2.getParameterAnnotations();
        return;
    }

    public static Class a(Class p1)
    {
        if (Boolean.TYPE != p1) {
            if (Byte.TYPE != p1) {
                if (Character.TYPE != p1) {
                    if (Double.TYPE != p1) {
                        if (Float.TYPE != p1) {
                            if (Integer.TYPE != p1) {
                                if (Long.TYPE != p1) {
                                    if (Short.TYPE == p1) {
                                        p1 = Short;
                                    }
                                    return p1;
                                } else {
                                    return Long;
                                }
                            } else {
                                return Integer;
                            }
                        } else {
                            return Float;
                        }
                    } else {
                        return Double;
                    }
                } else {
                    return Character;
                }
            } else {
                return Byte;
            }
        } else {
            return Boolean;
        }
    }

    public final void b(String p5, String p6, boolean p7)
    {
        java.util.regex.Pattern v0_0 = this.n;
        reflect.Method v2 = this.b;
        if (v0_0 != null) {
            throw z8.z0.m(v2, 0, "Only one HTTP method is allowed. Found: %s and %s.", new Object[] {v0_0, p5}));
        } else {
            this.n = p5;
            this.o = p7;
            if (!p6.isEmpty()) {
                IllegalArgumentException v5_3 = p6.indexOf(63);
                java.util.regex.Pattern v0_1 = z8.o0.x;
                if ((v5_3 != -1) && (v5_3 < (p6.length() - 1))) {
                    IllegalArgumentException v5_5 = p6.substring((v5_3 + 1));
                    if (v0_1.matcher(v5_5).find()) {
                        throw z8.z0.m(v2, 0, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", new Object[] {v5_5}));
                    }
                }
                this.r = p6;
                IllegalArgumentException v5_8 = v0_1.matcher(p6);
                String v6_4 = new java.util.LinkedHashSet();
                while (v5_8.find()) {
                    v6_4.add(v5_8.group(1));
                }
                this.u = v6_4;
                return;
            } else {
                return;
            }
        }
    }

    public final void c(int p3, reflect.Type p4)
    {
        if (z8.z0.j(p4)) {
            throw z8.z0.n(this.b, p3, "Parameter type must not include a type variable or wildcard: %s", new Object[] {p4}));
        } else {
            return;
        }
    }
}
