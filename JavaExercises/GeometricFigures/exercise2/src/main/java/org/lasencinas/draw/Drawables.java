package org.lasencinas.draw;

import java.util.List;

public interface Drawables {
    static void dibujarDrawables(List<Drawable> list) {
        for (Drawable drawable : list) {
            drawable.draw();
        }
    }

    static void applyThemeDrawables(List<Drawable> list) {
        for (Drawable drawable : list) {
            drawable.applyTheme();
        }
    }
}
