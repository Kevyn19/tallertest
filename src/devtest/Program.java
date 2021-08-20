package devtest;


import java.util.ArrayList;
import java.util.List;

class Program {


    public static void main(String[] args) {

        int array[] =  {7, 6, 4, -1, 1, 2};

        List<Integer[]> result = fourNumberSum(array,16);

        for(Integer[] elem: result){
            for(int i = 0; i < elem.length;i++){
                System.out.println(elem[i]);
            }
            System.out.println("\n");
        }


    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
       List<Integer[]> result =  new ArrayList<Integer[]>();

        if(array.length >= 4){
            int amount = 0;

            for(int i = 0; i < array.length-4; i++){
                amount = array[i];
                Integer auxArray[] = new Integer[5];
                auxArray[0] = array[0];
                for(int j = i+1; j < 4; j++){
                    auxArray[i+j] =  array[j];
                    amount += array[j];
                }
                if(amount == targetSum){
                    result.add(auxArray);
                    continue;
                }

            }
        }

        return result;
    }
}
