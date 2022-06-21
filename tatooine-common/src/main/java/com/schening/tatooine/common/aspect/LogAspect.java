package com.schening.tatooine.common.aspect;

import com.schening.tatooine.common.annotation.Log;
import com.schening.tatooine.common.model.OperationLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/1 8:16 下午
 */
@Aspect
@Component
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 配置织入点 - 自定义注解的包路径
     */
    @Pointcut("@annotation(com.schening.tatooine.common.annotation.Log)")
    public void logPointCut() {

    }

    /**
     * 处理完请求后执行
     *
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "logPointCut()", returning = "jsonResult")
    public void doAfterReturning(JoinPoint joinPoint, Object jsonResult) {

    }

    /**
     * 拦截异常操作
     *
     * @param joinPoint 切点
     * @param e 异常
     */
    @AfterThrowing(pointcut = "logPointCut()", throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint, Exception e) {

    }

    protected void handleLog(final JoinPoint joinPoint, final Exception e, Object jsonResult) {
        try{
            // 获得注解
            Log controllerLog = getControllerLog(joinPoint);
            if (controllerLog == null) {
                return;
            }

            // 获取当前用户

            // *========数据库日志=========*//
            OperationLog operationLog = new OperationLog();
            // 请求的地址
            operationLog.setOperationIP(null);
            // 返回参数

            // 设置方法名称
            String className = joinPoint.getTarget().getClass().getName();
            String methodName = joinPoint.getSignature().getName();

            // 设置请求方式

            // 处理设置注解上的参数

            // 保存数据库
        } catch (Exception exception) {
            logger.error("==前置通知异常==");
            logger.error("异常信息:{}", exception.getMessage());
//            logger.error("异常堆栈:{}", exception.getStackTrace());
        }
    }

    public Log getControllerLog(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        if (method == null) {
            return null;
        }
        return method.getAnnotation(Log.class);
    }

}
