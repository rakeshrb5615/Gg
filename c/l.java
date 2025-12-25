package c;
public final synthetic class l implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic int c;
    public final synthetic Object d;

    public synthetic l(i2.h p2, android.view.ViewGroup p3, int p4)
    {
        this.a = 2;
        this.b = p2;
        this.d = p3;
        this.c = p4;
        return;
    }

    public synthetic l(Object p1, int p2, int p3, Object p4)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        this.d = p4;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                boolean v0_5 = ((c.m) this.b);
                android.view.ViewGroup v1_6 = ((java.io.Serializable) ((l6.c) this.d).b);
                int v2_6 = ((String) v0_5.a.get(Integer.valueOf(this.c)));
                if (v2_6 != 0) {
                    String v4_0;
                    e.b v3_7 = ((e.f) v0_5.e.get(v2_6));
                    if (v3_7 == null) {
                        v4_0 = 0;
                    } else {
                        v4_0 = v3_7.a;
                    }
                    if (v4_0 != null) {
                        e.b v3_8 = v3_7.a;
                        kotlin.jvm.internal.j.c(v3_8, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (v0_5.d.remove(v2_6)) {
                            v3_8.onActivityResult(v1_6);
                        }
                    } else {
                        v0_5.g.remove(v2_6);
                        v0_5.f.put(v2_6, v1_6);
                    }
                }
                return;
            case 1:
                ((c.m) this.b).a(this.c, 0, new android.content.Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", ((android.content.IntentSender$SendIntentException) this.d)));
                return;
            case 2:
                ((i2.h) this.b).b.r(((android.view.ViewGroup) this.d), this.c);
                return;
            default:
                ((y1.b) ((u8.i) this.b).d).j(this.c, this.d);
                return;
        }
    }
}
