package androidx.profileinstaller;
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {

    public ProfileInstallReceiver()
    {
        return;
    }

    public final void onReceive(android.content.Context p6, android.content.Intent p7)
    {
        if (p7 != 0) {
            int v0_4 = p7.getAction();
            if (!"androidx.profileinstaller.action.INSTALL_PROFILE".equals(v0_4)) {
                if (!"androidx.profileinstaller.action.SKIP_FILE".equals(v0_4)) {
                    if (!"androidx.profileinstaller.action.SAVE_PROFILE".equals(v0_4)) {
                        if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(v0_4)) {
                            int v7_3 = p7.getExtras();
                            if (v7_3 != 0) {
                                int v7_4 = v7_3.getString("EXTRA_BENCHMARK_OPERATION");
                                int v0_8 = new j6.o(this, 20);
                                if (!"DROP_SHADER_CACHE".equals(v7_4)) {
                                    v0_8.j(16, 0);
                                } else {
                                    int v6_5;
                                    if (android.os.Build$VERSION.SDK_INT < 34) {
                                        v6_5 = p6.createDeviceProtectedStorageContext().getCodeCacheDir();
                                    } else {
                                        v6_5 = p6.createDeviceProtectedStorageContext().getCacheDir();
                                    }
                                    if (!y1.c.c(v6_5)) {
                                        v0_8.j(15, 0);
                                        return;
                                    } else {
                                        v0_8.j(14, 0);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        android.os.Process.sendSignal(android.os.Process.myPid(), 10);
                        android.util.Log.d("ProfileInstaller", "");
                        this.setResultCode(12);
                        return;
                    }
                } else {
                    int v7_7 = p7.getExtras();
                    if (v7_7 != 0) {
                        int v7_8 = v7_7.getString("EXTRA_SKIP_FILE_OPERATION");
                        if (!"WRITE_SKIP_FILE".equals(v7_8)) {
                            if ("DELETE_SKIP_FILE".equals(v7_8)) {
                                new java.io.File(p6.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                                android.util.Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                                this.setResultCode(11);
                                return;
                            }
                        } else {
                            int v7_13 = new j6.o(this, 20);
                            try {
                                y1.c.e(p6.getPackageManager().getPackageInfo(p6.getApplicationContext().getPackageName(), 0), p6.getFilesDir());
                                v7_13.j(10, 0);
                            } catch (int v6_2) {
                                v7_13.j(7, v6_2);
                            }
                        }
                    }
                }
            } else {
                y1.c.t(p6, new x1.d(), new j6.o(this, 20), 1);
                return;
            }
        }
        return;
    }
}
