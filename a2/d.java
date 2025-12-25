package a2;
public class d {
    public final synthetic int a;
    public int b;
    public final Object c;
    public Object d;
    public final java.io.Serializable e;
    public Object f;

    public d(a2.h0 p2)
    {
        this.a = 0;
        this.b = 0;
        this.c = p2;
        this.d = new a2.c();
        this.e = new java.util.ArrayList();
        return;
    }

    public d(String p6)
    {
        this.a = 1;
        kotlin.jvm.internal.j.e(p6, "source");
        StringBuilder v0_5 = new g0.d();
        int[] v2_1 = new Object[8];
        v0_5.c = v2_1;
        int[] v2_0 = new int[8];
        int v3 = 0;
        while (v3 < 8) {
            v2_0[v3] = -1;
            v3++;
        }
        v0_5.d = v2_0;
        v0_5.b = -1;
        this.c = v0_5;
        this.e = new StringBuilder();
        this.f = p6;
        return;
    }

    public static synthetic void n(a2.d p1, String p2, int p3, int p4)
    {
        if ((p4 & 2) != 0) {
            p3 = p1.b;
        }
        String v4_2;
        if ((p4 & 4) == 0) {
            v4_2 = "It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'";
        } else {
            v4_2 = "";
        }
        p1.m(p2, p3, v4_2);
        throw 0;
    }

    public void A(android.view.View p4)
    {
        if (((java.util.ArrayList) this.e).remove(p4)) {
            int v0_8 = ((a2.h0) this.c);
            a2.k1 v4_1 = androidx.recyclerview.widget.RecyclerView.M(p4);
            if (v4_1 != null) {
                int v0_2 = v0_8.a;
                int v1 = v4_1.p;
                if (!v0_2.P()) {
                    v4_1.a.setImportantForAccessibility(v1);
                } else {
                    v4_1.q = v1;
                    v0_2.x0.add(v4_1);
                }
                v4_1.p = 0;
            }
        }
        return;
    }

    public void a(android.view.View p3, int p4, boolean p5)
    {
        int v4_1;
        androidx.recyclerview.widget.RecyclerView v0_2 = ((a2.h0) this.c).a;
        if (p4 >= 0) {
            v4_1 = this.s(p4);
        } else {
            v4_1 = v0_2.getChildCount();
        }
        ((a2.c) this.d).e(v4_1, p5);
        if (p5) {
            this.v(p3);
        }
        v0_2.addView(p3, v4_1);
        androidx.recyclerview.widget.RecyclerView.M(p3);
        return;
    }

    public int b(CharSequence p5, int p6)
    {
        String v0_0 = (p6 + 4);
        if (v0_0 < p5.length()) {
            ((StringBuilder) this.e).append(((char) (this.p(p5, (p6 + 3)) + (((this.p(p5, p6) << 12) + (this.p(p5, (p6 + 1)) << 8)) + (this.p(p5, (p6 + 2)) << 4)))));
            return v0_0;
        } else {
            this.b = p6;
            if (v0_0 >= p5.length()) {
                a2.d.n(this, "Unexpected EOF during unicode escape", 0, 6);
                throw 0;
            } else {
                return this.b(p5, this.b);
            }
        }
    }

