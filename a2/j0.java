package a2;
public final class j0 extends android.database.Observable {

    public final boolean a()
    {
        return (this.mObservers.isEmpty() ^ 1);
    }

    public final void b()
    {
        int v0_1 = (this.mObservers.size() - 1);
        while (v0_1 >= 0) {
            ((a2.k0) this.mObservers.get(v0_1)).a();
            v0_1--;
        }
        return;
    }
}
