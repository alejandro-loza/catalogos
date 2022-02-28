package sspc.gob.mx.psr.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CentroReclusionSpec extends Specification{

    @Value('${local.server.port}')
    int port
    RestTemplate rest = new RestTemplate()

    def "Deberia traer todos los centros de reclusion"(){
        when:
        def resp = rest.getForEntity("http://localhost:${ port }/catalogos/centrosReclusion", List)?.body

        then:
        assert resp.size() == 3
        assert resp.first().nombre == "ALCATRAZ"
    }

    def "Deberia traer centro de reclusion Alcatraz"(){

        when:
        def resp = rest.getForEntity("http://localhost:${port}/catalogos/centrosReclusion/3", Map)?.body

        then:
        assert resp == [id:3, nombre:'ALCATRAZ']


    }
}
