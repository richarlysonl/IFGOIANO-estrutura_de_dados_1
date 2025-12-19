package documento;
import java.util.Random;

public class Documento {
    private int id;
    private String tipo;
    private int paginas;

    private static Random random = new Random();
    private static String[] tipos = {"PDF", "TXT", "JPG", "PNG", "DOCX", "XLSX"};

    public Documento(int id) {
        this.id = id;
        this.tipo = tipos[random.nextInt(tipos.length)];
        this.paginas = random.nextInt(100) + 1; // 1 a 100 páginas
    }

    public int getId() { return id; }
    public String getTipo() { return tipo; }
    public int getPaginas() { return paginas; }

    @Override
    public String toString() {
        return "[ID: " + id + ", Tipo: " + tipo + ", Páginas: " + paginas + "]";
    }
}
