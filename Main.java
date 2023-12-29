public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25, "Analista e desenvolvimento de sistemas");
        Pessoa pessoa2 = new Pessoa("Kauê" , 17,"Desenvolvedor pleno junior");
        Pessoa pessoa3 = new Pessoa ("Geovanna", 15,"Engenheiro de software");

        pessoa1.Apresentações();
        pessoa2.Apresentações();
        pessoa3.Apresentações();
    }

}
