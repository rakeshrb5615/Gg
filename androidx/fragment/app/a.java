package androidx.fragment.app;
public final class a extends androidx.fragment.app.m1 implements androidx.fragment.app.z0 {
    public final androidx.fragment.app.b1 q;
    public boolean r;
    public int s;

    public a(androidx.fragment.app.b1 p2)
    {
        p2.E();
        int v0_0 = p2.t;
        if (v0_0 != 0) {
            v0_0.b.getClassLoader();
        }
        this.a = new java.util.ArrayList();
        this.h = 1;
        this.p = 0;
        this.s = -1;
        this.q = p2;
        return;
    }

    public final boolean a(java.util.ArrayList p3, java.util.ArrayList p4)
    {
        if (androidx.fragment.app.b1.H(2)) {
            String v0_3 = new StringBuilder("Run: ");
            v0_3.append(this);
            android.util.Log.v("FragmentManager", v0_3.toString());
        }
        p3.add(this);
        p4.add(Boolean.FALSE);
        if (this.g) {
            java.util.ArrayList v3_3 = this.q;
            if (v3_3.d == null) {
                v3_3.d = new java.util.ArrayList();
            }
            v3_3.d.add(this);
        }
        return 1;
    }

    public final void c(int p4, androidx.fragment.app.e0 p5, String p6, int p7)
    {
        String v0_0 = p5.mPreviousWho;
        if (v0_0 != null) {
            k1.c.c(p5, v0_0);
        }
        String v0_2 = p5.getClass();
        String v1_2 = v0_2.getModifiers();
        if ((v0_2.isAnonymousClass()) || ((!reflect.Modifier.isPublic(v1_2)) || ((v0_2.isMemberClass()) && (!reflect.Modifier.isStatic(v1_2))))) {
            int v5_2 = new StringBuilder("Fragment ");
            v5_2.append(v0_2.getCanonicalName());
            v5_2.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(v5_2.toString());
        } else {
            if (p6 != null) {
                String v2_2 = p5.mTag;
                if ((v2_2 != null) && (!p6.equals(v2_2))) {
                    StringBuilder v7_2 = new StringBuilder("Can\'t change tag of fragment ");
                    v7_2.append(p5);
                    v7_2.append(": was ");
                    throw new IllegalStateException(v1.a.o(v7_2, p5.mTag, " now ", p6));
                } else {
                    p5.mTag = p6;
                }
            }
            if (p4 != null) {
                if (p4 == -1) {
                    StringBuilder v7_4 = new StringBuilder("Can\'t add fragment ");
                    v7_4.append(p5);
                    v7_4.append(" with tag ");
                    v7_4.append(p6);
                    v7_4.append(" to container view with no id");
                    throw new IllegalArgumentException(v7_4.toString());
                } else {
                    IllegalStateException v6_4 = p5.mFragmentId;
                    if ((v6_4 != null) && (v6_4 != p4)) {
                        StringBuilder v7_6 = new StringBuilder("Can\'t change container ID of fragment ");
                        v7_6.append(p5);
                        v7_6.append(": was ");
                        v7_6.append(p5.mFragmentId);
                        v7_6.append(" now ");
                        v7_6.append(p4);
                        throw new IllegalStateException(v7_6.toString());
                    } else {
                        p5.mFragmentId = p4;
                        p5.mContainerId = p4;
                    }
                }
            }
            this.b(new androidx.fragment.app.l1(p5, p7));
            p5.mFragmentManager = this.q;
            return;
        }
    }

    public final void d(int p9)
    {
        java.util.ArrayList v0 = this.a;
        if (this.g) {
            if (androidx.fragment.app.b1.H(2)) {
                int v2_0 = new StringBuilder("Bump nesting in ");
                v2_0.append(this);
                v2_0.append(" by ");
                v2_0.append(p9);
                android.util.Log.v("FragmentManager", v2_0.toString());
            }
            int v2_2 = v0.size();
            int v4_1 = 0;
            while (v4_1 < v2_2) {
                String v5_1 = ((androidx.fragment.app.l1) v0.get(v4_1));
                StringBuilder v6_0 = v5_1.b;
                if (v6_0 != null) {
                    v6_0.mBackStackNesting = (v6_0.mBackStackNesting + p9);
                    if (androidx.fragment.app.b1.H(2)) {
                        StringBuilder v6_3 = new StringBuilder("Bump nesting of ");
                        v6_3.append(v5_1.b);
                        v6_3.append(" to ");
                        v6_3.append(v5_1.b.mBackStackNesting);
                        android.util.Log.v("FragmentManager", v6_3.toString());
                    }
                }
                v4_1++;
            }
        }
        return;
    }

