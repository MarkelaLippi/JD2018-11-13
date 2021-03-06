package by.it.vchernetski.jd01_03;

public class InOut {

    static double[ ] getArray(String line){
        String[] strMas=line.trim().split(" ");
        double [] res=new double [strMas.length];
        for (int i = 0; i < res.length; i++) res[i] = Double.parseDouble(strMas[i]);
        return res;
    }
    static void printArray(double[ ] arr){
        for (double v : arr) {
            System.out.print(v+" ");
        }
    }
    static void printArray(double[ ] arr, String name, int columnCount){
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("%s[%- 3d]=%-10.5f", name,i,arr[i]);
            if(((i+1)%columnCount)==0||i+1==arr.length) System.out.println();
        }
    }
}
