package np.com.softwarica.lab.model;

public class Contacts {

    private String name;
    private String phone;
    private int imageId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Contacts(String name, String phone, int imageId){

        this.name= name;
        this.phone=phone;
        this.imageId=imageId;


    }


}
