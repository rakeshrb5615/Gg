package com.pairip.licensecheck;
public abstract class ILicenseV2ResultListener$Stub extends android.os.Binder implements com.pairip.licensecheck.ILicenseV2ResultListener {
    static final int TRANSACTION_VERIFY_LICENSE = 1;

    public ILicenseV2ResultListener$Stub()
    {
        this.attachInterface(this, "com.android.vending.licensing.ILicenseV2ResultListener");
        return;
    }

    private static Object readTypedObject(android.os.Parcel p1, android.os.Parcelable$Creator p2)
    {
        if (p1.readInt() == 0) {
            return 0;
        } else {
            return p2.createFromParcel(p1);
        }
    }

    public android.os.IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int p4, android.os.Parcel p5, android.os.Parcel p6, int p7)
    {
        if ((p4 >= 1) && (p4 <= 16777215)) {
            p5.enforceInterface("com.android.vending.licensing.ILicenseV2ResultListener");
        }
        if (p4 == 1) {
            this.verifyLicense(p5.readInt(), ((android.os.Bundle) com.pairip.licensecheck.ILicenseV2ResultListener$Stub.readTypedObject(p5, android.os.Bundle.CREATOR)));
        } else {
            if (p4 == 1598968902) {
                p6.writeString("com.android.vending.licensing.ILicenseV2ResultListener");
            } else {
                return super.onTransact(p4, p5, p6, p7);
            }
        }
        return 1;
    }
}
