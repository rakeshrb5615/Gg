package androidx.fragment.app;
public final class j1 {
    public final androidx.fragment.app.k0 a;
    public final androidx.fragment.app.k1 b;
    public final androidx.fragment.app.e0 c;
    public boolean d;
    public int e;

    public j1(androidx.fragment.app.k0 p2, androidx.fragment.app.k1 p3, androidx.fragment.app.e0 p4)
    {
        this.d = 0;
        this.e = -1;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        return;
    }

    public j1(androidx.fragment.app.k0 p3, androidx.fragment.app.k1 p4, androidx.fragment.app.e0 p5, android.os.Bundle p6)
    {
        int v4_2;
        this.d = 0;
        this.e = -1;
        this.a = p3;
        this.b = p4;
        this.c = p5;
        p5.mSavedViewState = 0;
        p5.mSavedViewRegistryState = 0;
        p5.mBackStackNesting = 0;
        p5.mInLayout = 0;
        p5.mAdded = 0;
        int v4_1 = p5.mTarget;
        if (v4_1 == 0) {
            v4_2 = 0;
        } else {
            v4_2 = v4_1.mWho;
        }
        p5.mTargetWho = v4_2;
        p5.mTarget = 0;
        p5.mSavedFragmentState = p6;
        p5.mArguments = p6.getBundle("arguments");
        return;
    }

    public j1(androidx.fragment.app.k0 p2, androidx.fragment.app.k1 p3, ClassLoader p4, androidx.fragment.app.v0 p5, android.os.Bundle p6)
    {
        this.d = 0;
        this.e = -1;
        this.a = p2;
        this.b = p3;
        String v2_1 = ((androidx.fragment.app.h1) p6.getParcelable("state"));
        String v3_2 = androidx.fragment.app.e0.instantiate(p5.a.t.b, v2_1.a, 0);
        v3_2.mWho = v2_1.b;
        v3_2.mFromLayout = v2_1.c;
        v3_2.mRestored = 1;
        v3_2.mFragmentId = v2_1.d;
        v3_2.mContainerId = v2_1.e;
        v3_2.mTag = v2_1.f;
        v3_2.mRetainInstance = v2_1.m;
        v3_2.mRemoving = v2_1.n;
        v3_2.mDetached = v2_1.o;
        v3_2.mHidden = v2_1.p;
        v3_2.mMaxState = androidx.lifecycle.o.values()[v2_1.q];
        v3_2.mTargetWho = v2_1.r;
        v3_2.mTargetRequestCode = v2_1.s;
        v3_2.mUserVisibleHint = v2_1.t;
        this.c = v3_2;
        v3_2.mSavedFragmentState = p6;
        String v2_4 = p6.getBundle("arguments");
        if (v2_4 != null) {
            v2_4.setClassLoader(p4);
        }
        v3_2.setArguments(v2_4);
        if (androidx.fragment.app.b1.H(2)) {
            String v2_8 = new StringBuilder("Instantiated fragment ");
            v2_8.append(v3_2);
            android.util.Log.v("FragmentManager", v2_8.toString());
        }
        return;
    }

    public final void a()
    {
        int v1_1 = this.c;
        if (androidx.fragment.app.b1.H(3)) {
            androidx.fragment.app.k0 v0_7 = new StringBuilder("moveto ACTIVITY_CREATED: ");
            v0_7.append(v1_1);
            android.util.Log.d("FragmentManager", v0_7.toString());
        }
        androidx.fragment.app.k0 v0_3;
        androidx.fragment.app.k0 v0_2 = v1_1.mSavedFragmentState;
        if (v0_2 == null) {
            v0_3 = 0;
        } else {
            v0_3 = v0_2.getBundle("savedInstanceState");
        }
        v1_1.performActivityCreated(v0_3);
        this.a.a(0);
        return;
    }

