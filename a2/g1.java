package a2;
public final class g1 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public int n;

    public final void a(int p4)
    {
        if ((this.d & p4) == 0) {
            StringBuilder v1_1 = new StringBuilder("Layout state should be one of ");
            v1_1.append(Integer.toBinaryString(p4));
            v1_1.append(" but it is ");
            v1_1.append(Integer.toBinaryString(this.d));
            throw new IllegalStateException(v1_1.toString());
        } else {
            return;
        }
    }

    public final int b()
    {
        if (!this.g) {
            return this.e;
        } else {
            return (this.b - this.c);
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("State{mTargetPosition=");
        v0_1.append(this.a);
        v0_1.append(", mData=null, mItemCount=");
        v0_1.append(this.e);
        v0_1.append(", mIsMeasuring=");
        v0_1.append(this.i);
        v0_1.append(", mPreviousLayoutItemCount=");
        v0_1.append(this.b);
        v0_1.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        v0_1.append(this.c);
        v0_1.append(", mStructureChanged=");
        v0_1.append(this.f);
        v0_1.append(", mInPreLayout=");
        v0_1.append(this.g);
        v0_1.append(", mRunSimpleAnimations=");
        v0_1.append(this.j);
        v0_1.append(", mRunPredictiveAnimations=");
        v0_1.append(this.k);
        v0_1.append(125);
        return v0_1.toString();
    }
}
