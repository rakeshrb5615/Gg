package n;
public final class l0 implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
    public android.widget.SpinnerAdapter a;
    public android.widget.ListAdapter b;

    public final boolean areAllItemsEnabled()
    {
        int v0_0 = this.b;
        if (v0_0 == 0) {
            return 1;
        } else {
            return v0_0.areAllItemsEnabled();
        }
    }

    public final int getCount()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            return v0_0.getCount();
        } else {
            return 0;
        }
    }

    public final android.view.View getDropDownView(int p2, android.view.View p3, android.view.ViewGroup p4)
    {
        android.widget.SpinnerAdapter v0 = this.a;
        if (v0 != null) {
            return v0.getDropDownView(p2, p3, p4);
        } else {
            return 0;
        }
    }

    public final Object getItem(int p2)
    {
        android.widget.SpinnerAdapter v0 = this.a;
        if (v0 != null) {
            return v0.getItem(p2);
        } else {
            return 0;
        }
    }

    public final long getItemId(int p3)
    {
        long v0_0 = this.a;
        if (v0_0 != 0) {
            return v0_0.getItemId(p3);
        } else {
            return -1;
        }
    }

    public final int getItemViewType(int p1)
    {
        return 0;
    }

    public final android.view.View getView(int p1, android.view.View p2, android.view.ViewGroup p3)
    {
        return this.getDropDownView(p1, p2, p3);
    }

    public final int getViewTypeCount()
    {
        return 1;
    }

    public final boolean hasStableIds()
    {
        int v0_0 = this.a;
        if ((v0_0 == 0) || (!v0_0.hasStableIds())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isEmpty()
    {
        if (this.getCount() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isEnabled(int p2)
    {
        android.widget.ListAdapter v0 = this.b;
        if (v0 == null) {
            return 1;
        } else {
            return v0.isEnabled(p2);
        }
    }

    public final void registerDataSetObserver(android.database.DataSetObserver p2)
    {
        android.widget.SpinnerAdapter v0 = this.a;
        if (v0 != null) {
            v0.registerDataSetObserver(p2);
        }
        return;
    }

    public final void unregisterDataSetObserver(android.database.DataSetObserver p2)
    {
        android.widget.SpinnerAdapter v0 = this.a;
        if (v0 != null) {
            v0.unregisterDataSetObserver(p2);
        }
        return;
    }
}
