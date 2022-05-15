package br.dio.collectionsEStream;

import java.util.*;

public class collectionsEStream {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Pablo");
        nomes.add("Carlos");
        nomes.add("Murilo");
        nomes.add("Jessica");
        nomes.add("Maria");

        //metodo add adiciona item na lista.

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        //set- recebe o inteiro (que o List- nome).
        // o set é um método de atualização. A posição alterada é que argumentamos entre (). Exemplo:
        // trocas o nome "Murilo", que está na posição 2 (pq ListasArray em java começam a partir do zero-1-2).
        // !! Importannte: Como a lista foi ordenada alfábeticamente com o método sort, a posição da lista está
        // em ordem alfabética. Sendo assim, "Murilo" está na posição 3!

        nomes.remove(4);
                // metodo 'remove' o elemento declarado.
                // 'remove' também remove o objeto declarado. Como abaixo:
        nomes.remove("Maria");
        System.out.println(nomes);

        int posicao = nomes.indexOf("Carlos"); // indexOf retona o indice dos elementos na lista.
        System.out.println(posicao);

        String nome = nomes.get(1); // necessário variável com método get (String nome = ..);
                //.get - recebe um inteiro.
        System.out.println(nome);

        //Como saber o tamanho da lista array?
        int tamanho = nomes.size(); //size para tamanho
        System.out.println(tamanho);

        ////Iterator - pode ser importado da java.uitl.////
        Iterator<String> iterator = nomes.iterator(); // Objeto Iterator pode ser navagedo através do while.
        while (iterator.hasNext()){
            System.out.println("--> " + iterator.next());
        }
        //hasNext - retornar um elemento booleano sempre que houve + de um item na lista - coletção
        //Obejto iterator.next - retorna um objeto que está inteirando agora.


        nomes.remove("Carlos");
        tamanho = nomes.size();
        System.out.println(tamanho);


        boolean temLarissa = nomes.contains("Larissa"); // metodo contains retora um boolean;
        System.out.println(temLarissa);

        boolean listaEstaVazia = nomes.isEmpty(); // isEmpty não recebe nenhum argumento (). Só retorna um boolean;
        System.out.println(listaEstaVazia); // isEmpty - verifica se há elementos na lista

        for (String nomesDoItem: nomes)

            System.out.println("--> " + nomesDoItem);


        nomes.clear(); //remove todos os elementos da lista.

        // --!-- Formas de Navegação entre os elementos da lista --!--

        // recebe dois argumentos: 1º é a declaração (variável);
            //2º argumento é a lista que temos (nomes).

    }

    public static void main(String[] args) {

        List<String> eSports = new Vector<>();

        //Adiciona 4 times de eSports no vector
        eSports.add("Futebol");
        eSports.add("Basquete");
        eSports.add("Tênis de Mesa");
        eSports.add("Handebol");

        //Altera o valor da posição 2 do Vetor
        eSports.set(2, "Ping Pong");

        //Altera o valor da posição 2 do Vetor
        eSports.remove(2);

        //Remove o esporte Handebol
        eSports.remove("Handebol");

        // Retorna o primeiro item de vetor
        System.out.println(eSports.get(0));

        //Navega nos esportes
        for (String esportes1: eSports ) {
            System.out.println(esportes1);
            
        }
    }
}
