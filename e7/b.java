package e7;
public class b implements java.io.Closeable, java.io.Flushable {
    public static final java.util.regex.Pattern r;
    public static final String[] s;
    public static final String[] t;
    public final java.io.Writer a;
    public int[] b;
    public int c;
    public w6.i d;
    public String e;
    public String f;
    public boolean m;
    public int n;
    public boolean o;
    public String p;
    public boolean q;

    static b()
    {
        e7.b.r = java.util.regex.Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
        String[] v0_6 = new String[128];
        e7.b.s = v0_6;
        String[] v0_7 = 0;
        while (v0_7 <= 31) {
            e7.b.s[v0_7] = String.format("\\u%04x", new Object[] {Integer.valueOf(v0_7)}));
            v0_7++;
        }
        String[] v0_1 = e7.b.s;
        v0_1[34] = "\\\"";
        v0_1[92] = "\\\\";
        v0_1[9] = "\\t";
        v0_1[8] = "\\b";
        v0_1[10] = "\\n";
        v0_1[13] = "\\r";
        v0_1[12] = "\\f";
        String[] v0_4 = ((String[]) v0_1.clone());
        e7.b.t = v0_4;
        v0_4[60] = "\\u003c";
        v0_4[62] = "\\u003e";
        v0_4[38] = "\\u0026";
        v0_4[61] = "\\u003d";
        v0_4[39] = "\\u0027";
        return;
    }

    public b(java.io.Writer p4)
    {
        String v0_4 = new int[32];
        this.b = v0_4;
        this.c = 0;
        if (v0_4.length == 0) {
            this.b = java.util.Arrays.copyOf(v0_4, 0);
        }
        String v0_1 = this.b;
        int v1_0 = this.c;
        this.c = (v1_0 + 1);
        v0_1[v1_0] = 6;
        this.n = 2;
        this.q = 1;
        java.util.Objects.requireNonNull(p4, "out == null");
        this.a = p4;
        this.D(w6.i.d);
        return;
    }

    public final void A()
    {
        if (!this.m) {
            java.io.Writer v1 = this.a;
            v1.write(this.d.a);
            int v0_3 = this.c;
            int v2 = 1;
            while (v2 < v0_3) {
                v1.write(this.d.b);
                v2++;
            }
        }
        return;
    }

    public e7.b B()
    {
        if (this.p != null) {
            if (!this.q) {
                this.p = 0;
                return this;
            } else {
                this.K();
            }
        }
        this.c();
        this.a.write("null");
        return this;
    }

    public final int C()
    {
        IllegalStateException v0_0 = this.c;
        if (v0_0 == null) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else {
            return this.b[(v0_0 - 1)];
        }
    }

    public final void D(w6.i p2)
    {
        java.util.Objects.requireNonNull(p2);
        this.d = p2;
        this.f = ",";
        if (!p2.c) {
            this.e = ":";
        } else {
            this.e = ": ";
            if (p2.a.isEmpty()) {
                this.f = ", ";
            }
        }
        if ((!this.d.a.isEmpty()) || (!this.d.b.isEmpty())) {
            int v2_10 = 0;
        } else {
            v2_10 = 1;
        }
        this.m = v2_10;
        return;
    }

    public final void E(String p9)
    {
        String[] v0_1;
        if (!this.o) {
            v0_1 = e7.b.s;
        } else {
            v0_1 = e7.b.t;
        }
        java.io.Writer v1 = this.a;
        v1.write(34);
        int v3_1 = p9.length();
        int v4 = 0;
        int v5 = 0;
        while (v4 < v3_1) {
            String v6_1;
            String v6_0 = p9.charAt(v4);
            if (v6_0 >= 128) {
                if (v6_0 != 8232) {
                    if (v6_0 == 8233) {
                        v6_1 = "\\u2029";
                        if (v5 < v4) {
                            v1.write(p9, v5, (v4 - v5));
                        }
                        v1.write(v6_1);
                        v5 = (v4 + 1);
                    }
                } else {
                    v6_1 = "\\u2028";
                }
            } else {
                v6_1 = v0_1[v6_0];
                if (v6_1 != null) {
                }
            }
            v4++;
        }
        if (v5 < v3_1) {
            v1.write(p9, v5, (v3_1 - v5));
        }
        v1.write(34);
        return;
    }

    public void F(double p4)
    {
        this.K();
        if ((this.n != 1) && ((Double.isNaN(p4)) || (Double.isInfinite(p4)))) {
            StringBuilder v1_1 = new StringBuilder("Numeric values must be finite, but was ");
            v1_1.append(p4);
            throw new IllegalArgumentException(v1_1.toString());
        } else {
            this.c();
            this.a.append(Double.toString(p4));
            return;
        }
    }

    public void G(long p2)
    {
        this.K();
        this.c();
        this.a.write(Long.toString(p2));
        return;
    }

    public void H(Number p5)
    {
        if (p5 != null) {
            this.K();
            String v0_0 = p5.toString();
            String v5_2 = p5.getClass();
            if ((v5_2 != Integer) && ((v5_2 != Long) && ((v5_2 != Byte) && ((v5_2 != Short) && ((v5_2 != java.math.BigDecimal) && ((v5_2 != java.math.BigInteger) && ((v5_2 != java.util.concurrent.atomic.AtomicInteger) && (v5_2 != java.util.concurrent.atomic.AtomicLong)))))))) {
                if ((!v0_0.equals("-Infinity")) && ((!v0_0.equals("Infinity")) && (!v0_0.equals("NaN")))) {
                    if ((v5_2 != Float) && ((v5_2 != Double) && (!e7.b.r.matcher(v0_0).matches()))) {
                        StringBuilder v2_1 = new StringBuilder("String created by ");
                        v2_1.append(v5_2);
                        v2_1.append(" is not a valid JSON number: ");
                        v2_1.append(v0_0);
                        throw new IllegalArgumentException(v2_1.toString());
                    }
                } else {
                    if (this.n != 1) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(v0_0));
                    }
                }
            }
            this.c();
            this.a.append(v0_0);
            return;
        } else {
            this.B();
            return;
        }
    }

    public void I(String p1)
    {
        if (p1 != null) {
            this.K();
            this.c();
            this.E(p1);
            return;
        } else {
            this.B();
            return;
        }
    }

    public void J(boolean p2)
    {
        String v2_1;
        this.K();
        this.c();
        if (p2 == null) {
            v2_1 = "false";
        } else {
            v2_1 = "true";
        }
        this.a.write(v2_1);
        return;
    }

    public final void K()
    {
        if (this.p == null) {
            return;
        } else {
            IllegalStateException v0_6 = this.C();
            if (v0_6 != 5) {
                if (v0_6 != 3) {
                    throw new IllegalStateException("Nesting problem.");
                }
            } else {
                this.a.write(this.f);
            }
            this.A();
            this.b[(this.c - 1)] = 4;
            this.E(this.p);
            this.p = 0;
            return;
        }
    }

    public final void c()
    {
        IllegalStateException v0_0 = this.C();
        if (v0_0 == 1) {
            this.b[(this.c - 1)] = 2;
            this.A();
            return;
        } else {
            int v3_0 = this.a;
            if (v0_0 == 2) {
                v3_0.append(this.f);
                this.A();
                return;
            } else {
                if (v0_0 == 4) {
                    v3_0.append(this.e);
                    this.b[(this.c - 1)] = 5;
                    return;
                } else {
                    if (v0_0 != 6) {
                        if (v0_0 != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        } else {
                            if (this.n != 1) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        }
                    }
                    this.b[(this.c - 1)] = 7;
                    return;
                }
            }
        }
    }

    public void close()
    {
        this.a.close();
        int v0_4 = this.c;
        if ((v0_4 > 1) || ((v0_4 == 1) && (this.b[(v0_4 - 1)] != 7))) {
            throw new java.io.IOException("Incomplete document");
        } else {
            this.c = 0;
            return;
        }
    }

    public void f()
    {
        this.K();
        this.c();
        java.io.Writer v0_2 = this.c;
        int v1_2 = this.b;
        if (v0_2 == v1_2.length) {
            this.b = java.util.Arrays.copyOf(v1_2, (v0_2 * 2));
        }
        java.io.Writer v0_0 = this.b;
        int v1_0 = this.c;
        this.c = (v1_0 + 1);
        v0_0[v1_0] = 1;
        this.a.write(91);
        return;
    }

    public void flush()
    {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else {
            this.a.flush();
            return;
        }
    }

    public void i()
    {
        this.K();
        this.c();
        java.io.Writer v0_2 = this.c;
        int v1_2 = this.b;
        if (v0_2 == v1_2.length) {
            this.b = java.util.Arrays.copyOf(v1_2, (v0_2 * 2));
        }
        java.io.Writer v0_0 = this.b;
        int v1_0 = this.c;
        this.c = (v1_0 + 1);
        v0_0[v1_0] = 3;
        this.a.write(123);
        return;
    }

    public final void s(int p2, int p3, char p4)
    {
        int v0 = this.C();
        if ((v0 != p3) && (v0 != p2)) {
            throw new IllegalStateException("Nesting problem.");
        } else {
            if (this.p != null) {
                String v3_2 = new StringBuilder("Dangling name: ");
                v3_2.append(this.p);
                throw new IllegalStateException(v3_2.toString());
            } else {
                this.c = (this.c - 1);
                if (v0 == p3) {
                    this.A();
                }
                this.a.write(p4);
                return;
            }
        }
    }

    public void x()
    {
        this.s(1, 2, 93);
        return;
    }

    public void y()
    {
        this.s(3, 5, 125);
        return;
    }

    public void z(String p3)
    {
        java.util.Objects.requireNonNull(p3, "name == null");
        if (this.p != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        } else {
            String v0_4 = this.C();
            if ((v0_4 != 3) && (v0_4 != 5)) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            } else {
                this.p = p3;
                return;
            }
        }
    }
}
