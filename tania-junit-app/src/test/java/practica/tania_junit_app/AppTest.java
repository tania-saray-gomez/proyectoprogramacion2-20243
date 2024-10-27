package practica.tania_junit_app;

import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
@Before
	public void septup() {
	system.out.println("se acaba de ejecutar el modo setup ");	
	}
@Beforeclass
public static void setupclass() {
	system.out.println("se acaba de ejecutar el modo setup class ");
}
@test
public void miprueba() {
	system.out.println("se acaba de ejecutar el modo test prueba ");
}
@test
public void misegundaprueba() {
	system.out.println("se acaba de ejecutar el modo test  segunda prueba ");
}
@after
public void teardows() {
	system.out.println("se acaba de ejecutar el modotear dows ");
}
@afterclass
public static void teardowsclass() {
	system.out.println("se acaba de ejecutar el modotear dows class ");
}
public void metodoauxiliar1() {
	system.out.println("se acaba de ejecutar el metodo auxiliar 1 ");
} 
public void metodoauxiliar2() {
	system.out.println("se acaba de ejecutar elmetodo auxiliar 2 ");
}

