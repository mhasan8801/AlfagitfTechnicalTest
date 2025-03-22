import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Membuat daftar angka (list)
        List<Integer> data = Arrays.asList(5, 1, 5, 2, 1, 3, 4);

        // Mencetak angka unik pertama dgn metode findFirstUnique
        System.out.println("First unique number: " + findFirstUnique(data));
    }

    public static Integer findFirstUnique(List<Integer> numbers) {

        // Menyimpan jumlah kemunculan angka dgn LinkedHashMap
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Menghitung jumlah kemunculan setiap angka dalam daftar
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Mencari angka unik pertama dalam daftar
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // Jika tidak ada angka unik, mengembalikan null
    }

}