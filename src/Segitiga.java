public class Segitiga<T,N> {
    private T tinggi;
    private N alas;

    public Segitiga(T tinggi, N alas){
    this.tinggi = tinggi;
    this.alas = alas;
    }

    public T getTinggi() {
        return tinggi;
    }

    public N getAlas() {
        return alas;
    }

    public int getResultAsInt(){
        return (int) (1.0/2.0 * (int) getAlas() * (int) getTinggi());
    }
    public double getResultAsDouble(){
        return 1.0/2.0 * (double) getAlas() * (double) getTinggi();
    }
}
