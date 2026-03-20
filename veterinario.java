public class Veterinario {
	private String nombre;
	private String apellido;
	private String matricula;
	private String especialidad;
	private int aniosExperiencia;
	
		public Veterinario(String nombre , String apellido, String matricula
				          , String especialdad, int aniosExperiencia) {
			setNombre(nombre);
			setApellido(apellido);
			setMatricula(matricula);
			setEspecialidad(especialidad);
			setAniosExperiencia(aniosExperiencia);
			
		}

		public void setNombre(String nombre) {
			this.nombre = (nombre == null || nombre.trim().isEmpty()) ? "Desconocido" : nombre.trim();

		}
		
		public void setApellido(String apellido) {
			this.apellido = (apellido == null || nombre.trim().isEmpty()) ?  "Desconocido" : apellido.trim();
		}
		
		public void setMatricula(String matricula) {
			 this.matricula = (matricula == null || matricula.trim().isEmpty()) ? "SIN-MATRICULA" : matricula.trim();

		}
		
		public void setEspecialidad(String especialidad) {
			  this.especialidad = (especialidad == null || especialidad.trim().isEmpty()) ? "General" : especialidad.trim();
		}
		
		public void setAniosExperiencia(int aniosExperiencia) {
			this.aniosExperiencia = (aniosExperiencia < 0) ? 0 : aniosExperiencia;

		}
		
					public String getNombre() {return nombre; }
					public String getApellido() {return apellido;}
					public String getMatricula() {return matricula;}
					public int getAniosExperiencia() {return aniosExperiencia;}
						
					
					
					 public String getNombreCompleto() {   return nombre + " " + apellido; }
					 public boolean esEspecialista() {  return aniosExperiencia >= 5;}
					 public String toString() {
					        return "Veterinario: " + getNombreCompleto() +
					               "\nMatrícula: " + matricula +
					               "\nEspecialidad: " + especialidad +
					               "\nAños de experiencia: " + aniosExperiencia;
					          }

                     public String getEspecialidad() {
                         return especialidad;
                     }
}