package com.google.android.gms.common.data;
public final class DataBufferObserverSet implements com.google.android.gms.common.data.DataBufferObserver, com.google.android.gms.common.data.DataBufferObserver$Observable {
    private final java.util.HashSet zaa;

    public DataBufferObserverSet()
    {
        this.zaa = new java.util.HashSet();
        return;
    }

    public void addObserver(com.google.android.gms.common.data.DataBufferObserver p2)
    {
        this.zaa.add(p2);
        return;
    }

    public void clear()
    {
        this.zaa.clear();
        return;
    }

    public boolean hasObservers()
    {
        if (this.zaa.isEmpty()) {
            return 0;
        } else {
            return 1;
        }
    }

    public void onDataChanged()
    {
        java.util.Iterator v0_1 = this.zaa.iterator();
        while (v0_1.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) v0_1.next()).onDataChanged();
        }
        return;
    }

    public void onDataRangeChanged(int p3, int p4)
    {
        java.util.Iterator v0_1 = this.zaa.iterator();
        while (v0_1.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) v0_1.next()).onDataRangeChanged(p3, p4);
        }
        return;
    }

    public void onDataRangeInserted(int p3, int p4)
    {
        java.util.Iterator v0_1 = this.zaa.iterator();
        while (v0_1.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) v0_1.next()).onDataRangeInserted(p3, p4);
        }
        return;
    }

    public void onDataRangeMoved(int p3, int p4, int p5)
    {
        java.util.Iterator v0_1 = this.zaa.iterator();
        while (v0_1.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) v0_1.next()).onDataRangeMoved(p3, p4, p5);
        }
        return;
    }

    public void onDataRangeRemoved(int p3, int p4)
    {
        java.util.Iterator v0_1 = this.zaa.iterator();
        while (v0_1.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) v0_1.next()).onDataRangeRemoved(p3, p4);
        }
        return;
    }

    public void removeObserver(com.google.android.gms.common.data.DataBufferObserver p2)
    {
        this.zaa.remove(p2);
        return;
    }
}