    public void c(android.view.View p4, int p5, android.view.ViewGroup$LayoutParams p6, boolean p7)
    {
        String v5_4;
        androidx.recyclerview.widget.RecyclerView v0_2 = ((a2.h0) this.c).a;
        if (p5 >= null) {
            v5_4 = this.s(p5);
        } else {
            v5_4 = v0_2.getChildCount();
        }
        ((a2.c) this.d).e(v5_4, p7);
        if (p7 != null) {
            this.v(p4);
        }
        StringBuilder v7_1 = androidx.recyclerview.widget.RecyclerView.M(p4);
        if (v7_1 == null) {
            if (androidx.recyclerview.widget.RecyclerView.F0) {
                StringBuilder v7_4 = new StringBuilder("No ViewHolder found for child: ");
                v7_4.append(p4);
                v7_4.append(", index: ");
                v7_4.append(v5_4);
                throw new IllegalArgumentException(v1.a.h(v0_2, v7_4));
            }
        } else {
            if ((!v7_1.j()) && (!v7_1.o())) {
                String v5_2 = new StringBuilder("Called attach on a child which is not detached: ");
                v5_2.append(v7_1);
                throw new IllegalArgumentException(v1.a.h(v0_2, v5_2));
            } else {
                if (androidx.recyclerview.widget.RecyclerView.G0) {
                    int v1_5 = new StringBuilder("reAttach ");
                    v1_5.append(v7_1);
                    android.util.Log.d("RecyclerView", v1_5.toString());
                }
                v7_1.j = (v7_1.j & -257);
            }
        }
        androidx.recyclerview.widget.RecyclerView.a(v0_2, p4, v5_4, p6);
        return;
    }

    public boolean d()
    {
        int v0_0 = this.b;
        if (v0_0 != -1) {
            String v1_2 = ((String) this.f);
            while (v0_0 < v1_2.length()) {
                char v3_0 = v1_2.charAt(v0_0);
                if ((v3_0 != 32) && ((v3_0 != 10) && ((v3_0 != 13) && (v3_0 != 9)))) {
                    this.b = v0_0;
                    if ((v3_0 == 44) || ((v3_0 == 58) || ((v3_0 == 93) || (v3_0 == 125)))) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    v0_0++;
                }
            }
            this.b = v0_0;
            return 0;
        } else {
            return 0;
        }
    }

    public void e(int p9, String p10)
    {
        String v0_1 = ((String) this.f);
        if ((v0_1.length() - p9) < p10.length()) {
            a2.d.n(this, "Unexpected end of boolean literal", 0, 6);
            throw 0;
        } else {
            int v1_0 = p10.length();
            int v2_0 = 0;
            while (v2_0 < v1_0) {
                if (p10.charAt(v2_0) != (v0_1.charAt((p9 + v2_0)) | 32)) {
                    String v9_3 = new StringBuilder("Expected valid boolean literal prefix, but had \'");
                    v9_3.append(this.j());
                    v9_3.append(39);
                    a2.d.n(this, v9_3.toString(), 0, 6);
                    throw 0;
                } else {
                    v2_0++;
                }
            }
            this.b = (p10.length() + p9);
            return;
        }
    }

    public String f()
    {
        String v0_1 = ((StringBuilder) this.e);
        int v1_2 = ((String) this.f);
        this.g(34);
        int v3_1 = this.b;
        char v5_3 = b8.i.v0(v1_2, 34, v3_1, 4);
        if (v5_3 == -1) {
            this.j();
            this.o(1, 0);
            throw 0;
        } else {
            int v10_0 = v3_1;
            while (v10_0 < v5_3) {
                if (v1_2.charAt(v10_0) != 92) {
                    v10_0++;
                } else {
                    int v3_0 = this.b;
                    char v5_0 = v1_2.charAt(v10_0);
                    int v11_1 = 0;
                    while (v5_0 != 34) {
                        if (v5_0 != 92) {
                            v10_0++;
                            if (v10_0 >= v1_2.length()) {
                                v0_1.append(v1_2, v3_0, v10_0);
                                v3_0 = this.w(v10_0);
                                if (v3_0 == -1) {
                                    a2.d.n(this, "Unexpected EOF", v3_0, 4);
                                    throw 0;
                                } else {
                                    v10_0 = v3_0;
                                    v11_1 = 1;
                                }
                            }
                        } else {
                            v0_1.append(v1_2, v3_0, v10_0);
                            int v3_2 = this.w((v10_0 + 1));
                            if (v3_2 == -1) {
                                a2.d.n(this, "Expected escape sequence to continue, got EOF", 0, 6);
                                throw 0;
                            } else {
                                int v10_3 = (v3_2 + 1);
                                int v3_3 = v1_2.charAt(v3_2);
                                if (v3_3 != 117) {
                                    int v11_3;
                                    if (v3_3 >= 117) {
                                        v11_3 = 0;
                                    } else {
                                        v11_3 = u8.c.a[v3_3];
                                    }
                                    if (v11_3 == 0) {
                                        String v0_8 = new StringBuilder("Invalid escaped char \'");
                                        v0_8.append(v3_3);
                                        v0_8.append(39);
                                        a2.d.n(this, v0_8.toString(), 0, 6);
                                        throw 0;
                                    } else {
                                        v0_1.append(v11_3);
                                    }
                                } else {
                                    v10_3 = this.b(v1_2, v10_3);
                                }
                                v3_0 = this.w(v10_3);
                                if (v3_0 == -1) {
                                    a2.d.n(this, "Unexpected EOF", v3_0, 4);
                                    throw 0;
                                }
                            }
                        }
                        v5_0 = v1_2.charAt(v10_0);
                    }
                    String v0_4;
                    if (v11_1 != 0) {
                        v0_4 = this.k(v3_0, v10_0);
                    } else {
                        v0_4 = v1_2.subSequence(v3_0, v10_0).toString();
                    }
                    this.b = (v10_0 + 1);
                    return v0_4;
                }
            }
            this.b = (v5_3 + 1);
            String v0_3 = v1_2.substring(v3_1, v5_3);
            kotlin.jvm.internal.j.d(v0_3, "substring(...)");
            return v0_3;
        }
    }

