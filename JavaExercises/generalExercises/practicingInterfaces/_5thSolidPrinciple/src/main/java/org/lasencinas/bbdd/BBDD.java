package org.lasencinas.bbdd;

import java.util.HashMap;
import java.util.Map;

public class BBDD {

    // ----- this is our "data base" -----
    public static Map<String, Map<String, Integer>> stocs = new HashMap<>();

    static {
        Map<String, Integer> stocTiendaNorte = new HashMap<>();
        stocTiendaNorte.put("lampara", 600);
        stocTiendaNorte.put("mesa", 500);

        stocs.put("tienda norte", stocTiendaNorte);
    }
}
