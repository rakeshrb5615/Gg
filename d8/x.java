package d8;
public final synthetic class x implements u7.p {
    public final synthetic int a;

    public synthetic x(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object invoke(Object p4, Object p5)
    {
        switch (this.a) {
            case 0:
                ((Boolean) p4).booleanValue();
                return ((Boolean) p4);
            case 1:
                return ((l7.h) p4).plus(((l7.f) p5));
            case 2:
                return ((l7.h) p4).plus(((l7.f) p5));
            case 3:
                return Integer.valueOf((((Integer) p4).intValue() + 1));
            case 4:
                if ((((l7.f) p5) instanceof d8.y1)) {
                    Integer v4_8;
                    if (!(p4 instanceof Integer)) {
                        v4_8 = 0;
                    } else {
                        v4_8 = ((Integer) p4);
                    }
                    Integer v4_9;
                    if (v4_8 == null) {
                        v4_9 = 1;
                    } else {
                        v4_9 = v4_8.intValue();
                    }
                    if (v4_9 != null) {
                        p4 = Integer.valueOf((v4_9 + 1));
                    } else {
                        p4 = ((l7.f) p5);
                    }
                }
                return p4;
            case 5:
                Integer v4_5 = ((d8.y1) p4);
                if (((d8.y1) p4) == null) {
                    if (!(((l7.f) p5) instanceof d8.y1)) {
                        v4_5 = 0;
                    } else {
                        v4_5 = ((d8.y1) ((l7.f) p5));
                    }
                }
                return v4_5;
            case 6:
                return ((i8.v) p4);
            case 7:
                Integer v4_2;
                kotlin.jvm.internal.j.e(((String) p4), "acc");
                kotlin.jvm.internal.j.e(((l7.f) p5), "element");
                if (((String) p4).length() != 0) {
                    int v0_4 = new StringBuilder();
                    v0_4.append(((String) p4));
                    v0_4.append(", ");
                    v0_4.append(((l7.f) p5));
                    v4_2 = v0_4.toString();
                } else {
                    v4_2 = ((l7.f) p5).toString();
                }
                return v4_2;
            default:
                l7.b v5_1 = ((l7.f) p5);
                kotlin.jvm.internal.j.e(((l7.h) p4), "acc");
                kotlin.jvm.internal.j.e(((l7.f) p5), "element");
                Integer v4_21 = ((l7.h) p4).minusKey(((l7.f) p5).getKey());
                int v0_13 = l7.i.a;
                if (v4_21 != v0_13) {
                    int v0_2;
                    l7.b v1_0 = l7.d.a;
                    l7.e v2_1 = ((l7.e) v4_21.get(v1_0));
                    if (v2_1 != null) {
                        Integer v4_22 = v4_21.minusKey(v1_0);
                        if (v4_22 != v0_13) {
                            v0_2 = new l7.b(v2_1, new l7.b(((l7.f) p5), v4_22));
                        } else {
                            v5_1 = new l7.b(v2_1, ((l7.f) p5));
                            return v5_1;
                        }
                    } else {
                        v0_2 = new l7.b(((l7.f) p5), v4_21);
                    }
                    v5_1 = v0_2;
                }
                return v5_1;
        }
    }
}
