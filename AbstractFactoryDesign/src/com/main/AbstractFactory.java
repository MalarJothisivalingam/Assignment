package com.main;

import com.design.Operator1;
import com.design.Operator2;

public abstract class AbstractFactory {
	abstract Operator1 getoper1(String Factory1);
	abstract Operator2 getoper2(String Factory2);

}
