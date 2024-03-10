class Final1 extends Thread{
    void run(){
        int i=0;
        while (i < 5
        ) {
            System.out.println("Salaam...I am MOHAMMAD ASIF NAWAZ" +
                    "");
            I++;
        }
    }
    public static void main(String args[]){
        Final1 f=new Thread();
        f.start();
    }
}