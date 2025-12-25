package h;
public final class g0 implements android.view.View$OnClickListener {
    public final android.view.View a;
    public final String b;
    public reflect.Method c;
    public android.content.Context d;

    public g0(android.view.View p1, String p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void onClick(android.view.View p6)
    {
        if (this.c == null) {
            Class v0_1 = this.a;
            IllegalStateException v1_4 = v0_1.getContext();
            while(true) {
                StringBuilder v2_2 = this.b;
                if (v1_4 == null) {
                    break;
                }
                try {
                    if (!v1_4.isRestricted()) {
                        StringBuilder v2_1 = v1_4.getClass().getMethod(v2_2, new Class[] {android.view.View}));
                        if (v2_1 != null) {
                            this.c = v2_1;
                            this.d = v1_4;
                            try {
                                this.c.invoke(this.d, new Object[] {p6}));
                                return;
                            } catch (String v6_7) {
                                throw new IllegalStateException("Could not execute non-public method for android:onClick", v6_7);
                            } catch (String v6_6) {
                                throw new IllegalStateException("Could not execute method for android:onClick", v6_6);
                            }
                        }
                    }
                    if (!(v1_4 instanceof android.content.ContextWrapper)) {
                        v1_4 = 0;
                    } else {
                        v1_4 = ((android.content.ContextWrapper) v1_4).getBaseContext();
                    }
                } catch (NoSuchMethodException) {
                }
            }
            String v6_3;
            String v6_8 = v0_1.getId();
            if (v6_8 != -1) {
                IllegalStateException v1_1 = new StringBuilder(" with id \'");
                v1_1.append(v0_1.getContext().getResources().getResourceEntryName(v6_8));
                v1_1.append("\'");
                v6_3 = v1_1.toString();
            } else {
                v6_3 = "";
            }
            StringBuilder v2_0 = v1.a.q("Could not find method ", v2_2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            v2_0.append(v0_1.getClass());
            v2_0.append(v6_3);
            throw new IllegalStateException(v2_0.toString());
        }
    }
}
