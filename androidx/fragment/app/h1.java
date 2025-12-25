package androidx.fragment.app;
public final class h1 implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final String r;
    public final int s;
    public final boolean t;

    static h1()
    {
        androidx.fragment.app.h1.CREATOR = new a2.z(7);
        return;
    }

    public h1(android.os.Parcel p4)
    {
        int v0_0;
        this.a = p4.readString();
        this.b = p4.readString();
        int v1 = 0;
        if (p4.readInt() == 0) {
            v0_0 = 0;
        } else {
            v0_0 = 1;
        }
        int v0_6;
        this.c = v0_0;
        this.d = p4.readInt();
        this.e = p4.readInt();
        this.f = p4.readString();
        if (p4.readInt() == 0) {
            v0_6 = 0;
        } else {
            v0_6 = 1;
        }
        int v0_8;
        this.m = v0_6;
        if (p4.readInt() == 0) {
            v0_8 = 0;
        } else {
            v0_8 = 1;
        }
        int v0_10;
        this.n = v0_8;
        if (p4.readInt() == 0) {
            v0_10 = 0;
        } else {
            v0_10 = 1;
        }
        int v0_12;
        this.o = v0_10;
        if (p4.readInt() == 0) {
            v0_12 = 0;
        } else {
            v0_12 = 1;
        }
        this.p = v0_12;
        this.q = p4.readInt();
        this.r = p4.readString();
        this.s = p4.readInt();
        if (p4.readInt() != 0) {
            v1 = 1;
        }
        this.t = v1;
        return;
    }

    public h1(androidx.fragment.app.e0 p2)
    {
        this.a = p2.getClass().getName();
        this.b = p2.mWho;
        this.c = p2.mFromLayout;
        this.d = p2.mFragmentId;
        this.e = p2.mContainerId;
        this.f = p2.mTag;
        this.m = p2.mRetainInstance;
        this.n = p2.mRemoving;
        this.o = p2.mDetached;
        this.p = p2.mHidden;
        this.q = p2.mMaxState.ordinal();
        this.r = p2.mTargetWho;
        this.s = p2.mTargetRequestCode;
        this.t = p2.mUserVisibleHint;
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder(128);
        v0_1.append("FragmentState{");
        v0_1.append(this.a);
        v0_1.append(" (");
        v0_1.append(this.b);
        v0_1.append(")}:");
        if (this.c) {
            v0_1.append(" fromLayout");
        }
        String v1_4 = this.e;
        if (v1_4 != null) {
            v0_1.append(" id=0x");
            v0_1.append(Integer.toHexString(v1_4));
        }
        String v1_6 = this.f;
        if ((v1_6 != null) && (!v1_6.isEmpty())) {
            v0_1.append(" tag=");
            v0_1.append(v1_6);
        }
        if (this.m) {
            v0_1.append(" retainInstance");
        }
        if (this.n) {
            v0_1.append(" removing");
        }
        if (this.o) {
            v0_1.append(" detached");
        }
        if (this.p) {
            v0_1.append(" hidden");
        }
        String v1_16 = this.r;
        if (v1_16 != null) {
            v0_1.append(" targetWho=");
            v0_1.append(v1_16);
            v0_1.append(" targetRequestCode=");
            v0_1.append(this.s);
        }
        if (this.t) {
            v0_1.append(" userVisibleHint");
        }
        return v0_1.toString();
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeString(this.a);
        p1.writeString(this.b);
        p1.writeInt(this.c);
        p1.writeInt(this.d);
        p1.writeInt(this.e);
        p1.writeString(this.f);
        p1.writeInt(this.m);
        p1.writeInt(this.n);
        p1.writeInt(this.o);
        p1.writeInt(this.p);
        p1.writeInt(this.q);
        p1.writeString(this.r);
        p1.writeInt(this.s);
        p1.writeInt(this.t);
        return;
    }
}