    public final void b()
    {
        android.view.View v0_0 = this.c;
        int v1_0 = v0_0.mContainer;
        while(true) {
            k1.a v2_0 = 0;
            if (v1_0 != 0) {
                int v3_0;
                int v3_6 = v1_0.getTag(2131362085);
                if (!(v3_6 instanceof androidx.fragment.app.e0)) {
                    v3_0 = 0;
                } else {
                    v3_0 = ((androidx.fragment.app.e0) v3_6);
                }
                if (v3_0 != 0) {
                    break;
                }
                int v1_1 = v1_0.getParent();
                if (!(v1_1 instanceof android.view.View)) {
                    v1_0 = 0;
                } else {
                    v1_0 = ((android.view.View) v1_1);
                }
            }
            int v1_2 = v0_0.getParentFragment();
            if ((v2_0 != null) && (!v2_0.equals(v1_2))) {
                int v1_4 = v0_0.mContainerId;
                int v4_1 = new StringBuilder("Attempting to nest fragment ");
                v4_1.append(v0_0);
                v4_1.append(" within the view of parent fragment ");
                v4_1.append(v2_0);
                v4_1.append(" via container with ID ");
                v4_1.append(v1_4);
                v4_1.append(" without using parent\'s childFragmentManager");
                k1.c.b(new k1.a(v0_0, v4_1.toString()));
                k1.c.a(v0_0).getClass();
            }
            int v1_9 = this.b.a;
            k1.a v2_2 = v0_0.mContainer;
            int v3_5 = -1;
            if (v2_2 != null) {
                int v4_2 = v1_9.indexOf(v0_0);
                android.view.View v5_2 = (v4_2 - 1);
                while (v5_2 >= null) {
                    android.view.ViewGroup v6_2 = ((androidx.fragment.app.e0) v1_9.get(v5_2));
                    if (v6_2.mContainer == v2_2) {
                        android.view.ViewGroup v6_3 = v6_2.mView;
                        if (v6_3 != null) {
                            v3_5 = (v2_2.indexOfChild(v6_3) + 1);
                            v0_0.mContainer.addView(v0_0.mView, v3_5);
                            return;
                        }
                    }
                    v5_2--;
                }
                do {
                    v4_2++;
                    if (v4_2 < v1_9.size()) {
                        android.view.View v5_5 = ((androidx.fragment.app.e0) v1_9.get(v4_2));
                        if (v5_5.mContainer == v2_2) {
                            android.view.View v5_6 = v5_5.mView;
                        }
                    }
                } while(v5_6 == null);
                v3_5 = v2_2.indexOfChild(v5_6);
            }
            v0_0.mContainer.addView(v0_0.mView, v3_5);
            return;
        }
        v2_0 = v3_0;
    }

    public final void c()
    {
        String v1_0 = this.c;
        if (androidx.fragment.app.b1.H(3)) {
            androidx.fragment.app.k0 v0_17 = new StringBuilder("moveto ATTACHED: ");
            v0_17.append(v1_0);
            android.util.Log.d("FragmentManager", v0_17.toString());
        }
        androidx.fragment.app.k0 v0_2 = v1_0.mTarget;
        int v2_1 = 0;
        java.util.HashMap v6_0 = this.b;
        if (v0_2 == null) {
            androidx.fragment.app.k0 v0_4 = v1_0.mTargetWho;
            if (v0_4 != null) {
                v2_1 = ((androidx.fragment.app.j1) v6_0.b.get(v0_4));
                if (v2_1 == 0) {
                    int v2_5 = new StringBuilder("Fragment ");
                    v2_5.append(v1_0);
                    v2_5.append(" declared target fragment ");
                    throw new IllegalStateException(v1.a.n(v2_5, v1_0.mTargetWho, " that does not belong to this FragmentManager!"));
                }
            }
        } else {
            androidx.fragment.app.k0 v0_10 = ((androidx.fragment.app.j1) v6_0.b.get(v0_2.mWho));
            if (v0_10 == null) {
                int v2_7 = new StringBuilder("Fragment ");
                v2_7.append(v1_0);
                v2_7.append(" declared target fragment ");
                v2_7.append(v1_0.mTarget);
                v2_7.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(v2_7.toString());
            } else {
                v1_0.mTargetWho = v1_0.mTarget.mWho;
                v1_0.mTarget = 0;
                v2_1 = v0_10;
            }
        }
        if (v2_1 != 0) {
            v2_1.k();
        }
        androidx.fragment.app.k0 v0_14 = v1_0.mFragmentManager;
        v1_0.mHost = v0_14.t;
        v1_0.mParentFragment = v0_14.v;
        androidx.fragment.app.k0 v0_16 = this.a;
        v0_16.g(0);
        v1_0.performAttach();
        v0_16.b(0);
        return;
    }

