package org.lasencinas;


import org.junit.Assert;
import org.junit.Test;
import org.lasencinas.bbdd.InventarioBBDD;
import org.lasencinas.negocio.ControladorEstoc;
import org.lasencinas.negocio.Inventariable;

public class ControladorEstocTest {

	@Test
	public void test_control_estoc() {
		Inventariable inventario = new InventarioBBDD();
		ControladorEstoc controlador = new ControladorEstoc(new InventarioBBDD());
		
		Assert.assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
		Assert.assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

	}

}
