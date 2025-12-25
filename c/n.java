package c;
public abstract class n extends d0.g implements androidx.lifecycle.b1, androidx.lifecycle.j, b2.g, c.w, e.j, e0.d, e0.e, d0.y, d0.z, q0.l {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c.h Companion;
    private androidx.lifecycle.a1 _viewModelStore;
    private final e.i activityResultRegistry;
    private int contentLayoutId;
    private final d.a contextAwareHelper;
    private final h7.d defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final h7.d fullyDrawnReporter$delegate;
    private final q0.o menuHostHelper;
    private final java.util.concurrent.atomic.AtomicInteger nextLocalRequestCode;
    private final h7.d onBackPressedDispatcher$delegate;
    private final h7.d onBackPressedInput$delegate;
    private final java.util.concurrent.CopyOnWriteArrayList onConfigurationChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList onMultiWindowModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList onNewIntentListeners;
    private final java.util.concurrent.CopyOnWriteArrayList onPictureInPictureModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList onTrimMemoryListeners;
    private final java.util.concurrent.CopyOnWriteArrayList onUserLeaveHintListeners;
    private final c.j reportFullyDrawnExecutor;
    private final b2.f savedStateRegistryController;

    static n()
    {
        c.n.Companion = new c.h();
        return;
    }

    public n()
    {
        this.contextAwareHelper = new d.a();
        this.menuHostHelper = new q0.o(new c.b(this, 0));
        IllegalStateException v0_4 = new c2.a(this, new a8.j(this, 2));
        this.savedStateRegistryController = new b2.f(v0_4);
        this.reportFullyDrawnExecutor = new c.k(this);
        this.fullyDrawnReporter$delegate = a.a.F(new c.c(this, 1));
        this.nextLocalRequestCode = new java.util.concurrent.atomic.AtomicInteger();
        this.activityResultRegistry = new c.m(this);
        this.onConfigurationChangedListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.onTrimMemoryListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.onNewIntentListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.onMultiWindowModeChangedListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.onPictureInPictureModeChangedListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.onUserLeaveHintListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.onBackPressedInput$delegate = a.a.F(new c.c(this, 2));
        if (this.getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        } else {
            this.getLifecycle().a(new c.e(this, 0));
            this.getLifecycle().a(new c.e(this, 1));
            this.getLifecycle().a(new b2.b(this, 1));
            v0_4.a();
            androidx.lifecycle.q0.d(this);
            this.getSavedStateRegistry().c("android:support:activity-result", new c.f(this, 0));
            this.addOnContextAvailableListener(new c.g(this));
            this.defaultViewModelProviderFactory$delegate = a.a.F(new c.c(this, 3));
            this.onBackPressedDispatcher$delegate = a.a.F(new c.c(this, 4));
            return;
        }
    }

