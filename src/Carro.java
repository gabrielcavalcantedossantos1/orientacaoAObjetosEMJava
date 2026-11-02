public class Carro {
    // atributos ou propriedades
    String marca;
    String modelo;
    int ano;

    // métodos
    void acelerar() {
        System.out.println("Estamos acelerando o carro!");
    }

    void exibirInfo() {
        System.out.printf("Marca: %s, modelo: %s, ano: %d", marca, modelo, ano);
    }
}
