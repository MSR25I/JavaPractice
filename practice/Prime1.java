package practice;

public class Prime1 {

    public boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimesBelow(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Prime1 primeChecker = new Prime1();
        int num = 53;

        int primeCount = primeChecker.countPrimesBelow(num);
        System.out.println("Number of prime numbers below " + num + ": " + primeCount);
    }
}