    public static android.os.Bundle a(c.n p4)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        String v4_1 = p4.activityResultRegistry;
        v4_1.getClass();
        String v2_4 = v4_1.b;
        v0_1.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new java.util.ArrayList(v2_4.values()));
        v0_1.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new java.util.ArrayList(v2_4.keySet()));
        v0_1.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new java.util.ArrayList(v4_1.d));
        v0_1.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new android.os.Bundle(v4_1.g));
        return v0_1;
    }

    public static final void access$ensureViewModelStore(c.n p1)
    {
        if (p1._viewModelStore == null) {
            androidx.lifecycle.a1 v0_4 = ((c.i) p1.getLastNonConfigurationInstance());
            if (v0_4 != null) {
                p1._viewModelStore = v0_4.b;
            }
            if (p1._viewModelStore == null) {
                p1._viewModelStore = new androidx.lifecycle.a1();
            }
        }
        return;
    }

    public static void b(c.v p0, c.n p1, androidx.lifecycle.u p2, androidx.lifecycle.n p3)
    {
        if (p3 == androidx.lifecycle.n.ON_CREATE) {
            android.window.OnBackInvokedDispatcher v1_1 = p1.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.j.d(v1_1, "getOnBackInvokedDispatcher(...)");
            p0.b(v1_1);
        }
        return;
    }

    public static c.q c(c.n p4)
    {
        return new c.q(p4.reportFullyDrawnExecutor, new c.c(p4, 0));
    }

    public static void d(c.n p0, androidx.lifecycle.u p1, androidx.lifecycle.n p2)
    {
        if (p2 == androidx.lifecycle.n.ON_DESTROY) {
            p0.contextAwareHelper.b = 0;
            if (!p0.isChangingConfigurations()) {
                p0.getViewModelStore().a();
            }
            c.k v0_2 = ((c.k) p0.reportFullyDrawnExecutor);
            android.view.ViewTreeObserver v1_1 = v0_2.d;
            v1_1.getWindow().getDecorView().removeCallbacks(v0_2);
            v1_1.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(v0_2);
        }
        return;
    }

    public static void e(c.n p2)
    {
        try {
            super.onBackPressed();
            return;
        } catch (NullPointerException v2_0) {
            if (!kotlin.jvm.internal.j.a(v2_0.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw v2_0;
            } else {
                return;
            }
        } catch (NullPointerException v2_1) {
            if (!kotlin.jvm.internal.j.a(v2_1.getMessage(), "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference")) {
                throw v2_1;
            } else {
                return;
            }
        }
    }

    public static void f(c.n p9, android.content.Context p10)
    {
        kotlin.jvm.internal.j.e(p10, "it");
        int v10_4 = p9.getSavedStateRegistry().a("android:support:activity-result");
        if (v10_4 != 0) {
            int v9_3 = p9.activityResultRegistry;
            java.util.LinkedHashMap v0_2 = v9_3.b;
            java.util.LinkedHashMap v1 = v9_3.a;
            android.os.Bundle v2 = v9_3.g;
            java.util.ArrayList v3_1 = v10_4.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            java.util.ArrayList v4_1 = v10_4.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if ((v4_1 != null) && (v3_1 != null)) {
                int v5_1 = v10_4.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (v5_1 != 0) {
                    v9_3.d.addAll(v5_1);
                }
                int v10_1 = v10_4.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (v10_1 != 0) {
                    v2.putAll(v10_1);
                }
                int v10_3 = v4_1.size();
                int v5_3 = 0;
                while (v5_3 < v10_3) {
                    boolean v6_2 = ((String) v4_1.get(v5_3));
                    if ((v0_2.containsKey(v6_2)) && (!v2.containsKey(v6_2))) {
                        if (((v1 instanceof v7.a)) && (!(v1 instanceof v7.b))) {
                            kotlin.jvm.internal.u.e(v1, "kotlin.collections.MutableMap");
                            throw 0;
                        } else {
                            v1.remove(((Integer) v0_2.remove(v6_2)));
                        }
                    }
                    boolean v6_6 = v3_1.get(v5_3);
                    kotlin.jvm.internal.j.d(v6_6, "get(...)");
                    boolean v6_8 = ((Number) v6_6).intValue();
                    String v8_0 = v4_1.get(v5_3);
                    kotlin.jvm.internal.j.d(v8_0, "get(...)");
                    String v8_1 = ((String) v8_0);
                    v1.put(Integer.valueOf(v6_8), v8_1);
                    v9_3.b.put(v8_1, Integer.valueOf(v6_8));
                    v5_3++;
                }
            }
        }
        return;
    }

    public void addContentView(android.view.View p4, android.view.ViewGroup$LayoutParams p5)
    {
        this.initializeViewTreeOwners();
        c.k v0_0 = this.reportFullyDrawnExecutor;
        android.view.View v1_1 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v1_1, "getDecorView(...)");
        ((c.k) v0_0).a(v1_1);
        super.addContentView(p4, p5);
        return;
    }

    public void addMenuProvider(q0.p p3)
    {
        kotlin.jvm.internal.j.e(p3, "provider");
        q0.o v0_1 = this.menuHostHelper;
        v0_1.b.add(p3);
        v0_1.a.run();
        return;
    }

    public void addMenuProvider(q0.p p6, androidx.lifecycle.u p7)
    {
        kotlin.jvm.internal.j.e(p6, "provider");
        kotlin.jvm.internal.j.e(p7, "owner");
        q0.n v0_4 = this.menuHostHelper;
        v0_4.b.add(p6);
        v0_4.a.run();
        androidx.lifecycle.p v7_1 = p7.getLifecycle();
        java.util.HashMap v1_0 = v0_4.c;
        c.d v2_1 = ((q0.n) v1_0.remove(p6));
        if (v2_1 != null) {
            v2_1.a.b(v2_1.b);
            v2_1.b = 0;
        }
        v1_0.put(p6, new q0.n(v7_1, new c.d(1, v0_4, p6)));
        return;
    }

    public void addMenuProvider(q0.p p6, androidx.lifecycle.u p7, androidx.lifecycle.o p8)
    {
        kotlin.jvm.internal.j.e(p6, "provider");
        kotlin.jvm.internal.j.e(p7, "owner");
        kotlin.jvm.internal.j.e(p8, "state");
        q0.o v0_3 = this.menuHostHelper;
        v0_3.getClass();
        androidx.lifecycle.p v7_1 = p7.getLifecycle();
        java.util.HashMap v1 = v0_3.c;
        q0.m v2_1 = ((q0.n) v1.remove(p6));
        if (v2_1 != null) {
            v2_1.a.b(v2_1.b);
            v2_1.b = 0;
        }
        v1.put(p6, new q0.n(v7_1, new q0.m(v0_3, p8, p6)));
        return;
    }

    public final void addOnConfigurationChangedListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onConfigurationChangedListeners.add(p2);
        return;
    }

    public final void addOnContextAvailableListener(d.b p3)
    {
        kotlin.jvm.internal.j.e(p3, "listener");
        java.util.concurrent.CopyOnWriteArraySet v0_1 = this.contextAwareHelper;
        v0_1.getClass();
        c.n v1 = v0_1.b;
        if (v1 != null) {
            p3.a(v1);
        }
        v0_1.a.add(p3);
        return;
    }

    public final void addOnMultiWindowModeChangedListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onMultiWindowModeChangedListeners.add(p2);
        return;
    }

    public final void addOnNewIntentListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onNewIntentListeners.add(p2);
        return;
    }

    public final void addOnPictureInPictureModeChangedListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onPictureInPictureModeChangedListeners.add(p2);
        return;
    }

    public final void addOnTrimMemoryListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onTrimMemoryListeners.add(p2);
        return;
    }

    public final void addOnUserLeaveHintListener(Runnable p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onUserLeaveHintListeners.add(p2);
        return;
    }

    public final e.i getActivityResultRegistry()
    {
        return this.activityResultRegistry;
    }

    public o1.b getDefaultViewModelCreationExtras()
    {
        o1.c v0_1 = new o1.c(0);
        java.util.LinkedHashMap v2 = v0_1.a;
        if (this.getApplication() != null) {
            v2.put(androidx.lifecycle.w0.d, this.getApplication());
        }
        int v1_4;
        v2.put(androidx.lifecycle.q0.a, this);
        v2.put(androidx.lifecycle.q0.b, this);
        int v1_3 = this.getIntent();
        if (v1_3 == 0) {
            v1_4 = 0;
        } else {
            v1_4 = v1_3.getExtras();
        }
        if (v1_4 != 0) {
            v2.put(androidx.lifecycle.q0.c, v1_4);
        }
        return v0_1;
    }

    public androidx.lifecycle.x0 getDefaultViewModelProviderFactory()
    {
        return ((androidx.lifecycle.x0) this.defaultViewModelProviderFactory$delegate.getValue());
    }

    public c.q getFullyDrawnReporter()
    {
        return ((c.q) this.fullyDrawnReporter$delegate.getValue());
    }

    public Object getLastCustomNonConfigurationInstance()
    {
        int v0_1 = ((c.i) this.getLastNonConfigurationInstance());
        if (v0_1 == 0) {
            return 0;
        } else {
            return v0_1.a;
        }
    }

    public androidx.lifecycle.p getLifecycle()
    {
        return super.getLifecycle();
    }

    public s1.c getNavigationEventDispatcher()
    {
        return this.getOnBackPressedDispatcher().b;
    }

    public final c.v getOnBackPressedDispatcher()
    {
        return ((c.v) this.onBackPressedDispatcher$delegate.getValue());
    }

    public final b2.e getSavedStateRegistry()
    {
        return this.savedStateRegistryController.b;
    }

    public androidx.lifecycle.a1 getViewModelStore()
    {
        if (this.getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call.");
        } else {
            if (this._viewModelStore == null) {
                androidx.lifecycle.a1 v0_2 = ((c.i) this.getLastNonConfigurationInstance());
                if (v0_2 != null) {
                    this._viewModelStore = v0_2.b;
                }
                if (this._viewModelStore == null) {
                    this._viewModelStore = new androidx.lifecycle.a1();
                }
            }
            androidx.lifecycle.a1 v0_7 = this._viewModelStore;
            kotlin.jvm.internal.j.b(v0_7);
            return v0_7;
        }
    }

    public void initializeViewTreeOwners()
    {
        android.view.View v0_6 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v0_6, "getDecorView(...)");
        v0_6.setTag(2131362596, this);
        android.view.View v0_1 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v0_1, "getDecorView(...)");
        v0_1.setTag(2131362600, this);
        android.view.View v0_3 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v0_3, "getDecorView(...)");
        v0_3.setTag(2131362599, this);
        android.view.View v0_5 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v0_5, "getDecorView(...)");
        v0_5.setTag(2131362598, this);
        android.view.View v0_8 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v0_8, "getDecorView(...)");
        v0_8.setTag(2131362353, this);
        android.view.View v0_10 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v0_10, "getDecorView(...)");
        v0_10.setTag(2131362597, this);
        return;
    }

    public void invalidateMenu()
    {
        this.invalidateOptionsMenu();
        return;
    }

    public void onActivityResult(int p2, int p3, android.content.Intent p4)
    {
        if (!this.activityResultRegistry.a(p2, p3, p4)) {
            super.onActivityResult(p2, p3, p4);
        }
        return;
    }

    public void onBackPressed()
    {
        ((s1.a) this.onBackPressedInput$delegate.getValue()).a();
        return;
    }

    public void onConfigurationChanged(android.content.res.Configuration p3)
    {
        kotlin.jvm.internal.j.e(p3, "newConfig");
        super.onConfigurationChanged(p3);
        java.util.Iterator v0_2 = this.onConfigurationChangedListeners.iterator();
        kotlin.jvm.internal.j.d(v0_2, "iterator(...)");
        while (v0_2.hasNext()) {
            ((p0.a) v0_2.next()).accept(p3);
        }
        return;
    }

    public void onCreate(android.os.Bundle p3)
    {
        this.savedStateRegistryController.a(p3);
        java.util.Iterator v0_1 = this.contextAwareHelper;
        v0_1.getClass();
        v0_1.b = this;
        java.util.Iterator v0_3 = v0_1.a.iterator();
        while (v0_3.hasNext()) {
            ((d.b) v0_3.next()).a(this);
        }
        super.onCreate(p3);
        androidx.lifecycle.k0.b(this);
        int v3_1 = this.contentLayoutId;
        if (v3_1 != 0) {
            this.setContentView(v3_1);
        }
        return;
    }

    public boolean onCreatePanelMenu(int p3, android.view.Menu p4)
    {
        kotlin.jvm.internal.j.e(p4, "menu");
        if (p3 == 0) {
            super.onCreatePanelMenu(p3, p4);
            int v3_2 = this.menuHostHelper;
            android.view.MenuInflater v0_1 = this.getMenuInflater();
            int v3_4 = v3_2.b.iterator();
            while (v3_4.hasNext()) {
                ((androidx.fragment.app.u0) ((q0.p) v3_4.next())).a.j(p4, v0_1);
            }
        }
        return 1;
    }

    public boolean onMenuItemSelected(int p2, android.view.MenuItem p3)
    {
        kotlin.jvm.internal.j.e(p3, "item");
        if (!super.onMenuItemSelected(p2, p3)) {
            if (p2 != 0) {
                return 0;
            } else {
                return this.menuHostHelper.a(p3);
            }
        } else {
            return 1;
        }
    }

    public void onMultiWindowModeChanged(boolean p4)
    {
        if (!this.dispatchingOnMultiWindowModeChanged) {
            java.util.Iterator v0_2 = this.onMultiWindowModeChangedListeners.iterator();
            kotlin.jvm.internal.j.d(v0_2, "iterator(...)");
            while (v0_2.hasNext()) {
                ((p0.a) v0_2.next()).accept(new d0.i(p4));
            }
        }
        return;
    }

    public void onMultiWindowModeChanged(boolean p3, android.content.res.Configuration p4)
    {
        kotlin.jvm.internal.j.e(p4, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = 1;
        try {
            super.onMultiWindowModeChanged(p3, p4);
            this.dispatchingOnMultiWindowModeChanged = 0;
            java.util.Iterator v4_2 = this.onMultiWindowModeChangedListeners.iterator();
            kotlin.jvm.internal.j.d(v4_2, "iterator(...)");
        } catch (Throwable v3_1) {
            this.dispatchingOnMultiWindowModeChanged = "iterator(...)";
            throw v3_1;
        }
        while (v4_2.hasNext()) {
            ((p0.a) v4_2.next()).accept(new d0.i(p3));
        }
        return;
    }

    public void onNewIntent(android.content.Intent p3)
    {
        kotlin.jvm.internal.j.e(p3, "intent");
        super.onNewIntent(p3);
        java.util.Iterator v0_2 = this.onNewIntentListeners.iterator();
        kotlin.jvm.internal.j.d(v0_2, "iterator(...)");
        while (v0_2.hasNext()) {
            ((p0.a) v0_2.next()).accept(p3);
        }
        return;
    }

    public void onPanelClosed(int p3, android.view.Menu p4)
    {
        kotlin.jvm.internal.j.e(p4, "menu");
        java.util.Iterator v0_3 = this.menuHostHelper.b.iterator();
        while (v0_3.hasNext()) {
            ((androidx.fragment.app.u0) ((q0.p) v0_3.next())).a.p(p4);
        }
        super.onPanelClosed(p3, p4);
        return;
    }

    public void onPictureInPictureModeChanged(boolean p4)
    {
        if (!this.dispatchingOnPictureInPictureModeChanged) {
            java.util.Iterator v0_2 = this.onPictureInPictureModeChangedListeners.iterator();
            kotlin.jvm.internal.j.d(v0_2, "iterator(...)");
            while (v0_2.hasNext()) {
                ((p0.a) v0_2.next()).accept(new d0.a0(p4));
            }
        }
        return;
    }

    public void onPictureInPictureModeChanged(boolean p3, android.content.res.Configuration p4)
    {
        kotlin.jvm.internal.j.e(p4, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = 1;
        try {
            super.onPictureInPictureModeChanged(p3, p4);
            this.dispatchingOnPictureInPictureModeChanged = 0;
            java.util.Iterator v4_2 = this.onPictureInPictureModeChangedListeners.iterator();
            kotlin.jvm.internal.j.d(v4_2, "iterator(...)");
        } catch (Throwable v3_1) {
            this.dispatchingOnPictureInPictureModeChanged = "iterator(...)";
            throw v3_1;
        }
        while (v4_2.hasNext()) {
            ((p0.a) v4_2.next()).accept(new d0.a0(p3));
        }
        return;
    }

    public boolean onPreparePanel(int p2, android.view.View p3, android.view.Menu p4)
    {
        kotlin.jvm.internal.j.e(p4, "menu");
        if (p2 == 0) {
            super.onPreparePanel(p2, p3, p4);
            int v2_4 = this.menuHostHelper.b.iterator();
            while (v2_4.hasNext()) {
                ((androidx.fragment.app.u0) ((q0.p) v2_4.next())).a.s(p4);
            }
        }
        return 1;
    }

    public void onRequestPermissionsResult(int p4, String[] p5, int[] p6)
    {
        kotlin.jvm.internal.j.e(p5, "permissions");
        kotlin.jvm.internal.j.e(p6, "grantResults");
        if (!this.activityResultRegistry.a(p4, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", p5).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", p6))) {
            super.onRequestPermissionsResult(p4, p5, p6);
        }
        return;
    }

    public Object onRetainCustomNonConfigurationInstance()
    {
        return 0;
    }

    public final Object onRetainNonConfigurationInstance()
    {
        int v0_0 = this.onRetainCustomNonConfigurationInstance();
        androidx.lifecycle.a1 v1 = this._viewModelStore;
        if (v1 == null) {
            c.i v2_3 = ((c.i) this.getLastNonConfigurationInstance());
            if (v2_3 != null) {
                v1 = v2_3.b;
            }
        }
        if ((v1 != null) || (v0_0 != 0)) {
            c.i v2_1 = new c.i();
            v2_1.a = v0_0;
            v2_1.b = v1;
            return v2_1;
        } else {
            return 0;
        }
    }

    public void onSaveInstanceState(android.os.Bundle p3)
    {
        kotlin.jvm.internal.j.e(p3, "outState");
        if ((this.getLifecycle() instanceof androidx.lifecycle.w)) {
            b2.f v0_5 = this.getLifecycle();
            kotlin.jvm.internal.j.c(v0_5, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.w) v0_5).g();
        }
        super.onSaveInstanceState(p3);
        this.savedStateRegistryController.b(p3);
        return;
    }

    public void onTrimMemory(int p4)
    {
        super.onTrimMemory(p4);
        java.util.Iterator v0_1 = this.onTrimMemoryListeners.iterator();
        kotlin.jvm.internal.j.d(v0_1, "iterator(...)");
        while (v0_1.hasNext()) {
            ((p0.a) v0_1.next()).accept(Integer.valueOf(p4));
        }
        return;
    }

    public void onUserLeaveHint()
    {
        super.onUserLeaveHint();
        java.util.Iterator v0_1 = this.onUserLeaveHintListeners.iterator();
        kotlin.jvm.internal.j.d(v0_1, "iterator(...)");
        while (v0_1.hasNext()) {
            ((Runnable) v0_1.next()).run();
        }
        return;
    }

    public android.content.Context peekAvailableContext()
    {
        return this.contextAwareHelper.b;
    }

    public final e.c registerForActivityResult(f.a p2, e.b p3)
    {
        kotlin.jvm.internal.j.e(p2, "contract");
        kotlin.jvm.internal.j.e(p3, "callback");
        return this.registerForActivityResult(p2, this.activityResultRegistry, p3);
    }

    public final e.c registerForActivityResult(f.a p3, e.i p4, e.b p5)
    {
        kotlin.jvm.internal.j.e(p3, "contract");
        kotlin.jvm.internal.j.e(p4, "registry");
        kotlin.jvm.internal.j.e(p5, "callback");
        String v0_5 = new StringBuilder("activity_rq#");
        v0_5.append(this.nextLocalRequestCode.getAndIncrement());
        return p4.c(v0_5.toString(), this, p3, p5);
    }

    public void removeMenuProvider(q0.p p2)
    {
        kotlin.jvm.internal.j.e(p2, "provider");
        this.menuHostHelper.b(p2);
        return;
    }

    public final void removeOnConfigurationChangedListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onConfigurationChangedListeners.remove(p2);
        return;
    }

    public final void removeOnContextAvailableListener(d.b p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        java.util.concurrent.CopyOnWriteArraySet v0_1 = this.contextAwareHelper;
        v0_1.getClass();
        v0_1.a.remove(p2);
        return;
    }

    public final void removeOnMultiWindowModeChangedListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onMultiWindowModeChangedListeners.remove(p2);
        return;
    }

    public final void removeOnNewIntentListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onNewIntentListeners.remove(p2);
        return;
    }

    public final void removeOnPictureInPictureModeChangedListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onPictureInPictureModeChangedListeners.remove(p2);
        return;
    }

    public final void removeOnTrimMemoryListener(p0.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onTrimMemoryListeners.remove(p2);
        return;
    }

    public final void removeOnUserLeaveHintListener(Runnable p2)
    {
        kotlin.jvm.internal.j.e(p2, "listener");
        this.onUserLeaveHintListeners.remove(p2);
        return;
    }

    public void reportFullyDrawn()
    {
        if (j5.t1.I()) {
            j5.t1.c("reportFullyDrawn() for ComponentActivity");
        }
        super.reportFullyDrawn();
        java.util.ArrayList v0_5 = this.getFullyDrawnReporter();
        v0_5.b = 1;
        java.util.ArrayList v2_0 = v0_5.c;
        int v3 = v2_0.size();
        int v4 = 0;
        while (v4 < v3) {
            u7.a v5_0 = v2_0.get(v4);
            v4++;
            ((u7.a) v5_0).invoke();
        }
        v0_5.c.clear();
        android.os.Trace.endSection();
        return;
    }

    public void setContentView(int p4)
    {
        this.initializeViewTreeOwners();
        c.k v0_0 = this.reportFullyDrawnExecutor;
        android.view.View v1_1 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v1_1, "getDecorView(...)");
        ((c.k) v0_0).a(v1_1);
        super.setContentView(p4);
        return;
    }

    public void setContentView(android.view.View p4)
    {
        this.initializeViewTreeOwners();
        c.k v0_0 = this.reportFullyDrawnExecutor;
        android.view.View v1_1 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v1_1, "getDecorView(...)");
        ((c.k) v0_0).a(v1_1);
        super.setContentView(p4);
        return;
    }

    public void setContentView(android.view.View p4, android.view.ViewGroup$LayoutParams p5)
    {
        this.initializeViewTreeOwners();
        c.k v0_0 = this.reportFullyDrawnExecutor;
        android.view.View v1_1 = this.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(v1_1, "getDecorView(...)");
        ((c.k) v0_0).a(v1_1);
        super.setContentView(p4, p5);
        return;
    }

    public void startActivityForResult(android.content.Intent p2, int p3)
    {
        kotlin.jvm.internal.j.e(p2, "intent");
        super.startActivityForResult(p2, p3);
        return;
    }

    public void startActivityForResult(android.content.Intent p2, int p3, android.os.Bundle p4)
    {
        kotlin.jvm.internal.j.e(p2, "intent");
        super.startActivityForResult(p2, p3, p4);
        return;
    }

    public void startIntentSenderForResult(android.content.IntentSender p2, int p3, android.content.Intent p4, int p5, int p6, int p7)
    {
        kotlin.jvm.internal.j.e(p2, "intent");
        super.startIntentSenderForResult(p2, p3, p4, p5, p6, p7);
        return;
    }

    public void startIntentSenderForResult(android.content.IntentSender p2, int p3, android.content.Intent p4, int p5, int p6, int p7, android.os.Bundle p8)
    {
        kotlin.jvm.internal.j.e(p2, "intent");
        super.startIntentSenderForResult(p2, p3, p4, p5, p6, p7, p8);
        return;
    }
}
