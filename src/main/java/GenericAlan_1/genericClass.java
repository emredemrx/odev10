package GenericAlan_1;

public class genericClass<D> {

    private D content;

    public genericClass(D content ) {
        this.content = content;
    }

    public D getContent() {
        return content;
    }

    public void setContent(D content) {
        this.content = content;
    }

    public void ekranaYaz (){
        System.out.println("Girilen degerler : " + this.content);
    }
}
