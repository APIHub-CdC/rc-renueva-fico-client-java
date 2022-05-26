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


public class Banxico {
  @SerializedName("numeroFirma")
  private String numeroFirma = null;
  @SerializedName("numeroSolicitud")
  private String numeroSolicitud = null;
  
  @JsonAdapter(TarjetaDeCreditoEnum.Adapter.class)
  public enum TarjetaDeCreditoEnum {
    V("V"),
    
    F("F");
    private String value;
    TarjetaDeCreditoEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TarjetaDeCreditoEnum fromValue(String text) {
      for (TarjetaDeCreditoEnum b : TarjetaDeCreditoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TarjetaDeCreditoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TarjetaDeCreditoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public TarjetaDeCreditoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TarjetaDeCreditoEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("tarjetaDeCredito")
  private TarjetaDeCreditoEnum tarjetaDeCredito = null;
  @SerializedName("numeroCuenta")
  private String numeroCuenta = null;
  
  @JsonAdapter(CreditoHipotecarioEnum.Adapter.class)
  public enum CreditoHipotecarioEnum {
    V("V"),
    
    F("F");
    private String value;
    CreditoHipotecarioEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CreditoHipotecarioEnum fromValue(String text) {
      for (CreditoHipotecarioEnum b : CreditoHipotecarioEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CreditoHipotecarioEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreditoHipotecarioEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public CreditoHipotecarioEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CreditoHipotecarioEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("creditoHipotecario")
  private CreditoHipotecarioEnum creditoHipotecario = null;
  
  @JsonAdapter(CreditoAutomotrizEnum.Adapter.class)
  public enum CreditoAutomotrizEnum {
    V("V"),
    
    F("F");
    private String value;
    CreditoAutomotrizEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CreditoAutomotrizEnum fromValue(String text) {
      for (CreditoAutomotrizEnum b : CreditoAutomotrizEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CreditoAutomotrizEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreditoAutomotrizEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public CreditoAutomotrizEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CreditoAutomotrizEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("creditoAutomotriz")
  private CreditoAutomotrizEnum creditoAutomotriz = null;
  public Banxico numeroFirma(String numeroFirma) {
    this.numeroFirma = numeroFirma;
    return this;
  }
   
  @ApiModelProperty(example = "B709359C8A7A", value = "Es el número de firma asociado a la autorización del consumidor para ser consultado. Este número nos permite conciliar la autorización de la consulta con el sistema.")
  public String getNumeroFirma() {
    return numeroFirma;
  }
  public void setNumeroFirma(String numeroFirma) {
    this.numeroFirma = numeroFirma;
  }
  public Banxico numeroSolicitud(String numeroSolicitud) {
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
  public Banxico tarjetaDeCredito(TarjetaDeCreditoEnum tarjetaDeCredito) {
    this.tarjetaDeCredito = tarjetaDeCredito;
    return this;
  }
   
  @ApiModelProperty(example = "V", value = "Si se cuenta con una tarjeta de crédito el valor es V (verdadero), de lo contrario el valor es F (falso).")
  public TarjetaDeCreditoEnum getTarjetaDeCredito() {
    return tarjetaDeCredito;
  }
  public void setTarjetaDeCredito(TarjetaDeCreditoEnum tarjetaDeCredito) {
    this.tarjetaDeCredito = tarjetaDeCredito;
  }
  public Banxico numeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "1214", value = "Indicar los últimos 4 dígitos del número que identifica la cuenta.")
  public String getNumeroCuenta() {
    return numeroCuenta;
  }
  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }
  public Banxico creditoHipotecario(CreditoHipotecarioEnum creditoHipotecario) {
    this.creditoHipotecario = creditoHipotecario;
    return this;
  }
   
  @ApiModelProperty(example = "V", value = "Si se cuenta con crédito hipotecario el valor es V (verdadero), de lo contrario el valor es F (falso).")
  public CreditoHipotecarioEnum getCreditoHipotecario() {
    return creditoHipotecario;
  }
  public void setCreditoHipotecario(CreditoHipotecarioEnum creditoHipotecario) {
    this.creditoHipotecario = creditoHipotecario;
  }
  public Banxico creditoAutomotriz(CreditoAutomotrizEnum creditoAutomotriz) {
    this.creditoAutomotriz = creditoAutomotriz;
    return this;
  }
   
  @ApiModelProperty(example = "V", value = "Si se cuenta con crédito automotriz ejercido en los últimos 24 meses el valor es V (verdadero), de lo contrario el valor es F (falso).")
  public CreditoAutomotrizEnum getCreditoAutomotriz() {
    return creditoAutomotriz;
  }
  public void setCreditoAutomotriz(CreditoAutomotrizEnum creditoAutomotriz) {
    this.creditoAutomotriz = creditoAutomotriz;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Banxico banxico = (Banxico) o;
    return Objects.equals(this.numeroFirma, banxico.numeroFirma) &&
        Objects.equals(this.numeroSolicitud, banxico.numeroSolicitud) &&
        Objects.equals(this.tarjetaDeCredito, banxico.tarjetaDeCredito) &&
        Objects.equals(this.numeroCuenta, banxico.numeroCuenta) &&
        Objects.equals(this.creditoHipotecario, banxico.creditoHipotecario) &&
        Objects.equals(this.creditoAutomotriz, banxico.creditoAutomotriz);
  }
  @Override
  public int hashCode() {
    return Objects.hash(numeroFirma, numeroSolicitud, tarjetaDeCredito, numeroCuenta, creditoHipotecario, creditoAutomotriz);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Banxico {\n");
    
    sb.append("    numeroFirma: ").append(toIndentedString(numeroFirma)).append("\n");
    sb.append("    numeroSolicitud: ").append(toIndentedString(numeroSolicitud)).append("\n");
    sb.append("    tarjetaDeCredito: ").append(toIndentedString(tarjetaDeCredito)).append("\n");
    sb.append("    numeroCuenta: ").append(toIndentedString(numeroCuenta)).append("\n");
    sb.append("    creditoHipotecario: ").append(toIndentedString(creditoHipotecario)).append("\n");
    sb.append("    creditoAutomotriz: ").append(toIndentedString(creditoAutomotriz)).append("\n");
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
