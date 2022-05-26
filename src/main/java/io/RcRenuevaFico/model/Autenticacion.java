package io.RcRenuevaFico.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
@ApiModel(description = "Contiene los datos del resultado del proceso de Autenticación. <br><b>Nota:</b> Este modelo solamente será enviado en caso de que se hayan enviado los headers de autenticación.")


public class Autenticacion {
  @SerializedName("numeroAutenticacion")
  private String numeroAutenticacion = null;
  @SerializedName("numeroSolicitud")
  private String numeroSolicitud = null;
  @SerializedName("estatusAutenticacion")
  private Boolean estatusAutenticacion = null;
  public Autenticacion numeroAutenticacion(String numeroAutenticacion) {
    this.numeroAutenticacion = numeroAutenticacion;
    return this;
  }
   
  @ApiModelProperty(example = "96529", value = "Número asignado por Círculo de Crédito para identificar la autenticación.")
  public String getNumeroAutenticacion() {
    return numeroAutenticacion;
  }
  public void setNumeroAutenticacion(String numeroAutenticacion) {
    this.numeroAutenticacion = numeroAutenticacion;
  }
  public Autenticacion numeroSolicitud(String numeroSolicitud) {
    this.numeroSolicitud = numeroSolicitud;
    return this;
  }
   
  @ApiModelProperty(example = "1519244698", value = "Es el identificador de la autenticación por parte del Otorgante. Este número se regresa de manera íntegra en el elemento de respuesta.")
  public String getNumeroSolicitud() {
    return numeroSolicitud;
  }
  public void setNumeroSolicitud(String numeroSolicitud) {
    this.numeroSolicitud = numeroSolicitud;
  }
  public Autenticacion estatusAutenticacion(Boolean estatusAutenticacion) {
    this.estatusAutenticacion = estatusAutenticacion;
    return this;
  }
   
  @ApiModelProperty(example = "true", value = "Contiene el resultado del proceso de Autenticación.<br> true = Autenticado <br> false = No autenticado")
  public Boolean isEstatusAutenticacion() {
    return estatusAutenticacion;
  }
  public void setEstatusAutenticacion(Boolean estatusAutenticacion) {
    this.estatusAutenticacion = estatusAutenticacion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Autenticacion autenticacion = (Autenticacion) o;
    return Objects.equals(this.numeroAutenticacion, autenticacion.numeroAutenticacion) &&
        Objects.equals(this.numeroSolicitud, autenticacion.numeroSolicitud) &&
        Objects.equals(this.estatusAutenticacion, autenticacion.estatusAutenticacion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(numeroAutenticacion, numeroSolicitud, estatusAutenticacion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Autenticacion {\n");
    
    sb.append("    numeroAutenticacion: ").append(toIndentedString(numeroAutenticacion)).append("\n");
    sb.append("    numeroSolicitud: ").append(toIndentedString(numeroSolicitud)).append("\n");
    sb.append("    estatusAutenticacion: ").append(toIndentedString(estatusAutenticacion)).append("\n");
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
