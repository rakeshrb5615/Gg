package androidx.emoji2.text;
public class EmojiCompatInitializer implements d2.b {

    public EmojiCompatInitializer()
    {
        return;
    }

    public final java.util.List a()
    {
        return java.util.Collections.singletonList(androidx.lifecycle.ProcessLifecycleInitializer);
    }

    public final Object b(android.content.Context p4)
    {
        g1.j v0_4 = new g1.q(new c4.f(p4, 1));
        v0_4.a = 1;
        if (g1.i.k == null) {
            if (g1.i.k == null) {
                g1.i.k = new g1.i(v0_4);
            }
        }
        Boolean v4_2 = d2.a.c(p4);
        v4_2.getClass();
        androidx.lifecycle.u v2_5 = v4_2.a.get(androidx.lifecycle.ProcessLifecycleInitializer);
        if (v2_5 == null) {
            v2_5 = v4_2.b(androidx.lifecycle.ProcessLifecycleInitializer, new java.util.HashSet());
        }
        Boolean v4_4 = ((androidx.lifecycle.u) v2_5).getLifecycle();
        v4_4.a(new g1.j(this, v4_4));
        return Boolean.TRUE;
    }
}
