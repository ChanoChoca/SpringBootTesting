package com.chanochoca.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

    @Test
    @Disabled("Don't  run until JIRA #123 is resolved")
    void basicTest() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.LINUX) //It won't run because I'm using WINDOWS
    void testForLinuxOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void testForLinuxAndWindowsOnly() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnJre(JRE.JAVA_22) //It won't run because I'm using JAVA_21
    void testForOnlyJava22() {
        // execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_21, max=JRE.JAVA_22)
    void testOnlyForJavaRange() {
        // execute method and perform asserts
    }

    @Test
    @EnabledIfEnvironmentVariable(named="CHANO_ENV", matches="DEV")
    void testOnlyForDevEnvironment() {
        // execute method and perform asserts
    }

    @Test
    @EnabledIfSystemProperty(named="CHANO_SYS_PROP", matches="CI_CD_DEPLOY")
    void testOnlyForSystemProperty() {
        // execute method and perform asserts
    }
}