    public void g(char p7)
    {
        int v0_0 = this.b;
        if (v0_0 == -1) {
            this.z(p7);
            throw 0;
        } else {
            String v3_1 = ((String) this.f);
            while (v0_0 < v3_1.length()) {
                int v4_0 = (v0_0 + 1);
                int v0_1 = v3_1.charAt(v0_0);
                if ((v0_1 != 32) && ((v0_1 != 10) && ((v0_1 != 13) && (v0_1 != 9)))) {
                    this.b = v4_0;
                    if (v0_1 != p7) {
                        this.z(p7);
                        throw 0;
                    } else {
                        return;
                    }
                } else {
                    v0_0 = v4_0;
                }
            }
            this.b = -1;
            this.z(p7);
            throw 0;
        }
    }

    public long h()
    {
        String v1_16 = this.w(this.x());
        String v2_5 = ((String) this.f);
        int v6_0 = 6;
        int v7_1 = 0;
        if ((v1_16 >= v2_5.length()) || (v1_16 == -1)) {
            a2.d.n(this, "EOF", 0, 6);
            throw 0;
        } else {
            StringBuilder v3_11;
            if (v2_5.charAt(v1_16) != 34) {
                v3_11 = 0;
            } else {
                v1_16++;
                if (v1_16 == v2_5.length()) {
                    a2.d.n(this, "EOF", 0, 6);
                    throw 0;
                } else {
                    v3_11 = 1;
                }
            }
            int v12 = v1_16;
            int v11 = 0;
            int v13 = 0;
            int v14 = 0;
            long v9_1 = 0;
            long v15_0 = 0;
            long v17_1 = 0;
            while(true) {
                long v20 = v15_0;
                if (v12 != v2_5.length()) {
                    int v5_14 = v2_5.charAt(v12);
                    if (((v5_14 != 101) && (v5_14 != 69)) || (v13 != 0)) {
                        if ((v5_14 != 45) || (v13 == 0)) {
                            if ((v5_14 != 43) || (v13 == 0)) {
                                if (v5_14 != 45) {
                                    if (u8.g.b(v5_14) == 0) {
                                        v12++;
                                        int v6_1 = (v5_14 - 48);
                                        if ((v6_1 < 0) || (v6_1 >= 10)) {
                                            String v1_9 = new StringBuilder("Unexpected symbol \'");
                                            v1_9.append(v5_14);
                                            v1_9.append("\' in numeric literal");
                                            a2.d.n(this, v1_9.toString(), v7_1, 6);
                                            throw 0;
                                        } else {
                                            if (v13 == 0) {
                                                v17_1 = ((v17_1 * ((long) 10)) - ((long) v6_1));
                                                if (v17_1 > v20) {
                                                    a2.d.n(this, "Numeric value overflow", 0, 6);
                                                    throw 0;
                                                }
                                            } else {
                                                v9_1 = ((v9_1 * ((long) 10)) + ((long) v6_1));
                                            }
                                            v15_0 = v20;
                                            v6_0 = 6;
                                            v7_1 = 0;
                                        }
                                    }
                                } else {
                                    if (v12 != v1_16) {
                                        a2.d.n(this, "Unexpected symbol \'-\' in numeric literal", v7_1, 6);
                                        throw 0;
                                    } else {
                                        v12++;
                                        v15_0 = v20;
                                        v6_0 = 6;
                                        v14 = 1;
                                    }
                                }
                            } else {
                                if (v12 == v1_16) {
                                    a2.d.n(this, "Unexpected symbol \'+\' in numeric literal", v7_1, 6);
                                    throw 0;
                                } else {
                                    v12++;
                                    v15_0 = v20;
                                    v6_0 = 6;
                                    v11 = 1;
                                }
                            }
                        } else {
                            if (v12 == v1_16) {
                                a2.d.n(this, "Unexpected symbol \'-\' in numeric literal", v7_1, 6);
                                throw 0;
                            } else {
                                v12++;
                                v11 = v7_1;
                                v15_0 = v20;
                                v6_0 = 6;
                            }
                        }
                    } else {
                        if (v12 == v1_16) {
                            break;
                        }
                        v12++;
                        v15_0 = v20;
                        v11 = 1;
                        v13 = 1;
                    }
                }
                int v5_15;
                if (v12 == v1_16) {
                    v5_15 = 0;
                } else {
                    v5_15 = 1;
                }
                if ((v1_16 == v12) || ((v14 != 0) && (v1_16 == (v12 - 1)))) {
                    a2.d.n(this, "Expected numeric literal", 0, 6);
                    throw 0;
                } else {
                    if (v3_11 != null) {
                        if (v5_15 == 0) {
                            a2.d.n(this, "EOF", 0, 6);
                            throw 0;
                        } else {
                            if (v2_5.charAt(v12) != 34) {
                                a2.d.n(this, "Expected closing quotation mark", 0, 6);
                                throw 0;
                            } else {
                                v12++;
                            }
                        }
                    }
                    long v10;
                    this.b = v12;
                    String v1_20 = v17_1;
                    if (v13 == 0) {
                        v10 = v1_20;
                    } else {
                        StringBuilder v3_0;
                        String v1_21 = ((double) v1_20);
                        if (v11 != 0) {
                            if (v11 != 1) {
                                throw new a5.o();
                            } else {
                                v3_0 = Math.pow(4621819117588971520, ((double) v9_1));
                            }
                        } else {
                            v3_0 = Math.pow(4621819117588971520, (- ((double) v9_1)));
                        }
                        String v1_2 = (v1_21 * v3_0);
                        if ((v1_2 > 4890909195324358656) || (v1_2 < -4332462841530417152)) {
                            a2.d.n(this, "Numeric value overflow", 0, 6);
                            throw 0;
                        } else {
                            if (Math.floor(v1_2) != v1_2) {
                                StringBuilder v3_8 = new StringBuilder("Can\'t convert ");
                                v3_8.append(v1_2);
                                v3_8.append(" to Long");
                                a2.d.n(this, v3_8.toString(), 0, 6);
                                throw 0;
                            } else {
                                v10 = ((long) v1_2);
                            }
                        }
                    }
                    if (v14 == 0) {
                        if (v10 == -9223372036854775808) {
                            a2.d.n(this, "Numeric value overflow", 0, 6);
                            throw 0;
                        } else {
                            return (- v10);
                        }
                    } else {
                        return v10;
                    }
                }
            }
            String v1_14 = new StringBuilder("Unexpected symbol ");
            v1_14.append(v5_14);
            v1_14.append(" in numeric literal");
            a2.d.n(this, v1_14.toString(), v7_1, v6_0);
            throw 0;
        }
    }

