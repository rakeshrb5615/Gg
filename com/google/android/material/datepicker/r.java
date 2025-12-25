package com.google.android.material.datepicker;
public final class r extends com.google.android.material.datepicker.x {
    public int b;
    public com.google.android.material.datepicker.b c;

    public r()
    {
        return;
    }

    public final void onCreate(android.os.Bundle p2)
    {
        super.onCreate(p2);
        if (p2 == null) {
            p2 = this.getArguments();
        }
        this.b = p2.getInt("THEME_RES_ID_KEY");
        if (p2.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        } else {
            this.c = ((com.google.android.material.datepicker.b) p2.getParcelable("CALENDAR_CONSTRAINTS_KEY"));
            return;
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
    {
        p2.cloneInContext(new android.view.ContextThemeWrapper(this.getContext(), this.b));
        throw 0;
    }

    public final void onSaveInstanceState(android.os.Bundle p3)
    {
        p3.putInt("THEME_RES_ID_KEY", this.b);
        p3.putParcelable("DATE_SELECTOR_KEY", 0);
        p3.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
        return;
    }
}
