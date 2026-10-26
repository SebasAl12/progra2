
	package variables;
	 
	public class MAIN {
	 
	 
		    public static void main(String[] args) {
	 
		        Hospital paciente1 = new Hospital();
		        Hospital paciente2 = new Hospital();
		        Hospital paciente3 = new Hospital();
		        Hospital paciente4 = new Hospital();
	 
		
		        paciente1.IngresarDatos("Carlos", "Perez", "1723456789");
		        paciente1.GenerarServicio("Emergencia");
		        paciente1.Turno = 1;
		        paciente1.Turnoasignado = "Turno A";
		        paciente1.asignaCubiculodesocupado(1);
	 
		        System.out.println("-------------------------");
	 
		        paciente2.IngresarDatos("Maria", "Lopez", "1723456780");
		        paciente2.GenerarServicio("Pediatria");
		        paciente2.Turno = 2;
		        paciente2.Turnoasignado = "Turno B";
		        paciente2.asignaCubiculodesocupado(2);
	 
		        System.out.println("-------------------------");
	 
	}
		    
		    
		    
	}
	 


