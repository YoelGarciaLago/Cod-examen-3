/**
 * Clase para guardar el nombre
 */
public class Record {
    /**
     * nº de aciertos al acabar
     */
    
    private int puntuacionRecord;
    /**
     * nome do pibe
     */
    private String aliasRecord;
    
    public int getPuntuacionRecord() {
        return puntuacionRecord;
    }
    
    public void setPuntuacionRecord(int puntuacionRecord) {
        this.puntuacionRecord = puntuacionRecord;
    }
    
    public String getAliasRecord() {
        return aliasRecord;
    }
    
    public void setAliasRecord(String aliasRecord) {
        this.aliasRecord = aliasRecord;
    }
}
