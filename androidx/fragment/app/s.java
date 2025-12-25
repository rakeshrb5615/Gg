package androidx.fragment.app;
public class s extends androidx.fragment.app.e0 implements android.content.DialogInterface$OnCancelListener, android.content.DialogInterface$OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private android.app.Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private android.os.Handler mHandler;
    private androidx.lifecycle.e0 mObserver;
    private android.content.DialogInterface$OnCancelListener mOnCancelListener;
    private android.content.DialogInterface$OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public s()
    {
        this.mDismissRunnable = new androidx.fragment.app.o(this, 0);
        this.mOnCancelListener = new androidx.fragment.app.p(this);
        this.mOnDismissListener = new androidx.fragment.app.q(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = 1;
        this.mShowsDialog = 1;
        this.mBackStackId = -1;
        this.mObserver = new androidx.fragment.app.z(this, 1);
        this.mDialogCreated = 0;
        return;
    }

    public static synthetic android.app.Dialog access$000(androidx.fragment.app.s p0)
    {
        return p0.mDialog;
    }

    public static synthetic android.content.DialogInterface$OnDismissListener access$100(androidx.fragment.app.s p0)
    {
        return p0.mOnDismissListener;
    }

    public static synthetic boolean access$200(androidx.fragment.app.s p0)
    {
        return p0.mShowsDialog;
    }

    public androidx.fragment.app.m0 createFragmentContainer()
    {
        return new androidx.fragment.app.r(this, super.createFragmentContainer());
    }

    public void dismiss()
    {
        this.f(0, 0, 0);
        return;
    }

    public void dismissAllowingStateLoss()
    {
        this.f(1, 0, 0);
        return;
    }

    public void dismissNow()
    {
        this.f(0, 0, 1);
        return;
    }

    public final void f(boolean p5, boolean p6, boolean p7)
    {
        if (!this.mDismissed) {
            this.mDismissed = 1;
            this.mShownByMe = 0;
            Runnable v2_6 = this.mDialog;
            if (v2_6 != null) {
                v2_6.setOnDismissListener(0);
                this.mDialog.dismiss();
                if (p6 == null) {
                    if (android.os.Looper.myLooper() != this.mHandler.getLooper()) {
                        this.mHandler.post(this.mDismissRunnable);
                    } else {
                        this.onDismiss(this.mDialog);
                    }
                }
            }
            this.mViewDestroyed = 1;
            if (this.mBackStackId < 0) {
                String v6_5 = this.getParentFragmentManager();
                v6_5.getClass();
                Runnable v2_5 = new androidx.fragment.app.a(v6_5);
                v2_5.p = 1;
                String v6_6 = this.mFragmentManager;
                if ((v6_6 != null) && (v6_6 != v2_5.q)) {
                    String v6_8 = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
                    v6_8.append(this.toString());
                    v6_8.append(" is already attached to a FragmentManager.");
                    throw new IllegalStateException(v6_8.toString());
                } else {
                    v2_5.b(new androidx.fragment.app.l1(this, 3));
                    if (p7 == null) {
                        if (p5 == 0) {
                            v2_5.e(0);
                            return;
                        } else {
                            v2_5.e(1);
                            return;
                        }
                    } else {
                        v2_5.f();
                        return;
                    }
                }
            } else {
                if (p7 == null) {
                    String v7_4 = this.getParentFragmentManager();
                    int v1_1 = this.mBackStackId;
                    v7_4.getClass();
                    if (v1_1 < 0) {
                        throw new IllegalArgumentException(g2.g.c(v1_1, "Bad id: "));
                    } else {
                        v7_4.v(new androidx.fragment.app.a1(v7_4, v1_1, 1), p5);
                    }
                } else {
                    int v5_5 = this.getParentFragmentManager();
                    String v7_5 = this.mBackStackId;
                    if (v7_5 < null) {
                        v5_5.getClass();
                        throw new IllegalArgumentException(g2.g.c(v7_5, "Bad id: "));
                    } else {
                        v5_5.O(v7_5, 1);
                    }
                }
                this.mBackStackId = -1;
                return;
            }
        } else {
            return;
        }
    }

    public android.app.Dialog getDialog()
    {
        return this.mDialog;
    }

    public boolean getShowsDialog()
    {
        return this.mShowsDialog;
    }

    public int getTheme()
    {
        return this.mTheme;
    }

    public boolean isCancelable()
    {
        return this.mCancelable;
    }

    public void onActivityCreated(android.os.Bundle p1)
    {
        super.onActivityCreated(p1);
        return;
    }

    public void onAttach(android.content.Context p5)
    {
        int v5_2;
        super.onAttach(p5);
        int v5_1 = this.getViewLifecycleOwnerLiveData();
        String v0_4 = this.mObserver;
        v5_1.getClass();
        androidx.lifecycle.c0.a("observeForever");
        androidx.lifecycle.z v1_2 = new androidx.lifecycle.z(v5_1, v0_4);
        int v5_8 = v5_1.b;
        p.c v2_0 = v5_8.a(v0_4);
        if (v2_0 == null) {
            p.c v2_2 = new p.c(v0_4, v1_2);
            v5_8.d = (v5_8.d + 1);
            String v0_2 = v5_8.b;
            if (v0_2 != null) {
                v0_2.c = v2_2;
                v2_2.d = v0_2;
                v5_8.b = v2_2;
            } else {
                v5_8.a = v2_2;
                v5_8.b = v2_2;
            }
            v5_2 = 0;
        } else {
            v5_2 = v2_0.b;
        }
        int v5_3 = ((androidx.lifecycle.b0) v5_2);
        if ((v5_3 instanceof androidx.lifecycle.a0)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else {
            if (v5_3 == 0) {
                v1_2.a(1);
            }
            if (!this.mShownByMe) {
                this.mDismissed = 0;
            }
            return;
        }
    }

    public void onCancel(android.content.DialogInterface p1)
    {
        return;
    }

    public void onCreate(android.os.Bundle p4)
    {
        String v0_12;
        super.onCreate(p4);
        this.mHandler = new android.os.Handler();
        if (this.mContainerId != 0) {
            v0_12 = 0;
        } else {
            v0_12 = 1;
        }
        this.mShowsDialog = v0_12;
        if (p4 != 0) {
            this.mStyle = p4.getInt("android:style", 0);
            this.mTheme = p4.getInt("android:theme", 0);
            this.mCancelable = p4.getBoolean("android:cancelable", 1);
            this.mShowsDialog = p4.getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = p4.getInt("android:backStackId", -1);
        }
        return;
    }

    public android.app.Dialog onCreateDialog(android.os.Bundle p3)
    {
        if (androidx.fragment.app.b1.H(3)) {
            c.p v3_5 = new StringBuilder("onCreateDialog called for DialogFragment ");
            v3_5.append(this);
            android.util.Log.d("FragmentManager", v3_5.toString());
        }
        return new c.p(this.requireContext(), this.getTheme());
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        int v0_0 = this.mDialog;
        if (v0_0 != 0) {
            this.mViewDestroyed = 1;
            v0_0.setOnDismissListener(0);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                this.onDismiss(this.mDialog);
            }
            this.mDialog = 0;
            this.mDialogCreated = 0;
        }
        return;
    }

    public void onDetach()
    {
        super.onDetach();
        if ((!this.mShownByMe) && (!this.mDismissed)) {
            this.mDismissed = 1;
        }
        this.getViewLifecycleOwnerLiveData().g(this.mObserver);
        return;
    }

    public void onDismiss(android.content.DialogInterface p2)
    {
        if (!this.mViewDestroyed) {
            if (androidx.fragment.app.b1.H(3)) {
                int v2_6 = new StringBuilder("onDismiss called for DialogFragment ");
                v2_6.append(this);
                android.util.Log.d("FragmentManager", v2_6.toString());
            }
            this.f(1, 1, 0);
        }
        return;
    }

    public android.view.View onFindViewById(int p2)
    {
        android.app.Dialog v0 = this.mDialog;
        if (v0 == null) {
            return 0;
        } else {
            return v0.findViewById(p2);
        }
    }

    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle p7)
    {
        android.view.LayoutInflater v0 = super.onGetLayoutInflater(p7);
        String v1_1 = this.mShowsDialog;
        if ((v1_1 != null) && (!this.mCreatingDialog)) {
            if ((v1_1 != null) && (!this.mDialogCreated)) {
                this.mCreatingDialog = 1;
                android.app.Dialog v7_1 = this.onCreateDialog(p7);
                this.mDialog = v7_1;
                if (!this.mShowsDialog) {
                    this.mDialog = 0;
                } else {
                    this.setupDialog(v7_1, this.mStyle);
                    android.app.Dialog v7_3 = this.getContext();
                    if ((v7_3 instanceof android.app.Activity)) {
                        this.mDialog.setOwnerActivity(((android.app.Activity) v7_3));
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = 1;
                }
                this.mCreatingDialog = 0;
            }
            if (androidx.fragment.app.b1.H(2)) {
                android.app.Dialog v7_11 = new StringBuilder("get layout inflater for DialogFragment ");
                v7_11.append(this);
                v7_11.append(" from dialog context");
                android.util.Log.d("FragmentManager", v7_11.toString());
            }
            android.app.Dialog v7_13 = this.mDialog;
            if (v7_13 != null) {
                return v0.cloneInContext(v7_13.getContext());
            }
        } else {
            if (androidx.fragment.app.b1.H(2)) {
                android.app.Dialog v7_18 = new StringBuilder("getting layout inflater for DialogFragment ");
                v7_18.append(this);
                android.app.Dialog v7_19 = v7_18.toString();
                if (this.mShowsDialog) {
                    String v1_7 = new StringBuilder("mCreatingDialog = true: ");
                    v1_7.append(v7_19);
                    android.util.Log.d("FragmentManager", v1_7.toString());
                } else {
                    String v1_9 = new StringBuilder("mShowsDialog = false: ");
                    v1_9.append(v7_19);
                    android.util.Log.d("FragmentManager", v1_9.toString());
                    return v0;
                }
            }
        }
        return v0;
    }

    public boolean onHasView()
    {
        return this.mDialogCreated;
    }

    public void onSaveInstanceState(android.os.Bundle p4)
    {
        int v0_0 = this.mDialog;
        if (v0_0 != 0) {
            int v0_5 = v0_0.onSaveInstanceState();
            v0_5.putBoolean("android:dialogShowing", 0);
            p4.putBundle("android:savedDialogState", v0_5);
        }
        int v0_6 = this.mStyle;
        if (v0_6 != 0) {
            p4.putInt("android:style", v0_6);
        }
        int v0_1 = this.mTheme;
        if (v0_1 != 0) {
            p4.putInt("android:theme", v0_1);
        }
        int v0_2 = this.mCancelable;
        if (v0_2 == 0) {
            p4.putBoolean("android:cancelable", v0_2);
        }
        int v0_3 = this.mShowsDialog;
        if (v0_3 == 0) {
            p4.putBoolean("android:showsDialog", v0_3);
        }
        int v0_4 = this.mBackStackId;
        if (v0_4 != -1) {
            p4.putInt("android:backStackId", v0_4);
        }
        return;
    }

    public void onStart()
    {
        super.onStart();
        android.view.View v0_0 = this.mDialog;
        if (v0_0 != null) {
            this.mViewDestroyed = 0;
            v0_0.show();
            android.view.View v0_1 = this.mDialog.getWindow().getDecorView();
            kotlin.jvm.internal.j.e(v0_1, "<this>");
            v0_1.setTag(2131362596, this);
            v0_1.setTag(2131362600, this);
            v0_1.setTag(2131362599, this);
        }
        return;
    }

    public void onStop()
    {
        super.onStop();
        android.app.Dialog v0 = this.mDialog;
        if (v0 != null) {
            v0.hide();
        }
        return;
    }

    public void onViewStateRestored(android.os.Bundle p2)
    {
        super.onViewStateRestored(p2);
        if ((this.mDialog != null) && (p2 != null)) {
            android.os.Bundle v2_1 = p2.getBundle("android:savedDialogState");
            if (v2_1 != null) {
                this.mDialog.onRestoreInstanceState(v2_1);
            }
        }
        return;
    }

    public void performCreateView(android.view.LayoutInflater p1, android.view.ViewGroup p2, android.os.Bundle p3)
    {
        super.performCreateView(p1, p2, p3);
        if ((this.mView == null) && ((this.mDialog != null) && (p3 != null))) {
            android.os.Bundle v1_4 = p3.getBundle("android:savedDialogState");
            if (v1_4 != null) {
                this.mDialog.onRestoreInstanceState(v1_4);
            }
        }
        return;
    }

    public final c.p requireComponentDialog()
    {
        String v0_0 = this.requireDialog();
        if (!(v0_0 instanceof c.p)) {
            StringBuilder v2_1 = new StringBuilder("DialogFragment ");
            v2_1.append(this);
            v2_1.append(" did not return a ComponentDialog instance from requireDialog(). The actual Dialog is ");
            v2_1.append(v0_0);
            throw new IllegalStateException(v2_1.toString());
        } else {
            return ((c.p) v0_0);
        }
    }

    public final android.app.Dialog requireDialog()
    {
        IllegalStateException v0_0 = this.getDialog();
        if (v0_0 == null) {
            String v1_2 = new StringBuilder("DialogFragment ");
            v1_2.append(this);
            v1_2.append(" does not have a Dialog.");
            throw new IllegalStateException(v1_2.toString());
        } else {
            return v0_0;
        }
    }

    public void setCancelable(boolean p2)
    {
        this.mCancelable = p2;
        android.app.Dialog v0 = this.mDialog;
        if (v0 != null) {
            v0.setCancelable(p2);
        }
        return;
    }

    public void setShowsDialog(boolean p1)
    {
        this.mShowsDialog = p1;
        return;
    }

    public void setStyle(int p4, int p5)
    {
        if (androidx.fragment.app.b1.H(2)) {
            String v1_3 = new StringBuilder("Setting style and theme for DialogFragment ");
            v1_3.append(this);
            v1_3.append(" to ");
            v1_3.append(p4);
            v1_3.append(", ");
            v1_3.append(p5);
            android.util.Log.d("FragmentManager", v1_3.toString());
        }
        this.mStyle = p4;
        if ((p4 == 2) || (p4 == 3)) {
            this.mTheme = 16973913;
        }
        if (p5 != 0) {
            this.mTheme = p5;
        }
        return;
    }

    public void setupDialog(android.app.Dialog p3, int p4)
    {
        if ((p4 != 1) && (p4 != 2)) {
            if (p4 == 3) {
                android.view.Window v4_1 = p3.getWindow();
                if (v4_1 != null) {
                    v4_1.addFlags(24);
                }
            } else {
                return;
            }
        }
        p3.requestWindowFeature(1);
        return;
    }

    public int show(androidx.fragment.app.m1 p3, String p4)
    {
        this.mDismissed = 0;
        this.mShownByMe = 1;
        p3.c(0, this, p4, 1);
        this.mViewDestroyed = 0;
        int v3_2 = ((androidx.fragment.app.a) p3).e(0);
        this.mBackStackId = v3_2;
        return v3_2;
    }

    public void show(androidx.fragment.app.b1 p4, String p5)
    {
        this.mDismissed = 0;
        this.mShownByMe = 1;
        p4.getClass();
        androidx.fragment.app.a v2_1 = new androidx.fragment.app.a(p4);
        v2_1.p = 1;
        v2_1.c(0, this, p5, 1);
        v2_1.e(0);
        return;
    }

    public void showNow(androidx.fragment.app.b1 p4, String p5)
    {
        this.mDismissed = 0;
        this.mShownByMe = 1;
        p4.getClass();
        androidx.fragment.app.a v2_1 = new androidx.fragment.app.a(p4);
        v2_1.p = 1;
        v2_1.c(0, this, p5, 1);
        v2_1.f();
        return;
    }
}
