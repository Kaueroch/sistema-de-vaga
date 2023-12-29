public class Pessoa implements pesso13 {
    String nome;
    int idade;
    String vaga;

    public Pessoa(String nome, int idade,String vaga) {
        this.nome = nome;
        this.idade = idade;
        this.vaga=vaga;
    }
    public void Apresentações() {
        System.out.println("Olá," + nome + "!");
        System.out.println("Sua idade é" + idade);
        System.out.println("Minha vaga é " + vaga);

        if (vaga.equals("Analista e desenvolvimento de sistemas")){
            casoforads();
        }else if(vaga.equals("Desenvolvedor pleno junior")){
            casofordevpj();
        }else if (vaga.equals("Engenheiro de software")){
            casoforengenheiro();
        }
    }
    public void casoforads(){
        System.out.println("Sinto muito," + nome + " Não temos vagas para " + vaga);
    }
    public void casofordevpj(){
        System.out.println("Temos vaga de " + vaga + "! " + " Aguarde um pouco e chamaremos você para a segunda fase " + nome);
    }

    public void casoforengenheiro(){
        System.out.println("Sinto muito," + nome + " Não temos vagas para " + vaga);
    }


}
