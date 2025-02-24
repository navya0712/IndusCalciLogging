package com.indus.training.core.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.indus.training.core.domain.CalciInput;
import com.indus.training.core.domain.CalciOutput;
import com.indus.training.core.exception.CalciException;
import com.indus.training.core.svc.ICalci;

/**
 * Description: Implementation of ICalci interface It provides methods for
 * addition, subtraction, multiplication and division of two numbers
 */
public class Calci implements ICalci {

	private static final Logger logger = LoggerFactory.getLogger(Calci.class);

	/**
	 * Description: Performs addition on the input parameters
	 * 
	 * @throws CalciException
	 */
	@Override
	public CalciOutput addition(CalciInput calInputObj) throws CalciException {
		logger.info("In addition:The calInputObj is {}", calInputObj);
		if (calInputObj == null) {
			logger.error("CalciInput cannot be null");
			throw new CalciException("Null CalciInput");
		}
		CalciOutput calOutObj = null;
		{
			double param1 = calInputObj.param1;
			double param2 = calInputObj.param2;
			double result = param1 + param2;
			calOutObj = new CalciOutput();
			calOutObj.param1 = param1;
			calOutObj.param2 = param2;
			calOutObj.result = result;
			calOutObj.operation = "Addition";
		}
		logger.info("In addition:The result of calInputObj = {} is calOutObj= {}", calInputObj, calOutObj);
		return calOutObj;
	}

	/**
	 * Description: Performs Subtraction on the input parameters
	 * 
	 * @throws CalciException
	 */
	@Override
	public CalciOutput subtract(CalciInput calInputObj) throws CalciException {
		logger.info("In subtract:The calInputObj is {}", calInputObj);
		if (calInputObj == null) {
			logger.error("CalciInput cannot be null");
			throw new CalciException("Null CalciInput");
		}
		CalciOutput calOutObj = null;
		{
			double param1 = calInputObj.param1;
			double param2 = calInputObj.param2;
			double result = param1 - param2;
			calOutObj = new CalciOutput();
			calOutObj.param1 = param1;
			calOutObj.param2 = param2;
			calOutObj.result = result;
			calOutObj.operation = "Subtraction";
		}
		logger.info("In subtract:The result of calInputObj = {} is calOutObj= {}", calInputObj, calOutObj);
		return calOutObj;
	}

	/**
	 * Description: Performs multiplication on the input parameters
	 * 
	 * @throws CalciException
	 */
	@Override
	public CalciOutput multiply(CalciInput calInputObj) throws CalciException {
		logger.info("In multiply:The calInputObj is {}", calInputObj);
		if (calInputObj == null) {
			logger.error("CalciInput cannot be null");
			throw new CalciException("Null CalciInput");
		}
		CalciOutput calOutObj = null;
		{
			double param1 = calInputObj.param1;
			double param2 = calInputObj.param2;
			double result = param1 * param2;
			calOutObj = new CalciOutput();
			calOutObj.param1 = param1;
			calOutObj.param2 = param2;
			calOutObj.result = result;
			calOutObj.operation = "Multiplication";
		}
		logger.info("In multiply:The result of calInputObj = {} is calOutObj= {}", calInputObj, calOutObj);
		return calOutObj;

	}

	/**
	 * Description: Performs Division on the input parameters
	 * 
	 * @throws CalciException
	 */
	@Override
	public CalciOutput division(CalciInput calInputObj) throws CalciException {
		logger.info("In division:The calInputObj is {}", calInputObj);
		if (calInputObj == null) {
			logger.error("CalciInput cannot be null");
			throw new CalciException("Null CalciInput");
		}
		CalciOutput calOutObj = null;
		{
			double param1 = calInputObj.param1;
			double param2 = calInputObj.param2;
			double result = param1 / param2;
			calOutObj = new CalciOutput();
			calOutObj.param1 = param1;
			calOutObj.param2 = param2;
			calOutObj.result = result;
			calOutObj.operation = "Division";
		}
		logger.info("In division:The result of calInputObj = {} is calOutObj= {}", calInputObj, calOutObj);
		return calOutObj;
	}

}
