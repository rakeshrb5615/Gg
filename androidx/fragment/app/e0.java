package androidx.fragment.app;
public abstract class e0 implements android.content.ComponentCallbacks, android.view.View$OnCreateContextMenuListener, androidx.lifecycle.u, androidx.lifecycle.b1, androidx.lifecycle.j, b2.g {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = 255;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = None;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    androidx.fragment.app.b0 mAnimationInfo;
    android.os.Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    androidx.fragment.app.b1 mChildFragmentManager;
    android.view.ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.x0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    androidx.fragment.app.b1 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.o0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    android.view.LayoutInflater mLayoutInflater;
    androidx.lifecycle.w mLifecycleRegistry;
    androidx.lifecycle.o mMaxState;
    boolean mMenuVisible;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final java.util.ArrayList mOnPreAttachedListeners;
    androidx.fragment.app.e0 mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    android.os.Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    android.os.Bundle mSavedFragmentState;
    private final androidx.fragment.app.c0 mSavedStateAttachListener;
    b2.f mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    android.os.Bundle mSavedViewRegistryState;
    android.util.SparseArray mSavedViewState;
    int mState;
    String mTag;
    androidx.fragment.app.e0 mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    android.view.View mView;
    androidx.fragment.app.v1 mViewLifecycleOwner;
    androidx.lifecycle.d0 mViewLifecycleOwnerLiveData;
    String mWho;

    static e0()
    {
        androidx.fragment.app.e0.USE_DEFAULT_TRANSITION = new Object();
        return;
    }

    public e0()
    {
        this.mState = -1;
        this.mWho = java.util.UUID.randomUUID().toString();
        this.mTargetWho = 0;
        this.mIsPrimaryNavigationFragment = 0;
        this.mChildFragmentManager = new androidx.fragment.app.c1();
        this.mMenuVisible = 1;
        this.mUserVisibleHint = 1;
        this.mPostponedDurationRunnable = new androidx.fragment.app.v(this, 0);
        this.mMaxState = androidx.lifecycle.o.e;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.d0();
        this.mNextLocalRequestCode = new java.util.concurrent.atomic.AtomicInteger();
        this.mOnPreAttachedListeners = new java.util.ArrayList();
        this.mSavedStateAttachListener = new androidx.fragment.app.w(this);
        this.d();
        return;
    }

    public static androidx.fragment.app.e0 instantiate(android.content.Context p1, String p2)
    {
        return androidx.fragment.app.e0.instantiate(p1, p2, 0);
    }

    public static androidx.fragment.app.e0 instantiate(android.content.Context p3, String p4, android.os.Bundle p5)
    {
        try {
            reflect.InvocationTargetException v3_2 = ((androidx.fragment.app.e0) androidx.fragment.app.v0.b(p4, p3.getClassLoader()).getConstructor(0).newInstance(0));
        } catch (reflect.InvocationTargetException v3_7) {
            throw new a5.o(v1.a.l("Unable to instantiate fragment ", p4, ": make sure class name exists, is public, and has an empty constructor that is public"), v3_7);
        } catch (reflect.InvocationTargetException v3_5) {
            throw new a5.o(v1.a.l("Unable to instantiate fragment ", p4, ": make sure class name exists, is public, and has an empty constructor that is public"), v3_5);
        } catch (reflect.InvocationTargetException v3_4) {
            throw new a5.o(v1.a.l("Unable to instantiate fragment ", p4, ": could not find Fragment constructor"), v3_4);
        } catch (reflect.InvocationTargetException v3_3) {
            throw new a5.o(v1.a.l("Unable to instantiate fragment ", p4, ": calling Fragment constructor caused an exception"), v3_3);
        }
        if (p5 == null) {
            return v3_2;
        } else {
            p5.setClassLoader(v3_2.getClass().getClassLoader());
            v3_2.setArguments(p5);
            return v3_2;
        }
    }

    public final androidx.fragment.app.b0 a()
    {
        if (this.mAnimationInfo == null) {
            androidx.fragment.app.b0 v0_3 = new androidx.fragment.app.b0();
            v0_3.i = 0;
            int v2_1 = androidx.fragment.app.e0.USE_DEFAULT_TRANSITION;
            v0_3.j = v2_1;
            v0_3.k = 0;
            v0_3.l = v2_1;
            v0_3.m = 0;
            v0_3.n = v2_1;
            v0_3.q = 1065353216;
            v0_3.r = 0;
            this.mAnimationInfo = v0_3;
        }
        return this.mAnimationInfo;
    }

    public final int b()
    {
        int v0_0 = this.mMaxState;
        if ((v0_0 != androidx.lifecycle.o.b) && (this.mParentFragment != null)) {
            return Math.min(v0_0.ordinal(), this.mParentFragment.b());
        } else {
            return v0_0.ordinal();
        }
    }

    public final androidx.fragment.app.e0 c(boolean p3)
    {
        if (p3 != null) {
            String v0_2 = new StringBuilder("Attempting to get target fragment from fragment ");
            v0_2.append(this);
            k1.c.b(new k1.e(this, v0_2.toString()));
            k1.c.a(this).getClass();
        }
        androidx.fragment.app.e0 v3_2 = this.mTarget;
        if (v3_2 == null) {
            androidx.fragment.app.e0 v3_3 = this.mFragmentManager;
            if (v3_3 != null) {
                String v0_0 = this.mTargetWho;
                if (v0_0 != null) {
                    return v3_3.c.b(v0_0);
                }
            }
            return 0;
        } else {
            return v3_2;
        }
    }

