package com.testng.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.TestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Oleg Romanenchuk on 9/5/2015.
 */
@ContextConfiguration("classpath:context.xml")
public class SpringTestNGContextCacheExample extends AbstractTestNGSpringContextTests {

    @BeforeClass
    private void saveFooName(){
        TestNGSpring = foo.getName();
        System.out.println("BeforeClass:foo name is '" + TestNGSpring + "'");
        assertEquals(TestNGSpring, "TestNG Spring");
    }

    @Test
    @DirtiesContext
    public void removeFromCache(){
        String newFooName = "New foo name";
        foo.setName(newFooName);
        System.out.println("removeFromCache: foo name changed to '" + foo.getName() + "'");
        this.dirtiedApplicationContext = super.applicationContext;
        System.out.println("removeFromCache: annotated DirtiesContext so context will be marked for removal in afterMethod ");
    }
    @Test(dependsOnMethods = {"removeFromCache"})
    public void verifyContextNew(){
        System.out.println("verifyContextNew: is context re-cached? " + (dirtiedApplicationContext !=applicationContext));
        System.out.println("verifyContextNew: foo name is '" + foo.getName() + "'");
        assertNotSame(super.applicationContext, this.dirtiedApplicationContext, "The application context should have been 'dirtied'.");
        assertEquals(foo.getName(), TestNGSpring);
        this.dirtiedApplicationContext = super.applicationContext;
        foo.setName(MODIFIED_FOO_NAME);
        System.out.println("verifyContextNew: modify foo name to '" + MODIFIED_FOO_NAME + "'");
    }

    @Test(dependsOnMethods = "verifyContextNew")
    public void verifyContextSame(){
        System.out.println("verifyContextSame: is context cached? " + (dirtiedApplicationContext == applicationContext));
        assertSame(this.applicationContext, this.dirtiedApplicationContext, "The application context should NOT have been 'dirtied'.");
        System.out.println("verifyContextSame: foo name is '" + foo.getName() + "'");
        assertEquals(foo.getName(), MODIFIED_FOO_NAME);
    }

    private String TestNGSpring;
    private static final String MODIFIED_FOO_NAME = "TestNG Spring Name Changed";
    private ApplicationContext dirtiedApplicationContext;

    @Autowired
    private Foo foo;
}
