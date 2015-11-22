public class sorting{
    public static void sort(int [] a){
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    int k = a[i];
                    int w = a[j];
                    a[i] = w;
                    a[j] = k;
                }
            }
        }
    }
    public static void main(String[] args){
        int [] array1 = new int[20];
        int [] array2 = new int[10];
        for(int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < array2.length; i++){
            array2[i] = (int)(Math.random()*100);
        }
        sort(array1);
        sort(array2);
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        int [] array3 = new int[(array1.length + array2.length)];
            int j = 0;
            while(j < array1.length){
                array3[j] = array1[j];
                j++;
            }
            while(j < array3.length){
                array3[j] = array2[j - 20];
                j++;
            }
        sort(array3);
        for(int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + " ");
        }
        System.out.println(" ");
    }
}