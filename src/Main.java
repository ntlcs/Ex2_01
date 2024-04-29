public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumeroDigitado();
        System.out.println("O dobro do número digitado é: " + resultado);



        Musica minhaMusica = new Musica("Ciega, Sordomuda", "Shakira", 1998);
        System.out.println("Ficha Técnica da Música:");
        minhaMusica.exibirFichaTecnica();
        minhaMusica.avaliar(4.8);
        minhaMusica.avaliar(4.5);
        System.out.println("\nFicha Técnica da Música Após Avaliações:");
        minhaMusica.exibirFichaTecnica();


        Carro meuCarro = new Carro("Jaguar", 2020, "Verde");
        meuCarro.exibirFichaTecnica();
        int idade = meuCarro.calcularIdade();
        System.out.println("Idade do Carro: " + idade + " anos");

        Aluno aluno = new Aluno("Marcinho", 2);
        aluno.exibirInformacoes();
    }
}
