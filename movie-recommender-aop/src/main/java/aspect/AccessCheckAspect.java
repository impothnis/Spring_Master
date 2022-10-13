package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AccessCheckAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("execution(String io.pavan.springaop.movierecommenderaop..*.*Filtering(..))")
	//@Before("execution(* io.pavan.springaop.movierecommenderaop..*.*Filtering(..)) || execution(String io.pavan.springaop.movierecommenderaop..*.*(..))")
	//@Before("execution(String io.pavan.springaop.movierecommenderaop..*.*(String))")
	//@Before("execution(* io.pavan.springaop.movierecommenderaop..*.*Filtering(..))")
	//@Before("execution(String io.pavan.springaop.movierecommenderaop..*.*(..))")
	//@Before("execution(* io.pavan.springaop.movierecommenderaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		//	logger.info("Intercepted method call");
		logger.info("Intercepted call before execution of: {}", joinPoint);

		//access check logic		
	}


	@AfterReturning(value = "execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))",
			returning = "result")
	//@AfterReturning("execution(* io.datajek.springaop.movierecommenderaop.data.*.*(..))")
	public void logAfterExecution(JoinPoint joinPoint, Object result) {
		//logger.info("Method {} complete", joinPoint);
		logger.info("{} returned with: {}", joinPoint, result);		
	}

	@AfterThrowing(value = "execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))",
			throwing = "exception")
	public void logAfterException(JoinPoint joinPoint, Object exception) {
		logger.info("Exception in {} returned with: {}", joinPoint, exception);
	}  

	@After(value = "execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))")
	public void logAfterMethod(JoinPoint joinPoint) {
		logger.info("After {}", joinPoint);
	}
}
