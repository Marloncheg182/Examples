<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:p="http://www.springframework.org/schema/p"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:jee="http://www.springframework.org/schema/jee" xmlns:tx="http://www.springframework.org/schema/tx"
       xmlns:task="http://www.springframework.org/schema/task"
       xsi:schemaLocation="http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-3.2.xsd http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.2.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.2.xsd http://www.springframework.org/schema/jee http://www.springframework.org/schema/jee/spring-jee-3.2.xsd http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-3.2.xsd http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task-3.2.xsd">
   <!--Bean implementation-->
    <bean id="simpleServiceBean" class="com.example.impl.SimpleServiceImpl">
        <property name="name" value="Hello"/>
        <property name="id" value="1"/>
    </bean>
    <!--Aspect beans -->
    <bean id="doBeforeAspect" class="com.example.aspect.DoBeforeAspect"/>
    <bean id="doAfterAspect" class="com.example.aspect.DoAfterAspect"/>
    <bean id="doAfterReturningAspect" class="com.example.aspect.DoAfterReturningAspect"/>
    <bean id="doAfterThrowingAspect" class="com.example.aspect.DoAfterThrowingAspect"/>
    <bean id="doAroundAspect" class="com.example.aspect.DoAroundAspect"/>
    <!--Aspect configs-->
    <!--Before Aspect-->
    <aop:config>
        <aop:aspect id="aspects" ref="doBeforeAspect">
            <aop:pointcut id="pointCutBefore" expression="execution(* com.example.SimpleService.sayHello(..))"/>
            <aop:before method="doBefore" pointcut-ref="pointCutBefore"/>
        </aop:aspect>
        <!--After Aspect-->
        <aop:aspect id="aspects" ref="doAfterAspect">
            <aop:pointcut id="pointCutAfter" expression="execution(* com.example.SimpleService.sayHello(..))"/>
            <aop:after method="doAfter" pointcut-ref="pointCutAfter"/>
        </aop:aspect>
        <!--After Returning Aspect-->
        <aop:aspect id="aspects" ref="doAfterReturningAspect">
            <aop:pointcut id="pointCutAfterReturning" expression="execution(* com.example.SimpleService.sayHello(..))"/>
            <aop:after-returning method="doAfterReturning" returning="result" pointcut-ref="pointCutAfterReturning"/>
        </aop:aspect>
        <!--After Throwing Aspect-->
        <aop:aspect id="aspects" ref="doAfterThrowingAspect">
            <aop:pointcut id="pointCutAfterThrowing" expression="execution(* com.example.SimpleService.sayHello(..))"/>
            <aop:after-throwing method="doAfterThrowing" throwing="error" pointcut-ref="pointCutAfterThrowing"/>
        </aop:aspect>
        <!--Around Aspect -->
        <aop:aspect id="aspects" ref="doAroundAspect">
            <aop:pointcut id="pointCutAround" expression="execution(* com.example.SimpleService.sayHello(..))"/>
            <aop:around method="doAround" pointcut-ref="pointCutAround"/>
        </aop:aspect>
    </aop:config>
</beans>