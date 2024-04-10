public class App {
    public static void main(String[] args) throws Exception {
       MetodosOrdenamiento burbuja= new MetodosOrdenamiento();
       //Creo el arreglo de eneteros int [];
       int [] numeros= {30,7,12,5};

       //Mandar a imprimir mi arreglo
       burbuja.imprimir(numeros);

       int [] arregloOrdenadoBuble =burbuja.sortByBubble(numeros);
       burbuja.imprimir(arregloOrdenadoBuble);
      

    }
}
