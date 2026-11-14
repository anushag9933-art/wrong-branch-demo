public class father {

    public void bike()
    {
        System .out.println("cbr");
    }

}
class son extends father{
@Override 
    public void bike()
    {


    }
}

class maininher
{
    public static void main(String[] args) {
        
        son s = new son();
        s.bike();
        
    }
}