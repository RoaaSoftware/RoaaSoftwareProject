package sakankom;


import java.util.ArrayList;
import java.util.List;

public class Owner extends User{

    private String address;
    private String phone;

    public  Owner (){

}

    public String getPhone(){return phone;}

    public void setPhone(String phone){this.phone=phone;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}



    public Owner(String type,String id, String name, String username, String password, String address, String phone) {
        super( type, id, name, username, password);
        this.address=address;
        this.phone=phone;
    }


    @Override

    public String toString(){
        return "Owner{"+ super.toString() + '\'' +
                ", address ='" + address + '\'' +
                ", phone ='" + phone + '\'' + '}';
    }


}