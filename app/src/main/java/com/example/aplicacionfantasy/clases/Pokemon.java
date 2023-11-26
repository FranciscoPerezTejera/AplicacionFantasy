package com.example.aplicacionfantasy.clases;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;


public class Pokemon implements Parcelable {

    String nombrePokemon;
    String tipoPrincipal;
    String cantidadPs;
    String ataque;
    String defensa;
    String velocidad;
    String numeroPokedex;
    Painter fotoPokemon;
    String descripcion;

    public Pokemon(String nombrePokemon, String numeroPokedex, String tipoPrincipal,String cantidadPs, String ataque, String defensa, String velocidad, Painter fotoPokemon, String descripcion) {
        this.nombrePokemon = nombrePokemon;
        this.tipoPrincipal = tipoPrincipal;
        this.cantidadPs = cantidadPs;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.numeroPokedex = numeroPokedex;
        this.fotoPokemon = fotoPokemon;
        this.descripcion = descripcion;
    }

    protected Pokemon(Parcel in) {
        nombrePokemon = in.readString();
        tipoPrincipal = in.readString();
        cantidadPs = in.readString();
        ataque = in.readString();
        defensa = in.readString();
        velocidad = in.readString();
        numeroPokedex = in.readString();
        descripcion = in.readString();
    }

    public static final Creator<Pokemon> CREATOR = new Creator<Pokemon>() {
        @Override
        public Pokemon createFromParcel(Parcel in) {
            return new Pokemon(in);
        }

        @Override
        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public String getTipoPrincipal() {
        return tipoPrincipal;
    }

    public void setTipoPrincipal(String tipoPrincipal) {
        this.tipoPrincipal = tipoPrincipal;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getDefensa() {
        return defensa;
    }

    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(String numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String getCantidadPs() {
        return cantidadPs;
    }

    public void setCantidadPs(String cantidadPs) {
        this.cantidadPs = cantidadPs;
    }

    public Painter getFotoPokemon() {
        return fotoPokemon;
    }

    public void setFotoPokemon(Painter fotoPokemon) {
        this.fotoPokemon = fotoPokemon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nombrePokemon);
        dest.writeString(tipoPrincipal);
        dest.writeString(cantidadPs);
        dest.writeString(ataque);
        dest.writeString(defensa);
        dest.writeString(velocidad);
        dest.writeString(numeroPokedex);
        dest.writeString(descripcion);
    }
}
