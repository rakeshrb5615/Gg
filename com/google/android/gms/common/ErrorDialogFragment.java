package com.google.android.gms.common;
public class ErrorDialogFragment extends android.app.DialogFragment {
    private android.app.Dialog zaa;
    private android.content.DialogInterface$OnCancelListener zab;
    private android.app.Dialog zac;

    public ErrorDialogFragment()
    {
        return;
    }

    public static com.google.android.gms.common.ErrorDialogFragment newInstance(android.app.Dialog p1)
    {
        return com.google.android.gms.common.ErrorDialogFragment.newInstance(p1, 0);
    }

    public static com.google.android.gms.common.ErrorDialogFragment newInstance(android.app.Dialog p2, android.content.DialogInterface$OnCancelListener p3)
    {
        com.google.android.gms.common.ErrorDialogFragment v0_1 = new com.google.android.gms.common.ErrorDialogFragment();
        android.app.Dialog v2_2 = ((android.app.Dialog) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Cannot display null dialog"));
        v2_2.setOnCancelListener(0);
        v2_2.setOnDismissListener(0);
        v0_1.zaa = v2_2;
        if (p3 != null) {
            v0_1.zab = p3;
        }
        return v0_1;
    }

    public void onCancel(android.content.DialogInterface p2)
    {
        android.content.DialogInterface$OnCancelListener v0 = this.zab;
        if (v0 != null) {
            v0.onCancel(p2);
        }
        return;
    }

    public android.app.Dialog onCreateDialog(android.os.Bundle p2)
    {
        android.app.Dialog v2_0 = this.zaa;
        if (v2_0 == null) {
            this.setShowsDialog(0);
            if (this.zac == null) {
                this.zac = new android.app.AlertDialog$Builder(((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.getActivity()))).create();
            }
            v2_0 = this.zac;
        }
        return v2_0;
    }

    public void show(android.app.FragmentManager p1, String p2)
    {
        super.show(p1, p2);
        return;
    }
}
