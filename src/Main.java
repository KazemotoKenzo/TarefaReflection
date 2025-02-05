public class Main {
    public static void main(String[] args){
        Cliente prod = new Cliente();

        if (prod.getClass().isAnnotationPresent(Tabela.class)){
            Tabela ano = prod.getClass().getAnnotation(Tabela.class);
            System.out.println("Nome da anotação: " + ano.annotationType().getName());
            System.out.println("Valor da anotação: " + ano.value());
        }
    }
}
