

public class Curso extends Conteudo {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso (){

    }

    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            return sb.toString();
    }

    @Override
    public double calcularXp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}