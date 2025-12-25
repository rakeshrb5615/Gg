package d0;
public abstract class g extends android.app.Activity implements androidx.lifecycle.u, q0.k {
    private final r.j extraDataMap;
    private final androidx.lifecycle.w lifecycleRegistry;

    public g()
    {
        this.extraDataMap = new r.j(0);
        this.lifecycleRegistry = new androidx.lifecycle.w(this);
        return;
    }

    public boolean dispatchKeyEvent(android.view.KeyEvent p3)
    {
        kotlin.jvm.internal.j.e(p3, "event");
        android.view.View v0_2 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v0_2, "window.decorView");
        if (!q4.b.n(v0_2, p3)) {
            return q4.b.o(this, v0_2, this, p3);
        } else {
            return 1;
        }
    }

    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p3)
    {
        kotlin.jvm.internal.j.e(p3, "event");
        boolean v0_2 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v0_2, "window.decorView");
        if (!q4.b.n(v0_2, p3)) {
            return super.dispatchKeyShortcutEvent(p3);
        } else {
            return 1;
        }
    }

    public d0.f getExtraData(Class p2)
    {
        kotlin.jvm.internal.j.e(p2, "extraDataClass");
        if (this.extraDataMap.get(p2) != null) {
            throw new ClassCastException();
        } else {
            return 0;
        }
    }

    public androidx.lifecycle.p getLifecycle()
    {
        return this.lifecycleRegistry;
    }

    public void onCreate(android.os.Bundle p1)
    {
        super.onCreate(p1);
        androidx.lifecycle.k0.b(this);
        return;
    }

    public void onSaveInstanceState(android.os.Bundle p3)
    {
        kotlin.jvm.internal.j.e(p3, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(p3);
        return;
    }

    public void putExtraData(d0.f p2)
    {
        kotlin.jvm.internal.j.e(p2, "extraData");
        throw 0;
    }

    public final boolean shouldDumpInternalState(String[] p4)
    {
        int v1 = 0;
        if ((p4 != 0) && (p4.length != 0)) {
            int v4_10 = p4[0];
            switch (v4_10.hashCode()) {
                case -645125871:
                    if ((v4_10.equals("--translation")) && (android.os.Build$VERSION.SDK_INT >= 31)) {
                    }
                    break;
                case 100470631:
                    if (v4_10.equals("--dump-dumpable")) {
                        if (android.os.Build$VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (v4_10.equals("--list-dumpables")) {
                    }
                    break;
                case 1159329357:
                    if ((v4_10.equals("--contentcapture")) && (android.os.Build$VERSION.SDK_INT >= 29)) {
                    }
                    break;
                case 1455016274:
                    if (v4_10.equals("--autofill")) {
                    }
                    break;
                default:
            }
            v1 = 1;
        }
        return (v1 ^ 1);
    }

    public boolean superDispatchKeyEvent(android.view.KeyEvent p2)
    {
        kotlin.jvm.internal.j.e(p2, "event");
        return super.dispatchKeyEvent(p2);
    }

    public android.content.Context zza()
    {
        return this.getApplicationContext();
    }
}
