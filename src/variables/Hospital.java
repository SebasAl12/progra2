package variables;
 
public class Hospital {
	
	  String Nombre;
	    String Apellido;
	    String Cedula;
	    String Servicio;
	    int Turno;
	    String Turnoasignado;
 
	    static String Turnosecuencial = "";
	    
	    int Cubiculo;
 
	   
	    public void GenerarServicio(String Servicio) {
	    	
	    	
	    	
	    	
	        this.Servicio = Servicio;
	        System.out.println("Servicio guardado: " + Servicio);
	    }
 
 
	    public void IngresarDatos(String nombre1, String apellido1, String cedula1) {
	        this.Nombre = nombre1;
	        this.Apellido = apellido1;
	        this.Cedula = cedula1;
 
	        System.out.println("Datos guardados ");
	    }
 
 
	    public void ImprimirInfo() {
	        System.out.println("Nombre: " + Nombre);
	        System.out.println("Apellido: " + Apellido);
	        System.out.println("Cedula: " + Cedula);
	        System.out.println("Servicio: " + Servicio);
	        System.out.println("Turno: " + Turno);
	        System.out.println("Turno asignado: " + Turnoasignado);
	    }
 
 
	    public void asignaCubiculodesocupado(int cubiculo) {
	        this.Cubiculo = cubiculo;
 
	        System.out.println("Cubiculo asignado: " + Cubiculo);
 
	        ImprimirInfo();
	        
	        System.out.println("Cubiculo: " + Cubiculo);
	    }
	}