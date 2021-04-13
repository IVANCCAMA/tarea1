
public class MateriaDeTecnologia{
    private String nombreMateria;
    private char nivelDeDificultad;
    private int semestre;
    private int duracionDeMeses;
    
    public MateriaDeTecnologia(String nombreMateria, char nivelDeDificultad, int semestre, int duracionDeMeses){
        this.nombreMateria = nombreMateria;
        this.nivelDeDificultad = nivelDeDificultad;
        this.semestre = semestre;
        this.duracionDeMeses = duracionDeMeses;
    }
    
    public String getNombreMateria(){
        return nombreMateria;
    }
    
    public void setNombreMateria(String nombre){
        this.nombreMateria = nombre;
    }
    
    public char getNivelDeDificultad(){
        return nivelDeDificultad; 
    }
    
    public void setNivelDeDificultad(char n){
        nivelDeDificultad = n;
    }
    
    public int getSemestre(){
        return semestre;
    }
    
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
    
    public int getDuracionDeMeses(){
        return duracionDeMeses;
    }
    
    public void setDuracionDeMeses(int duracion){
        duracionDeMeses = duracion;
    }
    
    public boolean esLargo(){
        boolean duracion = duracionDeMeses > 6;
        return duracion;
    }
    
    public boolean esDificil(){
        boolean nivel = nivelDeDificultad == 'A';
        return nivel;
    }
    
}