    public final int d()
    {
        String v1_0 = this.c;
        if (v1_0.mFragmentManager != null) {
            int v2_0 = this.e;
            int v3_19 = v1_0.mMaxState.ordinal();
            if (v3_19 == 1) {
                v2_0 = Math.min(v2_0, 0);
            } else {
                if (v3_19 == 2) {
                    v2_0 = Math.min(v2_0, 1);
                } else {
                    if (v3_19 == 3) {
                        v2_0 = Math.min(v2_0, 5);
                    } else {
                        if (v3_19 != 4) {
                            v2_0 = Math.min(v2_0, -1);
                        }
                    }
                }
            }
            if (v1_0.mFromLayout) {
                if (!v1_0.mInLayout) {
                    if (this.e >= 4) {
                        v2_0 = Math.min(v2_0, 1);
                    } else {
                        v2_0 = Math.min(v2_0, v1_0.mState);
                    }
                } else {
                    v2_0 = Math.max(this.e, 2);
                    int v3_12 = v1_0.mView;
                    if ((v3_12 != 0) && (v3_12.getParent() == null)) {
                        v2_0 = Math.min(v2_0, 2);
                    }
                }
            }
            if (!v1_0.mAdded) {
                v2_0 = Math.min(v2_0, 1);
            }
            int v4_2;
            int v3_16 = v1_0.mContainer;
            if (v3_16 == 0) {
                v4_2 = 0;
            } else {
                int v11_2;
                int v3_17 = androidx.fragment.app.n.h(v3_16, v1_0.getParentFragmentManager());
                int v11_1 = v3_17.f(v1_0);
                if (v11_1 == 0) {
                    v11_2 = 0;
                } else {
                    v11_2 = v11_1.b;
                }
                int v3_18 = v3_17.c;
                int v12_0 = v3_18.size();
                int v13 = 0;
                while (v13 < v12_0) {
                    androidx.fragment.app.y1 v14_0 = v3_18.get(v13);
                    v13++;
                    androidx.fragment.app.y1 v15_1 = ((androidx.fragment.app.y1) v14_0);
                    if ((kotlin.jvm.internal.j.a(v15_1.c, v1_0)) && (!v15_1.f)) {
                    }
                    androidx.fragment.app.y1 v14_1 = ((androidx.fragment.app.y1) v14_0);
                    if (v14_1 == null) {
                        v4_2 = 0;
                    } else {
                        v4_2 = v14_1.b;
                    }
                    int v3_21;
                    if (v11_2 != 0) {
                        v3_21 = androidx.fragment.app.a2.a[u.e.c(v11_2)];
                    } else {
                        v3_21 = -1;
                    }
                    if ((v3_21 != -1) && (v3_21 != 1)) {
                        v4_2 = v11_2;
                    }
                }
                v14_0 = 0;
            }
            if (v4_2 != 2) {
                if (v4_2 != 3) {
                    if (v1_0.mRemoving) {
                        if (!v1_0.isInBackStack()) {
                            v2_0 = Math.min(v2_0, -1);
                        } else {
                            v2_0 = Math.min(v2_0, 1);
                        }
                    }
                } else {
                    v2_0 = Math.max(v2_0, 3);
                }
            } else {
                v2_0 = Math.min(v2_0, 6);
            }
            if ((v1_0.mDeferStart) && (v1_0.mState < 5)) {
                v2_0 = Math.min(v2_0, 4);
            }
            if (androidx.fragment.app.b1.H(2)) {
                int v3_6 = new StringBuilder("computeExpectedState() of ");
                v3_6.append(v2_0);
                v3_6.append(" for ");
                v3_6.append(v1_0);
                android.util.Log.v("FragmentManager", v3_6.toString());
            }
            return v2_0;
        } else {
            return v1_0.mState;
        }
    }

    public final void e()
    {
        androidx.fragment.app.e0 v1 = this.c;
        if (androidx.fragment.app.b1.H(3)) {
            int v0_7 = new StringBuilder("moveto CREATED: ");
            v0_7.append(v1);
            android.util.Log.d("FragmentManager", v0_7.toString());
        }
        int v0_3;
        int v0_2 = v1.mSavedFragmentState;
        if (v0_2 == 0) {
            v0_3 = 0;
        } else {
            v0_3 = v0_2.getBundle("savedInstanceState");
        }
        if (v1.mIsCreated) {
            v1.mState = 1;
            v1.restoreChildFragmentState();
            return;
        } else {
            androidx.fragment.app.k0 v2_3 = this.a;
            v2_3.h(0);
            v1.performCreate(v0_3);
            v2_3.c(0);
            return;
        }
    }

