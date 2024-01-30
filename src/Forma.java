enum TipoForma{
    TRIANGOLO,
    RETTANGOLO,
}
abstract class Forma {
    abstract double calcolaArea();
    void stampaArea(){
        System.out.println("area della forma: " + calcolaArea());
    }

}

