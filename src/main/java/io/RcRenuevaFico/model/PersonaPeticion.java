package io.RcRenuevaFico.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.RcRenuevaFico.model.CatalogoEstadoCivil;
import io.RcRenuevaFico.model.CatalogoResidencia;
import io.RcRenuevaFico.model.CatalogoSexo;
import io.RcRenuevaFico.model.DomicilioPeticion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
@ApiModel(description = "Datos generales de la persona a consultar.")


public class PersonaPeticion {
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("primerNombre")
  private String primerNombre = null;
  @SerializedName("segundoNombre")
  private String segundoNombre = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("CURP")
  private String CURP = null;
  @SerializedName("nacionalidad")
  private String nacionalidad = null;
  @SerializedName("residencia")
  private CatalogoResidencia residencia = null;
  @SerializedName("estadoCivil")
  private CatalogoEstadoCivil estadoCivil = null;
  @SerializedName("sexo")
  private CatalogoSexo sexo = null;
  @SerializedName("claveElectorIFE")
  private String claveElectorIFE = null;
  @SerializedName("numeroDependientes")
  private Integer numeroDependientes = null;
  @SerializedName("fechaDefuncion")
  private String fechaDefuncion = null;
  @SerializedName("domicilio")
  private DomicilioPeticion domicilio = null;
  @SerializedName("cuenta")
  private String cuenta = null;
  public PersonaPeticion apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "SAHAGUN", required = true, value = "Apellido paterno de la persona. Sin abreviaturas o iniciales")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public PersonaPeticion apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "ZARAGOZA", required = true, value = "Apellido materno de la persona")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public PersonaPeticion apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }
   
  @ApiModelProperty(example = "TORRES", value = "Apellido adicional de la persona, si tuviere")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }
  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }
  public PersonaPeticion primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }
   
  @ApiModelProperty(example = "ROBERTO", required = true, value = "Primer nombre de la persona")
  public String getPrimerNombre() {
    return primerNombre;
  }
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }
  public PersonaPeticion segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }
   
  @ApiModelProperty(example = "MIGUEL", value = "Segundo nombre de la persona")
  public String getSegundoNombre() {
    return segundoNombre;
  }
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }
  public PersonaPeticion fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "2001-01-01", required = true, value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public PersonaPeticion RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101", required = true, value = "RFC con homoclave de la persona")
  public String getRFC() {
    return RFC;
  }
  public void setRFC(String RFC) {
    this.RFC = RFC;
  }
  public PersonaPeticion CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101HCMLNS09", value = "CURP de la persona, emitida por RENAPO")
  public String getCURP() {
    return CURP;
  }
  public void setCURP(String CURP) {
    this.CURP = CURP;
  }
  public PersonaPeticion nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }
   
  @ApiModelProperty(example = "MX", required = true, value = "<p>Debe contener la clave de la nacionalidad del consumidor los valores posibles son los siguientes:</p><p><table><thead><tr><th>Clave</th><th>Nacionalidad</th><th>País</th></tr></thead><tbody><tr><td>AD</td><td>Andorra</td><td>Andorra</td></tr><tr><td>AF</td><td>Afgana</td><td>Afganistán</td></tr><tr><td>AG</td><td>Antigua y Barbado</td><td>Antigua y Barbado</td></tr><tr><td>AI</td><td>Anguila</td><td>Anguila</td></tr><tr><td>AN</td><td>Albania</td><td>Albania</td></tr><tr><td>AO</td><td>Angola</td><td>Angola</td></tr><tr><td>AS</td><td>Ascensión</td><td>Ascensión</td></tr><tr><td>AT</td><td>Argentina</td><td>Argentina</td></tr><tr><td>AU</td><td>Australiana</td><td>Australia</td></tr><tr><td>AW</td><td>Árabe</td><td>Arabia</td></tr><tr><td>AX</td><td>Azores</td><td>Azores</td></tr><tr><td>BB</td><td>Barbados</td><td>Barbados</td></tr><tr><td>BD</td><td>Bangladesh</td><td>Bangladesh</td></tr><tr><td>BE</td><td>Belga</td><td>Bélgica</td></tr><tr><td>BF</td><td>Burkina</td><td>Burkina</td></tr><tr><td>BG</td><td>Búlgara</td><td>Bulgaria</td></tr><tr><td>BH</td><td>Bahrein</td><td>Bahrein</td></tr><tr><td>BI</td><td>Burundi</td><td>Burundi</td></tr><tr><td>BJ</td><td>Benin</td><td>Benin</td></tr><tr><td>BK</td><td>Birmania</td><td>Birmania</td></tr><tr><td>BM</td><td>Bután</td><td>Bután</td></tr><tr><td>BN</td><td>Brunei</td><td>Brunei</td></tr><tr><td>BO</td><td>Boliviana</td><td>Bolivia</td></tr><tr><td>BR</td><td>Brasileño</td><td>Brasil</td></tr><tr><td>BS</td><td>Bahamas</td><td>Bahamas</td></tr><tr><td>BU</td><td>Bermudas</td><td>Bermudas</td></tr><tr><td>BW</td><td>Botswana</td><td>Botswana</td></tr><tr><td>BX</td><td>Bosnia Herzegovina</td><td>Bosnia Herzegovina</td></tr><tr><td>BZ</td><td>Belice</td><td>Belice</td></tr><tr><td>CB</td><td>Colombiana</td><td>Colombia</td></tr><tr><td>CC</td><td>Córcega</td><td>Córcega</td></tr><tr><td>CD</td><td>Chad</td><td>Chad</td></tr><tr><td>CF</td><td>Rep. Central Africana</td><td>Rep. Central Africana</td></tr><tr><td>CG</td><td>Congo</td><td>Congo</td></tr><tr><td>CH</td><td>Liechtenstein</td><td>Liechtenstein</td></tr><tr><td>CI</td><td>Islas Caimán</td><td>Islas Caimán</td></tr><tr><td>CJ</td><td>Comoros</td><td>Comoros</td></tr><tr><td>CL</td><td>Chilena</td><td>Chile</td></tr><tr><td>CM</td><td>Camerunés</td><td>Camerún</td></tr><tr><td>CN</td><td>Canadiense</td><td>Canadá</td></tr><tr><td>CP</td><td>China</td><td>China (Pekín)</td></tr><tr><td>CS</td><td>República Checa Eslovaca</td><td>República Checa Eslovaca</td></tr><tr><td>CU</td><td>Cariacou</td><td>Cariacou</td></tr><tr><td>CV</td><td>Cabo Verde</td><td>Cabo Verde</td></tr><tr><td>CY</td><td>Chipre</td><td>Chipre</td></tr><tr><td>DF</td><td>Austriaca</td><td>Austria</td></tr><tr><td>DJ</td><td>Djibouti</td><td>Djibouti</td></tr><tr><td>DK</td><td>Danés</td><td>Dinamarca</td></tr><tr><td>DM</td><td>Dominicana</td><td>Dominicana</td></tr><tr><td>DO</td><td>Dominicana</td><td>República Dominicana</td></tr><tr><td>DW</td><td>Alemana</td><td>Alemania</td></tr><tr><td>DZ</td><td>Argelia</td><td>Argelia</td></tr><tr><td>EC</td><td>Ecuatoriana</td><td>Ecuador</td></tr><tr><td>EG</td><td>Egipcia</td><td>Egipto</td></tr><tr><td>EM</td><td>Timor Oriental</td><td>Timor Oriental</td></tr><tr><td>ES</td><td>Española</td><td>España</td></tr><tr><td>ET</td><td>Etiopia</td><td>Etiopia</td></tr><tr><td>FA</td><td>Islas Falkland (Malvinas)</td><td>Islas Falkland (Malvinas)</td></tr><tr><td>FE</td><td>Islas Faroe</td><td>Islas Faroe</td></tr><tr><td>FI</td><td>Finlandia</td><td>Finlandia</td></tr><tr><td>FJ</td><td>Fiji</td><td>Fiji</td></tr><tr><td>FP</td><td>Polinesia</td><td>Polinesia</td></tr><tr><td>FR</td><td>Francesa</td><td>Francia</td></tr><tr><td>GB</td><td>Gabón</td><td>Gabón</td></tr><tr><td>GD</td><td>Granada</td><td>Granada</td></tr><tr><td>GE</td><td>Groenlandia</td><td>Groenlandia</td></tr><tr><td>GF</td><td>Guayana Francesa</td><td>Guayana Francesa</td></tr><tr><td>GH</td><td>Ghana</td><td>Ghana</td></tr><tr><td>GI</td><td>Gibraltar</td><td>Gibraltar</td></tr><tr><td>GM</td><td>Gambia</td><td>Gambia</td></tr><tr><td>GN</td><td>Guinea</td><td>Guinea</td></tr><tr><td>GP</td><td>Guadalupe</td><td>Guadalupe</td></tr><tr><td>GQ</td><td>Guinea Ecuatorial</td><td>Guinea Ecuatorial</td></tr><tr><td>GR</td><td>Griega</td><td>Grecia</td></tr><tr><td>GT</td><td>Guatemalteca</td><td>Guatemala</td></tr><tr><td>GW</td><td>Guinea Bissau</td><td>Guinea Bissau</td></tr><tr><td>GX</td><td>República De Georgia</td><td>República De Georgia</td></tr><tr><td>GY</td><td>Guyana</td><td>Guyana</td></tr><tr><td>HA</td><td>Haitiana</td><td>Haití</td></tr><tr><td>HK</td><td>Hong Kong</td><td>Hong Kong</td></tr><tr><td>HN</td><td>Hondureña</td><td>Honduras</td></tr><tr><td>HR</td><td>Cubano</td><td>Cuba</td></tr><tr><td>HU</td><td>Húngara</td><td>Húngara</td></tr><tr><td>HX</td><td>Croata</td><td>Croacia</td></tr><tr><td>IB</td><td>India</td><td>India</td></tr><tr><td>IC</td><td>Costa De Marfil</td><td>Costa De Marfil</td></tr><tr><td>IE</td><td>Irlandesa</td><td>Irlandesa</td></tr><tr><td>IF</td><td>Indonesia</td><td>Indonesia</td></tr><tr><td>IG</td><td>Israelí</td><td>Israelí</td></tr><tr><td>IQ</td><td>Iraquí</td><td>Iraquí</td></tr><tr><td>IR</td><td>Iraní</td><td>Iraní</td></tr><tr><td>IS</td><td>Islandia</td><td>Islandia</td></tr><tr><td>IT</td><td>Italiano</td><td>Italiano</td></tr><tr><td>JM</td><td>Jamaicano</td><td>Jamaicano</td></tr><tr><td>JO</td><td>Jordano</td><td>Jordano</td></tr><tr><td>JP</td><td>Japonesa</td><td>Japonesa</td></tr><tr><td>KA</td><td>Kampuchea</td><td>Kampuchea</td></tr><tr><td>KE</td><td>Kenya</td><td>Kenya</td></tr><tr><td>KI</td><td>Kiribati</td><td>Kiribati</td></tr><tr><td>KN</td><td>San Cristóbal De Neváis</td><td>San Cristóbal De Neváis</td></tr><tr><td>KR</td><td>Corea Del Sur</td><td>Corea Del Sur</td></tr><tr><td>KW</td><td>Kuwait</td><td>Kuwait</td></tr><tr><td>KX</td><td>Corea Del Norte</td><td>Corea Del Norte</td></tr><tr><td>LB</td><td>Libanes</td><td>Libanes</td></tr><tr><td>LC</td><td>Santa Lucia</td><td>Santa Lucia</td></tr><tr><td>LE</td><td>Islas De Sotavento</td><td>Islas De Sotavento</td></tr><tr><td>LK</td><td>Sri Lanka</td><td>Sri Lanka</td></tr><tr><td>LO</td><td>Laos</td><td>Laos</td></tr><tr><td>LR</td><td>Liberia</td><td>Liberia</td></tr><tr><td>LS</td><td>Lesotho</td><td>Lesotho</td></tr><tr><td>LT</td><td>Lituania</td><td>Lituania</td></tr><tr><td>LU</td><td>Luxemburgo</td><td>Luxemburgo</td></tr><tr><td>LV</td><td>Libia</td><td>Libia</td></tr><tr><td>LX</td><td>Letonia</td><td>Letonia</td></tr><tr><td>MC</td><td>Mongolia</td><td>Mongolia</td></tr><tr><td>MD</td><td>Madeira</td><td>Madeira</td></tr><tr><td>MG</td><td>Madagascar</td><td>Madagascar</td></tr><tr><td>MH</td><td>Macedonia</td><td>Macedonia</td></tr><tr><td>MJ</td><td>Macao</td><td>Macao</td></tr><tr><td>MK</td><td>Montserrat</td><td>Montserrat</td></tr><tr><td>ML</td><td>Mali</td><td>Mali</td></tr><tr><td>MM</td><td>Montenegro</td><td>Montenegro</td></tr><tr><td>MP</td><td>Sao Tome y Principado</td><td>Sao Tome y Principado</td></tr><tr><td>MQ</td><td>Martinico</td><td>Martinico</td></tr><tr><td>MR</td><td>Mauritania</td><td>Mauritania</td></tr><tr><td>MT</td><td>Malta</td><td>Malta</td></tr><tr><td>MU</td><td>Mauricio</td><td>Mauricio</td></tr><tr><td>MV</td><td>Maldivas</td><td>Maldivas</td></tr><tr><td>MW</td><td>Malawi</td><td>Malawi</td></tr><tr><td>MX</td><td>Mexicana</td><td>México</td></tr><tr><td>MY</td><td>Malasia</td><td>Malasia</td></tr><tr><td>MZ</td><td>Mozambique</td><td>Mozambique</td></tr><tr><td>NA</td><td>Nauru</td><td>Nauru</td></tr><tr><td>ND</td><td>No Definido</td><td>No Definido</td></tr><tr><td>NI</td><td>Nicaragua</td><td>Nicaragua</td></tr><tr><td>NL</td><td>Holandesa</td><td>Holanda</td></tr><tr><td>NN</td><td>Antillas Holandesas</td><td>Antillas Holandesas</td></tr><tr><td>NO</td><td>Noruega</td><td>Noruega</td></tr><tr><td>NP</td><td>Nepal</td><td>Nepal</td></tr><tr><td>NR</td><td>Nigeriano</td><td>Nigeria</td></tr><tr><td>NW</td><td>Nueva Caledonia</td><td>Nueva Caledonia</td></tr><tr><td>NZ</td><td>Nueva Zelandia</td><td>Nueva Zelandia</td></tr><tr><td>OA</td><td>Katar</td><td>Katar</td></tr><tr><td>OM</td><td>Omán</td><td>Omán</td></tr><tr><td>PG</td><td>Papúa Nueva Guinea</td><td>Papúa Nueva Guinea</td></tr><tr><td>PH</td><td>Filipinas</td><td>Filipinas</td></tr><tr><td>PK</td><td>Pakistán</td><td>Pakistán</td></tr><tr><td>PL</td><td>Polaco</td><td>Polonia</td></tr><tr><td>PM</td><td>Panameño</td><td>Panamá</td></tr><tr><td>PS</td><td>Islas Pitcairn</td><td>Islas Pitcairn</td></tr><tr><td>PT</td><td>Portugués</td><td>Portugal</td></tr><tr><td>PU</td><td>Peruana</td><td>Perú</td></tr><tr><td>PY</td><td>Paraguayo</td><td>Paraguay</td></tr><tr><td>RC</td><td>Marroquí</td><td>Marruecos</td></tr><tr><td>RE</td><td>Islas Reunión</td><td>Islas Reunión</td></tr><tr><td>RO</td><td>Rumana</td><td>Rumania</td></tr><tr><td>RU</td><td>Rusa</td><td>Rusia</td></tr><tr><td>RW</td><td>Ruanda</td><td>Ruanda</td></tr><tr><td>SA</td><td>Saudí Árabe</td><td>Arabia Saudita</td></tr><tr><td>SB</td><td>Sudan</td><td>Sudan</td></tr><tr><td>SE</td><td>Sueco</td><td>Suecia</td></tr><tr><td>SF</td><td>San Vencen y Las Granadas</td><td>San Vencen y Las Granadas</td></tr><tr><td>SH</td><td>Santa Helena</td><td>Santa Helena</td></tr><tr><td>SI</td><td>Islas Salmon</td><td>Islas Salmon</td></tr><tr><td>SN</td><td>Senegal</td><td>Senegal</td></tr><tr><td>SO</td><td>Somalia</td><td>Somalia</td></tr><tr><td>SP</td><td>San Pierre y Miquelón</td><td>San Pierre y Miquelón</td></tr><tr><td>SR</td><td>Surinam</td><td>Surinam</td></tr><tr><td>SS</td><td>San Kitts</td><td>San Kitts</td></tr><tr><td>ST</td><td>Islas Santa Cruz</td><td>Islas Santa Cruz</td></tr><tr><td>SU</td><td>Estonia</td><td>Estonia</td></tr><tr><td>SV</td><td>Salvadoreña</td><td>El Salvador</td></tr><tr><td>SW</td><td>Suiza</td><td>Suiza</td></tr><tr><td>SX</td><td>Serbia</td><td>Serbia</td></tr><tr><td>SY</td><td>Siria</td><td>Siria</td></tr><tr><td>SZ</td><td>Swazilandia</td><td>Swazilandia</td></tr><tr><td>TA</td><td>Tonga</td><td>Tonga</td></tr><tr><td>TC</td><td>Turcos e Islas Caicos</td><td>Turcos e Islas Caicos</td></tr><tr><td>TD</td><td>Tristán De Cunha</td><td>Tristán De Cunha</td></tr><tr><td>TG</td><td>Togo</td><td>Togo</td></tr><tr><td>TH</td><td>Tailandia</td><td>Tailandia</td></tr><tr><td>TR</td><td>Turca</td><td>Turquía </td></tr><tr><td>TT</td><td>Trinidad y Tobago</td><td>Trinidad y Tobago</td></tr><tr><td>TU</td><td>Túnez</td><td>Túnez</td></tr><tr><td>TV</td><td>Tuvala</td><td>Tuvala</td></tr><tr><td>TW</td><td>Taiwán</td><td>Taiwán</td></tr><tr><td>TZ</td><td>Tanzania</td><td>Tanzania</td></tr><tr><td>UA</td><td>Ucraniano</td><td>Ucrania</td></tr><tr><td>UG</td><td>Uganda</td><td>Uganda</td></tr><tr><td>UK</td><td>Reino Unido</td><td>Reino Unido</td></tr><tr><td>UM</td><td>Árabe</td><td>Emiratos Árabes Unidos</td></tr><tr><td>US</td><td>Estadounidense</td><td>Estados Unidos</td></tr><tr><td>UY</td><td>Uruguayo</td><td>Uruguay</td></tr><tr><td>VC</td><td>Ciudad Del Vaticano</td><td>Ciudad Del Vaticano</td></tr><tr><td>VE</td><td>Venezolana</td><td>Venezuela</td></tr><tr><td>VG</td><td>Islas Vírgenes Inglesas</td><td>Islas Vírgenes Inglesas</td></tr><tr><td>VN</td><td>Vietnami</td><td>Vietnam</td></tr><tr><td>VU</td><td>Vanuatu</td><td>Vanuatu</td></tr><tr><td>WS</td><td>Samoa Oeste</td><td>Samoa Oeste</td></tr><tr><td>WT</td><td>Gales / Isla Futura</td><td>Gales / Isla Futura</td></tr><tr><td>XN</td><td>Eslovenia</td><td>Eslovenia</td></tr><tr><td>YE</td><td>Yemen (Del Sur)</td><td>Yemen (Del Sur)</td></tr><tr><td>YS</td><td>Yemen (Del Norte)</td><td>Yemen (Del Norte)</td></tr><tr><td>ZA</td><td>Sudafricana</td><td>África Del Sur</td></tr><tr><td>ZM</td><td>Zambia</td><td>Zambia</td></tr><tr><td>ZR</td><td>Zaire</td><td>Zaire</td></tr><tr><td>ZW</td><td>Zimbabwe</td><td>Zimbabwe</td></tr></tbody></table></p")
  public String getNacionalidad() {
    return nacionalidad;
  }
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public PersonaPeticion residencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoResidencia getResidencia() {
    return residencia;
  }
  public void setResidencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
  }
  public PersonaPeticion estadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoEstadoCivil getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }
  public PersonaPeticion sexo(CatalogoSexo sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoSexo getSexo() {
    return sexo;
  }
  public void setSexo(CatalogoSexo sexo) {
    this.sexo = sexo;
  }
  public PersonaPeticion claveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
    return this;
  }
   
  @ApiModelProperty(example = "000000000000", value = "La clave de elector que se encuentra en el IFE/INE.")
  public String getClaveElectorIFE() {
    return claveElectorIFE;
  }
  public void setClaveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
  }
  public PersonaPeticion numeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }
   
  @ApiModelProperty(value = "Número de personas que dependen de la persona.")
  public Integer getNumeroDependientes() {
    return numeroDependientes;
  }
  public void setNumeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }
  public PersonaPeticion fechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
    return this;
  }
   
  @ApiModelProperty(example = "9999-01-01", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaDefuncion() {
    return fechaDefuncion;
  }
  public void setFechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }
  public PersonaPeticion domicilio(DomicilioPeticion domicilio) {
    this.domicilio = domicilio;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public DomicilioPeticion getDomicilio() {
    return domicilio;
  }
  public void setDomicilio(DomicilioPeticion domicilio) {
    this.domicilio = domicilio;
  }
  public PersonaPeticion cuenta(String cuenta) {
    this.cuenta = cuenta;
    return this;
  }
   
  @ApiModelProperty(example = "CC7588788-A876", required = true, value = "Número de cuenta asociado a la persona que se esta consultando. La cuenta debe ser abierta o tener un máximo de X días de haber sido cerrada.")
  public String getCuenta() {
    return cuenta;
  }
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonaPeticion personaPeticion = (PersonaPeticion) o;
    return Objects.equals(this.apellidoPaterno, personaPeticion.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, personaPeticion.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, personaPeticion.apellidoAdicional) &&
        Objects.equals(this.primerNombre, personaPeticion.primerNombre) &&
        Objects.equals(this.segundoNombre, personaPeticion.segundoNombre) &&
        Objects.equals(this.fechaNacimiento, personaPeticion.fechaNacimiento) &&
        Objects.equals(this.RFC, personaPeticion.RFC) &&
        Objects.equals(this.CURP, personaPeticion.CURP) &&
        Objects.equals(this.nacionalidad, personaPeticion.nacionalidad) &&
        Objects.equals(this.residencia, personaPeticion.residencia) &&
        Objects.equals(this.estadoCivil, personaPeticion.estadoCivil) &&
        Objects.equals(this.sexo, personaPeticion.sexo) &&
        Objects.equals(this.claveElectorIFE, personaPeticion.claveElectorIFE) &&
        Objects.equals(this.numeroDependientes, personaPeticion.numeroDependientes) &&
        Objects.equals(this.fechaDefuncion, personaPeticion.fechaDefuncion) &&
        Objects.equals(this.domicilio, personaPeticion.domicilio) &&
        Objects.equals(this.cuenta, personaPeticion.cuenta);
  }
  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, apellidoAdicional, primerNombre, segundoNombre, fechaNacimiento, RFC, CURP, nacionalidad, residencia, estadoCivil, sexo, claveElectorIFE, numeroDependientes, fechaDefuncion, domicilio, cuenta);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonaPeticion {\n");
    
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    claveElectorIFE: ").append(toIndentedString(claveElectorIFE)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    cuenta: ").append(toIndentedString(cuenta)).append("\n");
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
