/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosPerro;

/**
 *
 * @author j_vgo
 */
public class Perro {
    private String nome;
    private boolean peloLargo;
    private boolean cazador;
    private boolean grande;
    private boolean deportivo;
    private String rutaImagen;
    private Perro seguiente;
    private Perro anterior;

    public Perro(String nome, boolean peloLargo, boolean cazador, boolean grande, boolean deportivo, String rutaImagen) {
        this.nome = nome;
        this.peloLargo = peloLargo;
        this.cazador = cazador;
        this.grande = grande;
        this.deportivo = deportivo;
        this.rutaImagen = rutaImagen;
        seguiente = null;
        anterior = null;
    }

    public Perro getSeguiente() {
        return seguiente;
    }

    public void setSeguiente(Perro seguiente) {
        this.seguiente = seguiente;
    }

    public Perro getAnterior() {
        return anterior;
    }

    public void setAnterior(Perro anterior) {
        this.anterior = anterior;
    }
    

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }

    public boolean isCazador() {
        return cazador;
    }

    public void setCazador(boolean cazador) {
        this.cazador = cazador;
    }

    public boolean isGrande() {
        return grande;
    }

    public void setGrande(boolean grande) {
        this.grande = grande;
    }

    public boolean isDeportivo() {
        return deportivo;
    }

    public void setDeportivo(boolean deportivo) {
        this.deportivo = deportivo;
    }
    
    
}
