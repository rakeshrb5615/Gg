package com.google.android.gms.common.internal;
public abstract class IGmsServiceBroker$Stub extends android.os.Binder implements com.google.android.gms.common.internal.IGmsServiceBroker {

    public IGmsServiceBroker$Stub()
    {
        this.attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        return;
    }

    public android.os.IBinder asBinder()
    {
        return this;
    }

    public final boolean onTransact(int p4, android.os.Parcel p5, android.os.Parcel p6, int p7)
    {
        if ((p4 > null) && (p4 <= 16777215)) {
            com.google.android.gms.common.internal.zzy v1_2;
            p5.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            int v7_3 = p5.readStrongBinder();
            com.google.android.gms.common.internal.GetServiceRequest v0_2 = 0;
            if (v7_3 != 0) {
                com.google.android.gms.common.internal.zzy v1_0 = v7_3.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (!(v1_0 instanceof com.google.android.gms.common.internal.IGmsCallbacks)) {
                    v1_2 = new com.google.android.gms.common.internal.zzy(v7_3);
                } else {
                    v1_2 = ((com.google.android.gms.common.internal.IGmsCallbacks) v1_0);
                }
            } else {
                v1_2 = 0;
            }
            if (p4 != 46) {
                if (p4 != 47) {
                    p5.readInt();
                    if (p4 != 4) {
                        p5.readString();
                        if (p4 == 1) {
                            p5.readString();
                            p5.createStringArray();
                            p5.readString();
                            if (p5.readInt() != 0) {
                                android.os.Bundle.CREATOR.createFromParcel(p5);
                            }
                        } else {
                            if ((p4 != 2) && ((p4 != 23) && ((p4 != 25) && (p4 != 27)))) {
                                if (p4 != 30) {
                                    if (p4 == 34) {
                                        p5.readString();
                                        throw new UnsupportedOperationException();
                                    } else {
                                        if ((p4 == 41) || ((p4 == 43) || ((p4 == 37) || (p4 == 38)))) {
                                            if (p5.readInt() != 0) {
                                                android.os.Bundle.CREATOR.createFromParcel(p5);
                                            }
                                        } else {
                                            switch (p4) {
                                                case 9:
                                                    p5.readString();
                                                    p5.createStringArray();
                                                    p5.readString();
                                                    p5.readStrongBinder();
                                                    p5.readString();
                                                    if (p5.readInt() == 0) {
                                                    } else {
                                                        android.os.Bundle.CREATOR.createFromParcel(p5);
                                                    }
                                                    break;
                                                case 10:
                                                    p5.readString();
                                                    p5.createStringArray();
                                                    break;
                                                case 19:
                                                    p5.readStrongBinder();
                                                    if (p5.readInt() == 0) {
                                                    } else {
                                                        android.os.Bundle.CREATOR.createFromParcel(p5);
                                                    }
                                                    break;
                                                case 20:
                                                    break;
                                                default:
                                            }
                                        }
                                    }
                                }
                                p5.createStringArray();
                                p5.readString();
                                if (p5.readInt() == 0) {
                                } else {
                                    android.os.Bundle.CREATOR.createFromParcel(p5);
                                }
                            }
                        }
                    }
                } else {
                    if (p5.readInt() != 0) {
                        com.google.android.gms.common.internal.zzai.CREATOR.createFromParcel(p5);
                    }
                    throw new UnsupportedOperationException();
                }
            } else {
                if (p5.readInt() != 0) {
                    v0_2 = ((com.google.android.gms.common.internal.GetServiceRequest) com.google.android.gms.common.internal.GetServiceRequest.CREATOR.createFromParcel(p5));
                }
                this.getService(v1_2, v0_2);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
                p6.writeNoException();
                return 1;
            }
        } else {
            return super.onTransact(p4, p5, p6, p7);
        }
    }
}
