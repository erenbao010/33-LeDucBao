package OOP_java.ex6;

import java.util.List;

class Iphone implements sharePhoto {
    private List<Photo> photos;

    public Iphone(List<Photo> photos) {
        this.photos = photos;
    }
    public void airdrop (Iphone photo, Iphone iphoneId){
        System.out.println("abc");
    }

}
class Photo {
    private String Id;
    private String namePhoto ;
    public void namePhoto(String namePhoto, String Id){
        this.namePhoto = namePhoto;
        this.Id = Id;
    }
}
    interface sharePhoto {
        void airdrop( Iphone photo, Iphone iphoneId);
    }

