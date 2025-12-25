package q0;
public final class z0 extends android.view.WindowInsetsAnimation$Callback {
    public final h3.k a;
    public java.util.List b;
    public java.util.ArrayList c;
    public final java.util.HashMap d;

    public z0(h3.k p2)
    {
        super(0);
        super.d = new java.util.HashMap();
        super.a = p2;
        return;
    }

    public final q0.c1 a(android.view.WindowInsetsAnimation p6)
    {
        q0.c1 v0_2 = ((q0.c1) this.d.get(p6));
        if (v0_2 == null) {
            v0_2 = new q0.c1(0, 0, 0);
            if (android.os.Build$VERSION.SDK_INT >= 30) {
                v0_2.a = new q0.a1(p6);
            }
            this.d.put(p6, v0_2);
        }
        return v0_2;
    }

    public final void onEnd(android.view.WindowInsetsAnimation p3)
    {
        this.a(p3);
        ((android.view.View) this.a.d).setTranslationY(0);
        this.d.remove(p3);
        return;
    }

    public final void onPrepare(android.view.WindowInsetsAnimation p3)
    {
        this.a(p3);
        h3.k v3_1 = this.a;
        int[] v1_1 = ((int[]) v3_1.e);
        ((android.view.View) v3_1.d).getLocationOnScreen(v1_1);
        v3_1.a = v1_1[1];
        return;
    }

    public final android.view.WindowInsets onProgress(android.view.WindowInsets p5, java.util.List p6)
    {
        h3.k v0_0 = this.c;
        if (v0_0 != null) {
            v0_0.clear();
        } else {
            h3.k v0_5 = new java.util.ArrayList(p6.size());
            this.c = v0_5;
            this.b = java.util.Collections.unmodifiableList(v0_5);
        }
        h3.k v0_2 = (p6.size() - 1);
        while (v0_2 >= null) {
            java.util.ArrayList v1_1 = ((android.view.WindowInsetsAnimation) p6.get(v0_2));
            q0.c1 v2 = this.a(v1_1);
            v2.a.d(v1_1.getFraction());
            this.c.add(v2);
            v0_2--;
        }
        android.view.WindowInsets v5_1 = q0.s1.g(0, p5);
        this.a.e(v5_1, this.b);
        return v5_1.f();
    }

    public final android.view.WindowInsetsAnimation$Bounds onStart(android.view.WindowInsetsAnimation p5, android.view.WindowInsetsAnimation$Bounds p6)
    {
        this.a(p5);
        android.view.WindowInsetsAnimation$Bounds v5_1 = q0.a1.f(p6);
        android.graphics.Insets v6_2 = q0.a1.e(p6);
        float v0_1 = this.a;
        android.view.View v1_1 = ((android.view.View) v0_1.d);
        int v2_2 = ((int[]) v0_1.e);
        v1_1.getLocationOnScreen(v2_2);
        int v3_2 = (v0_1.a - v2_2[1]);
        v0_1.b = v3_2;
        v1_1.setTranslationY(((float) v3_2));
        q0.y0.c();
        return q0.y0.a(v5_1.d(), v6_2.d());
    }
}
