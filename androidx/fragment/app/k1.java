package androidx.fragment.app;
public final class k1 {
    public final java.util.ArrayList a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public androidx.fragment.app.f1 d;

    public k1()
    {
        this.a = new java.util.ArrayList();
        this.b = new java.util.HashMap();
        this.c = new java.util.HashMap();
        return;
    }

    public final void a(androidx.fragment.app.e0 p4)
    {
        if (this.a.contains(p4)) {
            java.util.ArrayList v1_2 = new StringBuilder("Fragment already added: ");
            v1_2.append(p4);
            throw new IllegalStateException(v1_2.toString());
        } else {
            this.a.add(p4);
            p4.mAdded = 1;
            return;
        }
    }

    public final androidx.fragment.app.e0 b(String p2)
    {
        int v2_2 = ((androidx.fragment.app.j1) this.b.get(p2));
        if (v2_2 == 0) {
            return 0;
        } else {
            return v2_2.c;
        }
    }

    public final androidx.fragment.app.e0 c(String p3)
    {
        java.util.Iterator v0_2 = this.b.values().iterator();
        while (v0_2.hasNext()) {
            androidx.fragment.app.e0 v1_1 = ((androidx.fragment.app.j1) v0_2.next());
            if (v1_1 != null) {
                androidx.fragment.app.e0 v1_3 = v1_1.c.findFragmentByWho(p3);
                if (v1_3 != null) {
                    return v1_3;
                }
            }
        }
        return 0;
    }

    public final java.util.ArrayList d()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        java.util.Iterator v1_2 = this.b.values().iterator();
        while (v1_2.hasNext()) {
            androidx.fragment.app.j1 v2_1 = ((androidx.fragment.app.j1) v1_2.next());
            if (v2_1 != null) {
                v0_1.add(v2_1);
            }
        }
        return v0_1;
    }

    public final java.util.ArrayList e()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        java.util.Iterator v1_2 = this.b.values().iterator();
        while (v1_2.hasNext()) {
            int v2_1 = ((androidx.fragment.app.j1) v1_2.next());
            if (v2_1 == 0) {
                v0_1.add(0);
            } else {
                v0_1.add(v2_1.c);
            }
        }
        return v0_1;
    }

    public final java.util.List f()
    {
        if (!this.a.isEmpty()) {
            try {
                return new java.util.ArrayList(this.a);
            } catch (Throwable v1_2) {
                throw v1_2;
            }
        } else {
            return java.util.Collections.EMPTY_LIST;
        }
    }

    public final void g(androidx.fragment.app.j1 p4)
    {
        String v0_0 = p4.c;
        java.util.HashMap v2 = this.b;
        if (v2.get(v0_0.mWho) == null) {
            v2.put(v0_0.mWho, p4);
            if (v0_0.mRetainInstanceChangedWhileDetached) {
                if (!v0_0.mRetainInstance) {
                    this.d.g(v0_0);
                } else {
                    this.d.c(v0_0);
                }
                v0_0.mRetainInstanceChangedWhileDetached = 0;
            }
            if (androidx.fragment.app.b1.H(2)) {
                int v4_8 = new StringBuilder("Added fragment to active set ");
                v4_8.append(v0_0);
                android.util.Log.v("FragmentManager", v4_8.toString());
            }
            return;
        } else {
            return;
        }
    }

    public final void h(androidx.fragment.app.j1 p4)
    {
        String v0_0 = p4.c;
        if (v0_0.mRetainInstance) {
            this.d.g(v0_0);
        }
        java.util.HashMap v2 = this.b;
        if ((v2.get(v0_0.mWho) == p4) && ((((androidx.fragment.app.j1) v2.put(v0_0.mWho, 0)) != null) && (androidx.fragment.app.b1.H(2)))) {
            String v4_7 = new StringBuilder("Removed fragment from active set ");
            v4_7.append(v0_0);
            android.util.Log.v("FragmentManager", v4_7.toString());
        }
        return;
    }

    public final android.os.Bundle i(android.os.Bundle p2, String p3)
    {
        java.util.HashMap v0 = this.c;
        if (p2 == null) {
            return ((android.os.Bundle) v0.remove(p3));
        } else {
            return ((android.os.Bundle) v0.put(p3, p2));
        }
    }
}
