import modelo.ContaInterface;
import modelo.Contaareceber;
import modelo.Pagamento;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Contaareceber cr= new Contaareceber(1800,"Anna clara");
        System.out.println(cr);
        Pagamento p1 = new Pagamento(200, LocalDate.now());
        cr.addpagamento(p1);
        Pagamento p2 = new Pagamento(500, LocalDate.now());
        cr.addpagamento(p2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
