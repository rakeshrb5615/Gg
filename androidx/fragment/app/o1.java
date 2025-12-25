package androidx.fragment.app;
public final class o1 extends android.transition.Transition$EpicenterCallback {
    public final synthetic int a;
    public final synthetic android.graphics.Rect b;

    public synthetic o1(int p1, android.graphics.Rect p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final android.graphics.Rect onGetEpicenter(android.transition.Transition p2)
    {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                int v2_2 = this.b;
                if ((v2_2 == 0) || (v2_2.isEmpty())) {
                    v2_2 = 0;
                }
                return v2_2;
        }
    }
}
