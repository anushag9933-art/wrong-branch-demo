public class father {

    public void bike()
    {
        System .out.println("cbr");
    }

}
class son extends father{

    public void bike()
    {

    }
}

class main
{
    public static void main(String[] args) {
        
        son s = new son();
        s.bike();
        
    }
}