    public String i()
    {
        String v0_1 = ((String) this.d);
        if (v0_1 == null) {
            return this.f();
        } else {
            kotlin.jvm.internal.j.b(v0_1);
            this.d = 0;
            return v0_1;
        }
    }

    public String j()
    {
        String v0_1 = ((String) this.f);
        int v1_1 = ((String) this.d);
        if (v1_1 == 0) {
            int v1_3 = this.x();
            if ((v1_3 >= v0_1.length()) || (v1_3 == -1)) {
                a2.d.n(this, "EOF", v1_3, 4);
                throw 0;
            } else {
                StringBuilder v4_1 = u8.g.b(v0_1.charAt(v1_3));
                if (v4_1 != 1) {
                    if (v4_1 != null) {
                        StringBuilder v3_3 = new StringBuilder("Expected beginning of the string, but got ");
                        v3_3.append(v0_1.charAt(v1_3));
                        a2.d.n(this, v3_3.toString(), 0, 6);
                        throw 0;
                    } else {
                        int v2_0 = 0;
                        while (u8.g.b(v0_1.charAt(v1_3)) == 0) {
                            v1_3++;
                            if (v1_3 >= v0_1.length()) {
                                ((StringBuilder) this.e).append(v0_1, this.b, v1_3);
                                int v2_4 = this.w(v1_3);
                                if (v2_4 != -1) {
                                    v1_3 = v2_4;
                                    v2_0 = 1;
                                } else {
                                    this.b = v1_3;
                                    return this.k(0, 0);
                                }
                            }
                        }
                        String v0_6;
                        if (v2_0 != 0) {
                            v0_6 = this.k(this.b, v1_3);
                        } else {
                            v0_6 = v0_1.subSequence(this.b, v1_3).toString();
                        }
                        this.b = v1_3;
                        return v0_6;
                    }
                } else {
                    return this.i();
                }
            }
        } else {
            kotlin.jvm.internal.j.b(v1_1);
            this.d = 0;
            return v1_1;
        }
    }

