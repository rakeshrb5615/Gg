package d4;
public abstract class d extends android.os.Binder implements android.os.IInterface {
    public final synthetic int a;

    public synthetic d(int p1)
    {
        this.a = p1;
        return;
    }

    public final android.os.IBinder asBinder()
    {
        return this;
    }

    public final boolean onTransact(int p7, android.os.Parcel p8, android.os.Parcel p9, int p10)
    {
        android.os.Bundle v1_0 = 0;
        int v4 = 1;
        switch (this.a) {
            case 0:
                if (p7 <= 16777215) {
                    p8.enforceInterface(this.getInterfaceDescriptor());
                    if (p7 == 2) {
                        if (p8.readInt() != 0) {
                            v1_0 = ((android.os.Parcelable) android.os.Bundle.CREATOR.createFromParcel(p8));
                        }
                        android.os.Bundle v1_2 = ((android.os.Bundle) v1_0);
                        Throwable v7_10 = p8.dataAvail();
                        if (v7_10 > null) {
                            throw new android.os.BadParcelableException(g2.g.c(v7_10, "Parcel data not fully consumed, unread size: "));
                        } else {
                            ((c4.i) this).a(v1_2);
                        }
                    } else {
                        if (p7 == 3) {
                            if (p8.readInt() != 0) {
                                v1_0 = ((android.os.Parcelable) android.os.Bundle.CREATOR.createFromParcel(p8));
                            }
                            android.os.Bundle v1_4 = ((android.os.Bundle) v1_0);
                            Throwable v7_14 = p8.dataAvail();
                            if (v7_14 > null) {
                                throw new android.os.BadParcelableException(g2.g.c(v7_14, "Parcel data not fully consumed, unread size: "));
                            } else {
                                ((c4.i) this).zzb(v1_4);
                            }
                        } else {
                            v4 = 0;
                        }
                    }
                } else {
                    if (!super.onTransact(p7, p8, p9, p10)) {
                    }
                }
                return v4;
            default:
                if (p7 <= 16777215) {
                    p8.enforceInterface(this.getInterfaceDescriptor());
                    if (p7 != 2) {
                        v4 = 0;
                    } else {
                        if (p8.readInt() != 0) {
                            v1_0 = ((android.os.Parcelable) android.os.Bundle.CREATOR.createFromParcel(p8));
                        }
                        android.os.Bundle v1_6 = ((android.os.Bundle) v1_0);
                        Throwable v7_18 = p8.dataAvail();
                        if (v7_18 > null) {
                            throw new android.os.BadParcelableException(g2.g.c(v7_18, "Parcel data not fully consumed, unread size: "));
                        } else {
                            Throwable v7_21 = ((h4.e) this).d.a;
                            if (v7_21 != null) {
                                v7_21.e.remove(((h4.e) this).c);
                                v7_21.a().post(new i4.g(v7_21, 0));
                            }
                            h4.b v10_1 = new Object[0];
                            ((h4.e) this).b.g("onGetLaunchReviewFlowInfo", v10_1);
                            ((h4.e) this).c.trySetResult(new h4.b(((android.app.PendingIntent) v1_6.get("confirmation_intent")), v1_6.getBoolean("is_review_no_op")));
                        }
                    }
                } else {
                    if (!super.onTransact(p7, p8, p9, p10)) {
                    }
                }
                return v4;
        }
    }
}
