import org.junit.Test;
import reactor.core.publisher.Flux;

import java.util.concurrent.*;

public class GatWay {

    @Test
    public void test(){
        Flux<Integer> ints = Flux.range(1,4).map(i -> {
            if(i<3)return i;
            throw new RuntimeException("Got 4");
        });


        ints.subscribe( i -> System.out.println(i),error -> System.out.println("error" + error));

        Flux.just(1,2,3).subscribe(s -> System.out.println(s));
    }

    @Test
    public void test2() throws InterruptedException {

        ExecutorService executor = new ThreadPoolExecutor(5,50,0,
                TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());


        CountDownLatch latch = new CountDownLatch(1);
       String a = CompletableFuture.supplyAsync(()->{
           try {
               Thread.sleep(10000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           return "hello";
        },executor).thenApplyAsync( v-> {latch.countDown();return v + "world";},executor).join();


        System.out.println("============In Main ===========");
        latch.await();
        System.out.println("1");
    }

    @Test
    public void test3(){

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->{

            System.out.println(">>>>>>>> Future1 <<<<<<<<");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "future1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->{
            System.out.println(">>>>>>>> Future2 <<<<<<<<");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "future2";
        });


    }
}
