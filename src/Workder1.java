import java.util.stream.Stream;

public class Workder1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Worker1 start");

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Worker1 end");
    }



    public static void main(String[] args) {
    
    	int a = 1;
    	int b = 4;
    	int c;
    	int d;
    	c = ++b;
    	d = a++;

        System.out.println("d = " + d);
        Stream<Integer> s = Stream.of(5, 10, 20, 50);
        Integer i = s.reduce((integer1, integer2)-> integer2 - integer1).orElse(-1);

        System.out.println(i); 
        String str1 = "Hello";
        String str2 = str1;

        str1 = str1 + "World";

        System.out.println(str2);
    }
}


  
