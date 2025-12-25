package a2;
public abstract class k1 {
    public static final java.util.List t;
    public final android.view.View a;
    public ref.WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public a2.k1 h;
    public a2.k1 i;
    public int j;
    public final java.util.ArrayList k;
    public final java.util.List l;
    public int m;
    public a2.z0 n;
    public boolean o;
    public int p;
    public int q;
    public androidx.recyclerview.widget.RecyclerView r;
    public a2.i0 s;

    static k1()
    {
        a2.k1.t = java.util.Collections.EMPTY_LIST;
        return;
    }

    public k1(android.view.View p4)
    {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = -1;
        if (p4 == null) {
            throw new IllegalArgumentException("itemView may not be null");
        } else {
            this.a = p4;
            return;
        }
    }

    public final void a(int p2)
    {
        this.j = (p2 | this.j);
        return;
    }

    public final int b()
    {
        int v0 = this.g;
        if (v0 == -1) {
            v0 = this.c;
        }
        return v0;
    }

    public final java.util.List c()
    {
        if ((this.j & 1024) == 0) {
            java.util.List v0_3 = this.k;
            if ((v0_3 != null) && (v0_3.size() != 0)) {
                return this.l;
            }
        }
        return a2.k1.t;
    }

    public final boolean d()
    {
        int v0_0 = this.a;
        if ((v0_0.getParent() == null) || (v0_0.getParent() == this.r)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean e()
    {
        if ((this.j & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean f()
    {
        if ((this.j & 4) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean g()
    {
        if (((this.j & 16) != 0) || (this.a.hasTransientState())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean h()
    {
        if ((this.j & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean i()
    {
        if (this.n == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean j()
    {
        if ((this.j & 256) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean k()
    {
        if ((this.j & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void l(int p3, boolean p4)
    {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (p4 != 0) {
            this.g = (this.g + p3);
        }
        this.c = (this.c + p3);
        a2.u0 v3_1 = this.a;
        if (v3_1.getLayoutParams() != null) {
            ((a2.u0) v3_1.getLayoutParams()).c = 1;
        }
        return;
    }

    public final void m()
    {
        if ((androidx.recyclerview.widget.RecyclerView.F0) && (this.j())) {
            String v1_3 = new StringBuilder("Attempting to reset temp-detached ViewHolder: ");
            v1_3.append(this);
            v1_3.append(". ViewHolders should be fully detached before resetting.");
            throw new IllegalStateException(v1_3.toString());
        } else {
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1;
            this.g = -1;
            this.m = 0;
            this.h = 0;
            this.i = 0;
            int v2_3 = this.k;
            if (v2_3 != 0) {
                v2_3.clear();
            }
            this.j = (this.j & -1025);
            this.p = 0;
            this.q = -1;
            androidx.recyclerview.widget.RecyclerView.l(this);
            return;
        }
    }

    public final void n(boolean p3)
    {
        String v1_2;
        String v1_0 = this.m;
        if (p3 == null) {
            v1_2 = (v1_0 + 1);
        } else {
            v1_2 = (v1_0 - 1);
        }
        this.m = v1_2;
        if (v1_2 >= null) {
            if ((p3 != null) || (v1_2 != 1)) {
                if ((p3 != null) && (v1_2 == null)) {
                    this.j = (this.j & -17);
                }
            } else {
                this.j = (this.j | 16);
            }
        } else {
            this.m = 0;
            if (androidx.recyclerview.widget.RecyclerView.F0) {
                int v0_8 = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                v0_8.append(this);
                throw new RuntimeException(v0_8.toString());
            } else {
                int v0_11 = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                v0_11.append(this);
                android.util.Log.e("View", v0_11.toString());
            }
        }
        if (androidx.recyclerview.widget.RecyclerView.G0) {
            int v0_15 = new StringBuilder("setIsRecyclable val:");
            v0_15.append(p3);
            v0_15.append(":");
            v0_15.append(this);
            android.util.Log.d("RecyclerView", v0_15.toString());
        }
        return;
    }

    public final boolean o()
    {
        if ((this.j & 128) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean p()
    {
        if ((this.j & 32) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String toString()
    {
        String v0_36;
        if (!this.getClass().isAnonymousClass()) {
            v0_36 = this.getClass().getSimpleName();
        } else {
            v0_36 = "ViewHolder";
        }
        String v2_1 = new StringBuilder();
        v2_1.append(v0_36);
        v2_1.append("{");
        v2_1.append(Integer.toHexString(this.hashCode()));
        v2_1.append(" position=");
        v2_1.append(this.c);
        v2_1.append(" id=");
        v2_1.append(this.e);
        v2_1.append(", oldPos=");
        v2_1.append(this.d);
        v2_1.append(", pLpos:");
        v2_1.append(this.g);
        StringBuilder v1_1 = new StringBuilder(v2_1.toString());
        if (this.i()) {
            String v0_21;
            v1_1.append(" scrap ");
            if (!this.o) {
                v0_21 = "[attachedScrap]";
            } else {
                v0_21 = "[changeScrap]";
            }
            v1_1.append(v0_21);
        }
        if (this.f()) {
            v1_1.append(" invalid");
        }
        if (!this.e()) {
            v1_1.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            v1_1.append(" update");
        }
        if (this.h()) {
            v1_1.append(" removed");
        }
        if (this.o()) {
            v1_1.append(" ignored");
        }
        if (this.j()) {
            v1_1.append(" tmpDetached");
        }
        if (!this.g()) {
            String v0_39 = new StringBuilder(" not recyclable(");
            v0_39.append(this.m);
            v0_39.append(")");
            v1_1.append(v0_39.toString());
        }
        if (((this.j & 512) != 0) || (this.f())) {
            v1_1.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            v1_1.append(" no parent");
        }
        v1_1.append("}");
        return v1_1.toString();
    }
}
