package io.chrissalerno.demo.notification;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesArchitectureRules;
import org.jmolecules.archunit.JMoleculesDddRules;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AnalyzeClasses(packages = "io.chrissalerno.demo.notification")
class JMoleculesRulesTest {

    @ArchTest
    ArchRule dddRules = JMoleculesDddRules.all();

    @ArchTest
    ArchRule onion = JMoleculesArchitectureRules.ensureOnionSimple();

}