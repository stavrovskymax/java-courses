class Loops {
    int a[];
    int num;
    int idx;
    
    int findIndexArray(int num, int a[]) {
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
}

class FindIndex {
    public static void main(String args[]) {
        Loops metod = new Loops();
        
        int array[] = {5, 6, 4};
        
        int index = 4;
        
        System.out.println(metod.findIndexArray(index, array));
    }
}
            
        