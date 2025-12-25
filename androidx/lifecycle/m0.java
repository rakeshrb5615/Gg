package androidx.lifecycle;
public class m0 extends android.app.Fragment {
    public static final synthetic int b;
    public androidx.lifecycle.z0 a;

    public m0()
    {
        return;
    }

    public final void a(androidx.lifecycle.n p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 29) {
            android.app.Activity v0_1 = this.getActivity();
            kotlin.jvm.internal.j.d(v0_1, "getActivity(...)");
            androidx.lifecycle.k0.a(v0_1, p3);
        }
        return;
    }

    public final void onActivityCreated(android.os.Bundle p1)
    {
        super.onActivityCreated(p1);
        this.a(androidx.lifecycle.n.ON_CREATE);
        return;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        this.a(androidx.lifecycle.n.ON_DESTROY);
        this.a = 0;
        return;
    }

    public final void onPause()
    {
        super.onPause();
        this.a(androidx.lifecycle.n.ON_PAUSE);
        return;
    }

    public final void onResume()
    {
        super.onResume();
        androidx.lifecycle.n v0_0 = this.a;
        if (v0_0 != null) {
            ((androidx.lifecycle.j0) v0_0.a).a();
        }
        this.a(androidx.lifecycle.n.ON_RESUME);
        return;
    }

    public final void onStart()
    {
        super.onStart();
        androidx.lifecycle.n v0_0 = this.a;
        if (v0_0 != null) {
            androidx.lifecycle.n v0_3 = ((androidx.lifecycle.j0) v0_0.a);
            int v1_4 = (v0_3.a + 1);
            v0_3.a = v1_4;
            if ((v1_4 == 1) && (v0_3.d)) {
                v0_3.f.e(androidx.lifecycle.n.ON_START);
                v0_3.d = 0;
            }
        }
        this.a(androidx.lifecycle.n.ON_START);
        return;
    }

    public final void onStop()
    {
        super.onStop();
        this.a(androidx.lifecycle.n.ON_STOP);
        return;
    }
}
