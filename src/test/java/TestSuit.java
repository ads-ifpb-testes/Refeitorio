import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BuscarAlunoTest.class,
        BuscarVisitanteTest.class,
        CriarAlunoTest.class,
        CriarVisitanteTest.class,
        RemoverAlunoTest.class
})

public class TestSuit {

}