import java.util.*;
public class Solution {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Linear Search");
        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();
        int[] data = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print(String.format("Input angka ke- %d : ", i+1));
            data[i] = input.nextInt();
        }
        System.out.println();
        System.out.print("Masukkan angka yang ingin dicari : ");
        int x = input.nextInt();
        int posisi = LinearSearch(data, x, n);
        System.out.println(String.format("Posisi angka %d ada di indeks ke %d", x, posisi));
    }

    static int LinearSearch(int data[], int x, int n)
    {
        for(int i=0;i<n;i++)
        {
            if(data[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
}
