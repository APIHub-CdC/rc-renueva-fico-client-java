package io.RcRenuevaFico.client.api;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import io.RcRenuevaFico.api.ReporteDeCrditoRenuevaConFicoScoreApi;
import io.RcRenuevaFico.client.ApiClient;
import io.RcRenuevaFico.model.CatalogoEstados;
import io.RcRenuevaFico.model.DomicilioPeticion;
import io.RcRenuevaFico.model.PersonaPeticion;
import io.RcRenuevaFico.model.Respuesta;
import okhttp3.OkHttpClient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;

import java.util.concurrent.TimeUnit;

public class ReporteDeCrditoRenuevaConFicoScoreApiTest {
private final ReporteDeCrditoRenuevaConFicoScoreApi api = new ReporteDeCrditoRenuevaConFicoScoreApi();

private Logger logger = LoggerFactory.getLogger(ReporteDeCrditoRenuevaConFicoScoreApiTest.class.getName());
    
    private String keystoreFile = "/your_path/keystore.jks";
	private String cdcCertFile = "/your_path/cdc_cert.pem";
	private String keystorePassword = "your_password";
	private String keyAlias = "your_alias";
	private String keyPassword = "your_key_password";
	
	
	
	
	@Before()
    public void setUp() {
    	
    	ApiClient apiClient = api.getApiClient();
		apiClient.setBasePath("Your Url");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword)).build();
		apiClient.setHttpClient(okHttpClient);
    }
	
    @Test
    public void getReporteTest() throws Exception {
        
        String xApiKey = "Your Apikey";
        String username = "Your Username";
        String password = "Your Password";
        
        PersonaPeticion request = new PersonaPeticion();
        DomicilioPeticion domicilio = new DomicilioPeticion();
        
        domicilio.setDireccion("");
        domicilio.setColoniaPoblacion("");
        domicilio.setDelegacionMunicipio("");
        domicilio.setCiudad("");
        domicilio.setEstado(CatalogoEstados.HGO);
        domicilio.setCP("");
        
        request.setPrimerNombre("");
        request.setApellidoPaterno("");
        request.setApellidoMaterno("");
        request.setFechaNacimiento("");
        request.setRFC("");
        request.setNacionalidad("");
        request.setCuenta("");
        request.setDomicilio(domicilio);
        
        Respuesta response = api.getReporte( xApiKey, username, password, request);
        System.out.println(response.toString());
        logger.info("Report: "+response.toString());
        
        Assert.assertTrue(response.getFolioConsulta() != null);
    }
    
}