    public void callStartTransitionListener(boolean p4)
    {
        Runnable v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            v0_0.s = 0;
        }
        if (this.mView != null) {
            Runnable v0_4 = this.mContainer;
            if (v0_4 != null) {
                androidx.fragment.app.o v1_3 = this.mFragmentManager;
                if (v1_3 != null) {
                    Runnable v0_1 = androidx.fragment.app.n.h(v0_4, v1_3);
                    v0_1.i();
                    if (p4 == 0) {
                        v0_1.d();
                    } else {
                        this.mHost.c.post(new androidx.fragment.app.o(v0_1, 1));
                    }
                    int v4_3 = this.mPostponedHandler;
                    if (v4_3 != 0) {
                        v4_3.removeCallbacks(this.mPostponedDurationRunnable);
                        this.mPostponedHandler = 0;
                    }
                }
            }
        }
        return;
    }

    public androidx.fragment.app.m0 createFragmentContainer()
    {
        return new androidx.fragment.app.x(this);
    }

    public final void d()
    {
        this.mLifecycleRegistry = new androidx.lifecycle.w(this);
        this.mSavedStateRegistryController = new b2.f(new c2.a(this, new a8.j(this, 2)));
        this.mDefaultFactory = 0;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            androidx.fragment.app.c0 v0_5 = this.mSavedStateAttachListener;
            if (this.mState < 0) {
                this.mOnPreAttachedListeners.add(v0_5);
            } else {
                v0_5.a();
                return;
            }
        }
        return;
    }

    public void dump(String p3, java.io.FileDescriptor p4, java.io.PrintWriter p5, String[] p6)
    {
        p5.print(p3);
        p5.print("mFragmentId=#");
        p5.print(Integer.toHexString(this.mFragmentId));
        p5.print(" mContainerId=#");
        p5.print(Integer.toHexString(this.mContainerId));
        p5.print(" mTag=");
        p5.println(this.mTag);
        p5.print(p3);
        p5.print("mState=");
        p5.print(this.mState);
        p5.print(" mWho=");
        p5.print(this.mWho);
        p5.print(" mBackStackNesting=");
        p5.println(this.mBackStackNesting);
        p5.print(p3);
        p5.print("mAdded=");
        p5.print(this.mAdded);
        p5.print(" mRemoving=");
        p5.print(this.mRemoving);
        p5.print(" mFromLayout=");
        p5.print(this.mFromLayout);
        p5.print(" mInLayout=");
        p5.println(this.mInLayout);
        p5.print(p3);
        p5.print("mHidden=");
        p5.print(this.mHidden);
        p5.print(" mDetached=");
        p5.print(this.mDetached);
        p5.print(" mMenuVisible=");
        p5.print(this.mMenuVisible);
        p5.print(" mHasMenu=");
        p5.println(this.mHasMenu);
        p5.print(p3);
        p5.print("mRetainInstance=");
        p5.print(this.mRetainInstance);
        p5.print(" mUserVisibleHint=");
        p5.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            p5.print(p3);
            p5.print("mFragmentManager=");
            p5.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            p5.print(p3);
            p5.print("mHost=");
            p5.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            p5.print(p3);
            p5.print("mParentFragment=");
            p5.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            p5.print(p3);
            p5.print("mArguments=");
            p5.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            p5.print(p3);
            p5.print("mSavedFragmentState=");
            p5.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            p5.print(p3);
            p5.print("mSavedViewState=");
            p5.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            p5.print(p3);
            p5.print("mSavedViewRegistryState=");
            p5.println(this.mSavedViewRegistryState);
        }
        androidx.fragment.app.b1 v0_12 = this.c(0);
        if (v0_12 != null) {
            p5.print(p3);
            p5.print("mTarget=");
            p5.print(v0_12);
            p5.print(" mTargetRequestCode=");
            p5.println(this.mTargetRequestCode);
        }
        p5.print(p3);
        p5.print("mPopDirection=");
        p5.println(this.getPopDirection());
        if (this.getEnterAnim() != 0) {
            p5.print(p3);
            p5.print("getEnterAnim=");
            p5.println(this.getEnterAnim());
        }
        if (this.getExitAnim() != 0) {
            p5.print(p3);
            p5.print("getExitAnim=");
            p5.println(this.getExitAnim());
        }
        if (this.getPopEnterAnim() != 0) {
            p5.print(p3);
            p5.print("getPopEnterAnim=");
            p5.println(this.getPopEnterAnim());
        }
        if (this.getPopExitAnim() != 0) {
            p5.print(p3);
            p5.print("getPopExitAnim=");
            p5.println(this.getPopExitAnim());
        }
        if (this.mContainer != null) {
            p5.print(p3);
            p5.print("mContainer=");
            p5.println(this.mContainer);
        }
        if (this.mView != null) {
            p5.print(p3);
            p5.print("mView=");
            p5.println(this.mView);
        }
        if (this.getAnimatingAway() != null) {
            p5.print(p3);
            p5.print("mAnimatingAway=");
            p5.println(this.getAnimatingAway());
        }
        if (this.getContext() != null) {
            q1.b.a(this).b(p3, p4, p5, p6);
        }
        p5.print(p3);
        androidx.fragment.app.b1 v0_45 = new StringBuilder("Child ");
        v0_45.append(this.mChildFragmentManager);
        v0_45.append(":");
        p5.println(v0_45.toString());
        this.mChildFragmentManager.u(g2.g.d(p3, "  "), p4, p5, p6);
        return;
    }

    public final androidx.fragment.app.u e(f.a p9, androidx.fragment.app.z p10, e.b p11)
    {
        if (this.mState > 1) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        } else {
            java.util.concurrent.atomic.AtomicReference v5_1 = new java.util.concurrent.atomic.AtomicReference();
            androidx.fragment.app.a0 v2_1 = new androidx.fragment.app.a0(this, p10, v5_1, p9, p11);
            if (this.mState < 0) {
                this.mOnPreAttachedListeners.add(v2_1);
            } else {
                v2_1.a();
            }
            return new androidx.fragment.app.u(v5_1);
        }
    }

    public final boolean equals(Object p1)
    {
        return super.equals(p1);
    }

    public androidx.fragment.app.e0 findFragmentByWho(String p2)
    {
        if (!p2.equals(this.mWho)) {
            return this.mChildFragmentManager.c.c(p2);
        } else {
            return this;
        }
    }

    public String generateActivityResultKey()
    {
        String v0_2 = new StringBuilder("fragment_");
        v0_2.append(this.mWho);
        v0_2.append("_rq#");
        v0_2.append(this.mNextLocalRequestCode.getAndIncrement());
        return v0_2.toString();
    }

    public final androidx.fragment.app.j0 getActivity()
    {
        androidx.fragment.app.j0 v0_0 = this.mHost;
        if (v0_0 != null) {
            return v0_0.a;
        } else {
            return 0;
        }
    }

    public boolean getAllowEnterTransitionOverlap()
    {
        boolean v0_0 = this.mAnimationInfo;
        if (v0_0) {
            boolean v0_1 = v0_0.p;
            if (v0_1) {
                return v0_1.booleanValue();
            }
        }
        return 1;
    }

    public boolean getAllowReturnTransitionOverlap()
    {
        boolean v0_0 = this.mAnimationInfo;
        if (v0_0) {
            boolean v0_1 = v0_0.o;
            if (v0_1) {
                return v0_1.booleanValue();
            }
        }
        return 1;
    }

    public android.view.View getAnimatingAway()
    {
        androidx.fragment.app.b0 v0 = this.mAnimationInfo;
        if (v0 != null) {
            v0.getClass();
            return 0;
        } else {
            return 0;
        }
    }

    public final android.os.Bundle getArguments()
    {
        return this.mArguments;
    }

    public final androidx.fragment.app.b1 getChildFragmentManager()
    {
        if (this.mHost == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " has not been attached yet."));
        } else {
            return this.mChildFragmentManager;
        }
    }

    public android.content.Context getContext()
    {
        androidx.fragment.app.j0 v0_0 = this.mHost;
        if (v0_0 != null) {
            return v0_0.b;
        } else {
            return 0;
        }
    }

    public o1.b getDefaultViewModelCreationExtras()
    {
        v3.f v0_1 = this.requireContext().getApplicationContext();
        while ((v0_1 instanceof android.content.ContextWrapper)) {
            if (!(v0_1 instanceof android.app.Application)) {
                v0_1 = ((android.content.ContextWrapper) v0_1).getBaseContext();
            } else {
                v3.f v0_2 = ((android.app.Application) v0_1);
            }
            if ((v0_2 == null) && (androidx.fragment.app.b1.H(3))) {
                String v1_3 = new StringBuilder("Could not find Application instance from Context ");
                v1_3.append(this.requireContext().getApplicationContext());
                v1_3.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                android.util.Log.d("FragmentManager", v1_3.toString());
            }
            String v1_6 = new o1.c(0);
            String v2_6 = v1_6.a;
            if (v0_2 != null) {
                v2_6.put(androidx.lifecycle.w0.d, v0_2);
            }
            v2_6.put(androidx.lifecycle.q0.a, this);
            v2_6.put(androidx.lifecycle.q0.b, this);
            if (this.getArguments() != null) {
                v2_6.put(androidx.lifecycle.q0.c, this.getArguments());
            }
            return v1_6;
        }
        v0_2 = 0;
    }

    public androidx.lifecycle.x0 getDefaultViewModelProviderFactory()
    {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        } else {
            if (this.mDefaultFactory == null) {
                android.content.Context v0_1 = this.requireContext().getApplicationContext();
                while ((v0_1 instanceof android.content.ContextWrapper)) {
                    if (!(v0_1 instanceof android.app.Application)) {
                        v0_1 = ((android.content.ContextWrapper) v0_1).getBaseContext();
                    } else {
                        android.content.Context v0_2 = ((android.app.Application) v0_1);
                    }
                    if ((v0_2 == null) && (androidx.fragment.app.b1.H(3))) {
                        String v1_5 = new StringBuilder("Could not find Application instance from Context ");
                        v1_5.append(this.requireContext().getApplicationContext());
                        v1_5.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                        android.util.Log.d("FragmentManager", v1_5.toString());
                    }
                    this.mDefaultFactory = new androidx.lifecycle.t0(v0_2, this, this.getArguments());
                }
                v0_2 = 0;
            }
            return this.mDefaultFactory;
        }
    }

    public int getEnterAnim()
    {
        int v0_0 = this.mAnimationInfo;
        if (v0_0 != 0) {
            return v0_0.b;
        } else {
            return 0;
        }
    }

    public Object getEnterTransition()
    {
        Object v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            return v0_0.i;
        } else {
            return 0;
        }
    }

    public d0.b0 getEnterTransitionCallback()
    {
        androidx.fragment.app.b0 v0 = this.mAnimationInfo;
        if (v0 != null) {
            v0.getClass();
            return 0;
        } else {
            return 0;
        }
    }

    public int getExitAnim()
    {
        int v0_0 = this.mAnimationInfo;
        if (v0_0 != 0) {
            return v0_0.c;
        } else {
            return 0;
        }
    }

    public Object getExitTransition()
    {
        Object v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            return v0_0.k;
        } else {
            return 0;
        }
    }

    public d0.b0 getExitTransitionCallback()
    {
        androidx.fragment.app.b0 v0 = this.mAnimationInfo;
        if (v0 != null) {
            v0.getClass();
            return 0;
        } else {
            return 0;
        }
    }

    public android.view.View getFocusedView()
    {
        android.view.View v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            return v0_0.r;
        } else {
            return 0;
        }
    }

    public final androidx.fragment.app.b1 getFragmentManager()
    {
        return this.mFragmentManager;
    }

    public final Object getHost()
    {
        androidx.fragment.app.j0 v0_0 = this.mHost;
        if (v0_0 != null) {
            return ((androidx.fragment.app.i0) v0_0).e;
        } else {
            return 0;
        }
    }

    public final int getId()
    {
        return this.mFragmentId;
    }

    public final android.view.LayoutInflater getLayoutInflater()
    {
        android.view.LayoutInflater v0_0 = this.mLayoutInflater;
        if (v0_0 == null) {
            v0_0 = this.performGetLayoutInflater(0);
        }
        return v0_0;
    }

    public android.view.LayoutInflater getLayoutInflater(android.os.Bundle p2)
    {
        IllegalStateException v2_0 = this.mHost;
        if (v2_0 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        } else {
            IllegalStateException v2_5 = ((androidx.fragment.app.i0) v2_0).e;
            IllegalStateException v2_1 = v2_5.getLayoutInflater().cloneInContext(v2_5);
            v2_1.setFactory2(this.mChildFragmentManager.f);
            return v2_1;
        }
    }

    public androidx.lifecycle.p getLifecycle()
    {
        return this.mLifecycleRegistry;
    }

    public q1.b getLoaderManager()
    {
        return q1.b.a(this);
    }

    public int getNextTransition()
    {
        int v0_0 = this.mAnimationInfo;
        if (v0_0 != 0) {
            return v0_0.f;
        } else {
            return 0;
        }
    }

    public final androidx.fragment.app.e0 getParentFragment()
    {
        return this.mParentFragment;
    }

    public final androidx.fragment.app.b1 getParentFragmentManager()
    {
        IllegalStateException v0_0 = this.mFragmentManager;
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " not associated with a fragment manager."));
        } else {
            return v0_0;
        }
    }

    public boolean getPopDirection()
    {
        boolean v0_0 = this.mAnimationInfo;
        if (v0_0) {
            return v0_0.a;
        } else {
            return 0;
        }
    }

    public int getPopEnterAnim()
    {
        int v0_0 = this.mAnimationInfo;
        if (v0_0 != 0) {
            return v0_0.d;
        } else {
            return 0;
        }
    }

    public int getPopExitAnim()
    {
        int v0_0 = this.mAnimationInfo;
        if (v0_0 != 0) {
            return v0_0.e;
        } else {
            return 0;
        }
    }

    public float getPostOnViewCreatedAlpha()
    {
        float v0_0 = this.mAnimationInfo;
        if (v0_0 != 0) {
            return v0_0.q;
        } else {
            return 1065353216;
        }
    }

    public Object getReenterTransition()
    {
        Object v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            Object v0_1 = v0_0.l;
            if (v0_1 == androidx.fragment.app.e0.USE_DEFAULT_TRANSITION) {
                v0_1 = this.getExitTransition();
            }
            return v0_1;
        } else {
            return 0;
        }
    }

    public final android.content.res.Resources getResources()
    {
        return this.requireContext().getResources();
    }

    public final boolean getRetainInstance()
    {
        String v1_1 = new StringBuilder("Attempting to get retain instance for fragment ");
        v1_1.append(this);
        k1.c.b(new k1.d(this, v1_1.toString()));
        k1.c.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition()
    {
        Object v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            Object v0_1 = v0_0.j;
            if (v0_1 == androidx.fragment.app.e0.USE_DEFAULT_TRANSITION) {
                v0_1 = this.getEnterTransition();
            }
            return v0_1;
        } else {
            return 0;
        }
    }

    public final b2.e getSavedStateRegistry()
    {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition()
    {
        Object v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            return v0_0.m;
        } else {
            return 0;
        }
    }

    public Object getSharedElementReturnTransition()
    {
        Object v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            Object v0_1 = v0_0.n;
            if (v0_1 == androidx.fragment.app.e0.USE_DEFAULT_TRANSITION) {
                v0_1 = this.getSharedElementEnterTransition();
            }
            return v0_1;
        } else {
            return 0;
        }
    }

    public java.util.ArrayList getSharedElementSourceNames()
    {
        java.util.ArrayList v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            java.util.ArrayList v0_1 = v0_0.g;
            if (v0_1 != null) {
                return v0_1;
            }
        }
        return new java.util.ArrayList();
    }

    public java.util.ArrayList getSharedElementTargetNames()
    {
        java.util.ArrayList v0_0 = this.mAnimationInfo;
        if (v0_0 != null) {
            java.util.ArrayList v0_1 = v0_0.h;
            if (v0_1 != null) {
                return v0_1;
            }
        }
        return new java.util.ArrayList();
    }

    public final String getString(int p2)
    {
        return this.getResources().getString(p2);
    }

    public final varargs String getString(int p2, Object[] p3)
    {
        return this.getResources().getString(p2, p3);
    }

    public final String getTag()
    {
        return this.mTag;
    }

    public final androidx.fragment.app.e0 getTargetFragment()
    {
        return this.c(1);
    }

    public final int getTargetRequestCode()
    {
        String v1_1 = new StringBuilder("Attempting to get target request code from fragment ");
        v1_1.append(this);
        k1.c.b(new k1.e(this, v1_1.toString()));
        k1.c.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int p2)
    {
        return this.getResources().getText(p2);
    }

    public boolean getUserVisibleHint()
    {
        return this.mUserVisibleHint;
    }

    public android.view.View getView()
    {
        return this.mView;
    }

    public androidx.lifecycle.u getViewLifecycleOwner()
    {
        IllegalStateException v0_0 = this.mViewLifecycleOwner;
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.k("Can\'t access the Fragment View\'s LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        } else {
            return v0_0;
        }
    }

    public androidx.lifecycle.c0 getViewLifecycleOwnerLiveData()
    {
        return this.mViewLifecycleOwnerLiveData;
    }

    public androidx.lifecycle.a1 getViewModelStore()
    {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        } else {
            if (this.b() == 1) {
                throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            } else {
                IllegalStateException v0_5 = this.mFragmentManager.L.d;
                androidx.lifecycle.a1 v1_3 = ((androidx.lifecycle.a1) v0_5.get(this.mWho));
                if (v1_3 == null) {
                    v1_3 = new androidx.lifecycle.a1();
                    v0_5.put(this.mWho, v1_3);
                }
                return v1_3;
            }
        }
    }

    public final boolean hasOptionsMenu()
    {
        return this.mHasMenu;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    public void initState()
    {
        this.d();
        this.mPreviousWho = this.mWho;
        this.mWho = java.util.UUID.randomUUID().toString();
        this.mAdded = 0;
        this.mRemoving = 0;
        this.mFromLayout = 0;
        this.mInLayout = 0;
        this.mRestored = 0;
        this.mBackStackNesting = 0;
        this.mFragmentManager = 0;
        this.mChildFragmentManager = new androidx.fragment.app.c1();
        this.mHost = 0;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = 0;
        this.mHidden = 0;
        this.mDetached = 0;
        return;
    }

    public final boolean isAdded()
    {
        if ((this.mHost == null) || (!this.mAdded)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isDetached()
    {
        return this.mDetached;
    }

    public final boolean isHidden()
    {
        if (!this.mHidden) {
            boolean v0_3 = this.mFragmentManager;
            if (v0_3) {
                boolean v0_1;
                androidx.fragment.app.e0 v2 = this.mParentFragment;
                v0_3.getClass();
                if (v2 != null) {
                    v0_1 = v2.isHidden();
                } else {
                    v0_1 = 0;
                }
                if (v0_1) {
                    return 1;
                }
            }
            return 0;
        }
        return 1;
    }

    public final boolean isInBackStack()
    {
        if (this.mBackStackNesting <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isInLayout()
    {
        return this.mInLayout;
    }

    public final boolean isMenuVisible()
    {
        if (this.mMenuVisible) {
            if (this.mFragmentManager != null) {
                boolean v0_4;
                boolean v0_3 = this.mParentFragment;
                if (v0_3) {
                    v0_4 = v0_3.isMenuVisible();
                } else {
                    v0_4 = 1;
                }
                if (!v0_4) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public boolean isPostponed()
    {
        boolean v0_0 = this.mAnimationInfo;
        if (v0_0) {
            return v0_0.s;
        } else {
            return 0;
        }
    }

    public final boolean isRemoving()
    {
        return this.mRemoving;
    }

    public final boolean isResumed()
    {
        if (this.mState < 7) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isStateSaved()
    {
        int v0_0 = this.mFragmentManager;
        if (v0_0 != 0) {
            if ((!v0_0.E) && (!v0_0.F)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final boolean isVisible()
    {
        if ((this.isAdded()) && (!this.isHidden())) {
            int v0_6 = this.mView;
            if ((v0_6 != 0) && ((v0_6.getWindowToken() != null) && (this.mView.getVisibility() == 0))) {
                return 1;
            }
        }
        return 0;
    }

    public void noteStateNotSaved()
    {
        this.mChildFragmentManager.M();
        return;
    }

    public void onActivityCreated(android.os.Bundle p1)
    {
        this.mCalled = 1;
        return;
    }

    public void onActivityResult(int p3, int p4, android.content.Intent p5)
    {
        if (androidx.fragment.app.b1.H(2)) {
            StringBuilder v0_3 = new StringBuilder("Fragment ");
            v0_3.append(this);
            v0_3.append(" received the following in onActivityResult(): requestCode: ");
            v0_3.append(p3);
            v0_3.append(" resultCode: ");
            v0_3.append(p4);
            v0_3.append(" data: ");
            v0_3.append(p5);
            android.util.Log.v("FragmentManager", v0_3.toString());
        }
        return;
    }

    public void onAttach(android.app.Activity p1)
    {
        this.mCalled = 1;
        return;
    }

    public void onAttach(android.content.Context p2)
    {
        androidx.fragment.app.j0 v2_2;
        this.mCalled = 1;
        androidx.fragment.app.j0 v2_1 = this.mHost;
        if (v2_1 != null) {
            v2_2 = v2_1.a;
        } else {
            v2_2 = 0;
        }
        if (v2_2 != null) {
            this.mCalled = 0;
            this.onAttach(v2_2);
        }
        return;
    }

    public void onAttachFragment(androidx.fragment.app.e0 p1)
    {
        return;
    }

    public void onConfigurationChanged(android.content.res.Configuration p1)
    {
        this.mCalled = 1;
        return;
    }

    public boolean onContextItemSelected(android.view.MenuItem p1)
    {
        return 0;
    }

    public void onCreate(android.os.Bundle p4)
    {
        this.mCalled = 1;
        this.restoreChildFragmentState();
        androidx.fragment.app.b1 v0 = this.mChildFragmentManager;
        if (v0.s < 1) {
            v0.E = 0;
            v0.F = 0;
            v0.L.g = 0;
            v0.t(1);
            return;
        } else {
            return;
        }
    }

    public android.view.animation.Animation onCreateAnimation(int p1, boolean p2, int p3)
    {
        return 0;
    }

    public android.animation.Animator onCreateAnimator(int p1, boolean p2, int p3)
    {
        return 0;
    }

    public void onCreateContextMenu(android.view.ContextMenu p2, android.view.View p3, android.view.ContextMenu$ContextMenuInfo p4)
    {
        this.requireActivity().onCreateContextMenu(p2, p3, p4);
        return;
    }

    public void onCreateOptionsMenu(android.view.Menu p1, android.view.MenuInflater p2)
    {
        return;
    }

    public android.view.View onCreateView(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
    {
        p4 = this.mContentLayoutId;
        if (p4 == 0) {
            return 0;
        } else {
            return p2.inflate(p4, p3, 0);
        }
    }

    public void onDestroy()
    {
        this.mCalled = 1;
        return;
    }

    public void onDestroyOptionsMenu()
    {
        return;
    }

    public void onDestroyView()
    {
        this.mCalled = 1;
        return;
    }

    public void onDetach()
    {
        this.mCalled = 1;
        return;
    }

    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle p1)
    {
        return this.getLayoutInflater(p1);
    }

    public void onHiddenChanged(boolean p1)
    {
        return;
    }

    public void onInflate(android.app.Activity p1, android.util.AttributeSet p2, android.os.Bundle p3)
    {
        this.mCalled = 1;
        return;
    }

    public void onInflate(android.content.Context p2, android.util.AttributeSet p3, android.os.Bundle p4)
    {
        androidx.fragment.app.j0 v2_2;
        this.mCalled = 1;
        androidx.fragment.app.j0 v2_1 = this.mHost;
        if (v2_1 != null) {
            v2_2 = v2_1.a;
        } else {
            v2_2 = 0;
        }
        if (v2_2 != null) {
            this.mCalled = 0;
            this.onInflate(v2_2, p3, p4);
        }
        return;
    }

    public void onLowMemory()
    {
        this.mCalled = 1;
        return;
    }

    public void onMultiWindowModeChanged(boolean p1)
    {
        return;
    }

    public boolean onOptionsItemSelected(android.view.MenuItem p1)
    {
        return 0;
    }

    public void onOptionsMenuClosed(android.view.Menu p1)
    {
        return;
    }

    public void onPause()
    {
        this.mCalled = 1;
        return;
    }

    public void onPictureInPictureModeChanged(boolean p1)
    {
        return;
    }

    public void onPrepareOptionsMenu(android.view.Menu p1)
    {
        return;
    }

    public void onPrimaryNavigationFragmentChanged(boolean p1)
    {
        return;
    }

    public void onRequestPermissionsResult(int p1, String[] p2, int[] p3)
    {
        return;
    }

    public void onResume()
    {
        this.mCalled = 1;
        return;
    }

    public void onSaveInstanceState(android.os.Bundle p1)
    {
        return;
    }

    public void onStart()
    {
        this.mCalled = 1;
        return;
    }

    public void onStop()
    {
        this.mCalled = 1;
        return;
    }

    public void onViewCreated(android.view.View p1, android.os.Bundle p2)
    {
        return;
    }

    public void onViewStateRestored(android.os.Bundle p1)
    {
        this.mCalled = 1;
        return;
    }

    public void performActivityCreated(android.os.Bundle p4)
    {
        this.mChildFragmentManager.M();
        this.mState = 3;
        this.mCalled = 0;
        this.onActivityCreated(p4);
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onActivityCreated()"));
        } else {
            if (androidx.fragment.app.b1.H(3)) {
                int v4_4 = new StringBuilder("moveto RESTORE_VIEW_STATE: ");
                v4_4.append(this);
                android.util.Log.d("FragmentManager", v4_4.toString());
            }
            if (this.mView != null) {
                int v4_8;
                int v4_7 = this.mSavedFragmentState;
                if (v4_7 == 0) {
                    v4_8 = 0;
                } else {
                    v4_8 = v4_7.getBundle("savedInstanceState");
                }
                this.restoreViewState(v4_8);
            }
            this.mSavedFragmentState = 0;
            int v4_9 = this.mChildFragmentManager;
            v4_9.E = 0;
            v4_9.F = 0;
            v4_9.L.g = 0;
            v4_9.t(4);
            return;
        }
    }

    public void performAttach()
    {
        androidx.fragment.app.b1 v0_0 = this.mOnPreAttachedListeners;
        androidx.fragment.app.f1 v1_0 = v0_0.size();
        androidx.fragment.app.m0 v3_1 = 0;
        while (v3_1 < v1_0) {
            androidx.fragment.app.c0 v4_0 = v0_0.get(v3_1);
            v3_1++;
            ((androidx.fragment.app.c0) v4_0).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, this.createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = 0;
        this.onAttach(this.mHost.b);
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onAttach()"));
        } else {
            androidx.fragment.app.b1 v0_8 = this.mFragmentManager.m.iterator();
            while (v0_8.hasNext()) {
                ((androidx.fragment.app.g1) v0_8.next()).a(this);
            }
            androidx.fragment.app.b1 v0_9 = this.mChildFragmentManager;
            v0_9.E = 0;
            v0_9.F = 0;
            v0_9.L.g = 0;
            v0_9.t(0);
            return;
        }
    }

    public void performConfigurationChanged(android.content.res.Configuration p1)
    {
        this.onConfigurationChanged(p1);
        return;
    }

    public boolean performContextItemSelected(android.view.MenuItem p2)
    {
        if (this.mHidden) {
            return 0;
        } else {
            if (!this.onContextItemSelected(p2)) {
                return this.mChildFragmentManager.i(p2);
            } else {
                return 1;
            }
        }
    }

    public void performCreate(android.os.Bundle p4)
    {
        this.mChildFragmentManager.M();
        this.mState = 1;
        this.mCalled = 0;
        this.mLifecycleRegistry.a(new androidx.fragment.app.y(this));
        this.onCreate(p4);
        this.mIsCreated = 1;
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onCreate()"));
        } else {
            this.mLifecycleRegistry.e(androidx.lifecycle.n.ON_CREATE);
            return;
        }
    }

    public boolean performCreateOptionsMenu(android.view.Menu p3, android.view.MenuInflater p4)
    {
        int v1 = 0;
        if (this.mHidden) {
            return 0;
        } else {
            if ((this.mHasMenu) && (this.mMenuVisible)) {
                this.onCreateOptionsMenu(p3, p4);
                v1 = 1;
            }
            return (this.mChildFragmentManager.j(p3, p4) | v1);
        }
    }

    public void performCreateView(android.view.LayoutInflater p5, android.view.ViewGroup p6, android.os.Bundle p7)
    {
        this.mChildFragmentManager.M();
        this.mPerformedCreateView = 1;
        this.mViewLifecycleOwner = new androidx.fragment.app.v1(this, this.getViewModelStore(), new androidx.fragment.app.t(this, 0));
        IllegalStateException v5_1 = this.onCreateView(p5, p6, p7);
        this.mView = v5_1;
        if (v5_1 == null) {
            if (this.mViewLifecycleOwner.d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            } else {
                this.mViewLifecycleOwner = 0;
                return;
            }
        } else {
            this.mViewLifecycleOwner.b();
            if (androidx.fragment.app.b1.H(3)) {
                IllegalStateException v5_11 = new StringBuilder("Setting ViewLifecycleOwner on View ");
                v5_11.append(this.mView);
                v5_11.append(" for Fragment ");
                v5_11.append(this);
                android.util.Log.d("FragmentManager", v5_11.toString());
            }
            IllegalStateException v5_13 = this.mView;
            String v6_6 = this.mViewLifecycleOwner;
            kotlin.jvm.internal.j.e(v5_13, "<this>");
            v5_13.setTag(2131362596, v6_6);
            IllegalStateException v5_14 = this.mView;
            String v6_7 = this.mViewLifecycleOwner;
            kotlin.jvm.internal.j.e(v5_14, "<this>");
            v5_14.setTag(2131362600, v6_7);
            IllegalStateException v5_15 = this.mView;
            String v6_8 = this.mViewLifecycleOwner;
            kotlin.jvm.internal.j.e(v5_15, "<this>");
            v5_15.setTag(2131362599, v6_8);
            this.mViewLifecycleOwnerLiveData.h(this.mViewLifecycleOwner);
            return;
        }
    }

    public void performDestroy()
    {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.e(androidx.lifecycle.n.ON_DESTROY);
        this.mState = 0;
        this.mCalled = 0;
        this.mIsCreated = 0;
        this.onDestroy();
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onDestroy()"));
        } else {
            return;
        }
    }

    public void performDestroyView()
    {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            androidx.fragment.app.b2 v0_7 = this.mViewLifecycleOwner;
            v0_7.b();
            if (v0_7.d.c.compareTo(androidx.lifecycle.o.c) >= 0) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.n.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = 0;
        this.onDestroyView();
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onDestroyView()"));
        } else {
            String v1_6 = q1.b.a(this).b.b;
            String v2_2 = v1_6.c;
            int v3 = 0;
            while (v3 < v2_2) {
                ((q1.c) v1_6.e(v3)).i();
                v3++;
            }
            this.mPerformedCreateView = 0;
            return;
        }
    }

    public void performDetach()
    {
        this.mState = -1;
        this.mCalled = 0;
        this.onDetach();
        this.mLayoutInflater = 0;
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onDetach()"));
        } else {
            androidx.fragment.app.c1 v0_2 = this.mChildFragmentManager;
            if (!v0_2.G) {
                v0_2.k();
                this.mChildFragmentManager = new androidx.fragment.app.c1();
            }
            return;
        }
    }

    public android.view.LayoutInflater performGetLayoutInflater(android.os.Bundle p1)
    {
        android.view.LayoutInflater v1_1 = this.onGetLayoutInflater(p1);
        this.mLayoutInflater = v1_1;
        return v1_1;
    }

    public void performLowMemory()
    {
        this.onLowMemory();
        return;
    }

    public void performMultiWindowModeChanged(boolean p1)
    {
        this.onMultiWindowModeChanged(p1);
        return;
    }

    public boolean performOptionsItemSelected(android.view.MenuItem p2)
    {
        if (this.mHidden) {
            return 0;
        } else {
            if ((!this.mHasMenu) || ((!this.mMenuVisible) || (!this.onOptionsItemSelected(p2)))) {
                return this.mChildFragmentManager.o(p2);
            } else {
                return 1;
            }
        }
    }

    public void performOptionsMenuClosed(android.view.Menu p2)
    {
        if (!this.mHidden) {
            if ((this.mHasMenu) && (this.mMenuVisible)) {
                this.onOptionsMenuClosed(p2);
            }
            this.mChildFragmentManager.p(p2);
        }
        return;
    }

    public void performPause()
    {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.n.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.n.ON_PAUSE);
        this.mState = 6;
        this.mCalled = 0;
        this.onPause();
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onPause()"));
        } else {
            return;
        }
    }

    public void performPictureInPictureModeChanged(boolean p1)
    {
        this.onPictureInPictureModeChanged(p1);
        return;
    }

    public boolean performPrepareOptionsMenu(android.view.Menu p3)
    {
        int v1 = 0;
        if (this.mHidden) {
            return 0;
        } else {
            if ((this.mHasMenu) && (this.mMenuVisible)) {
                this.onPrepareOptionsMenu(p3);
                v1 = 1;
            }
            return (this.mChildFragmentManager.s(p3) | v1);
        }
    }

    public void performPrimaryNavigationFragmentChanged()
    {
        this.mFragmentManager.getClass();
        androidx.fragment.app.b1 v0_2 = androidx.fragment.app.b1.K(this);
        androidx.fragment.app.e0 v1_2 = this.mIsPrimaryNavigationFragment;
        if ((v1_2 != null) && (v1_2.booleanValue() == v0_2)) {
            return;
        } else {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(v0_2);
            this.onPrimaryNavigationFragmentChanged(v0_2);
            androidx.fragment.app.b1 v0_1 = this.mChildFragmentManager;
            v0_1.b0();
            v0_1.q(v0_1.w);
            return;
        }
    }

    public void performResume()
    {
        this.mChildFragmentManager.M();
        this.mChildFragmentManager.x(1);
        this.mState = 7;
        this.mCalled = 0;
        this.onResume();
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onResume()"));
        } else {
            androidx.fragment.app.f1 v3_0 = androidx.lifecycle.n.ON_RESUME;
            this.mLifecycleRegistry.e(v3_0);
            if (this.mView != null) {
                this.mViewLifecycleOwner.d.e(v3_0);
            }
            androidx.fragment.app.b1 v2_6 = this.mChildFragmentManager;
            v2_6.E = 0;
            v2_6.F = 0;
            v2_6.L.g = 0;
            v2_6.t(7);
            return;
        }
    }

    public void performSaveInstanceState(android.os.Bundle p1)
    {
        this.onSaveInstanceState(p1);
        return;
    }

    public void performStart()
    {
        this.mChildFragmentManager.M();
        this.mChildFragmentManager.x(1);
        this.mState = 5;
        this.mCalled = 0;
        this.onStart();
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onStart()"));
        } else {
            androidx.fragment.app.f1 v3_0 = androidx.lifecycle.n.ON_START;
            this.mLifecycleRegistry.e(v3_0);
            if (this.mView != null) {
                this.mViewLifecycleOwner.d.e(v3_0);
            }
            androidx.fragment.app.b1 v2_6 = this.mChildFragmentManager;
            v2_6.E = 0;
            v2_6.F = 0;
            v2_6.L.g = 0;
            v2_6.t(5);
            return;
        }
    }

    public void performStop()
    {
        androidx.fragment.app.b2 v0_0 = this.mChildFragmentManager;
        v0_0.F = 1;
        v0_0.L.g = 1;
        v0_0.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.n.ON_STOP);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
        this.mState = 4;
        this.mCalled = 0;
        this.onStop();
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onStop()"));
        } else {
            return;
        }
    }

    public void performViewCreated()
    {
        androidx.fragment.app.b1 v0_1;
        androidx.fragment.app.b1 v0_0 = this.mSavedFragmentState;
        if (v0_0 == null) {
            v0_1 = 0;
        } else {
            v0_1 = v0_0.getBundle("savedInstanceState");
        }
        this.onViewCreated(this.mView, v0_1);
        this.mChildFragmentManager.t(2);
        return;
    }

    public void postponeEnterTransition()
    {
        this.a().s = 1;
        return;
    }

    public final void postponeEnterTransition(long p3, java.util.concurrent.TimeUnit p5)
    {
        this.a().s = 1;
        android.os.Handler v0_7 = this.mPostponedHandler;
        if (v0_7 != null) {
            v0_7.removeCallbacks(this.mPostponedDurationRunnable);
        }
        android.os.Handler v0_8 = this.mFragmentManager;
        if (v0_8 == null) {
            this.mPostponedHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        } else {
            this.mPostponedHandler = v0_8.t.c;
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, p5.toMillis(p3));
        return;
    }

    public final e.c registerForActivityResult(f.a p3, e.b p4)
    {
        return this.e(p3, new androidx.fragment.app.z(this, 0), p4);
    }

    public final e.c registerForActivityResult(f.a p3, e.i p4, e.b p5)
    {
        return this.e(p3, new androidx.fragment.app.z(p4, 2), p5);
    }

    public void registerForContextMenu(android.view.View p1)
    {
        p1.setOnCreateContextMenuListener(this);
        return;
    }

    public final void requestPermissions(String[] p4, int p5)
    {
        if (this.mHost == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " not attached to Activity"));
        } else {
            String v0_1 = this.getParentFragmentManager();
            if (v0_1.B == null) {
                v0_1.t.getClass();
                return;
            } else {
                v0_1.C.addLast(new androidx.fragment.app.y0(this.mWho, p5));
                v0_1.B.a(p4);
                return;
            }
        }
    }

    public final androidx.fragment.app.j0 requireActivity()
    {
        IllegalStateException v0_0 = this.getActivity();
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " not attached to an activity."));
        } else {
            return v0_0;
        }
    }

    public final android.os.Bundle requireArguments()
    {
        IllegalStateException v0_0 = this.getArguments();
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " does not have any arguments."));
        } else {
            return v0_0;
        }
    }

    public final android.content.Context requireContext()
    {
        IllegalStateException v0_0 = this.getContext();
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " not attached to a context."));
        } else {
            return v0_0;
        }
    }

    public final androidx.fragment.app.b1 requireFragmentManager()
    {
        return this.getParentFragmentManager();
    }

    public final Object requireHost()
    {
        IllegalStateException v0_0 = this.getHost();
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " not attached to a host."));
        } else {
            return v0_0;
        }
    }

    public final androidx.fragment.app.e0 requireParentFragment()
    {
        IllegalStateException v0_0 = this.getParentFragment();
        if (v0_0 != null) {
            return v0_0;
        } else {
            if (this.getContext() != null) {
                StringBuilder v2_0 = new StringBuilder("Fragment ");
                v2_0.append(this);
                v2_0.append(" is not a child Fragment, it is directly attached to ");
                v2_0.append(this.getContext());
                throw new IllegalStateException(v2_0.toString());
            } else {
                throw new IllegalStateException(v1.a.k("Fragment ", this, " is not attached to any Fragment or host"));
            }
        }
    }

    public final android.view.View requireView()
    {
        IllegalStateException v0_0 = this.getView();
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        } else {
            return v0_0;
        }
    }

    public void restoreChildFragmentState()
    {
        androidx.fragment.app.b1 v0_0 = this.mSavedFragmentState;
        if (v0_0 != null) {
            androidx.fragment.app.b1 v0_1 = v0_0.getBundle("childFragmentManager");
            if (v0_1 != null) {
                this.mChildFragmentManager.S(v0_1);
                androidx.fragment.app.b1 v0_2 = this.mChildFragmentManager;
                v0_2.E = 0;
                v0_2.F = 0;
                v0_2.L.g = 0;
                v0_2.t(1);
            }
        }
        return;
    }

    public final void restoreViewState(android.os.Bundle p3)
    {
        androidx.lifecycle.n v0_0 = this.mSavedViewState;
        if (v0_0 != null) {
            this.mView.restoreHierarchyState(v0_0);
            this.mSavedViewState = 0;
        }
        this.mCalled = 0;
        this.onViewStateRestored(p3);
        if (!this.mCalled) {
            throw new androidx.fragment.app.b2(v1.a.k("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        } else {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.n.ON_CREATE);
            }
            return;
        }
    }

    public void setAllowEnterTransitionOverlap(boolean p2)
    {
        this.a().p = Boolean.valueOf(p2);
        return;
    }

    public void setAllowReturnTransitionOverlap(boolean p2)
    {
        this.a().o = Boolean.valueOf(p2);
        return;
    }

    public void setAnimations(int p2, int p3, int p4, int p5)
    {
        if ((this.mAnimationInfo != null) || ((p2 != null) || ((p3 != 0) || ((p4 != 0) || (p5 != 0))))) {
            this.a().b = p2;
            this.a().c = p3;
            this.a().d = p4;
            this.a().e = p5;
            return;
        } else {
            return;
        }
    }

    public void setArguments(android.os.Bundle p2)
    {
        if ((this.mFragmentManager != null) && (this.isStateSaved())) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        } else {
            this.mArguments = p2;
            return;
        }
    }

    public void setEnterSharedElementCallback(d0.b0 p1)
    {
        this.a().getClass();
        return;
    }

    public void setEnterTransition(Object p2)
    {
        this.a().i = p2;
        return;
    }

    public void setExitSharedElementCallback(d0.b0 p1)
    {
        this.a().getClass();
        return;
    }

    public void setExitTransition(Object p2)
    {
        this.a().k = p2;
        return;
    }

    public void setFocusedView(android.view.View p2)
    {
        this.a().r = p2;
        return;
    }

    public void setHasOptionsMenu(boolean p2)
    {
        if (this.mHasMenu != p2) {
            this.mHasMenu = p2;
            if ((this.isAdded()) && (!this.isHidden())) {
                ((androidx.fragment.app.i0) this.mHost).e.invalidateMenu();
            }
        }
        return;
    }

    public void setInitialSavedState(androidx.fragment.app.d0 p2)
    {
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        } else {
            int v2_3;
            if (p2 == 0) {
                v2_3 = 0;
            } else {
                v2_3 = p2.a;
                if (v2_3 == 0) {
                }
            }
            this.mSavedFragmentState = v2_3;
            return;
        }
    }

    public void setMenuVisibility(boolean p2)
    {
        if (this.mMenuVisible != p2) {
            this.mMenuVisible = p2;
            if ((this.mHasMenu) && ((this.isAdded()) && (!this.isHidden()))) {
                ((androidx.fragment.app.i0) this.mHost).e.invalidateMenu();
            }
        }
        return;
    }

    public void setNextTransition(int p2)
    {
        if ((this.mAnimationInfo != null) || (p2 != 0)) {
            this.a();
            this.mAnimationInfo.f = p2;
            return;
        } else {
            return;
        }
    }

    public void setPopDirection(boolean p2)
    {
        if (this.mAnimationInfo != null) {
            this.a().a = p2;
            return;
        } else {
            return;
        }
    }

    public void setPostOnViewCreatedAlpha(float p2)
    {
        this.a().q = p2;
        return;
    }

    public void setReenterTransition(Object p2)
    {
        this.a().l = p2;
        return;
    }

    public void setRetainInstance(boolean p4)
    {
        String v1_1 = new StringBuilder("Attempting to set retain instance for fragment ");
        v1_1.append(this);
        k1.c.b(new k1.d(this, v1_1.toString()));
        k1.c.a(this).getClass();
        this.mRetainInstance = p4;
        androidx.fragment.app.b1 v0_2 = this.mFragmentManager;
        if (v0_2 == null) {
            this.mRetainInstanceChangedWhileDetached = 1;
            return;
        } else {
            if (p4 == null) {
                v0_2.L.g(this);
                return;
            } else {
                v0_2.L.c(this);
                return;
            }
        }
    }

    public void setReturnTransition(Object p2)
    {
        this.a().j = p2;
        return;
    }

    public void setSharedElementEnterTransition(Object p2)
    {
        this.a().m = p2;
        return;
    }

    public void setSharedElementNames(java.util.ArrayList p2, java.util.ArrayList p3)
    {
        this.a();
        androidx.fragment.app.b0 v0 = this.mAnimationInfo;
        v0.g = p2;
        v0.h = p3;
        return;
    }

    public void setSharedElementReturnTransition(Object p2)
    {
        this.a().n = p2;
        return;
    }

    public void setTargetFragment(androidx.fragment.app.e0 p4, int p5)
    {
        if (p4 != null) {
            String v1_4 = new StringBuilder("Attempting to set target fragment ");
            v1_4.append(p4);
            v1_4.append(" with request code ");
            v1_4.append(p5);
            v1_4.append(" for fragment ");
            v1_4.append(this);
            k1.c.b(new k1.e(this, v1_4.toString()));
            k1.c.a(this).getClass();
        }
        int v2_1;
        androidx.fragment.app.b1 v0_3 = this.mFragmentManager;
        if (p4 == null) {
            v2_1 = 0;
        } else {
            v2_1 = p4.mFragmentManager;
        }
        if ((v0_3 != null) && ((v2_1 != 0) && (v0_3 != v2_1))) {
            throw new IllegalArgumentException(v1.a.k("Fragment ", p4, " must share the same FragmentManager to be set as a target fragment"));
        } else {
            androidx.fragment.app.b1 v0_5 = p4;
            while (v0_5 != null) {
                if (v0_5.equals(this)) {
                    androidx.fragment.app.b1 v0_9 = new StringBuilder("Setting ");
                    v0_9.append(p4);
                    v0_9.append(" as the target of ");
                    v0_9.append(this);
                    v0_9.append(" would create a target cycle");
                    throw new IllegalArgumentException(v0_9.toString());
                } else {
                    v0_5 = v0_5.c(0);
                }
            }
            if (p4 != null) {
                if ((this.mFragmentManager == null) || (p4.mFragmentManager == null)) {
                    this.mTargetWho = 0;
                    this.mTarget = p4;
                } else {
                    this.mTargetWho = p4.mWho;
                    this.mTarget = 0;
                }
            } else {
                this.mTargetWho = 0;
                this.mTarget = 0;
            }
            this.mTargetRequestCode = p5;
            return;
        }
    }

    public void setUserVisibleHint(boolean p8)
    {
        int v1_3 = new StringBuilder("Attempting to set user visible hint to ");
        v1_3.append(p8);
        v1_3.append(" for fragment ");
        v1_3.append(this);
        k1.c.b(new k1.a(this, v1_3.toString()));
        k1.c.a(this).getClass();
        int v1_1 = 0;
        if ((!this.mUserVisibleHint) && ((p8 != null) && ((this.mState < 5) && ((this.mFragmentManager != null) && ((this.isAdded()) && (this.mIsCreated)))))) {
            androidx.fragment.app.b1 v0_8 = this.mFragmentManager;
            androidx.fragment.app.j1 v4 = v0_8.f(this);
            androidx.fragment.app.e0 v5 = v4.c;
            if (v5.mDeferStart) {
                if (!v0_8.b) {
                    v5.mDeferStart = 0;
                    v4.k();
                } else {
                    v0_8.H = 1;
                }
            }
        }
        this.mUserVisibleHint = p8;
        if ((this.mState < 5) && (p8 == null)) {
            v1_1 = 1;
        }
        this.mDeferStart = v1_1;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(p8);
        }
        return;
    }

    public boolean shouldShowRequestPermissionRationale(String p6)
    {
        androidx.fragment.app.j0 v0_0 = this.mHost;
        if (v0_0 == null) {
            return 0;
        } else {
            androidx.fragment.app.j0 v0_2 = ((androidx.fragment.app.i0) v0_0).e;
            reflect.Method v2_2 = android.os.Build$VERSION.SDK_INT;
            if ((v2_2 >= 33) || (!android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", p6))) {
                if (v2_2 < 32) {
                    if (v2_2 != 31) {
                        return v0_2.shouldShowRequestPermissionRationale(p6);
                    } else {
                        try {
                            boolean v6_2 = ((Boolean) android.content.pm.PackageManager.getMethod("shouldShowRequestPermissionRationale", new Class[] {String})).invoke(v0_2.getApplication().getPackageManager(), new Object[] {p6}))).booleanValue();
                        } catch (IllegalAccessException) {
                            v6_2 = v0_2.shouldShowRequestPermissionRationale(v6_2);
                        }
                        return v6_2;
                    }
                } else {
                    return v0_2.shouldShowRequestPermissionRationale(p6);
                }
            } else {
                return 0;
            }
        }
    }

    public void startActivity(android.content.Intent p2)
    {
        this.startActivity(p2, 0);
        return;
    }

    public void startActivity(android.content.Intent p2, android.os.Bundle p3)
    {
        String v0_0 = this.mHost;
        if (v0_0 == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " not attached to Activity"));
        } else {
            e0.c.startActivity(v0_0.b, p2, p3);
            return;
        }
    }

    public void startActivityForResult(android.content.Intent p2, int p3)
    {
        this.startActivityForResult(p2, p3, 0);
        return;
    }

    public void startActivityForResult(android.content.Intent p4, int p5, android.os.Bundle p6)
    {
        if (this.mHost == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " not attached to Activity"));
        } else {
            androidx.fragment.app.o0 v0_1 = this.getParentFragmentManager();
            if (v0_1.z == null) {
                androidx.fragment.app.o0 v0_2 = v0_1.t;
                if (p5 != -1) {
                    v0_2.getClass();
                    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
                } else {
                    e0.c.startActivity(v0_2.b, p4, p6);
                    return;
                }
            } else {
                v0_1.C.addLast(new androidx.fragment.app.y0(this.mWho, p5));
                if (p6 != null) {
                    p4.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", p6);
                }
                v0_1.z.a(p4);
                return;
            }
        }
    }

    public void startIntentSenderForResult(android.content.IntentSender p9, int p10, android.content.Intent p11, int p12, int p13, int p14, android.os.Bundle p15)
    {
        if (this.mHost == null) {
            throw new IllegalStateException(v1.a.k("Fragment ", this, " not attached to Activity"));
        } else {
            if (androidx.fragment.app.b1.H(2)) {
                java.util.ArrayDeque v2_2 = new StringBuilder("Fragment ");
                v2_2.append(this);
                v2_2.append(" received the following in startIntentSenderForResult() requestCode: ");
                v2_2.append(p10);
                v2_2.append(" IntentSender: ");
                v2_2.append(p9);
                v2_2.append(" fillInIntent: ");
                v2_2.append(p11);
                v2_2.append(" options: ");
                v2_2.append(p15);
                android.util.Log.v("FragmentManager", v2_2.toString());
            }
            java.util.ArrayDeque v2_4 = this.getParentFragmentManager();
            if (v2_4.A == null) {
                androidx.fragment.app.j0 v0_1 = v2_4.t;
                if (p10 != -1) {
                    v0_1.getClass();
                    throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
                } else {
                    v0_1.a.startIntentSenderForResult(p9, p10, p11, p12, p13, p14, p15);
                    return;
                }
            } else {
                if (p15 != null) {
                    if (p11 == null) {
                        p11 = new android.content.Intent();
                        p11.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", 1);
                    }
                    if (androidx.fragment.app.b1.H(2)) {
                        String v4_9 = new StringBuilder("ActivityOptions ");
                        v4_9.append(p15);
                        v4_9.append(" were added to fillInIntent ");
                        v4_9.append(p11);
                        v4_9.append(" for fragment ");
                        v4_9.append(this);
                        android.util.Log.v("FragmentManager", v4_9.toString());
                    }
                    p11.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", p15);
                }
                kotlin.jvm.internal.j.e(p9, "intentSender");
                String v4_14 = new e.k(p9, p11, p12, p13);
                v2_4.C.addLast(new androidx.fragment.app.y0(this.mWho, p10));
                if (androidx.fragment.app.b1.H(2)) {
                    e.h v9_9 = new StringBuilder("Fragment ");
                    v9_9.append(this);
                    v9_9.append("is launching an IntentSender for result ");
                    android.util.Log.v("FragmentManager", v9_9.toString());
                }
                v2_4.A.a(v4_14);
                return;
            }
        }
    }

    public void startPostponedEnterTransition()
    {
        if ((this.mAnimationInfo != null) && (this.a().s)) {
            if (this.mHost != null) {
                if (android.os.Looper.myLooper() == this.mHost.c.getLooper()) {
                    this.callStartTransitionListener(1);
                } else {
                    this.mHost.c.postAtFrontOfQueue(new androidx.fragment.app.v(this, 1));
                    return;
                }
            } else {
                this.a().s = 0;
                return;
            }
        }
        return;
    }

    public String toString()
    {
        String v0_1 = new StringBuilder(128);
        v0_1.append(this.getClass().getSimpleName());
        v0_1.append("{");
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        v0_1.append("} (");
        v0_1.append(this.mWho);
        if (this.mFragmentId != 0) {
            v0_1.append(" id=0x");
            v0_1.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            v0_1.append(" tag=");
            v0_1.append(this.mTag);
        }
        v0_1.append(")");
        return v0_1.toString();
    }

    public void unregisterForContextMenu(android.view.View p2)
    {
        p2.setOnCreateContextMenuListener(0);
        return;
    }
}
