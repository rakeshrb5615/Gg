package y6;
public final synthetic class b implements y6.p {
    public final synthetic int a;
    public final synthetic reflect.Type b;

    public synthetic b(int p1, reflect.Type p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final Object c()
    {
        switch (this.a) {
            case 0:
                String v0_3 = this.b;
                if (!(v0_3 instanceof reflect.ParameterizedType)) {
                    StringBuilder v3_11 = new StringBuilder("Invalid EnumSet type: ");
                    v3_11.append(v0_3.toString());
                    throw new w6.p(v3_11.toString());
                } else {
                    w6.p v1_4 = ((reflect.ParameterizedType) v0_3).getActualTypeArguments()[0];
                    if (!(v1_4 instanceof Class)) {
                        StringBuilder v3_3 = new StringBuilder("Invalid EnumSet type: ");
                        v3_3.append(v0_3.toString());
                        throw new w6.p(v3_3.toString());
                    } else {
                        return java.util.EnumSet.noneOf(((Class) v1_4));
                    }
                }
            default:
                String v0_7 = this.b;
                if (!(v0_7 instanceof reflect.ParameterizedType)) {
                    StringBuilder v3_5 = new StringBuilder("Invalid EnumMap type: ");
                    v3_5.append(v0_7.toString());
                    throw new w6.p(v3_5.toString());
                } else {
                    w6.p v1_15 = ((reflect.ParameterizedType) v0_7).getActualTypeArguments()[0];
                    if (!(v1_15 instanceof Class)) {
                        StringBuilder v3_9 = new StringBuilder("Invalid EnumMap type: ");
                        v3_9.append(v0_7.toString());
                        throw new w6.p(v3_9.toString());
                    } else {
                        return new java.util.EnumMap(((Class) v1_15));
                    }
                }
        }
    }
}
