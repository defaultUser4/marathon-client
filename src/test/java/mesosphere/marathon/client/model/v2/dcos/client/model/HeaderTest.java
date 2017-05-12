package mesosphere.marathon.client.model.v2.dcos.client.model;

import java.io.IOException;

import org.junit.Test;

import mesosphere.dcos.client.DCOS;
import mesosphere.dcos.client.DCOSClient;
import mesosphere.dcos.client.model.DCOSAuthCredentials;
import mesosphere.marathon.client.model.v2.GetAppVersionResponse;

public class HeaderTest {
    @Test
    public void test() throws IOException {
        final String newEndpoint = "https://mplusdcosdev.northamerica.cerner.net/";
        final DCOSAuthCredentials newAuthCredentials = DCOSAuthCredentials.forServiceAccount("test_spinnaker", "-----BEGIN PRIVATE KEY-----\n" +
                                                                                                             "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCv49kgxTjpQo0g\n" +
                                                                                                             "uElhfFXApXfXpkvCZuo3OHc09lMSRoaR2hFQTaQmhyB6LCI4dkLxXi0462yxX0ef\n" +
                                                                                                             "XLdm4n5A7NFiBCWGyKttoFCCxE6Jh3woYVBZ/tbIveNb+Kg/te/XNShv5gnlb8d/\n" +
                                                                                                             "bbyVCDcAy7DHBmotmipoLhd48qmkss+ORwCcTxiXCcEmmaYb5DflUGoas0XHkIXC\n" +
                                                                                                             "yTTNLMnkzFhthNSD3jd7PBGAG3KyOvHh5bRRP8V/TQ0RVZFR89Nzp2ny4rwrOJhm\n" +
                                                                                                             "RiT5fHGf+VxlSd7cxc0H3S/AE4kEdeA17ziSXkr+MxkkGG4FJokkpbx5WCf+Zlok\n" +
                                                                                                             "xCvbeFrPAgMBAAECggEAK2tBhDdrTxmgoP0dEDWTLZUrOk7Q0NJ66trDgo10AETs\n" +
                                                                                                             "n0CHmZ0w8lnVCJOwduOqrs6itzRWhoqQsaQ/meQ7ameLYHjJkrYiq1MxzLYM9SI+\n" +
                                                                                                             "4fDz1uNzveYyI9gEIIYXCLcUnlrZAoxPYQOD0/5NJaMipl7NAyjVYxZNsQumGQOq\n" +
                                                                                                             "LXCOkOrP6ld2/0tvn6qLqccJBMqzEx++TFzyWMfHx2Q4yd1/XsRKizNw2P+1rPbi\n" +
                                                                                                             "qYj5wnKIPNS/gkncBqdZYhvVPr5IY7mMzmIzRftyUynF8dPTFfv7AdXWrzuqtC4F\n" +
                                                                                                             "j/6gETmArmqNypsz/gv+sh8wZhBrDBz62B59XFKbUQKBgQDai6sinLXhufMbuj0C\n" +
                                                                                                             "FcP2EG6VV3MasgvkClYmrS6+JVOyY23FcrqI9xMbKCLaLeswkht+YeMzhEGbvDfn\n" +
                                                                                                             "I2szFtPWVl7WhAIRW2xoVpFpPCcQ+Llg3oN3Z1pe+kQw+bHrgIOU0iAXyn4gTbek\n" +
                                                                                                             "2ZZDVjFl5GN+B4dTHiGEICT0kwKBgQDOCLynglBxTI/udGTCe8I1zN06xESRyMpk\n" +
                                                                                                             "kzY3diLP2f4Ck5iCzJho/mqJNvQXUcLNHBU6N3Nw2vhCOVbIxvW/cw5DFwgiw+MQ\n" +
                                                                                                             "RNBHkV+uoHUS8FmZqBChrgr8/+DYoUV+sX4/ZdTorCOsU3dvroXZSK42yZrcd0xK\n" +
                                                                                                             "5LAM7c4CVQKBgHbr9Y36FIbmNsHpz/Tofx/QxTwCwCHQrOPENCkLqBnUGf1CWaNN\n" +
                                                                                                             "0O9i80SdzIlI32gouUlGXunTmBf0jb766QR98Xv6t9SnNLDZPN5x7OKE1wVHMyjh\n" +
                                                                                                             "LEy3Mtfn+19jIEv0PKWoycnoaEWPxNSxijDOIEc/xlv4IM074iURkMp9AoGBAKh9\n" +
                                                                                                             "tqIaTOTK4u3z2668fM94kPcNKLI8DWAAj5b9kmx+bl73CwL0hDNg1AkQmr8zSuZn\n" +
                                                                                                             "7+gjDtIdEGc/8vvQ0YnWcrRk8m9T2K4mSFouxZvOds+dJPkm2ysNZMkQDHW8NVPt\n" +
                                                                                                             "nTwFb/8zPx0fSQ5ZH/bYnDgL2Qwwt4CL0nlQRGfdAoGAG/bU2v8ybILSYhLdL96g\n" +
                                                                                                             "y+YSU5ZpbjuuFEJm1GxtvK0ZxkA3qLVjVOw7gnctCwe8qGs8HmFnd8mDgLg5Hrjz\n" +
                                                                                                             "4DAEtY9FCm/LbhDHHR5XdnpD/1o3WiFc/Bppko6ePR/MW1A3CUQtVO9M2LOQchOg\n" +
                                                                                                             "hfbAi9PdvKS0+7sZkJ/edMs=\n" +
                                                                                                             "-----END PRIVATE KEY-----");
        final DCOS dcosClient = DCOSClient.getInstance(newEndpoint, newAuthCredentials);
        GetAppVersionResponse versions = dcosClient.getAppVersion("test/default/testapp-dev-test-v000");
    }
}
