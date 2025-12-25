package o0;
public final class b {
    public static final String b;
    public static final String c;
    public static final o0.b d;
    public static final o0.b e;
    public final boolean a;

    static b()
    {
        o0.b.b = Character.toString(8206);
        o0.b.c = Character.toString(8207);
        o0.b.d = new o0.b(0);
        o0.b.e = new o0.b(1);
        return;
    }

    public b(boolean p2)
    {
        this.a = p2;
        return;
    }

    public static int a(CharSequence p9)
    {
        o0.a v0_1 = new o0.a(p9);
        v0_1.c = 0;
        int v1 = 0;
        int v2_2 = 0;
        int v3 = 0;
        while(true) {
            byte v4_8 = v0_1.c;
            if ((v4_8 >= v0_1.b) || (v1 != 0)) {
                break;
            }
            byte v4_5;
            int v5_0 = v0_1.a;
            byte v4_0 = v5_0.charAt(v4_8);
            v0_1.d = v4_0;
            if (!Character.isHighSurrogate(v4_0)) {
                v0_1.c = (v0_1.c + 1);
                byte v4_4 = v0_1.d;
                if (v4_4 >= 1792) {
                    v4_5 = Character.getDirectionality(v4_4);
                } else {
                    v4_5 = o0.a.e[v4_4];
                }
            } else {
                byte v4_7 = Character.codePointAt(v5_0, v0_1.c);
                v0_1.c = (Character.charCount(v4_7) + v0_1.c);
                v4_5 = Character.getDirectionality(v4_7);
            }
            if (v4_5 == 0) {
                if (v3 == 0) {
                    return -1;
                }
            } else {
                if ((v4_5 == 1) || (v4_5 == 2)) {
                    if (v3 == 0) {
                        return 1;
                    }
                } else {
                    if (v4_5 != 9) {
                        switch (v4_5) {
                            case 14:
                            case 15:
                                v3++;
                                v2_2 = -1;
                            case 16:
                            case 17:
                                v3++;
                                v2_2 = 1;
                                break;
                            case 18:
                                v3--;
                                v2_2 = 0;
                                break;
                            default:
                        }
                    }
                }
            }
            v1 = v3;
        }
        if (v1 != 0) {
            if (v2_2 != 0) {
                return v2_2;
            }
            while (v0_1.c > 0) {
                switch (v0_1.a()) {
                    case 14:
                    case 15:
                        if (v1 != v3) {
                        }
                        return -1;
                    case 16:
                    case 17:
                        if (v1 != v3) {
                        }
                        return -1;
                    case 18:
                        v3++;
                        break;
                    default:
                }
                v3--;
            }
        }
        return 0;
    }

    public static int b(CharSequence p6)
    {
        o0.a v0_1 = new o0.a(p6);
        v0_1.c = v0_1.b;
        int v1 = 0;
        do {
            int v2 = v1;
            if (v0_1.c <= 0) {
                return 0;
            } else {
                byte v3_0 = v0_1.a();
                if (v3_0 == 0) {
                    if (v1 != 0) {
                        if (v2 == 0) {
                            break;
                        }
                        while (v0_1.c > 0) {
                        }
                        return 0;
                    }
                } else {
                    if ((v3_0 == 1) || (v3_0 == 2)) {
                        if (v1 != 0) {
                        }
                    } else {
                        if (v3_0 != 9) {
                            switch (v3_0) {
                                case 14:
                                case 15:
                                    if (v2 != v1) {
                                    } else {
                                        return -1;
                                    }
                                case 16:
                                case 17:
                                    if (v2 != v1) {
                                    }
                                    break;
                                case 18:
                                    v1++;
                                    break;
                                default:
                                    if (v2 == 0) {
                                        break;
                                    }
                            }
                            v1--;
                        }
                    }
                    return 1;
                }
                return -1;
            }
        } while(v2 != 0);
    }

    public final android.text.SpannableStringBuilder c(CharSequence p11)
    {
        if (p11 != 0) {
            int v2_0;
            boolean v0_2 = o0.f.c.g(p11, p11.length());
            android.text.SpannableStringBuilder v1_2 = new android.text.SpannableStringBuilder();
            if (!v0_2) {
                v2_0 = o0.f.a;
            } else {
                v2_0 = o0.f.b;
            }
            int v2_3;
            int v2_1 = v2_0.g(p11, p11.length());
            String v3_1 = "";
            String v4 = o0.b.c;
            String v6 = o0.b.b;
            boolean v8 = this.a;
            if ((v8) || ((v2_1 == 0) && (o0.b.a(p11) != 1))) {
                if ((!v8) || ((v2_1 != 0) && (o0.b.a(p11) != -1))) {
                    v2_3 = "";
                } else {
                    v2_3 = v4;
                }
            } else {
                v2_3 = v6;
            }
            v1_2.append(v2_3);
            if (v0_2 == v8) {
                v1_2.append(p11);
            } else {
                int v2_4;
                if (!v0_2) {
                    v2_4 = 8234;
                } else {
                    v2_4 = 8235;
                }
                v1_2.append(v2_4);
                v1_2.append(p11);
                v1_2.append(8236);
            }
            boolean v0_1;
            if (!v0_2) {
                v0_1 = o0.f.a;
            } else {
                v0_1 = o0.f.b;
            }
            boolean v0_3 = v0_1.g(p11, p11.length());
            if ((v8) || ((!v0_3) && (o0.b.b(p11) != 1))) {
                if ((v8) && ((!v0_3) || (o0.b.b(p11) == -1))) {
                    v3_1 = v4;
                }
            } else {
                v3_1 = v6;
            }
            v1_2.append(v3_1);
            return v1_2;
        } else {
            return 0;
        }
    }
}
