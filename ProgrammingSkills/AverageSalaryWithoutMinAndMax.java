import java.util.Arrays;

public class AverageSalaryWithoutMinAndMax {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(average(salary));

    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        double total = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            System.out.println(salary[i]);
            total += (double) salary[i]; // 0, 1, 2, 3, 4 => 5
        }
        return (total / (double) (salary.length - 2)) + 1e-6;
    }
}