    public final void f()
    {
        String v0_0 = this.c;
        if (!v0_0.mFromLayout) {
            if (androidx.fragment.app.b1.H(3)) {
                StringBuilder v2_0 = new StringBuilder("moveto CREATE_VIEW: ");
                v2_0.append(v0_0);
                android.util.Log.d("FragmentManager", v2_0.toString());
            }
            StringBuilder v2_11;
            StringBuilder v2_7 = v0_0.mSavedFragmentState;
            String v4_4 = 0;
            if (v2_7 == null) {
                v2_11 = 0;
            } else {
                v2_11 = v2_7.getBundle("savedInstanceState");
            }
            int v5_1 = v0_0.performGetLayoutInflater(v2_11);
            k1.b v6_1 = v0_0.mContainer;
            if (v6_1 == null) {
                k1.b v6_2 = v0_0.mContainerId;
                if (v6_2 != null) {
                    if (v6_2 == -1) {
                        throw new IllegalArgumentException(v1.a.k("Cannot create fragment ", v0_0, " for a container view with no id"));
                    } else {
                        v4_4 = ((android.view.ViewGroup) v0_0.mFragmentManager.u.b(v6_2));
                        if (v4_4 != null) {
                            if (!(v4_4 instanceof androidx.fragment.app.FragmentContainerView)) {
                                String v7_1 = new StringBuilder("Attempting to add fragment ");
                                v7_1.append(v0_0);
                                v7_1.append(" to container ");
                                v7_1.append(v4_4);
                                v7_1.append(" which is not a FragmentContainerView");
                                k1.c.b(new k1.a(v0_0, v7_1.toString()));
                                k1.c.a(v0_0).getClass();
                            }
                        } else {
                            if (!v0_0.mRestored) {
                                try {
                                    String v1_23 = v0_0.getResources().getResourceName(v0_0.mContainerId);
                                } catch (android.content.res.Resources$NotFoundException) {
                                    v1_23 = "unknown";
                                }
                                StringBuilder v3_3 = new StringBuilder("No view found for id 0x");
                                v3_3.append(Integer.toHexString(v0_0.mContainerId));
                                v3_3.append(" (");
                                v3_3.append(v1_23);
                                v3_3.append(") for fragment ");
                                v3_3.append(v0_0);
                                throw new IllegalArgumentException(v3_3.toString());
                            }
                        }
                    }
                }
            } else {
                v4_4 = v6_1;
            }
            v0_0.mContainer = v4_4;
            v0_0.performCreateView(v5_1, v4_4, v2_11);
            if (v0_0.mView != null) {
                if (androidx.fragment.app.b1.H(3)) {
                    String v1_1 = new StringBuilder("moveto VIEW_CREATED: ");
                    v1_1.append(v0_0);
                    android.util.Log.d("FragmentManager", v1_1.toString());
                }
                v0_0.mView.setSaveFromParentEnabled(0);
                v0_0.mView.setTag(2131362085, v0_0);
                if (v4_4 != null) {
                    this.b();
                }
                if (v0_0.mHidden) {
                    v0_0.mView.setVisibility(8);
                }
                if (!v0_0.mView.isAttachedToWindow()) {
                    String v1_9 = v0_0.mView;
                    v1_9.addOnAttachStateChangeListener(new androidx.fragment.app.i1(v1_9));
                } else {
                    q0.g0.c(v0_0.mView);
                }
                v0_0.performViewCreated();
                this.a.m(0);
                String v1_13 = v0_0.mView.getVisibility();
                v0_0.setPostOnViewCreatedAlpha(v0_0.mView.getAlpha());
                if ((v0_0.mContainer != null) && (v1_13 == null)) {
                    String v1_15 = v0_0.mView.findFocus();
                    if (v1_15 != null) {
                        v0_0.setFocusedView(v1_15);
                        if (androidx.fragment.app.b1.H(2)) {
                            StringBuilder v2_9 = new StringBuilder("requestFocus: Saved focused view ");
                            v2_9.append(v1_15);
                            v2_9.append(" for Fragment ");
                            v2_9.append(v0_0);
                            android.util.Log.v("FragmentManager", v2_9.toString());
                        }
                    }
                    v0_0.mView.setAlpha(0);
                }
            }
            v0_0.mState = 2;
            return;
        } else {
            return;
        }
    }

