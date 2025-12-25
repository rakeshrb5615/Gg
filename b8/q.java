package b8;
public final synthetic class q implements u7.p {
    public final synthetic int a;
    public final synthetic java.io.Serializable b;

    public synthetic q(int p1, java.io.Serializable p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final Object invoke(Object p4, Object p5)
    {
        switch (this.a) {
            case 0:
                d8.e1 v4_3;
                h7.f v0_6 = ((char[]) this.b);
                d8.e1 v5_13 = ((Integer) p5).intValue();
                kotlin.jvm.internal.j.e(((CharSequence) p4), "$this$DelimitedRangesSequence");
                d8.e1 v4_1 = b8.i.x0(((CharSequence) p4), v0_6, v5_13, 0);
                if (v4_1 >= null) {
                    v4_3 = new h7.f(Integer.valueOf(v4_1), Integer.valueOf(1));
                } else {
                    v4_3 = 0;
                }
                return v4_3;
            default:
                h7.f v0_5 = ((h8.g) this.b);
                StringBuilder v1_1 = ((Integer) p4).intValue();
                d8.e1 v4_5 = ((l7.f) p5).getKey();
                h7.f v0_8 = v0_5.b.get(v4_5);
                if (v4_5 == d8.b0.b) {
                    h7.f v0_9 = ((d8.e1) v0_8);
                    d8.e1 v5_4 = ((d8.e1) ((l7.f) p5));
                    while(true) {
                        d8.e1 v4_6 = 0;
                        if (v5_4 == null) {
                            break;
                        }
                        if ((v5_4 != v0_9) && ((v5_4 instanceof i8.q))) {
                            d8.e1 v5_7 = ((d8.q) d8.r1.b.get(((i8.q) v5_4)));
                            if (v5_7 != null) {
                                v4_6 = v5_7.getParent();
                            }
                            v5_4 = v4_6;
                        }
                        if (v5_4 != v0_9) {
                            StringBuilder v1_3 = new StringBuilder("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
                            v1_3.append(v5_4);
                            v1_3.append(", expected child of ");
                            v1_3.append(v0_9);
                            v1_3.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'");
                            throw new IllegalStateException(v1_3.toString().toString());
                        } else {
                            if (v0_9 != null) {
                                v1_1++;
                            }
                        }
                    }
                    v5_4 = 0;
                } else {
                    if (((l7.f) p5) == v0_8) {
                    } else {
                        v1_1 = -2147483648;
                    }
                }
                return Integer.valueOf(v1_1);
        }
    }
}
