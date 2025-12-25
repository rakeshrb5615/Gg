package e;
public final class a implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final int a;
    public final android.content.Intent b;

    static a()
    {
        e.a.CREATOR = new a2.z(11);
        return;
    }

    public a(int p1, android.content.Intent p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        int v1_1;
        String v0_2 = new StringBuilder("ActivityResult{resultCode=");
        int v2 = this.a;
        if (v2 == -1) {
            v1_1 = "RESULT_OK";
        } else {
            if (v2 == 0) {
                v1_1 = "RESULT_CANCELED";
            } else {
                v1_1 = String.valueOf(v2);
            }
        }
        v0_2.append(v1_1);
        v0_2.append(", data=");
        v0_2.append(this.b);
        v0_2.append(125);
        return v0_2.toString();
    }

    public final void writeToParcel(android.os.Parcel p3, int p4)
    {
        int v1;
        kotlin.jvm.internal.j.e(p3, "dest");
        p3.writeInt(this.a);
        android.content.Intent v0_2 = this.b;
        if (v0_2 != null) {
            v1 = 1;
        } else {
            v1 = 0;
        }
        p3.writeInt(v1);
        if (v0_2 != null) {
            v0_2.writeToParcel(p3, p4);
        }
        return;
    }
}