    public final void g()
    {
        androidx.fragment.app.e0 v1 = this.c;
        if (androidx.fragment.app.b1.H(3)) {
            androidx.fragment.app.e0 v0_12 = new StringBuilder("movefrom CREATED: ");
            v0_12.append(v1);
            android.util.Log.d("FragmentManager", v0_12.toString());
        }
        androidx.fragment.app.e0 v0_5;
        boolean v2_1 = 1;
        int v3 = 0;
        if ((!v1.mRemoving) || (v1.isInBackStack())) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        androidx.fragment.app.k1 v5 = this.b;
        if ((v0_5 != null) && (!v1.mBeingSaved)) {
            v5.i(0, v1.mWho);
        }
        if (v0_5 == null) {
            androidx.fragment.app.e0 v6_3;
            androidx.fragment.app.e0 v6_2 = v5.d;
            if ((!v6_2.b.containsKey(v1.mWho)) || (!v6_2.e)) {
                v6_3 = 1;
            } else {
                v6_3 = v6_2.f;
            }
            if (v6_3 == null) {
                androidx.fragment.app.e0 v0_6 = v1.mTargetWho;
                if (v0_6 != null) {
                    androidx.fragment.app.e0 v0_7 = v5.b(v0_6);
                    if ((v0_7 != null) && (v0_7.mRetainInstance)) {
                        v1.mTarget = v0_7;
                    }
                }
                v1.mState = 0;
                return;
            }
        }
        androidx.fragment.app.e0 v6_4 = v1.mHost;
        if (!(v6_4 instanceof androidx.lifecycle.b1)) {
            androidx.fragment.app.e0 v6_5 = v6_4.b;
            if (v6_5 != null) {
                v2_1 = (1 ^ v6_5.isChangingConfigurations());
            }
        } else {
            v2_1 = v5.d.f;
        }
        if (((v0_5 != null) && (!v1.mBeingSaved)) || (v2_1)) {
            v5.d.d(v1, 0);
        }
        v1.performDestroy();
        this.a.d(0);
        androidx.fragment.app.e0 v0_13 = v5.d();
        boolean v2_5 = v0_13.size();
        while (v3 < v2_5) {
            androidx.fragment.app.e0 v6_7 = v0_13.get(v3);
            v3++;
            androidx.fragment.app.e0 v6_8 = ((androidx.fragment.app.j1) v6_7);
            if (v6_8 != null) {
                androidx.fragment.app.e0 v6_9 = v6_8.c;
                if (v1.mWho.equals(v6_9.mTargetWho)) {
                    v6_9.mTarget = v1;
                    v6_9.mTargetWho = 0;
                }
            }
        }
        androidx.fragment.app.e0 v0_14 = v1.mTargetWho;
        if (v0_14 != null) {
            v1.mTarget = v5.b(v0_14);
        }
        v5.h(this);
        return;
    }

    public final void h()
    {
        androidx.fragment.app.e0 v1 = this.c;
        if (androidx.fragment.app.b1.H(3)) {
            int v0_7 = new StringBuilder("movefrom CREATE_VIEW: ");
            v0_7.append(v1);
            android.util.Log.d("FragmentManager", v0_7.toString());
        }
        int v0_2 = v1.mContainer;
        if (v0_2 != 0) {
            int v2_1 = v1.mView;
            if (v2_1 != 0) {
                v0_2.removeView(v2_1);
            }
        }
        v1.performDestroyView();
        this.a.n(0);
        v1.mContainer = 0;
        v1.mView = 0;
        v1.mViewLifecycleOwner = 0;
        v1.mViewLifecycleOwnerLiveData.h(0);
        v1.mInLayout = 0;
        return;
    }

    public final void i()
    {
        androidx.fragment.app.e0 v3 = this.c;
        if (androidx.fragment.app.b1.H(3)) {
            String v1_12 = new StringBuilder("movefrom ATTACHED: ");
            v1_12.append(v3);
            android.util.Log.d("FragmentManager", v1_12.toString());
        }
        v3.performDetach();
        this.a.e(0);
        v3.mState = -1;
        v3.mHost = 0;
        v3.mParentFragment = 0;
        v3.mFragmentManager = 0;
        if ((!v3.mRemoving) || (v3.isInBackStack())) {
            String v1_9;
            String v1_8 = this.b.d;
            if ((!v1_8.b.containsKey(v3.mWho)) || (!v1_8.e)) {
                v1_9 = 1;
            } else {
                v1_9 = v1_8.f;
            }
            if (v1_9 != null) {
                if (androidx.fragment.app.b1.H(3)) {
                    String v0_3 = new StringBuilder("initState called for fragment: ");
                    v0_3.append(v3);
                    android.util.Log.d("FragmentManager", v0_3.toString());
                }
                v3.initState();
            }
        }
        return;
    }

