package com.tutum.control.dispositivos.auth;

public class JwtConfig  {
	public static final String LLAVE_SECRETA = "pcyb.tutum.tech.cfrs14.org";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEA2b5TWxu6NKnHIZw6VvNEy/v7reIRWWTx0Q+FX9ADViKteoC2\r\n"
			+ "0DuJylfre9gc8qF/ynwU/Zsy4uBjmiWAJIkuTwumDwTv/0qHzB5wpp2hZRzTc/P4\r\n"
			+ "Pn8kmE4ASxw2Ka3LbjvA7D4Bp6OciitR/nxIvoTuos09wwRto21crPoVzfxwN3AX\r\n"
			+ "RfpW9pBsOPm7XIZpDiPzmCaAVTfonWxAjXazHtK7029ZuMW+WVK2klkP8Xfsftho\r\n"
			+ "5DoVdLJvLkbFRvVyjIA/k7HIGzLMoJ0uZR/OJmdRhtoZFGKNzkiloz468K7Ll+/S\r\n"
			+ "zdZgJVKXWoft01dhyY5pNnsayb3TeEjV7DUD5QIDAQABAoIBAC7o4P5k19XWqc7k\r\n"
			+ "4HCxEiY8EDmi1YgDxlD63goJP17EM8mLh1cPLJ1KGbJhmcLv5h8SYldMo0bbfrnL\r\n"
			+ "0HKOl0pyQQFFWAsQ3HauLCjJFuc4sZluexHDxHeHfmqwFj8ecRA7kVGT/jlGd0gR\r\n"
			+ "EyYXUnixHNQ4EVE9V/14Zxng+ueYUA7v6ygvwDmy46llkCzmXu3CYpKchwZogzgO\r\n"
			+ "xEFQG9rHc8feafrSOFgA0XNi7agGf7LYz5DAQadU5vw+EflVz2w9l0V4ENl3Hdx8\r\n"
			+ "o5mnx3QMNZTYx8B1evJ4c58glq83EsUR8TDdGElJmg5jupNfnNRdRLLm2LP4zNv3\r\n"
			+ "JuEALQECgYEA+rggX4IeKYzA4He95Cf6jwGvIjfmrvhZntj5/ABz3VokbPlcioXJ\r\n"
			+ "brC2jdfOVdKn5hceR0vALHGO5JvRx1n4WqYAV0wEH86eMvATBBd9Ye7mHEKlHFfa\r\n"
			+ "ZgdlT692G2zL1Q4w24V3O8wtJw3n8ScA5+c7ENNqb8NeJ0JjjLcdPMECgYEA3lRk\r\n"
			+ "8r7I7qt7NZaaL+WJeshrvv2X7QO95MzguEPl25KKnWkE+kswCaFfX66Mz7dHQ24L\r\n"
			+ "t0emFu3OVc54uRvmJKVe5gfUtQSUnNDAH5BjW+tuP8ggO93H71ouj+PuT8j467FZ\r\n"
			+ "wCqKPPIkhp6VarrphQkSLd2EGdk3iEvMZOQ+PCUCgYAF/6HGpzZRiCyVMkg4zTwR\r\n"
			+ "b9jg2LWMOiTqyAYzIU+kXCPC97RfHBRVsaSsgB1PsFqUBrmSux098vmYPqImQuDO\r\n"
			+ "Smp3rDntCOSAE35g+q7lSPH4ex+4LeHrzwF9hpUs0s2Nq2k/11Gi/J+X7509B9Hd\r\n"
			+ "uoqPPH+vbN0z00LOexMYAQKBgCC5LzqDVjO6zaGvjvYpxLhrs2AjFy9tc4+vkAvP\r\n"
			+ "Ao/0264bfP4R/voL5GvC1zrjcPu9wL+zLgEF826xuxcTwiX2qScWU/pouC70krKS\r\n"
			+ "n+0xk8KThBsLo5fZIC1RkQvxOqIGMn2URVB/G10tDjTtWd2Y3jId/omHbSMEdQsM\r\n"
			+ "hRR5AoGBAOC5Wh4acy/1NNThuRpot9RbfMjuxBvg7T3me85SUoNr26FL9uuEBJFB\r\n"
			+ "7jvWu/bI9hmUP4DXieAxf4JBu9+OpvuINHUJFGSaWJFekvLjClMtrpr3W2hHYh6M\r\n"
			+ "++TjAXd6kgdfpWvlMWh/NPspUVBEGsly8fYUvwO9LautERLSSVZU\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2b5TWxu6NKnHIZw6VvNE\r\n"
			+ "y/v7reIRWWTx0Q+FX9ADViKteoC20DuJylfre9gc8qF/ynwU/Zsy4uBjmiWAJIku\r\n"
			+ "TwumDwTv/0qHzB5wpp2hZRzTc/P4Pn8kmE4ASxw2Ka3LbjvA7D4Bp6OciitR/nxI\r\n"
			+ "voTuos09wwRto21crPoVzfxwN3AXRfpW9pBsOPm7XIZpDiPzmCaAVTfonWxAjXaz\r\n"
			+ "HtK7029ZuMW+WVK2klkP8Xfsftho5DoVdLJvLkbFRvVyjIA/k7HIGzLMoJ0uZR/O\r\n"
			+ "JmdRhtoZFGKNzkiloz468K7Ll+/SzdZgJVKXWoft01dhyY5pNnsayb3TeEjV7DUD\r\n"
			+ "5QIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
 