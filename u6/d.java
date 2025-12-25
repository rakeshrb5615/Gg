package u6;
public final class d extends n7.i implements u7.p {
    public int a;
    public final synthetic u6.e b;
    public final synthetic Object c;
    public final synthetic a1.d d;
    public final synthetic a1.o e;

    public d(u6.e p1, java.util.Map p2, a1.d p3, a1.o p4, l7.c p5)
    {
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        super(2, p5);
        return;
    }

    public final l7.c create(Object p7, l7.c p8)
    {
        return new u6.d(this.b, this.c, this.d, this.e, p8);
    }

    public final Object invoke(Object p1, Object p2)
    {
        return ((u6.d) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p10)
    {
        String v0_0 = m7.a.a;
        a1.d v1_0 = this.a;
        h7.l v2 = h7.l.a;
        a1.o v3 = this.e;
        try {
            if (v1_0 == null) {
                c4.b.e0(p10);
                Object v10_2 = u6.e.a(this.b).openConnection();
                kotlin.jvm.internal.j.c(v10_2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                Object v10_3 = ((javax.net.ssl.HttpsURLConnection) v10_2);
                v10_3.setRequestMethod("GET");
                v10_3.setRequestProperty("Accept", "application/json");
                a1.d v1_6 = this.c.entrySet().iterator();
                while (v1_6.hasNext()) {
                    String v7_5 = ((java.util.Map$Entry) v1_6.next());
                    v10_3.setRequestProperty(((String) v7_5.getKey()), ((String) v7_5.getValue()));
                }
                a1.d v1_7 = v10_3.getResponseCode();
                if (v1_7 != 200) {
                    Object v10_5 = new StringBuilder();
                    v10_5.append("Bad response code: ");
                    v10_5.append(v1_7);
                    Object v10_6 = v10_5.toString();
                    this.a = 2;
                    v3.invoke(v10_6, this);
                    if (v2 != v0_0) {
                        return v2;
                    }
                } else {
                    Object v10_7 = v10_3.getInputStream();
                    a1.d v1_9 = new java.io.BufferedReader(new java.io.InputStreamReader(v10_7));
                    StringBuilder v5_4 = new StringBuilder();
                    while(true) {
                        String v7_3 = v1_9.readLine();
                        if (v7_3 == null) {
                            break;
                        }
                        v5_4.append(v7_3);
                    }
                    v1_9.close();
                    v10_7.close();
                    Object v10_9 = new org.json.JSONObject(v5_4.toString());
                    a1.d v1_11 = this.d;
                    this.a = 1;
                    if (v1_11.invoke(v10_9, this) != v0_0) {
                        return v2;
                    } else {
                    }
                }
            } else {
                if ((v1_0 == 1) || (v1_0 == 2)) {
                    c4.b.e0(p10);
                    return v2;
                } else {
                    if (v1_0 != 3) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p10);
                        return v2;
                    }
                }
            }
        } catch (Object v10_11) {
            a1.d v1_12 = v10_11.getMessage();
            if (v1_12 == null) {
                v1_12 = v10_11.toString();
            }
            this.a = 3;
            v3.invoke(v1_12, this);
            if (v2 != v0_0) {
                return v2;
            }
        }
        return v0_0;
    }
}