    public final void j()
    {
        androidx.fragment.app.e0 v0 = this.c;
        if ((v0.mFromLayout) && ((v0.mInLayout) && (!v0.mPerformedCreateView))) {
            if (androidx.fragment.app.b1.H(3)) {
                int v1_2 = new StringBuilder("moveto CREATE_VIEW: ");
                v1_2.append(v0);
                android.util.Log.d("FragmentManager", v1_2.toString());
            }
            int v1_5;
            int v1_4 = v0.mSavedFragmentState;
            if (v1_4 == 0) {
                v1_5 = 0;
            } else {
                v1_5 = v1_4.getBundle("savedInstanceState");
            }
            v0.performCreateView(v0.performGetLayoutInflater(v1_5), 0, v1_5);
            int v1_6 = v0.mView;
            if (v1_6 != 0) {
                v1_6.setSaveFromParentEnabled(0);
                v0.mView.setTag(2131362085, v0);
                if (v0.mHidden) {
                    v0.mView.setVisibility(8);
                }
                v0.performViewCreated();
                this.a.m(0);
                v0.mState = 2;
            }
        }
        return;
    }

    public final void k()
    {
        androidx.fragment.app.e0 v3 = this.c;
        if (!this.d) {
            this.d = 1;
            String v5_26 = 0;
            while(true) {
                String v6_0 = this.d();
                String v7_2 = v3.mState;
                boolean v8 = 3;
                String v9_0 = this.b;
                if (v6_0 == v7_2) {
                    break;
                }
                String v5_0 = this.a;
                if (v6_0 <= v7_2) {
                    switch ((v7_2 - 1)) {
                        case -1:
                            this.i();
                            break;
                        case 0:
                            if ((v3.mBeingSaved) && (((android.os.Bundle) v9_0.c.get(v3.mWho)) == null)) {
                                v9_0.i(this.n(), v3.mWho);
                            }
                            this.g();
                            break;
                        case 1:
                            this.h();
                            v3.mState = 1;
                            break;
                        case 2:
                            v3.mInLayout = 0;
                            v3.mState = 2;
                            break;
                        case 3:
                            if (androidx.fragment.app.b1.H(3)) {
                                String v5_4 = new StringBuilder();
                                v5_4.append("movefrom ACTIVITY_CREATED: ");
                                v5_4.append(v3);
                                android.util.Log.d("FragmentManager", v5_4.toString());
                            }
                            if (!v3.mBeingSaved) {
                                if ((v3.mView != null) && (v3.mSavedViewState == null)) {
                                    this.o();
                                }
                            } else {
                                v9_0.i(this.n(), v3.mWho);
                            }
                            if (v3.mView != null) {
                                String v5_11 = v3.mContainer;
                                if (v5_11 != null) {
                                    String v5_12 = androidx.fragment.app.n.h(v5_11, v3.getParentFragmentManager());
                                    if (androidx.fragment.app.b1.H(2)) {
                                        String v6_14 = new StringBuilder("SpecialEffectsController: Enqueuing remove operation for fragment ");
                                        v6_14.append(v3);
                                        android.util.Log.v("FragmentManager", v6_14.toString());
                                    }
                                    v5_12.b(1, 3, this);
                                }
                            }
                            v3.mState = 3;
                            break;
                        case 4:
                            if (androidx.fragment.app.b1.H(3)) {
                                String v6_7 = new StringBuilder("movefrom STARTED: ");
                                v6_7.append(v3);
                                android.util.Log.d("FragmentManager", v6_7.toString());
                            }
                            v3.performStop();
                            v5_0.l(0);
                            break;
                        case 5:
                            v3.mState = 5;
                            break;
                        case 6:
                            if (androidx.fragment.app.b1.H(3)) {
                                String v6_3 = new StringBuilder("movefrom RESUMED: ");
                                v6_3.append(v3);
                                android.util.Log.d("FragmentManager", v6_3.toString());
                            }
                            v3.performPause();
                            v5_0.f(0);
                            break;
                        default:
                    }
                } else {
                    switch ((v7_2 + 1)) {
                        case 0:
                            this.c();
                            break;
                        case 1:
                            this.e();
                            break;
                        case 2:
                            this.j();
                            this.f();
                            break;
                        case 3:
                            this.a();
                            break;
                        case 4:
                            if (v3.mView != null) {
                                String v5_23 = v3.mContainer;
                                if (v5_23 != null) {
                                    String v5_24 = androidx.fragment.app.n.h(v5_23, v3.getParentFragmentManager());
                                    String v7_9 = v3.mView.getVisibility();
                                    if (v7_9 == null) {
                                        v8 = 2;
                                    } else {
                                        if (v7_9 == 4) {
                                            v8 = 4;
                                        } else {
                                            if (v7_9 != 8) {
                                                String v1_2 = new StringBuilder("Unknown visibility ");
                                                v1_2.append(v7_9);
                                                throw new IllegalArgumentException(v1_2.toString());
                                            } else {
                                            }
                                        }
                                    }
                                    g2.g.j(v8, "finalState");
                                    if (androidx.fragment.app.b1.H(2)) {
                                        String v7_13 = new StringBuilder("SpecialEffectsController: Enqueuing add operation for fragment ");
                                        v7_13.append(v3);
                                        android.util.Log.v("FragmentManager", v7_13.toString());
                                    }
                                    v5_24.b(v8, 2, this);
                                }
                            }
                            v3.mState = 4;
                            break;
                        case 5:
                            if (androidx.fragment.app.b1.H(3)) {
                                String v6_20 = new StringBuilder("moveto STARTED: ");
                                v6_20.append(v3);
                                android.util.Log.d("FragmentManager", v6_20.toString());
                            }
                            v3.performStart();
                            v5_0.k(0);
                            break;
                        case 6:
                            v3.mState = 6;
                            break;
                        case 7:
                            this.m();
                            break;
                        default:
                    }
                }
                v5_26 = 1;
            }
            if ((v5_26 == null) && ((v7_2 == -1) && ((v3.mRemoving) && ((!v3.isInBackStack()) && (!v3.mBeingSaved))))) {
                if (androidx.fragment.app.b1.H(3)) {
                    String v5_29 = new StringBuilder();
                    v5_29.append("Cleaning up state of never attached fragment: ");
                    v5_29.append(v3);
                    android.util.Log.d("FragmentManager", v5_29.toString());
                }
                v9_0.d.d(v3, 1);
                v9_0.h(this);
                if (androidx.fragment.app.b1.H(3)) {
                    String v5_34 = new StringBuilder();
                    v5_34.append("initState called for fragment: ");
                    v5_34.append(v3);
                    android.util.Log.d("FragmentManager", v5_34.toString());
                }
                v3.initState();
            }
            if (v3.mHiddenChanged) {
                if (v3.mView != null) {
                    String v5_38 = v3.mContainer;
                    if (v5_38 != null) {
                        String v5_39 = androidx.fragment.app.n.h(v5_38, v3.getParentFragmentManager());
                        if (!v3.mHidden) {
                            if (androidx.fragment.app.b1.H(2)) {
                                String v6_29 = new StringBuilder("SpecialEffectsController: Enqueuing show operation for fragment ");
                                v6_29.append(v3);
                                android.util.Log.v("FragmentManager", v6_29.toString());
                            }
                            v5_39.b(2, 1, this);
                        } else {
                            if (androidx.fragment.app.b1.H(2)) {
                                String v1_7 = new StringBuilder("SpecialEffectsController: Enqueuing hide operation for fragment ");
                                v1_7.append(v3);
                                android.util.Log.v("FragmentManager", v1_7.toString());
                            }
                            v5_39.b(3, 1, this);
                        }
                    }
                }
                String v1_9 = v3.mFragmentManager;
                if ((v1_9 != null) && ((v3.mAdded) && (androidx.fragment.app.b1.I(v3)))) {
                    v1_9.D = 1;
                }
                v3.mHiddenChanged = 0;
                v3.onHiddenChanged(v3.mHidden);
                v3.mChildFragmentManager.n();
            }
            this.d = 0;
            return;
        } else {
            if (androidx.fragment.app.b1.H(2)) {
                IllegalArgumentException v0_6 = new StringBuilder("Ignoring re-entrant call to moveToExpectedState() for ");
                v0_6.append(v3);
                android.util.Log.v("FragmentManager", v0_6.toString());
            }
            return;
        }
    }

