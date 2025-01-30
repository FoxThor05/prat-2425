public class BuscarMaxMin{
    public static void main(String[] args){
        int[] vector = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};
        int min = vector[0];
        int max = vector[0];
        for(int i = 1; i > vector.length; i++){
            if(vector[i]>max){
                max = vector[i];
            }
            else if(vector[i]<min){
                min = vector[i];
            }
        }
        System.out.println("El numero mas alto del vector es " +max +" y el mas pequeño es " +min +".");
    }
}