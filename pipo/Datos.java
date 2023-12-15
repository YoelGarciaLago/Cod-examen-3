/**
 * Juego :p
 */
public class Datos {
    /**
     *  Número a adivinar
     */
    private int numero;
    /**
     *  numero introduccido por el usuario
     */
    private int numeroAdivinado;
    /**
     *  numero de intentos maximos
     */
    private int intentosMax;
    /**
     *  contador de los intentos restantes
     */
    private int contadorIntentos;
    /**
     *  numero de aciertos por partida
     */
    private int aciertos;
    /**
     *  alias del jugador
     */
    private String alias;
    /**
     *  numero de fallos
     */
    private int fallos;
    /**
     *  Clase Record
     */
    private static Record record;
    /**
     * Clase Partida
     */
    private static Partida ronda;
    
    /**
     * Para crear un Singleton
     */
    private Datos() {
    
    }
    
    /**
     * Singleton
     */
    static Datos dato = new Datos();
    
    /**
     * singleton
     * @return dato
     */
    public static Datos getInstance(){
        return dato;
    }
    
    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     *
     * @param intentosMax
     */
    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }
    /**
     *
     * @param numeroAdivinado
     */
    public void setNumeroAdivinado(int numeroAdivinado) {
        this.numeroAdivinado = numeroAdivinado;
    }
    /**
     *
     * @param contadorIntentos
     */
    public void setContadorIntentos(int contadorIntentos) {
        this.contadorIntentos = contadorIntentos;
    }
    /**
     *
     * @param aciertos
     */
    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
    /**
     *
     * @param alias
     *
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
    /**
     *
     * @param fallos
     */
    public void setFallos(int fallos) {
        this.fallos = fallos;
    }
    
    /**
     *
     * @return numero
     */
    
    public int getNumero() {
        return numero;
    }
    /**
     *
     * @return numeroAdivinado
     */
    public int getNumeroAdivinado() {
        return numeroAdivinado;
    }
    /**
     *
     * @return intentosMax
     */
    public int getIntentosMax() {
        return intentosMax;
    }
    /**
     *
     * @return contadorIntentos
     */
    public int getContadorIntentos() {
        return contadorIntentos;
    }
    /**
     *
     * @return aciertos
     */
    public int getAciertos() {
        return aciertos;
    }
    /**
     *
     * @return alias
     */
    public String getAlias() {
        return alias;
    }
    /**
     *
     * @return fallos
     */
    public int getFallos() {
        return fallos;
    }
    
    
}
