import java.io.*;

public class Fiboncce {
    public static void main(String[] args) throws Exception{
        sol obj = new sol();
        int n = 12;

        sol.f(n);
        System.out.println(sol.f(n));


    }

    static class sol{
        static int f(int n)
        {
            if (n <= 1) {
                return n;
            }
            int last = f(n - 1);
            int slast = f(n - 2);

            return last + slast;
        }


    }

}


