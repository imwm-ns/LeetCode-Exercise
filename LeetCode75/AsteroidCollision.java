import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            // When asteroid is a positive number.
            if (asteroid > 0) stack.push(asteroid);
            else {
                // When asteroid is a negative number.
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) stack.pop(); // If last element in stack less than asteroid. I will pop it out of stack.
                if (stack.isEmpty() || stack.peek() < 0) stack.push(asteroid); // If a size of stack is empty or last element less than zero. I will push asteroid in stack.
                else if (asteroid + stack.peek() == 0) stack.pop(); // If asteroid and last element of stack are as same as. I will pop it out of stack.
            }
        }

        int[] res = new int[stack.size()]; // Create the array for return the answer.
        for (int i = res.length - 1; i >= 0; i--) res[i] = stack.pop(); // Pop element in stack to change value of position in array.
        return res;
    }
}
