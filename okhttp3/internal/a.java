package okhttp3.internal;
public final synthetic class a implements u7.l {
    public final synthetic int a;

    public synthetic a(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object invoke(Object p3)
    {
        switch (this.a) {
            case 0:
                int v3_5;
                kotlin.jvm.internal.j.e(((okhttp3.internal.LinkedTags) p3), "it");
                int v3_4 = ((okhttp3.internal.LinkedTags) p3).c;
                if (!(v3_4 instanceof okhttp3.internal.LinkedTags)) {
                    v3_5 = 0;
                } else {
                    v3_5 = ((okhttp3.internal.LinkedTags) v3_4);
                }
                return v3_5;
            default:
                kotlin.jvm.internal.j.e(((okhttp3.internal.LinkedTags) p3), "it");
                boolean v0_3 = new StringBuilder();
                v0_3.append(((okhttp3.internal.LinkedTags) p3).a);
                v0_3.append(61);
                v0_3.append(((okhttp3.internal.LinkedTags) p3).b);
                return v0_3.toString();
        }
    }
}
