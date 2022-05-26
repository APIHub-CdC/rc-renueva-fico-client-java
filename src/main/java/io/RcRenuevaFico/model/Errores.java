package io.RcRenuevaFico.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.RcRenuevaFico.model.Autenticacion;
import io.RcRenuevaFico.model.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Si existen errores, se listarán.")


public class Errores {
  @SerializedName("errores")
  private List<Error> errores = null;
  @SerializedName("autenticacion")
  private Autenticacion autenticacion = null;
  public Errores errores(List<Error> errores) {
    this.errores = errores;
    return this;
  }
  public Errores addErroresItem(Error erroresItem) {
    if (this.errores == null) {
      this.errores = new ArrayList<Error>();
    }
    this.errores.add(erroresItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Error> getErrores() {
    return errores;
  }
  public void setErrores(List<Error> errores) {
    this.errores = errores;
  }
  public Errores autenticacion(Autenticacion autenticacion) {
    this.autenticacion = autenticacion;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Autenticacion getAutenticacion() {
    return autenticacion;
  }
  public void setAutenticacion(Autenticacion autenticacion) {
    this.autenticacion = autenticacion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Errores errores = (Errores) o;
    return Objects.equals(this.errores, errores.errores) &&
        Objects.equals(this.autenticacion, errores.autenticacion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(errores, autenticacion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Errores {\n");
    
    sb.append("    errores: ").append(toIndentedString(errores)).append("\n");
    sb.append("    autenticacion: ").append(toIndentedString(autenticacion)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
