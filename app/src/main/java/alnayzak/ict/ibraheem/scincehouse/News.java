package alnayzak.ict.ibraheem.scincehouse;


public class News {

    private final String mTitolo;
    private final String mdatapubblicata;
    private final String mUrl;

    public News(String Titolo, String datapubblicata, String url) {
        this.mTitolo = Titolo;
        this.mdatapubblicata = datapubblicata;
        this.mUrl = url;
    }

    public String getTitolo() {
        return mTitolo;
    }


    public String getdatapubblicata() {
        return mdatapubblicata;
    }

    public String getUrl() {
        return mUrl;
    }

}
