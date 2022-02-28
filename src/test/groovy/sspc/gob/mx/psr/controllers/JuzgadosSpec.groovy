package sspc.gob.mx.psr.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class JuzgadosSpec extends Specification{

    @Value('${local.server.port}')
    int port
    RestTemplate rest = new RestTemplate()

    def "Deberia traer todos los juzgados"(){
        when:
        def resp = rest.getForEntity("http://localhost:${port}/catalogos/juzgados", List)?.body

        then:
        assert resp.size() == 2
        assert resp.first().nombre == "Juzgado Conciliador"
    }

    def "Deberia buscar un juzgado"(){

        when:
        def resp = rest.getForEntity("http://localhost:${port}/catalogos/juzgados/1", Map)?.body

        then:
        assert resp == [id:1, nombre:'Suprema Corte de justicia']
    }

}
