public class multithread {
    synchronized void disp(String s) {
        System.out.print(" [ " + s);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.print(" ] ");
    }
}

    class thr implements Runnable {
        Thread t;
        String sob;
        multithread m;

        thr(multithread oba, String s1) {
            m = oba;
            sob = s1;
            t = new Thread(this);
            t.start();
        }

        @Override
        public void run() {
            m.disp(sob);
        }
    }

class one2{
    public static void main(String []args){
        multithread obx=new multithread();
        thr ob=new thr(obx,"rama");
        thr ob1=new thr(obx,"nand");
        thr ob2=new thr(obx,"sagar");
    }
}