    public String k(int p3, int p4)
    {
        StringBuilder v0_1 = ((StringBuilder) this.e);
        v0_1.append(((String) this.f), p3, p4);
        String v3_1 = v0_1.toString();
        kotlin.jvm.internal.j.d(v3_1, "toString(...)");
        v0_1.setLength(0);
        return v3_1;
    }

    public void l(int p5)
    {
        IllegalArgumentException v5_1 = this.s(p5);
        ((a2.c) this.d).f(v5_1);
        String v0_5 = ((a2.h0) this.c).a;
        IllegalArgumentException v1_4 = v0_5.getChildAt(v5_1);
        if (v1_4 == null) {
            if (androidx.recyclerview.widget.RecyclerView.F0) {
                int v2_1 = new StringBuilder("No view at offset ");
                v2_1.append(v5_1);
                throw new IllegalArgumentException(v1.a.h(v0_5, v2_1));
            }
        } else {
            IllegalArgumentException v1_3 = androidx.recyclerview.widget.RecyclerView.M(v1_4);
            if (v1_3 != null) {
                if ((v1_3.j()) && (!v1_3.o())) {
                    int v2_5 = new StringBuilder("called detach on an already detached child ");
                    v2_5.append(v1_3);
                    throw new IllegalArgumentException(v1.a.h(v0_5, v2_5));
                } else {
                    if (androidx.recyclerview.widget.RecyclerView.G0) {
                        int v2_8 = new StringBuilder("tmpDetach ");
                        v2_8.append(v1_3);
                        android.util.Log.d("RecyclerView", v2_8.toString());
                    }
                    v1_3.a(256);
                }
            }
        }
        androidx.recyclerview.widget.RecyclerView.c(v0_5, v5_1);
        return;
    }

