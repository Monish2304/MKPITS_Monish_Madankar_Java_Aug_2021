class DaemonEx2 extends Thread {
    public void run(){
        for(int i=0;i<=5;i++){
            if(isDaemon()){
                System.out.println(getName() +"is Daemon");
            }
            else{
                System.out.println(getName() +"is not Daemon");
            }
        }
    }
}


class ThreadEx2 {
    public static void main(String []args){
        ThreadEx ob1=new ThreadEx();
        ThreadEx ob2=new ThreadEx();
        ThreadEx ob3=new ThreadEx();

        ob1.start();
        ob2.setDaemon(true);
        ob2.start();
        ob3.start();
    }
}
