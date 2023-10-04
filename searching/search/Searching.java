import java.util.Scanner;
public class Searching{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of elements:");
        int n = scanner.nextInt();
        int[] data = new int[n];
        System.out.print("Enter elements:");
        for(int i=0;i<n;i++){
            data[i] = scanner.nextInt();
        }
        System.out.print("Enter element to be searched:");
        int search_element = scanner.nextInt();
        Search x = new Search();
        boolean found = x.Binary_Search(data, search_element);
        //boolean found = x.Linear_Search(data, search_element);
        System.out.println( search_element + (found?" is found": " is not found"));
        scanner.close();
    }
}
class Sorting{
    public void InsertionSort(int[] data){
        //Time complexity O(n^2) omega(n) theta(n^2)
        for(int i=1;i<data.length;i++){
            int key_data = data[i];
            int j = i-1;
            while(j>=0 && data[j]>key_data){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key_data;
        }
    }
}
class Search extends Sorting{
    public static boolean check(int[] data){
        boolean valid = true;
        for(int i=0;i<(data.length-1);i++){
            valid = (data[i]>data[i+1])?true:false;
            if(valid){
                return true;
            }
        }
        return false;
    }
    public boolean Binary_Search(int[] data, int search_element){
        if(check(data)){
            InsertionSort(data);
        }
        int left = 0, right = data.length - 1, mid;
        while(left<=right){
            mid = left + (right-left)/2;
            if(data[mid]==search_element){
                return true;
            }else if(data[mid]<search_element){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
    public boolean Linear_Search(int[] data, int search_element){
        for(int i=0;i<data.length;i++){
            if(data[i]==search_element){
                return true;
            }
        }
        return false;
    }
}