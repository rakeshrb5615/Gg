package androidx.fragment.app;
public final class q0 implements android.view.LayoutInflater$Factory2 {
    public final androidx.fragment.app.b1 a;

    public q0(androidx.fragment.app.b1 p1)
    {
        this.a = p1;
        return;
    }

    public final android.view.View onCreateView(android.view.View p11, String p12, android.content.Context p13, android.util.AttributeSet p14)
    {
        String v1_2 = this.a;
        if (!androidx.fragment.app.FragmentContainerView.getName().equals(p12)) {
            if ("fragment".equals(p12)) {
                androidx.fragment.app.p0 v12_2 = p14.getAttributeValue(0, "class");
                androidx.fragment.app.e0 v2_3 = p13.obtainStyledAttributes(p14, j1.a.a);
                int v3 = 0;
                if (v12_2 == null) {
                    v12_2 = v2_3.getString(0);
                }
                int v6 = v2_3.getResourceId(1, -1);
                String v8 = v2_3.getString(2);
                v2_3.recycle();
                if (v12_2 != null) {
                    try {
                        androidx.fragment.app.e0 v2_6 = androidx.fragment.app.e0.isAssignableFrom(androidx.fragment.app.v0.a(v12_2, p13.getClassLoader()));
                    } catch (ClassNotFoundException) {
                        v2_6 = 0;
                    }
                    if (v2_6 != null) {
                        if (p11 != null) {
                            v3 = p11.getId();
                        }
                        if ((v3 == -1) && ((v6 == -1) && (v8 == null))) {
                            String v13_12 = new StringBuilder();
                            v13_12.append(p14.getPositionDescription());
                            v13_12.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                            v13_12.append(v12_2);
                            throw new IllegalArgumentException(v13_12.toString());
                        } else {
                            androidx.fragment.app.e0 v2_1;
                            if (v6 == -1) {
                                v2_1 = 0;
                            } else {
                                v2_1 = v1_2.A(v6);
                            }
                            if ((v2_1 == null) && (v8 != null)) {
                                v2_1 = v1_2.B(v8);
                            }
                            if ((v2_1 == null) && (v3 != -1)) {
                                v2_1 = v1_2.A(v3);
                            }
                            String v13_3;
                            if (v2_1 != null) {
                                if (v2_1.mInLayout) {
                                    String v13_15 = new StringBuilder();
                                    v13_15.append(p14.getPositionDescription());
                                    v13_15.append(": Duplicate id 0x");
                                    v13_15.append(Integer.toHexString(v6));
                                    v13_15.append(", tag ");
                                    v13_15.append(v8);
                                    v13_15.append(", or parent id 0x");
                                    v13_15.append(Integer.toHexString(v3));
                                    v13_15.append(" with another fragment for ");
                                    v13_15.append(v12_2);
                                    throw new IllegalArgumentException(v13_15.toString());
                                } else {
                                    v2_1.mInLayout = 1;
                                    v2_1.mFragmentManager = v1_2;
                                    String v13_1 = v1_2.t;
                                    v2_1.mHost = v13_1;
                                    v2_1.onInflate(v13_1.b, p14, v2_1.mSavedFragmentState);
                                    v13_3 = v1_2.f(v2_1);
                                    if (androidx.fragment.app.b1.H(2)) {
                                        String v14_3 = new StringBuilder("Retained Fragment ");
                                        v14_3.append(v2_1);
                                        v14_3.append(" has been re-attached via the <fragment> tag: id=0x");
                                        v14_3.append(Integer.toHexString(v6));
                                        android.util.Log.v("FragmentManager", v14_3.toString());
                                    }
                                }
                            } else {
                                String v13_7;
                                androidx.fragment.app.e0 v2_0 = v1_2.E();
                                p13.getClassLoader();
                                v2_1 = androidx.fragment.app.e0.instantiate(v2_0.a.t.b, v12_2, 0);
                                v2_1.mFromLayout = 1;
                                if (v6 == 0) {
                                    v13_7 = v3;
                                } else {
                                    v13_7 = v6;
                                }
                                v2_1.mFragmentId = v13_7;
                                v2_1.mContainerId = v3;
                                v2_1.mTag = v8;
                                v2_1.mInLayout = 1;
                                v2_1.mFragmentManager = v1_2;
                                String v13_8 = v1_2.t;
                                v2_1.mHost = v13_8;
                                v2_1.onInflate(v13_8.b, p14, v2_1.mSavedFragmentState);
                                v13_3 = v1_2.a(v2_1);
                                if (androidx.fragment.app.b1.H(2)) {
                                    String v14_7 = new StringBuilder("Fragment ");
                                    v14_7.append(v2_1);
                                    v14_7.append(" has been inflated via the <fragment> tag: id=0x");
                                    v14_7.append(Integer.toHexString(v6));
                                    android.util.Log.v("FragmentManager", v14_7.toString());
                                }
                            }
                            String v0_10 = new StringBuilder("Attempting to use <fragment> tag to add fragment ");
                            v0_10.append(v2_1);
                            v0_10.append(" to container ");
                            v0_10.append(((android.view.ViewGroup) p11));
                            k1.c.b(new k1.a(v2_1, v0_10.toString()));
                            k1.c.a(v2_1).getClass();
                            v2_1.mContainer = ((android.view.ViewGroup) p11);
                            v13_3.k();
                            v13_3.j();
                            android.view.View v11_3 = v2_1.mView;
                            if (v11_3 == null) {
                                throw new IllegalStateException(v1.a.l("Fragment ", v12_2, " did not create a view."));
                            } else {
                                if (v6 != 0) {
                                    v11_3.setId(v6);
                                }
                                if (v2_1.mView.getTag() == null) {
                                    v2_1.mView.setTag(v8);
                                }
                                v2_1.mView.addOnAttachStateChangeListener(new androidx.fragment.app.p0(this, v13_3));
                                return v2_1.mView;
                            }
                        }
                    }
                }
            }
            return 0;
        } else {
            return new androidx.fragment.app.FragmentContainerView(p13, p14, v1_2);
        }
    }

    public final android.view.View onCreateView(String p2, android.content.Context p3, android.util.AttributeSet p4)
    {
        return this.onCreateView(0, p2, p3, p4);
    }
}
