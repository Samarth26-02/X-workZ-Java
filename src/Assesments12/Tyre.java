

package Assesments12;
//tyre class is extending the properties of rubber class...

public class Tyre extends Rubber{
    @Override
    public void expand(){
        System.out.println("expand running in Tyre..");
    }
    public void compress(){
        System.out.println("compress running in tyre..");
    }
}
