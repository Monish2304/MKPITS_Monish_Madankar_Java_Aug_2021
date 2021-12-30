class ThreadEx extends Thread {
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("HEllo " +getName() +isDaemon());
        }
    }
}

class DaemonEx{
    public static void main(String []args){
        ThreadEx ob1=new ThreadEx();
        ThreadEx ob2=new ThreadEx();
        ThreadEx ob3=new ThreadEx();

        ob1.start();
        ob2.start();
        ob3.start();
    }
}