    public final void l(ClassLoader p4)
    {
        androidx.fragment.app.e0 v0 = this.c;
        Boolean v1_0 = v0.mSavedFragmentState;
        if (v1_0 != null) {
            v1_0.setClassLoader(p4);
            if (v0.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                v0.mSavedFragmentState.putBundle("savedInstanceState", new android.os.Bundle());
            }
            v0.mSavedViewState = v0.mSavedFragmentState.getSparseParcelableArray("viewState");
            v0.mSavedViewRegistryState = v0.mSavedFragmentState.getBundle("viewRegistryState");
            int v4_7 = ((androidx.fragment.app.h1) v0.mSavedFragmentState.getParcelable("state"));
            if (v4_7 != 0) {
                v0.mTargetWho = v4_7.r;
                v0.mTargetRequestCode = v4_7.s;
                Boolean v1_6 = v0.mSavedUserVisibleHint;
                if (v1_6 == null) {
                    v0.mUserVisibleHint = v4_7.t;
                } else {
                    v0.mUserVisibleHint = v1_6.booleanValue();
                    v0.mSavedUserVisibleHint = 0;
                }
            }
            if (!v0.mUserVisibleHint) {
                v0.mDeferStart = 1;
            }
        }
        return;
    }

    public final void m()
    {
        androidx.fragment.app.e0 v2 = this.c;
        if (androidx.fragment.app.b1.H(3)) {
            String v0_13 = new StringBuilder("moveto RESUMED: ");
            v0_13.append(v2);
            android.util.Log.d("FragmentManager", v0_13.toString());
        }
        String v0_2 = v2.getFocusedView();
        if (v0_2 != null) {
            if (v0_2 != v2.mView) {
                android.view.ViewParent v3_1 = v0_2.getParent();
                while (v3_1 != null) {
                    if (v3_1 != v2.mView) {
                        v3_1 = v3_1.getParent();
                    }
                }
                v2.setFocusedView(0);
                v2.performResume();
                this.a.i(0);
                this.b.i(0, v2.mWho);
                v2.mSavedFragmentState = 0;
                v2.mSavedViewState = 0;
                v2.mSavedViewRegistryState = 0;
                return;
            }
            android.view.ViewParent v3_2 = v0_2.requestFocus();
            if (androidx.fragment.app.b1.H(2)) {
                String v0_5;
                android.view.View v4_4 = new StringBuilder("requestFocus: Restoring focused view ");
                v4_4.append(v0_2);
                v4_4.append(" ");
                if (v3_2 == null) {
                    v0_5 = "failed";
                } else {
                    v0_5 = "succeeded";
                }
                v4_4.append(v0_5);
                v4_4.append(" on Fragment ");
                v4_4.append(v2);
                v4_4.append(" resulting in focused view ");
                v4_4.append(v2.mView.findFocus());
                android.util.Log.v("FragmentManager", v4_4.toString());
            }
        }
        v2.setFocusedView(0);
        v2.performResume();
        this.a.i(0);
        this.b.i(0, v2.mWho);
        v2.mSavedFragmentState = 0;
        v2.mSavedViewState = 0;
        v2.mSavedViewRegistryState = 0;
        return;
    }

