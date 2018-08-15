class Loops {
    int a[];
    int num;
    int idx;
    
    int findIndexArray(int a[], int num) {
        for(int i=0; i < a.length; i++) {
            if(a[i] == num) {
                idx = i;
                break;
            }
            else idx = -1;
        }
        if(a.length == 0) return -1;
        return idx;
    }

    void replaceElement(int a[], int b, int c) {
       for(int i=0; i < a.length; i++) {
           if(a[i] == b) a[i] = c;
       }
   }
}

class HexletArray {
    public static void main(String args[]) {
        Loops metod = new Loops();
        
        int array[] = {5, 6, 4, 5};
        
/*        int index = 4;
        
        System.out.println(metod.findIndex(array, index)); */
        
        metod.replaceElement(array, 5, 10);
        
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}