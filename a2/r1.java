package a2;
public final class r1 implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public java.util.ArrayList m;
    public boolean n;
    public boolean o;
    public boolean p;

    static r1()
    {
        a2.r1.CREATOR = new a2.z(2);
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeInt(this.a);
        p1.writeInt(this.b);
        p1.writeInt(this.c);
        if (this.c > 0) {
            p1.writeIntArray(this.d);
        }
        p1.writeInt(this.e);
        if (this.e > 0) {
            p1.writeIntArray(this.f);
        }
        p1.writeInt(this.n);
        p1.writeInt(this.o);
        p1.writeInt(this.p);
        p1.writeList(this.m);
        return;
    }
}
