class thr1 implements Runnable{
        Thread t;
        thr1(){
            t=new Thread(this);
            t.start();
            }

    public thr1(multithread obx, String rama) {
    }

    @Override
    public void run() {
        class even {
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    if (i / 2 == 0) {
                        System.out.println("Even "+t.getName());
                    }
                }
            }
        }

    }

    class odd {
        public void run() {
            for (int i = 0; i <= 10; i++) {
                if (i / 2 != 0) {
                    System.out.println("Odd "+t.getName());
                }
            }
        }
    }

}

    class runnableex{
        public static void main(String[] args) {
            thr1 ob1=new thr1();
            thr1 ob2=new thr1();
        }
        }
