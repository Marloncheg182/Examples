package dataexam.test.service;

import dataexam.service.BankService;
import dataexam.test.config.TestDataBaseConfig;
import dataexam.test.util.BankUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Dell on 6/13/2015.
 */

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class BankServiceTest {

    @Resource
    private EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;

    @Resource
    private BankService bankService;

    @Before
    public void setUp() throws Exception
    {
        entityManager = entityManagerFactory.createEntityManager();
    }
    public void testSaveBank()throws Exception
    {
        bankService.addBank(BankUtil.createBank());
    }
}
