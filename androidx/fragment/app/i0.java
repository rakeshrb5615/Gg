package androidx.fragment.app;
public final class i0 extends androidx.fragment.app.o0 implements e0.d, e0.e, d0.y, d0.z, androidx.lifecycle.b1, c.w, e.j, b2.g, androidx.fragment.app.g1, q0.l {
    public final synthetic androidx.fragment.app.j0 e;

    public i0(androidx.fragment.app.j0 p1)
    {
        this.e = p1;
        super(p1);
        return;
    }

    public final void a(androidx.fragment.app.e0 p2)
    {
        this.e.onAttachFragment(p2);
        return;
    }

    public final void addMenuProvider(q0.p p2)
    {
        this.e.addMenuProvider(p2);
        return;
    }

    public final void addOnConfigurationChangedListener(p0.a p2)
    {
        this.e.addOnConfigurationChangedListener(p2);
        return;
    }

    public final void addOnMultiWindowModeChangedListener(p0.a p2)
    {
        this.e.addOnMultiWindowModeChangedListener(p2);
        return;
    }

    public final void addOnPictureInPictureModeChangedListener(p0.a p2)
    {
        this.e.addOnPictureInPictureModeChangedListener(p2);
        return;
    }

    public final void addOnTrimMemoryListener(p0.a p2)
    {
        this.e.addOnTrimMemoryListener(p2);
        return;
    }

    public final android.view.View b(int p2)
    {
        return this.e.findViewById(p2);
    }

    public final boolean c()
    {
        int v0_1 = this.e.getWindow();
        if ((v0_1 == 0) || (v0_1.peekDecorView() == null)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final e.i getActivityResultRegistry()
    {
        return this.e.getActivityResultRegistry();
    }

    public final androidx.lifecycle.p getLifecycle()
    {
        return this.e.mFragmentLifecycleRegistry;
    }

    public final c.v getOnBackPressedDispatcher()
    {
        return this.e.getOnBackPressedDispatcher();
    }

    public final b2.e getSavedStateRegistry()
    {
        return this.e.getSavedStateRegistry();
    }

    public final androidx.lifecycle.a1 getViewModelStore()
    {
        return this.e.getViewModelStore();
    }

    public final void removeMenuProvider(q0.p p2)
    {
        this.e.removeMenuProvider(p2);
        return;
    }

    public final void removeOnConfigurationChangedListener(p0.a p2)
    {
        this.e.removeOnConfigurationChangedListener(p2);
        return;
    }

    public final void removeOnMultiWindowModeChangedListener(p0.a p2)
    {
        this.e.removeOnMultiWindowModeChangedListener(p2);
        return;
    }

    public final void removeOnPictureInPictureModeChangedListener(p0.a p2)
    {
        this.e.removeOnPictureInPictureModeChangedListener(p2);
        return;
    }

    public final void removeOnTrimMemoryListener(p0.a p2)
    {
        this.e.removeOnTrimMemoryListener(p2);
        return;
    }
}
