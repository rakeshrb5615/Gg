package q0;
public abstract class r1 {

    public static int a(int p5)
    {
        int v0 = 0;
        int v2 = 1;
        while (v2 <= 512) {
            if ((p5 & v2) != 0) {
                int v3_0;
                if (v2 == 1) {
                    v3_0 = android.view.WindowInsets$Type.statusBars();
                } else {
                    if (v2 == 2) {
                        v3_0 = android.view.WindowInsets$Type.navigationBars();
                    } else {
                        if (v2 == 4) {
                            v3_0 = android.view.WindowInsets$Type.captionBar();
                        } else {
                            if (v2 == 8) {
                                v3_0 = android.view.WindowInsets$Type.ime();
                            } else {
                                if (v2 == 16) {
                                    v3_0 = android.view.WindowInsets$Type.systemGestures();
                                } else {
                                    if (v2 == 32) {
                                        v3_0 = android.view.WindowInsets$Type.mandatorySystemGestures();
                                    } else {
                                        if (v2 == 64) {
                                            v3_0 = android.view.WindowInsets$Type.tappableElement();
                                        } else {
                                            if (v2 == 128) {
                                                v3_0 = android.view.WindowInsets$Type.displayCutout();
                                            } else {
                                                if (v2 == 512) {
                                                    v3_0 = android.view.WindowInsets$Type.systemOverlays();
                                                } else {
                                                    v2 <<= 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                v0 |= v3_0;
            }
        }
        return v0;
    }
}
