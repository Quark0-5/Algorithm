import java.util.Scanner;
class Pair{
    int position;
    boolean found;
}

public class Linear_search{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of elements:");
        int n = scanner.nextInt();
        int[] data = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++){
            data[i] = scanner.nextInt();
        }
        System.out.println("Enter value to search:");
        int search_value = scanner.nextInt();
        Pair x = new Pair();
        x.found = false;
        for(int i=0;i<n;i++){
            if(data[i] == search_value){
                x.found = true;
                x.position = i+1;
            }
        }
        if(x.found == false){
            System.out.println("Not found");
        }else{
            System.out.println("Found in position number " + x.position+"\n");
        }
        scanner.close();


    }
}