    public void m(String p4, int p5, String p6)
    {
        String v6_1;
        kotlin.jvm.internal.j.e(p4, "message");
        kotlin.jvm.internal.j.e(p6, "hint");
        if (p6.length() != 0) {
            v6_1 = "\n".concat(p6);
        } else {
            v6_1 = "";
        }
        u8.d v0_2 = new StringBuilder();
        v0_2.append(p4);
        v0_2.append(" at path: ");
        v0_2.append(((g0.d) this.c).d());
        v0_2.append(v6_1);
        String v4_5 = v0_2.toString();
        String v6_3 = ((String) this.f);
        kotlin.jvm.internal.j.e(v4_5, "message");
        kotlin.jvm.internal.j.e(v6_3, "input");
        u8.d v0_7 = new StringBuilder();
        v0_7.append(v4_5);
        v0_7.append("\nJSON input: ");
        v0_7.append(u8.g.d(v6_3, p5));
        String v4_8 = v0_7.toString();
        kotlin.jvm.internal.j.e(v4_8, "message");
        if (p5 >= null) {
            StringBuilder v1_1 = new StringBuilder("Unexpected JSON token at offset ");
            v1_1.append(p5);
            v1_1.append(": ");
            v1_1.append(v4_8);
            v4_8 = v1_1.toString();
        }
        kotlin.jvm.internal.j.e(v4_8, "message");
        throw new u8.d(v4_8);
    }

    public void o(byte p4, boolean p5)
    {
        String v4_1;
        int v0_1 = ((String) this.f);
        if (p4 != 1) {
            if (p4 != 2) {
                if (p4 != 4) {
                    if (p4 != 5) {
                        if (p4 != 6) {
                            if (p4 != 7) {
                                if (p4 != 8) {
                                    if (p4 != 9) {
                                        if (p4 != 10) {
                                            if (p4 != 127) {
                                                v4_1 = "valid token";
                                            } else {
                                                v4_1 = "invalid token";
                                            }
                                        } else {
                                            v4_1 = "end of the input";
                                        }
                                    } else {
                                        v4_1 = "end of the array \']\'";
                                    }
                                } else {
                                    v4_1 = "start of the array \'[\'";
                                }
                            } else {
                                v4_1 = "end of the object \'}\'";
                            }
                        } else {
                            v4_1 = "start of the object \'{\'";
                        }
                    } else {
                        v4_1 = "colon \':\'";
                    }
                } else {
                    v4_1 = "comma \',\'";
                }
            } else {
                v4_1 = "string escape sequence \'\\\'";
            }
        } else {
            v4_1 = "quotation mark \'\"\'";
        }
        int v5_1;
        if (p5 == 0) {
            v5_1 = this.b;
        } else {
            v5_1 = (this.b - 1);
        }
        if ((this.b != v0_1.length()) && (v5_1 >= 0)) {
            int v0_3 = String.valueOf(v0_1.charAt(v5_1));
        } else {
            v0_3 = "EOF";
        }
        int v1_10 = new StringBuilder("Expected ");
        v1_10.append(v4_1);
        v1_10.append(", but had \'");
        v1_10.append(v0_3);
        v1_10.append("\' instead");
        a2.d.n(this, v1_10.toString(), v5_1, 4);
        throw 0;
    }

    public int p(CharSequence p2, int p3)
    {
        int v2_1 = p2.charAt(p3);
        if ((48 > v2_1) || (v2_1 >= 58)) {
            if ((97 > v2_1) || (v2_1 >= 103)) {
                if ((65 > v2_1) || (v2_1 >= 71)) {
                    int v3_4 = new StringBuilder("Invalid toHexChar char \'");
                    v3_4.append(v2_1);
                    v3_4.append("\' in unicode escape");
                    a2.d.n(this, v3_4.toString(), 0, 6);
                    throw 0;
                } else {
                    return (v2_1 - 55);
                }
            } else {
                return (v2_1 - 87);
            }
        } else {
            return (v2_1 - 48);
        }
    }

    public android.view.View q(int p2)
    {
        return ((a2.h0) this.c).a.getChildAt(this.s(p2));
    }