    public final android.os.Bundle n()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        android.os.Bundle v1_0 = this.c;
        if (v1_0.mState == -1) {
            android.os.Bundle v2_14 = v1_0.mSavedFragmentState;
            if (v2_14 != null) {
                v0_1.putAll(v2_14);
            }
        }
        v0_1.putParcelable("state", new androidx.fragment.app.h1(v1_0));
        if (v1_0.mState > -1) {
            android.os.Bundle v2_3 = new android.os.Bundle();
            v1_0.performSaveInstanceState(v2_3);
            if (!v2_3.isEmpty()) {
                v0_1.putBundle("savedInstanceState", v2_3);
            }
            this.a.j(0);
            android.os.Bundle v2_6 = new android.os.Bundle();
            v1_0.mSavedStateRegistryController.b(v2_6);
            if (!v2_6.isEmpty()) {
                v0_1.putBundle("registryState", v2_6);
            }
            android.os.Bundle v2_9 = v1_0.mChildFragmentManager.T();
            if (!v2_9.isEmpty()) {
                v0_1.putBundle("childFragmentManager", v2_9);
            }
            if (v1_0.mView != null) {
                this.o();
            }
            android.os.Bundle v2_11 = v1_0.mSavedViewState;
            if (v2_11 != null) {
                v0_1.putSparseParcelableArray("viewState", v2_11);
            }
            android.os.Bundle v2_12 = v1_0.mSavedViewRegistryState;
            if (v2_12 != null) {
                v0_1.putBundle("viewRegistryState", v2_12);
            }
        }
        android.os.Bundle v1_1 = v1_0.mArguments;
        if (v1_1 != null) {
            v0_1.putBundle("arguments", v1_1);
        }
        return v0_1;
    }

    public final void o()
    {
        androidx.fragment.app.e0 v0 = this.c;
        if (v0.mView != null) {
            if (androidx.fragment.app.b1.H(2)) {
                android.os.Bundle v1_9 = new StringBuilder("Saving view state for fragment ");
                v1_9.append(v0);
                v1_9.append(" with view ");
                v1_9.append(v0.mView);
                android.util.Log.v("FragmentManager", v1_9.toString());
            }
            android.os.Bundle v1_3 = new android.util.SparseArray();
            v0.mView.saveHierarchyState(v1_3);
            if (v1_3.size() > 0) {
                v0.mSavedViewState = v1_3;
            }
            android.os.Bundle v1_5 = new android.os.Bundle();
            v0.mViewLifecycleOwner.e.b(v1_5);
            if (!v1_5.isEmpty()) {
                v0.mSavedViewRegistryState = v1_5;
            }
        }
        return;
    }
}
