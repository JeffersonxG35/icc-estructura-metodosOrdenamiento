public class MetodosOrdenamiento {
    //Metodo que devuelve un arreglo de enteros ordenados por burbuja

    public int[]sortByBubble(int []arreglo, boolean logs){

        ///obtener tamaño del arreglo
        int tamanio=arreglo.length;

//bucle externo que va a recorrer todo el arreglo
        for(int i=0; i<tamanio;i++){
            if(logs){
                System.out.println("\n Pasado numero "+i);
            }
            
//bucle interno que compara el elemento actual con los siguientes 
for(int j=1+1; i<tamanio;j++){
    if(logs){
    System.out.println("i="+arreglo[i]+"j="+arreglo[j]);
    }
    if(arreglo[i]>arreglo[j]){
        //Intercambiamos los elementos 
        if(logs){
        System.out.println("- Si es mayor asi que cambio");
        }
        int temporal=arreglo [i];
        arreglo[i]=arreglo[j];
        arreglo[j]=temporal;
        if (logs){
        System.out.print(" ");
        imprimir(arreglo);
    }
    }
}
        }
        return arreglo;
    }




    //Metodo que devuelve un arreglo de enteros ordenados por Seleccion




    //Metodo que devuelve un arreglo de enteros ordenados por Inserción



    //Metodo que imprime un arreglo
    public void imprimir(int []arreglo){
       for (int i=0; i<arreglo.length;i++){
        System.out.print(arreglo[i] +" ");
       }
       System.out.println();
    }


}
