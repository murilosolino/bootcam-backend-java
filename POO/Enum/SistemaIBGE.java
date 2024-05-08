package POO.Enum;

public class SistemaIBGE {
    public static void main(String[] args) {

        for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
            System.out.println(uf.getNome() + " - "+ uf.getSigla());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        System.out.println(eb);

        System.out.println(eb.getNome() + " - " + eb.getSigla());
        System.out.println(eb.nomeMaisuculo(eb.getNome()));
    }
}