    public int r()
    {
        return (((a2.h0) this.c).a.getChildCount() - ((java.util.ArrayList) this.e).size());
    }

    public int s(int p6)
    {
        a2.c v0_1 = ((a2.c) this.d);
        if (p6) {
            int v2_3 = ((a2.h0) this.c).a.getChildCount();
            int v3 = p6;
            while (v3 < v2_3) {
                int v4_2 = (p6 - (v3 - v0_1.b(v3)));
                if (v4_2 != 0) {
                    v3 += v4_2;
                }
                while (v0_1.d(v3)) {
                    v3++;
                }
                return v3;
            }
            return -1;
        } else {
            return -1;
        }
    }

    public android.view.View t(int p2)
    {
        return ((a2.h0) this.c).a.getChildAt(p2);
    }

    public final String toString()
    {
        switch (this.a) {
            case 0:
                String v0_5 = new StringBuilder();
                v0_5.append(((a2.c) this.d).toString());
                v0_5.append(", hidden list:");
                v0_5.append(((java.util.ArrayList) this.e).size());
                return v0_5.toString();
            default:
                String v0_4 = new StringBuilder("JsonReader(source=\'");
                v0_4.append(((String) this.f));
                v0_4.append("\', currentPosition=");
                v0_4.append(this.b);
                v0_4.append(41);
                return v0_4.toString();
        }
    }

    public int u()
    {
        return ((a2.h0) this.c).a.getChildCount();
    }

    public void v(android.view.View p5)
    {
        ((java.util.ArrayList) this.e).add(p5);
        java.util.ArrayList v0_4 = ((a2.h0) this.c);
        a2.k1 v5_1 = androidx.recyclerview.widget.RecyclerView.M(p5);
        if (v5_1 != null) {
            android.view.View v1 = v5_1.a;
            java.util.ArrayList v0_5 = v0_4.a;
            boolean v2_0 = v5_1.q;
            if (v2_0 == -1) {
                v5_1.p = v1.getImportantForAccessibility();
            } else {
                v5_1.p = v2_0;
            }
            if (!v0_5.P()) {
                v1.setImportantForAccessibility(4);
            } else {
                v5_1.q = 4;
                v0_5.x0.add(v5_1);
                return;
            }
        }
        return;
    }

    public int w(int p2)
    {
        if (p2 >= ((String) this.f).length()) {
            return -1;
        } else {
            return p2;
        }
    }

    public int x()
    {
        int v0 = this.b;
        if (v0 != -1) {
            String v1_2 = ((String) this.f);
            while (v0 < v1_2.length()) {
                char v2_1 = v1_2.charAt(v0);
                if ((v2_1 != 32) && ((v2_1 != 10) && ((v2_1 != 13) && (v2_1 != 9)))) {
                    break;
                }
                v0++;
            }
            this.b = v0;
            return v0;
        } else {
            return v0;
        }
    }

    public boolean y()
    {
        int v0_0 = this.x();
        int v1_3 = ((String) this.f);
        if ((v0_0 >= v1_3.length()) || ((v0_0 == -1) || (v1_3.charAt(v0_0) != 44))) {
            return 0;
        } else {
            this.b = (this.b + 1);
            return 1;
        }
    }

    public void z(char p5)
    {
        String v0_0 = this.b;
        if ((v0_0 > null) && (p5 == 34)) {
            try {
                this.b = (v0_0 - 1);
                String v3_2 = this.j();
                this.b = v0_0;
                String v0_2 = kotlin.jvm.internal.j.a(v3_2, "null");
            } catch (int v5_1) {
                this.b = v0_2;
                throw v5_1;
            }
            if (v0_2 != null) {
                this.m("Expected string literal but \'null\' literal was found", (this.b - 1), "Use \'coerceInputValues = true\' in \'Json {}\' builder to coerce nulls if property has a default value.");
                throw 0;
            }
        }
        this.o(u8.g.b(p5), 1);
        throw 0;
    }
}
