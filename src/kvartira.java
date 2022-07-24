public class kvartira {
String gorod;
String street;
int dom;

public static int count;

    public kvartira (String gorod, String street, int dom) {
        this.gorod = gorod;
        this.street = street;
        this.dom = dom;
        count++;
    }
    //геттеры
    public String getGorod() {return this.gorod;}
    public String getStreet() {return this.street;}
    public int getDom() {return this.dom;}


    //сеттеры
    public void setGorod(String NewGorod) {this.gorod = NewGorod;}
    public void setStreet(String NewStreet) {this.street = NewStreet;}
    public void setDom(int NewDom) {this.dom = NewDom;}


    public static int getCount() {return count;}


}


