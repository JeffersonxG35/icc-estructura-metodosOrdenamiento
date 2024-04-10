public class App {
    public static void main(String[] args) throws Exception {
    MetodosOrdenamiento metodosOrdenamiento= new MetodosOrdenamiento();
    //Creo el arreglo de eneteros int [];
    int [] numeros= {30,7,12,5};
    
       //Mandar a imprimir mi arreglo
       metodosOrdenamiento.imprimir(numeros);
    
       int [] arregloOrdenadoBuble =metodosOrdenamiento.sortByBubble(numeros, true);
       metodosOrdenamiento.imprimir(arregloOrdenadoBuble);
      
    
    }
    }
    
    
