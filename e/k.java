package e;
public final class k implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final android.content.IntentSender a;
    public final android.content.Intent b;
    public final int c;
    public final int d;

    static k()
    {
        e.k.CREATOR = new a2.z(12);
        return;
    }

    public k(android.content.IntentSender p2, android.content.Intent p3, int p4, int p5)
    {
        kotlin.jvm.internal.j.e(p2, "intentSender");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p2, int p3)
    {
        kotlin.jvm.internal.j.e(p2, "dest");
        p2.writeParcelable(this.a, p3);
        p2.writeParcelable(this.b, p3);
        p2.writeInt(this.c);
        p2.writeInt(this.d);
        return;
    }
}
