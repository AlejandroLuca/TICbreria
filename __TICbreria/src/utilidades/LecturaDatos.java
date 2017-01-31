package utilidades;

import java.util.Scanner;

public class LecturaDatos {

	public LecturaDatos(){
		
	}
	public static String recogeString() {
        String dato = new Scanner(System.in).nextLine();
        return dato;
    }

    public static String recogeString(String msg) {
        System.out.println(msg);
        return recogeString();
    }

    public static int recogeInt() {
        int dato = new Scanner(System.in).nextInt();
        return dato;
    }

    public static int recogeInt(String msg){
        System.out.println(msg);
        return recogeInt();
    }

    public static double recogeDouble() {
        double dato = new Scanner(System.in).nextDouble();
        return dato;
    }

    public static double recogeDouble(String msg) {
        System.out.println(msg);
        return recogeDouble();
    }
}
