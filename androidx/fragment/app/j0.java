package androidx.fragment.app;
public abstract class j0 extends c.n implements d0.a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.w mFragmentLifecycleRegistry;
    final androidx.fragment.app.n0 mFragments;
    boolean mResumed;
    boolean mStopped;

    public j0()
    {
        this.mFragments = new androidx.fragment.app.n0(new androidx.fragment.app.i0(this));
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.w(this);
        this.mStopped = 1;
        this.getSavedStateRegistry().c("android:support:lifecycle", new androidx.fragment.app.f0(this, 0));
        this.addOnConfigurationChangedListener(new androidx.fragment.app.g0(this, 0));
        this.addOnNewIntentListener(new androidx.fragment.app.g0(this, 1));
        this.addOnContextAvailableListener(new androidx.fragment.app.h0(this));
        return;
    }

    public static boolean g(androidx.fragment.app.b1 p5)
    {
        java.util.Iterator v5_3 = p5.c.f().iterator();
        int v0_0 = 0;
        while (v5_3.hasNext()) {
            androidx.fragment.app.e0 v1_1 = ((androidx.fragment.app.e0) v5_3.next());
            if (v1_1 != null) {
                if (v1_1.getHost() != null) {
                    v0_0 |= androidx.fragment.app.j0.g(v1_1.getChildFragmentManager());
                }
                int v2_3 = v1_1.mViewLifecycleOwner;
                if (v2_3 != 0) {
                    v2_3.b();
                    if (v2_3.d.c.compareTo(androidx.lifecycle.o.d) >= 0) {
                        v1_1.mViewLifecycleOwner.d.g();
                        v0_0 = 1;
                    }
                }
                if (v1_1.mLifecycleRegistry.c.compareTo(androidx.lifecycle.o.d) >= 0) {
                    v1_1.mLifecycleRegistry.g();
                    v0_0 = 1;
                }
            }
        }
        return v0_0;
    }

    public final android.view.View dispatchFragmentsOnCreateView(android.view.View p2, String p3, android.content.Context p4, android.util.AttributeSet p5)
    {
        return this.mFragments.a.d.f.onCreateView(p2, p3, p4, p5);
    }

    public void dump(String p3, java.io.FileDescriptor p4, java.io.PrintWriter p5, String[] p6)
    {
        super.dump(p3, p4, p5, p6);
        if (this.shouldDumpInternalState(p6)) {
            p5.print(p3);
            p5.print("Local FragmentActivity ");
            p5.print(Integer.toHexString(System.identityHashCode(this)));
            p5.println(" State:");
            androidx.fragment.app.c1 v0_3 = new StringBuilder();
            v0_3.append(p3);
            v0_3.append("  ");
            androidx.fragment.app.c1 v0_5 = v0_3.toString();
            p5.print(v0_5);
            p5.print("mCreated=");
            p5.print(this.mCreated);
            p5.print(" mResumed=");
            p5.print(this.mResumed);
            p5.print(" mStopped=");
            p5.print(this.mStopped);
            if (this.getApplication() != null) {
                q1.b.a(this).b(v0_5, p4, p5, p6);
            }
            this.mFragments.a.d.u(p3, p4, p5, p6);
            return;
        } else {
            return;
        }
    }

    public androidx.fragment.app.b1 getSupportFragmentManager()
    {
        return this.mFragments.a.d;
    }

    public q1.b getSupportLoaderManager()
    {
        return q1.b.a(this);
    }

    public void markFragmentsCreated()
    {
        while (androidx.fragment.app.j0.g(this.getSupportFragmentManager())) {
        }
        return;
    }

    public void onActivityResult(int p2, int p3, android.content.Intent p4)
    {
        this.mFragments.a();
        super.onActivityResult(p2, p3, p4);
        return;
    }

    public void onAttachFragment(androidx.fragment.app.e0 p1)
    {
        return;
    }

    public void onCreate(android.os.Bundle p3)
    {
        super.onCreate(p3);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_CREATE);
        androidx.fragment.app.c1 v3_4 = this.mFragments.a.d;
        v3_4.E = 0;
        v3_4.F = 0;
        v3_4.L.g = 0;
        v3_4.t(1);
        return;
    }

    public android.view.View onCreateView(android.view.View p2, String p3, android.content.Context p4, android.util.AttributeSet p5)
    {
        android.view.View v0 = this.dispatchFragmentsOnCreateView(p2, p3, p4, p5);
        if (v0 != null) {
            return v0;
        } else {
            return super.onCreateView(p2, p3, p4, p5);
        }
    }

    public android.view.View onCreateView(String p2, android.content.Context p3, android.util.AttributeSet p4)
    {
        android.view.View v0_1 = this.dispatchFragmentsOnCreateView(0, p2, p3, p4);
        if (v0_1 != null) {
            return v0_1;
        } else {
            return super.onCreateView(p2, p3, p4);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        this.mFragments.a.d.k();
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_DESTROY);
        return;
    }

    public boolean onMenuItemSelected(int p2, android.view.MenuItem p3)
    {
        if (!super.onMenuItemSelected(p2, p3)) {
            if (p2 != 6) {
                return 0;
            } else {
                return this.mFragments.a.d.i(p3);
            }
        } else {
            return 1;
        }
    }

    public void onPause()
    {
        super.onPause();
        this.mResumed = 0;
        this.mFragments.a.d.t(5);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_PAUSE);
        return;
    }

    public void onPostResume()
    {
        super.onPostResume();
        this.onResumeFragments();
        return;
    }

    public void onRequestPermissionsResult(int p2, String[] p3, int[] p4)
    {
        this.mFragments.a();
        super.onRequestPermissionsResult(p2, p3, p4);
        return;
    }

    public void onResume()
    {
        this.mFragments.a();
        super.onResume();
        this.mResumed = 1;
        this.mFragments.a.d.x(1);
        return;
    }

    public void onResumeFragments()
    {
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_RESUME);
        androidx.fragment.app.c1 v0_3 = this.mFragments.a.d;
        v0_3.E = 0;
        v0_3.F = 0;
        v0_3.L.g = 0;
        v0_3.t(7);
        return;
    }

    public void onStart()
    {
        this.mFragments.a();
        super.onStart();
        this.mStopped = 0;
        if (!this.mCreated) {
            this.mCreated = 1;
            androidx.fragment.app.c1 v1_1 = this.mFragments.a.d;
            v1_1.E = 0;
            v1_1.F = 0;
            v1_1.L.g = 0;
            v1_1.t(4);
        }
        this.mFragments.a.d.x(1);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_START);
        androidx.fragment.app.c1 v1_8 = this.mFragments.a.d;
        v1_8.E = 0;
        v1_8.F = 0;
        v1_8.L.g = 0;
        v1_8.t(5);
        return;
    }

    public void onStateNotSaved()
    {
        this.mFragments.a();
        return;
    }

    public void onStop()
    {
        super.onStop();
        this.mStopped = 1;
        this.markFragmentsCreated();
        androidx.lifecycle.n v1_3 = this.mFragments.a.d;
        v1_3.F = 1;
        v1_3.L.g = 1;
        v1_3.t(4);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
        return;
    }

    public void setEnterSharedElementCallback(d0.b0 p1)
    {
        this.setEnterSharedElementCallback(0);
        return;
    }

    public void setExitSharedElementCallback(d0.b0 p1)
    {
        this.setExitSharedElementCallback(0);
        return;
    }

    public void startActivityFromFragment(androidx.fragment.app.e0 p2, android.content.Intent p3, int p4)
    {
        this.startActivityFromFragment(p2, p3, p4, 0);
        return;
    }

    public void startActivityFromFragment(androidx.fragment.app.e0 p2, android.content.Intent p3, int p4, android.os.Bundle p5)
    {
        if (p4 != -1) {
            p2.startActivityForResult(p3, p4, p5);
            return;
        } else {
            this.startActivityForResult(p3, -1, p5);
            return;
        }
    }

    public void startIntentSenderFromFragment(androidx.fragment.app.e0 p10, android.content.IntentSender p11, int p12, android.content.Intent p13, int p14, int p15, int p16, android.os.Bundle p17)
    {
        if (p12 != -1) {
            p10.startIntentSenderForResult(p11, p12, p13, p14, p15, p16, p17);
            return;
        } else {
            this.startIntentSenderForResult(p11, p12, p13, p14, p15, p16, p17);
            return;
        }
    }

    public void supportFinishAfterTransition()
    {
        this.finishAfterTransition();
        return;
    }

    public void supportInvalidateOptionsMenu()
    {
        this.invalidateMenu();
        return;
    }

    public void supportPostponeEnterTransition()
    {
        this.postponeEnterTransition();
        return;
    }

    public void supportStartPostponedEnterTransition()
    {
        this.startPostponedEnterTransition();
        return;
    }

    public final void validateRequestPermissionsRequestCode(int p1)
    {
        return;
    }
}