    public final int e(boolean p4)
    {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        } else {
            if (androidx.fragment.app.b1.H(2)) {
                int v0_2 = new StringBuilder("Commit: ");
                v0_2.append(this);
                android.util.Log.v("FragmentManager", v0_2.toString());
                java.io.PrintWriter v2_3 = new java.io.PrintWriter(new androidx.fragment.app.w1());
                this.g("  ", v2_3, 1);
                v2_3.close();
            }
            this.r = 1;
            androidx.fragment.app.b1 v1_0 = this.q;
            if (!this.g) {
                this.s = -1;
            } else {
                this.s = v1_0.i.getAndIncrement();
            }
            v1_0.v(this, p4);
            return this.s;
        }
    }

    public final void f()
    {
        if (this.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        } else {
            this.h = 0;
            this.q.y(this, 0);
            return;
        }
    }

    public final void g(String p7, java.io.PrintWriter p8, boolean p9)
    {
        java.util.ArrayList v0 = this.a;
        if (p9) {
            p8.print(p7);
            p8.print("mName=");
            p8.print(this.i);
            p8.print(" mIndex=");
            p8.print(this.s);
            p8.print(" mCommitted=");
            p8.println(this.r);
            if (this.f != 0) {
                p8.print(p7);
                p8.print("mTransition=#");
                p8.print(Integer.toHexString(this.f));
            }
            if ((this.b != 0) || (this.c != 0)) {
                p8.print(p7);
                p8.print("mEnterAnim=#");
                p8.print(Integer.toHexString(this.b));
                p8.print(" mExitAnim=#");
                p8.println(Integer.toHexString(this.c));
            }
            if ((this.d != 0) || (this.e != 0)) {
                p8.print(p7);
                p8.print("mPopEnterAnim=#");
                p8.print(Integer.toHexString(this.d));
                p8.print(" mPopExitAnim=#");
                p8.println(Integer.toHexString(this.e));
            }
            if ((this.j != 0) || (this.k != null)) {
                p8.print(p7);
                p8.print("mBreadCrumbTitleRes=#");
                p8.print(Integer.toHexString(this.j));
                p8.print(" mBreadCrumbTitleText=");
                p8.println(this.k);
            }
            if ((this.l != 0) || (this.m != null)) {
                p8.print(p7);
                p8.print("mBreadCrumbShortTitleRes=#");
                p8.print(Integer.toHexString(this.l));
                p8.print(" mBreadCrumbShortTitleText=");
                p8.println(this.m);
            }
        }
        if (!v0.isEmpty()) {
            p8.print(p7);
            p8.println("Operations:");
            CharSequence v1_42 = v0.size();
            int v2 = 0;
            while (v2 < v1_42) {
                String v4_1;
                String v3_1 = ((androidx.fragment.app.l1) v0.get(v2));
                switch (v3_1.a) {
                    case 0:
                        v4_1 = "NULL";
                        break;
                    case 1:
                        v4_1 = "ADD";
                        break;
                    case 2:
                        v4_1 = "REPLACE";
                        break;
                    case 3:
                        v4_1 = "REMOVE";
                        break;
                    case 4:
                        v4_1 = "HIDE";
                        break;
                    case 5:
                        v4_1 = "SHOW";
                        break;
                    case 6:
                        v4_1 = "DETACH";
                        break;
                    case 7:
                        v4_1 = "ATTACH";
                        break;
                    case 8:
                        v4_1 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        v4_1 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        v4_1 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        String v4_3 = new StringBuilder("cmd=");
                        v4_3.append(v3_1.a);
                        v4_1 = v4_3.toString();
                }
                p8.print(p7);
                p8.print("  Op #");
                p8.print(v2);
                p8.print(": ");
                p8.print(v4_1);
                p8.print(" ");
                p8.println(v3_1.b);
                if (p9) {
                    if ((v3_1.d != 0) || (v3_1.e != 0)) {
                        p8.print(p7);
                        p8.print("enterAnim=#");
                        p8.print(Integer.toHexString(v3_1.d));
                        p8.print(" exitAnim=#");
                        p8.println(Integer.toHexString(v3_1.e));
                    }
                    if ((v3_1.f != 0) || (v3_1.g != 0)) {
                        p8.print(p7);
                        p8.print("popEnterAnim=#");
                        p8.print(Integer.toHexString(v3_1.f));
                        p8.print(" popExitAnim=#");
                        p8.println(Integer.toHexString(v3_1.g));
                    }
                }
                v2++;
            }
        }
        return;
    }

    public final androidx.fragment.app.a h(androidx.fragment.app.e0 p4)
    {
        IllegalStateException v0_0 = p4.mFragmentManager;
        if ((v0_0 != null) && (v0_0 != this.q)) {
            StringBuilder v1_3 = new StringBuilder("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            v1_3.append(p4.toString());
            v1_3.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(v1_3.toString());
        } else {
            this.b(new androidx.fragment.app.l1(p4, 4));
            return this;
        }
    }

    public final androidx.fragment.app.a i(androidx.fragment.app.e0 p4)
    {
        IllegalStateException v0_0 = p4.mFragmentManager;
        if ((v0_0 != null) && (v0_0 != this.q)) {
            StringBuilder v1_3 = new StringBuilder("Cannot show Fragment attached to a different FragmentManager. Fragment ");
            v1_3.append(p4.toString());
            v1_3.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(v1_3.toString());
        } else {
            this.b(new androidx.fragment.app.l1(p4, 5));
            return this;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder(128);
        v0_1.append("BackStackEntry{");
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            v0_1.append(" #");
            v0_1.append(this.s);
        }
        if (this.i != null) {
            v0_1.append(" ");
            v0_1.append(this.i);
        }
        v0_1.append("}");
        return v0_1.toString();
    }
}
