class Loops {
    private int a[];
    private int idx;
    
    Loops(int arrayLoops[]) {
        this.a = arrayLoops;
        this.idx = 0;
    }
    
    // Поиск элемента в массиве
    int findIndexArray(int num) {
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

    // Замена элементов массива
    void replaceElement(int b, int c) {
       for(int i=0; i < a.length; i++) {
           if(a[i] == b) a[i] = c;
       }
   }
    
    // Создать треугольный массив
    void triangleArray(int numArray) {
        if (numArray < 2) {
                System.out.print("null");
                return;
            }
        int numbers[][] = new int[numArray][];
        System.out.println("arg[0][0] = null");
        for(int i=0; i < numArray; i++) {
            numbers[i] = new int[i];
            for(int j=0; j < numbers[i].length; j++) {
                numbers[i][j] = i;
                System.out.println("arg[" + i + "][" + j + "] = " + numbers[i][j]);
            }
        }
    }
}

class HexletArray {
    public static void main(String args[]) {
        
        final int array[] = {5, 6, 4, 5};        
        
        Loops metod = new Loops(array);
        
        System.out.println("Source array");
        
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("\n");
            
        System.out.println("Searching for an element in an array");
        
        final int index = 4;
        
        System.out.println("Find element by index: " + index);
        
        System.out.println("Result: " + metod.findIndexArray(index));
        
        System.out.println();
        
        System.out.println("Replacing array elements");
        
        final int inReplace = 5; 
        
        final int outReplace = 10;
        
        System.out.println("Replace " + inReplace + " to " + outReplace);
        
        metod.replaceElement(inReplace, outReplace);
        
        System.out.print("Result:");
        
        for(int i=0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        
        System.out.println("\n");
        
        System.out.println("Create a triangle array");
        
        final int sizeTriangleArray = 4;
        
        System.out.println("Size of a triangle array: " + sizeTriangleArray);
        
        System.out.println("Result:");
        
        metod.triangleArray(sizeTriangleArray);
    }
}