package program;

public class Strinhhhh {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    class HelloWorld {
        public static String reverseall(String s) {
            String rev = " ";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }
            return rev;
        }

        public static void reverse(String s) {
            String arr[] = s.split(" ");
            String rev = " ";
            for (int i = 0; i < arr.length; i++) {
                if (i == 0 || i == 1) {
                    String str = reverseall(arr[i]);
                    rev = rev + str + " ";
                } else {
                    rev = rev + arr[i] + " ";
                }
                System.out.println(rev);
            }
        }

        public static void main(String args[]) {
            reverse("Neudesic is the trusted technology partner in business innovation");
        }
    }
        }

