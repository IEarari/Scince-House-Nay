package alnayzak.ict.ibraheem.scincehouse;

public class Item {
    private String mTitle, mDiscription, mMainPoints ;
    private int mImageSRC;


    public Item(int ImageSRC, String Title, String Discription, String MainPoints){
        mTitle=Title;
        mDiscription=Discription;
        mMainPoints =MainPoints;
        mImageSRC =ImageSRC;
    }
    public Item(int ImageSRC, String Title, String Discription){
        mTitle=Title;
        mDiscription=Discription;
        mImageSRC =ImageSRC;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDiscription() {
        return mDiscription;
    }

    public String getmMainPoints() {
        return mMainPoints;
    }

    public int getmImageSRC() {
        return mImageSRC;
    }
}
