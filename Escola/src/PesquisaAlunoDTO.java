public class PesquisaAlunoDTO {
    private String vNome;
    private int vIdade;
    private double vMedia;

    public PesquisaAlunoDTO(String vNome, int vIdade, double vMedia) {
        setvNome(vNome);
        setvIdade(vIdade);
        setvMedia(vMedia);
    }

    public void setvNome(String vNome) {
        if (vNome  == null) {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
        this.vNome = vNome;
    }

    public void setvIdade(int vIdade) {
    if (vIdade < 0 || vIdade > 100) {
        throw  new IllegalArgumentException("idade invalida");
    }
        this.vIdade = vIdade;
    }

    public void setvMedia(double vMedia) {
        if (vMedia < 0 || vMedia >10) {
            throw new IllegalArgumentException("Media invalida");
        }
        this.vMedia = vMedia;
    }

    public String getvNome() {
        return vNome;
    }

    public int getvIdade() {
        return vIdade;
    }

    public double getvMedia() {
        return vMedia;
    }
}