package d0;
public final class b implements android.app.Application$ActivityLifecycleCallbacks {
    public Object a;
    public android.app.Activity b;
    public final int c;
    public boolean d;
    public boolean e;
    public boolean f;

    public b(android.app.Activity p2)
    {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.b = p2;
        this.c = p2.hashCode();
        return;
    }

    public final void onActivityCreated(android.app.Activity p1, android.os.Bundle p2)
    {
        return;
    }

    public final void onActivityDestroyed(android.app.Activity p2)
    {
        if (this.b == p2) {
            this.b = 0;
            this.e = 1;
        }
        return;
    }

    public final void onActivityPaused(android.app.Activity p5)
    {
        if ((this.e) && ((!this.f) && (!this.d))) {
            android.os.Handler v0_7 = this.a;
            try {
                String v1_2 = d0.c.c.get(p5);
            } catch (int v5_4) {
                android.util.Log.e("ActivityRecreator", "Exception while fetching field values", v5_4);
            }
            if ((v1_2 == v0_7) && (p5.hashCode() == this.c)) {
                d0.c.g.postAtFrontOfQueue(new b5.l(3, d0.c.b.get(p5), v1_2));
                this.f = 1;
                this.a = 0;
                return;
            }
        }
        return;
    }

    public final void onActivityResumed(android.app.Activity p1)
    {
        return;
    }

    public final void onActivitySaveInstanceState(android.app.Activity p1, android.os.Bundle p2)
    {
        return;
    }

    public final void onActivityStarted(android.app.Activity p2)
    {
        if (this.b == p2) {
            this.d = 1;
        }
        return;
    }

    public final void onActivityStopped(android.app.Activity p1)
    {
        return;
    }
}
