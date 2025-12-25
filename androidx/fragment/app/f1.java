package androidx.fragment.app;
public final class f1 extends androidx.lifecycle.v0 {
    public static final androidx.fragment.app.e1 h;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public final java.util.HashMap d;
    public final boolean e;
    public boolean f;
    public boolean g;

    static f1()
    {
        androidx.fragment.app.f1.h = new androidx.fragment.app.e1(0);
        return;
    }

    public f1(boolean p2)
    {
        this.b = new java.util.HashMap();
        this.c = new java.util.HashMap();
        this.d = new java.util.HashMap();
        this.f = 0;
        this.g = 0;
        this.e = p2;
        return;
    }

    public final void b()
    {
        if (androidx.fragment.app.b1.H(3)) {
            int v0_4 = new StringBuilder("onCleared called for ");
            v0_4.append(this);
            android.util.Log.d("FragmentManager", v0_4.toString());
        }
        this.f = 1;
        return;
    }

    public final void c(androidx.fragment.app.e0 p5)
    {
        if (!this.g) {
            java.util.HashMap v3 = this.b;
            if (!v3.containsKey(p5.mWho)) {
                v3.put(p5.mWho, p5);
                if (androidx.fragment.app.b1.H(2)) {
                    StringBuilder v0_3 = new StringBuilder("Updating retained Fragments: Added ");
                    v0_3.append(p5);
                    android.util.Log.v("FragmentManager", v0_3.toString());
                }
            }
        } else {
            if (androidx.fragment.app.b1.H(2)) {
                android.util.Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
        }
        return;
    }

    public final void d(androidx.fragment.app.e0 p3, boolean p4)
    {
        if (androidx.fragment.app.b1.H(3)) {
            String v0_3 = new StringBuilder("Clearing non-config state for ");
            v0_3.append(p3);
            android.util.Log.d("FragmentManager", v0_3.toString());
        }
        this.f(p3.mWho, p4);
        return;
    }

    public final void e(String p3, boolean p4)
    {
        if (androidx.fragment.app.b1.H(3)) {
            String v0_3 = new StringBuilder("Clearing non-config state for saved state of Fragment ");
            v0_3.append(p3);
            android.util.Log.d("FragmentManager", v0_3.toString());
        }
        this.f(p3, p4);
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((!p5) || ((androidx.fragment.app.f1 != p5.getClass()) || ((!this.b.equals(((androidx.fragment.app.f1) p5).b)) || ((!this.c.equals(((androidx.fragment.app.f1) p5).c)) || (!this.d.equals(((androidx.fragment.app.f1) p5).d)))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final void f(String p7, boolean p8)
    {
        androidx.lifecycle.a1 v0_0 = this.c;
        androidx.fragment.app.f1 v1_1 = ((androidx.fragment.app.f1) v0_0.get(p7));
        if (v1_1 != null) {
            if (p8 != null) {
                java.util.ArrayList v8_3 = new java.util.ArrayList();
                v8_3.addAll(v1_1.c.keySet());
                int v2_1 = v8_3.size();
                int v3 = 0;
                while (v3 < v2_1) {
                    String v4_0 = v8_3.get(v3);
                    v3++;
                    v1_1.e(((String) v4_0), 1);
                }
            }
            v1_1.b();
            v0_0.remove(p7);
        }
        java.util.ArrayList v8_1 = this.d;
        androidx.lifecycle.a1 v0_2 = ((androidx.lifecycle.a1) v8_1.get(p7));
        if (v0_2 != null) {
            v0_2.a();
            v8_1.remove(p7);
        }
        return;
    }

    public final void g(androidx.fragment.app.e0 p5)
    {
        if (!this.g) {
            if ((this.b.remove(p5.mWho) != null) && (androidx.fragment.app.b1.H(2))) {
                StringBuilder v0_3 = new StringBuilder("Updating retained Fragments: Removed ");
                v0_3.append(p5);
                android.util.Log.v("FragmentManager", v0_3.toString());
            }
        } else {
            if (androidx.fragment.app.b1.H(2)) {
                android.util.Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
        }
        return;
    }

    public final int hashCode()
    {
        return (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("FragmentManagerViewModel{");
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        v0_1.append("} Fragments (");
        int v1_3 = this.b.values().iterator();
        while (v1_3.hasNext()) {
            v0_1.append(v1_3.next());
            if (v1_3.hasNext()) {
                v0_1.append(", ");
            }
        }
        v0_1.append(") Child Non Config (");
        int v1_7 = this.c.keySet().iterator();
        while (v1_7.hasNext()) {
            v0_1.append(((String) v1_7.next()));
            if (v1_7.hasNext()) {
                v0_1.append(", ");
            }
        }
        v0_1.append(") ViewModelStores (");
        int v1_11 = this.d.keySet().iterator();
        while (v1_11.hasNext()) {
            v0_1.append(((String) v1_11.next()));
            if (v1_11.hasNext()) {
                v0_1.append(", ");
            }
        }
        v0_1.append(41);
        return v0_1.toString();
    }
}
