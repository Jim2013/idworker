package com.imadcn.framework.idworker.spring.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.imadcn.framework.idworker.generator.SnowflakeGenerator;

public class IdworkerNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("registry", new RegistryBeanDefinitionParser());
		registerBeanDefinitionParser("generator", new GeneratorBeanDefinitionParser(SnowflakeGenerator.class));
	}

}
