package org.lasencinas.draw;

public interface Drawable {
    void draw();
    default void applyTheme() {
        ;
    }
}
